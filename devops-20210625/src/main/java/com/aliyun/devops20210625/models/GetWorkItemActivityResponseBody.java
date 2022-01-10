// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetWorkItemActivityResponseBody extends TeaModel {
    // 动态信息
    @NameInMap("activities")
    public java.util.List<GetWorkItemActivityResponseBodyActivities> activities;

    // 错误码
    @NameInMap("errorCode")
    public String errorCode;

    // 错误信息
    @NameInMap("errorMsg")
    public String errorMsg;

    // 请求id，每次请求都是唯一值，便于后续排查问题
    @NameInMap("requestId")
    public String requestId;

    // true或者false
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

    public static class GetWorkItemActivityResponseBodyActivitiesProperty extends TeaModel {
        // 属性的展示名
        @NameInMap("displayName")
        public String displayName;

        // 资源id
        @NameInMap("propertyIdentifier")
        public String propertyIdentifier;

        // 属性key
        @NameInMap("propertyName")
        public String propertyName;

        // 类型
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
        // 动作类型
        @NameInMap("actionType")
        public String actionType;

        // 事件id
        @NameInMap("eventId")
        public Long eventId;

        // 事件时间
        @NameInMap("eventTime")
        public Long eventTime;

        // 事件类型
        @NameInMap("eventType")
        public String eventType;

        // 操作者
        @NameInMap("operator")
        public String operator;

        // 父事件id
        @NameInMap("parentEventId")
        public Long parentEventId;

        // 修改属性
        @NameInMap("property")
        public GetWorkItemActivityResponseBodyActivitiesProperty property;

        // 操作对象
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
