// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeMqttMessageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public DescribeMqttMessageResponseBodyMessage message;

    public static DescribeMqttMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMqttMessageResponseBody self = new DescribeMqttMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMqttMessageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMqttMessageResponseBody setMessage(DescribeMqttMessageResponseBodyMessage message) {
        this.message = message;
        return this;
    }
    public DescribeMqttMessageResponseBodyMessage getMessage() {
        return this.message;
    }

    public static class DescribeMqttMessageResponseBodyMessage extends TeaModel {
        @NameInMap("Time")
        public Long time;

        @NameInMap("AppKey")
        public String appKey;

        @NameInMap("Mid")
        public String mid;

        @NameInMap("Topic")
        public String topic;

        @NameInMap("Payload")
        public String payload;

        @NameInMap("QoS")
        public Integer qoS;

        public static DescribeMqttMessageResponseBodyMessage build(java.util.Map<String, ?> map) throws Exception {
            DescribeMqttMessageResponseBodyMessage self = new DescribeMqttMessageResponseBodyMessage();
            return TeaModel.build(map, self);
        }

        public DescribeMqttMessageResponseBodyMessage setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public DescribeMqttMessageResponseBodyMessage setAppKey(String appKey) {
            this.appKey = appKey;
            return this;
        }
        public String getAppKey() {
            return this.appKey;
        }

        public DescribeMqttMessageResponseBodyMessage setMid(String mid) {
            this.mid = mid;
            return this;
        }
        public String getMid() {
            return this.mid;
        }

        public DescribeMqttMessageResponseBodyMessage setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public DescribeMqttMessageResponseBodyMessage setPayload(String payload) {
            this.payload = payload;
            return this;
        }
        public String getPayload() {
            return this.payload;
        }

        public DescribeMqttMessageResponseBodyMessage setQoS(Integer qoS) {
            this.qoS = qoS;
            return this;
        }
        public Integer getQoS() {
            return this.qoS;
        }

    }

}
