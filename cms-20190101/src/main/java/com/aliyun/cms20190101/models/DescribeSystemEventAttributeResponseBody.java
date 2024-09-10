// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSystemEventAttributeResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * <blockquote>
     * <p> The status code 200 indicates that the call is successful.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The message that is returned. If the call is successful, <code>success</code> is returned. If the call fails, an error message is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>60912C8D-B340-4253-ADE7-61ACDFD25CFC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. Valid values: True: The call is successful. false: The call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * 
         * <strong>example:</strong>
         * <p>[{&quot;product&quot;:&quot;CloudMonitor&quot;,&quot;content&quot;:&quot;{\&quot;ipGroup\&quot;:\&quot;112.126.XX.XX,10.163.XX.XX\&quot;,\&quot;tianjimonVersion\&quot;:\&quot;1.2.22\&quot;}&quot;,&quot;groupId&quot;:&quot;176,177,178,179,180,692,120812,1663836,96,2028302&quot;,&quot;time&quot;:&quot;1552209568000&quot;,&quot;resourceId&quot;:&quot;acs:ecs:cn-beijing:173651113438****:instance/i-25k35****&quot;,&quot;level&quot;:&quot;CRITICAL&quot;,&quot;status&quot;:&quot;stopped&quot;,&quot;instanceName&quot;:&quot;cmssiteprobebj-6&quot;,&quot;name&quot;:&quot;Agent_Status_Stopped&quot;,&quot;regionId&quot;:&quot;cn-beijing&quot;}]</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The ID of the application group.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The event ID.</p>
         * 
         * <strong>example:</strong>
         * <p>b936efc9-f621-4e8a-a6eb-076be40e****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>instanceId1</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The level of the event. Valid values:</p>
         * <ul>
         * <li>CRITICAL</li>
         * <li>WARN</li>
         * <li>INFO</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>WARN</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The event name.</p>
         * 
         * <strong>example:</strong>
         * <p>Agent_Status_Stopped</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The abbreviation of the service name.</p>
         * 
         * <strong>example:</strong>
         * <p>CloudMonitor</p>
         */
        @NameInMap("Product")
        public String product;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxx-1</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The status of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the event occurred. The value is a timestamp.</p>
         * <p>Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1552199984000</p>
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
