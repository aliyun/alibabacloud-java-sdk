// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class UpdateSubscriptionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UpdateSubscriptionResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <strong>example:</strong>
     * <p>03C67DAD-EB26-41D8-949D-9B0C470FB716</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateSubscriptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSubscriptionResponseBody self = new UpdateSubscriptionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSubscriptionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateSubscriptionResponseBody setData(UpdateSubscriptionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateSubscriptionResponseBodyData getData() {
        return this.data;
    }

    public UpdateSubscriptionResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateSubscriptionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateSubscriptionResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public UpdateSubscriptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateSubscriptionResponseBodyDataEventList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Disabled")
        public Boolean disabled;

        /**
         * <strong>example:</strong>
         * <p>Dialing</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("Topic")
        public String topic;

        public static UpdateSubscriptionResponseBodyDataEventList build(java.util.Map<String, ?> map) throws Exception {
            UpdateSubscriptionResponseBodyDataEventList self = new UpdateSubscriptionResponseBodyDataEventList();
            return TeaModel.build(map, self);
        }

        public UpdateSubscriptionResponseBodyDataEventList setDisabled(Boolean disabled) {
            this.disabled = disabled;
            return this;
        }
        public Boolean getDisabled() {
            return this.disabled;
        }

        public UpdateSubscriptionResponseBodyDataEventList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateSubscriptionResponseBodyDataEventList setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

    public static class UpdateSubscriptionResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>rmq-cn-****.cn-shanghai.rmq.aliyuncs.com:8080</p>
         */
        @NameInMap("AccessPoint")
        public String accessPoint;

        @NameInMap("EventList")
        public java.util.List<UpdateSubscriptionResponseBodyDataEventList> eventList;

        /**
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>rmq-cn-****</p>
         */
        @NameInMap("MqInstanceId")
        public String mqInstanceId;

        /**
         * <strong>example:</strong>
         * <p>rocketmq5</p>
         */
        @NameInMap("MqType")
        public String mqType;

        /**
         * <strong>example:</strong>
         * <p>GID_xxx</p>
         */
        @NameInMap("ProducerId")
        public String producerId;

        /**
         * <strong>example:</strong>
         * <p>ccc-event</p>
         */
        @NameInMap("Topic")
        public String topic;

        /**
         * <strong>example:</strong>
         * <p>username</p>
         */
        @NameInMap("Username")
        public String username;

        public static UpdateSubscriptionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateSubscriptionResponseBodyData self = new UpdateSubscriptionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateSubscriptionResponseBodyData setAccessPoint(String accessPoint) {
            this.accessPoint = accessPoint;
            return this;
        }
        public String getAccessPoint() {
            return this.accessPoint;
        }

        public UpdateSubscriptionResponseBodyData setEventList(java.util.List<UpdateSubscriptionResponseBodyDataEventList> eventList) {
            this.eventList = eventList;
            return this;
        }
        public java.util.List<UpdateSubscriptionResponseBodyDataEventList> getEventList() {
            return this.eventList;
        }

        public UpdateSubscriptionResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public UpdateSubscriptionResponseBodyData setMqInstanceId(String mqInstanceId) {
            this.mqInstanceId = mqInstanceId;
            return this;
        }
        public String getMqInstanceId() {
            return this.mqInstanceId;
        }

        public UpdateSubscriptionResponseBodyData setMqType(String mqType) {
            this.mqType = mqType;
            return this;
        }
        public String getMqType() {
            return this.mqType;
        }

        public UpdateSubscriptionResponseBodyData setProducerId(String producerId) {
            this.producerId = producerId;
            return this;
        }
        public String getProducerId() {
            return this.producerId;
        }

        public UpdateSubscriptionResponseBodyData setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public UpdateSubscriptionResponseBodyData setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
