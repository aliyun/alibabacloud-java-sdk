// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListAliyunOfficialEventSourcesResponseBody extends TeaModel {
    /**
     * <p>The returned response code. The value Success indicates that the request is successful.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public ListAliyunOfficialEventSourcesResponseBodyData data;

    /**
     * <p>The returned error message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation is successful. Valid values: true and false.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListAliyunOfficialEventSourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAliyunOfficialEventSourcesResponseBody self = new ListAliyunOfficialEventSourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAliyunOfficialEventSourcesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAliyunOfficialEventSourcesResponseBody setData(ListAliyunOfficialEventSourcesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListAliyunOfficialEventSourcesResponseBodyData getData() {
        return this.data;
    }

    public ListAliyunOfficialEventSourcesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAliyunOfficialEventSourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAliyunOfficialEventSourcesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAliyunOfficialEventSourcesResponseBodyDataEventSourceListEventTypes extends TeaModel {
        /**
         * <p>The name of the event source.</p>
         */
        @NameInMap("EventSourceName")
        public String eventSourceName;

        /**
         * <p>The name of the group to which the queried event type belongs.</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The full name of the queried event type.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The short name of the queried event type.</p>
         */
        @NameInMap("ShortName")
        public String shortName;

        public static ListAliyunOfficialEventSourcesResponseBodyDataEventSourceListEventTypes build(java.util.Map<String, ?> map) throws Exception {
            ListAliyunOfficialEventSourcesResponseBodyDataEventSourceListEventTypes self = new ListAliyunOfficialEventSourcesResponseBodyDataEventSourceListEventTypes();
            return TeaModel.build(map, self);
        }

        public ListAliyunOfficialEventSourcesResponseBodyDataEventSourceListEventTypes setEventSourceName(String eventSourceName) {
            this.eventSourceName = eventSourceName;
            return this;
        }
        public String getEventSourceName() {
            return this.eventSourceName;
        }

        public ListAliyunOfficialEventSourcesResponseBodyDataEventSourceListEventTypes setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ListAliyunOfficialEventSourcesResponseBodyDataEventSourceListEventTypes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAliyunOfficialEventSourcesResponseBodyDataEventSourceListEventTypes setShortName(String shortName) {
            this.shortName = shortName;
            return this;
        }
        public String getShortName() {
            return this.shortName;
        }

    }

    public static class ListAliyunOfficialEventSourcesResponseBodyDataEventSourceList extends TeaModel {
        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the event bus.</p>
         */
        @NameInMap("Arn")
        public String arn;

        /**
         * <p>The time when the event source was created. Unit: milliseconds.</p>
         */
        @NameInMap("Ctime")
        public Float ctime;

        /**
         * <p>The description of the queried event source.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the event source to which the queried event type belongs.</p>
         */
        @NameInMap("EventBusName")
        public String eventBusName;

        /**
         * <p>The queried event types.</p>
         */
        @NameInMap("EventTypes")
        public java.util.List<ListAliyunOfficialEventSourcesResponseBodyDataEventSourceListEventTypes> eventTypes;

        @NameInMap("FullName")
        public String fullName;

        /**
         * <p>The name of the queried event source.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The status of the queried event source. Valid value: Activated.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type of the queried event source.</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListAliyunOfficialEventSourcesResponseBodyDataEventSourceList build(java.util.Map<String, ?> map) throws Exception {
            ListAliyunOfficialEventSourcesResponseBodyDataEventSourceList self = new ListAliyunOfficialEventSourcesResponseBodyDataEventSourceList();
            return TeaModel.build(map, self);
        }

        public ListAliyunOfficialEventSourcesResponseBodyDataEventSourceList setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public ListAliyunOfficialEventSourcesResponseBodyDataEventSourceList setCtime(Float ctime) {
            this.ctime = ctime;
            return this;
        }
        public Float getCtime() {
            return this.ctime;
        }

        public ListAliyunOfficialEventSourcesResponseBodyDataEventSourceList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAliyunOfficialEventSourcesResponseBodyDataEventSourceList setEventBusName(String eventBusName) {
            this.eventBusName = eventBusName;
            return this;
        }
        public String getEventBusName() {
            return this.eventBusName;
        }

        public ListAliyunOfficialEventSourcesResponseBodyDataEventSourceList setEventTypes(java.util.List<ListAliyunOfficialEventSourcesResponseBodyDataEventSourceListEventTypes> eventTypes) {
            this.eventTypes = eventTypes;
            return this;
        }
        public java.util.List<ListAliyunOfficialEventSourcesResponseBodyDataEventSourceListEventTypes> getEventTypes() {
            return this.eventTypes;
        }

        public ListAliyunOfficialEventSourcesResponseBodyDataEventSourceList setFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }
        public String getFullName() {
            return this.fullName;
        }

        public ListAliyunOfficialEventSourcesResponseBodyDataEventSourceList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAliyunOfficialEventSourcesResponseBodyDataEventSourceList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAliyunOfficialEventSourcesResponseBodyDataEventSourceList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListAliyunOfficialEventSourcesResponseBodyData extends TeaModel {
        /**
         * <p>The name of the event source to which the queried event type belongs.</p>
         */
        @NameInMap("EventSourceList")
        public java.util.List<ListAliyunOfficialEventSourcesResponseBodyDataEventSourceList> eventSourceList;

        public static ListAliyunOfficialEventSourcesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAliyunOfficialEventSourcesResponseBodyData self = new ListAliyunOfficialEventSourcesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAliyunOfficialEventSourcesResponseBodyData setEventSourceList(java.util.List<ListAliyunOfficialEventSourcesResponseBodyDataEventSourceList> eventSourceList) {
            this.eventSourceList = eventSourceList;
            return this;
        }
        public java.util.List<ListAliyunOfficialEventSourcesResponseBodyDataEventSourceList> getEventSourceList() {
            return this.eventSourceList;
        }

    }

}
