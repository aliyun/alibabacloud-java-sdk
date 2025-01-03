// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetWorkItemActivityResponseBody extends TeaModel {
    @NameInMap("activities")
    public java.util.List<GetWorkItemActivityResponseBodyActivities> activities;

    /**
     * <strong>example:</strong>
     * <p>Openapi.RequestError</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>error</p>
     */
    @NameInMap("errorMsg")
    public String errorMsg;

    /**
     * <strong>example:</strong>
     * <p>ASSDS-ASSASX-XSAXSA-XSAXSAXS</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetWorkItemActivityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWorkItemActivityResponseBody self = new GetWorkItemActivityResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWorkItemActivityResponseBody setActivities(java.util.List<GetWorkItemActivityResponseBodyActivities> activities) {
        this.activities = activities;
        return this;
    }
    public java.util.List<GetWorkItemActivityResponseBodyActivities> getActivities() {
        return this.activities;
    }

    public GetWorkItemActivityResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetWorkItemActivityResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetWorkItemActivityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWorkItemActivityResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetWorkItemActivityResponseBodyActivitiesNewValue extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Sprint-221124</p>
         */
        @NameInMap("displayValue")
        public String displayValue;

        /**
         * <strong>example:</strong>
         * <p>bed1cca179badeb501a72d1194</p>
         */
        @NameInMap("plainValue")
        public String plainValue;

        /**
         * <strong>example:</strong>
         * <p>Sprint</p>
         */
        @NameInMap("resourceType")
        public String resourceType;

        public static GetWorkItemActivityResponseBodyActivitiesNewValue build(java.util.Map<String, ?> map) throws Exception {
            GetWorkItemActivityResponseBodyActivitiesNewValue self = new GetWorkItemActivityResponseBodyActivitiesNewValue();
            return TeaModel.build(map, self);
        }

        public GetWorkItemActivityResponseBodyActivitiesNewValue setDisplayValue(String displayValue) {
            this.displayValue = displayValue;
            return this;
        }
        public String getDisplayValue() {
            return this.displayValue;
        }

        public GetWorkItemActivityResponseBodyActivitiesNewValue setPlainValue(String plainValue) {
            this.plainValue = plainValue;
            return this;
        }
        public String getPlainValue() {
            return this.plainValue;
        }

        public GetWorkItemActivityResponseBodyActivitiesNewValue setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class GetWorkItemActivityResponseBodyActivitiesOldValue extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Sprint-221124</p>
         */
        @NameInMap("displayValue")
        public String displayValue;

        /**
         * <strong>example:</strong>
         * <p>bed1cca179badeb501a72d1194</p>
         */
        @NameInMap("plainValue")
        public String plainValue;

        /**
         * <strong>example:</strong>
         * <p>Sprint</p>
         */
        @NameInMap("resourceType")
        public String resourceType;

        public static GetWorkItemActivityResponseBodyActivitiesOldValue build(java.util.Map<String, ?> map) throws Exception {
            GetWorkItemActivityResponseBodyActivitiesOldValue self = new GetWorkItemActivityResponseBodyActivitiesOldValue();
            return TeaModel.build(map, self);
        }

        public GetWorkItemActivityResponseBodyActivitiesOldValue setDisplayValue(String displayValue) {
            this.displayValue = displayValue;
            return this;
        }
        public String getDisplayValue() {
            return this.displayValue;
        }

        public GetWorkItemActivityResponseBodyActivitiesOldValue setPlainValue(String plainValue) {
            this.plainValue = plainValue;
            return this;
        }
        public String getPlainValue() {
            return this.plainValue;
        }

        public GetWorkItemActivityResponseBodyActivitiesOldValue setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class GetWorkItemActivityResponseBodyActivitiesProperty extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>标题</p>
         */
        @NameInMap("displayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>subject</p>
         */
        @NameInMap("propertyIdentifier")
        public String propertyIdentifier;

        /**
         * <strong>example:</strong>
         * <p>subject</p>
         */
        @NameInMap("propertyName")
        public String propertyName;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("propertyType")
        public String propertyType;

        public static GetWorkItemActivityResponseBodyActivitiesProperty build(java.util.Map<String, ?> map) throws Exception {
            GetWorkItemActivityResponseBodyActivitiesProperty self = new GetWorkItemActivityResponseBodyActivitiesProperty();
            return TeaModel.build(map, self);
        }

        public GetWorkItemActivityResponseBodyActivitiesProperty setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetWorkItemActivityResponseBodyActivitiesProperty setPropertyIdentifier(String propertyIdentifier) {
            this.propertyIdentifier = propertyIdentifier;
            return this;
        }
        public String getPropertyIdentifier() {
            return this.propertyIdentifier;
        }

        public GetWorkItemActivityResponseBodyActivitiesProperty setPropertyName(String propertyName) {
            this.propertyName = propertyName;
            return this;
        }
        public String getPropertyName() {
            return this.propertyName;
        }

        public GetWorkItemActivityResponseBodyActivitiesProperty setPropertyType(String propertyType) {
            this.propertyType = propertyType;
            return this;
        }
        public String getPropertyType() {
            return this.propertyType;
        }

    }

    public static class GetWorkItemActivityResponseBodyActivities extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>update</p>
         */
        @NameInMap("actionType")
        public String actionType;

        /**
         * <strong>example:</strong>
         * <p>3201131</p>
         */
        @NameInMap("eventId")
        public Long eventId;

        /**
         * <strong>example:</strong>
         * <p>1640867079624</p>
         */
        @NameInMap("eventTime")
        public Long eventTime;

        /**
         * <strong>example:</strong>
         * <p>workitem.updated</p>
         */
        @NameInMap("eventType")
        public String eventType;

        @NameInMap("newValue")
        public java.util.List<GetWorkItemActivityResponseBodyActivitiesNewValue> newValue;

        @NameInMap("oldValue")
        public java.util.List<GetWorkItemActivityResponseBodyActivitiesOldValue> oldValue;

        /**
         * <strong>example:</strong>
         * <p>19xx7043xxxxxxx914</p>
         */
        @NameInMap("operator")
        public String operator;

        /**
         * <strong>example:</strong>
         * <p>3201132</p>
         */
        @NameInMap("parentEventId")
        public Long parentEventId;

        /**
         * <strong>example:</strong>
         * <p>public</p>
         */
        @NameInMap("property")
        public GetWorkItemActivityResponseBodyActivitiesProperty property;

        /**
         * <strong>example:</strong>
         * <p>e8bxxxxxxxxxxxxxxxx23</p>
         */
        @NameInMap("resourceIdentifier")
        public String resourceIdentifier;

        public static GetWorkItemActivityResponseBodyActivities build(java.util.Map<String, ?> map) throws Exception {
            GetWorkItemActivityResponseBodyActivities self = new GetWorkItemActivityResponseBodyActivities();
            return TeaModel.build(map, self);
        }

        public GetWorkItemActivityResponseBodyActivities setActionType(String actionType) {
            this.actionType = actionType;
            return this;
        }
        public String getActionType() {
            return this.actionType;
        }

        public GetWorkItemActivityResponseBodyActivities setEventId(Long eventId) {
            this.eventId = eventId;
            return this;
        }
        public Long getEventId() {
            return this.eventId;
        }

        public GetWorkItemActivityResponseBodyActivities setEventTime(Long eventTime) {
            this.eventTime = eventTime;
            return this;
        }
        public Long getEventTime() {
            return this.eventTime;
        }

        public GetWorkItemActivityResponseBodyActivities setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public GetWorkItemActivityResponseBodyActivities setNewValue(java.util.List<GetWorkItemActivityResponseBodyActivitiesNewValue> newValue) {
            this.newValue = newValue;
            return this;
        }
        public java.util.List<GetWorkItemActivityResponseBodyActivitiesNewValue> getNewValue() {
            return this.newValue;
        }

        public GetWorkItemActivityResponseBodyActivities setOldValue(java.util.List<GetWorkItemActivityResponseBodyActivitiesOldValue> oldValue) {
            this.oldValue = oldValue;
            return this;
        }
        public java.util.List<GetWorkItemActivityResponseBodyActivitiesOldValue> getOldValue() {
            return this.oldValue;
        }

        public GetWorkItemActivityResponseBodyActivities setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetWorkItemActivityResponseBodyActivities setParentEventId(Long parentEventId) {
            this.parentEventId = parentEventId;
            return this;
        }
        public Long getParentEventId() {
            return this.parentEventId;
        }

        public GetWorkItemActivityResponseBodyActivities setProperty(GetWorkItemActivityResponseBodyActivitiesProperty property) {
            this.property = property;
            return this;
        }
        public GetWorkItemActivityResponseBodyActivitiesProperty getProperty() {
            return this.property;
        }

        public GetWorkItemActivityResponseBodyActivities setResourceIdentifier(String resourceIdentifier) {
            this.resourceIdentifier = resourceIdentifier;
            return this;
        }
        public String getResourceIdentifier() {
            return this.resourceIdentifier;
        }

    }

}
