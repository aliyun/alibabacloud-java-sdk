// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSystemEventAttributeResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * <br>
     * <p>>  The status code 200 indicates that the call is successful.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The message that is returned. If the call is successful, `success` is returned. If the call fails, an error message is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. Valid values: True: The call is successful. false: The call fails.</p>
     */
    @NameInMap("Success")
    public String success;

    /**
     * <p>The details of the event.</p>
     */
    @NameInMap("SystemEvents")
    public DescribeSystemEventAttributeResponseBodySystemEvents systemEvents;

    public static DescribeSystemEventAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSystemEventAttributeResponseBody self = new DescribeSystemEventAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSystemEventAttributeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeSystemEventAttributeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSystemEventAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSystemEventAttributeResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public DescribeSystemEventAttributeResponseBody setSystemEvents(DescribeSystemEventAttributeResponseBodySystemEvents systemEvents) {
        this.systemEvents = systemEvents;
        return this;
    }
    public DescribeSystemEventAttributeResponseBodySystemEvents getSystemEvents() {
        return this.systemEvents;
    }

    public static class DescribeSystemEventAttributeResponseBodySystemEventsSystemEvent extends TeaModel {
        /**
         * <p>The details of the event.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The ID of the application group.</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("Id")
        public String id;

        /**
         * <p>The instance name.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The severity level of the alert. Valid values:</p>
         * <br>
         * <p>*   CRITICAL</p>
         * <p>*   WARN</p>
         * <p>*   INFO</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The event name.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The abbreviation of the service name.</p>
         */
        @NameInMap("Product")
        public String product;

        /**
         * <p>The region ID.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The resource ID.</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The status of the event.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the event occurred. The value is a timestamp.</p>
         * <br>
         * <p>Unit: milliseconds.</p>
         */
        @NameInMap("Time")
        public Long time;

        public static DescribeSystemEventAttributeResponseBodySystemEventsSystemEvent build(java.util.Map<String, ?> map) throws Exception {
            DescribeSystemEventAttributeResponseBodySystemEventsSystemEvent self = new DescribeSystemEventAttributeResponseBodySystemEventsSystemEvent();
            return TeaModel.build(map, self);
        }

        public DescribeSystemEventAttributeResponseBodySystemEventsSystemEvent setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeSystemEventAttributeResponseBodySystemEventsSystemEvent setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeSystemEventAttributeResponseBodySystemEventsSystemEvent setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeSystemEventAttributeResponseBodySystemEventsSystemEvent setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeSystemEventAttributeResponseBodySystemEventsSystemEvent setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeSystemEventAttributeResponseBodySystemEventsSystemEvent setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSystemEventAttributeResponseBodySystemEventsSystemEvent setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public DescribeSystemEventAttributeResponseBodySystemEventsSystemEvent setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeSystemEventAttributeResponseBodySystemEventsSystemEvent setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeSystemEventAttributeResponseBodySystemEventsSystemEvent setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSystemEventAttributeResponseBodySystemEventsSystemEvent setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

    }

    public static class DescribeSystemEventAttributeResponseBodySystemEvents extends TeaModel {
        @NameInMap("SystemEvent")
        public java.util.List<DescribeSystemEventAttributeResponseBodySystemEventsSystemEvent> systemEvent;

        public static DescribeSystemEventAttributeResponseBodySystemEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribeSystemEventAttributeResponseBodySystemEvents self = new DescribeSystemEventAttributeResponseBodySystemEvents();
            return TeaModel.build(map, self);
        }

        public DescribeSystemEventAttributeResponseBodySystemEvents setSystemEvent(java.util.List<DescribeSystemEventAttributeResponseBodySystemEventsSystemEvent> systemEvent) {
            this.systemEvent = systemEvent;
            return this;
        }
        public java.util.List<DescribeSystemEventAttributeResponseBodySystemEventsSystemEvent> getSystemEvent() {
            return this.systemEvent;
        }

    }

}
