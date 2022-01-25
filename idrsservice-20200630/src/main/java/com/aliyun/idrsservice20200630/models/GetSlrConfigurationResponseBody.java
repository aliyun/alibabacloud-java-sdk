// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetSlrConfigurationResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetSlrConfigurationResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetSlrConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSlrConfigurationResponseBody self = new GetSlrConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSlrConfigurationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSlrConfigurationResponseBody setData(GetSlrConfigurationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSlrConfigurationResponseBodyData getData() {
        return this.data;
    }

    public GetSlrConfigurationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSlrConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetSlrConfigurationResponseBodyData extends TeaModel {
        @NameInMap("MqEndpoint")
        public String mqEndpoint;

        @NameInMap("MqEventList")
        public java.util.List<String> mqEventList;

        @NameInMap("MqGroupId")
        public String mqGroupId;

        @NameInMap("MqGroupIdTest")
        public String mqGroupIdTest;

        @NameInMap("MqInstanceId")
        public String mqInstanceId;

        @NameInMap("MqSubscribe")
        public Boolean mqSubscribe;

        @NameInMap("MqTopic")
        public String mqTopic;

        @NameInMap("MqTopicTest")
        public String mqTopicTest;

        public static GetSlrConfigurationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSlrConfigurationResponseBodyData self = new GetSlrConfigurationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSlrConfigurationResponseBodyData setMqEndpoint(String mqEndpoint) {
            this.mqEndpoint = mqEndpoint;
            return this;
        }
        public String getMqEndpoint() {
            return this.mqEndpoint;
        }

        public GetSlrConfigurationResponseBodyData setMqEventList(java.util.List<String> mqEventList) {
            this.mqEventList = mqEventList;
            return this;
        }
        public java.util.List<String> getMqEventList() {
            return this.mqEventList;
        }

        public GetSlrConfigurationResponseBodyData setMqGroupId(String mqGroupId) {
            this.mqGroupId = mqGroupId;
            return this;
        }
        public String getMqGroupId() {
            return this.mqGroupId;
        }

        public GetSlrConfigurationResponseBodyData setMqGroupIdTest(String mqGroupIdTest) {
            this.mqGroupIdTest = mqGroupIdTest;
            return this;
        }
        public String getMqGroupIdTest() {
            return this.mqGroupIdTest;
        }

        public GetSlrConfigurationResponseBodyData setMqInstanceId(String mqInstanceId) {
            this.mqInstanceId = mqInstanceId;
            return this;
        }
        public String getMqInstanceId() {
            return this.mqInstanceId;
        }

        public GetSlrConfigurationResponseBodyData setMqSubscribe(Boolean mqSubscribe) {
            this.mqSubscribe = mqSubscribe;
            return this;
        }
        public Boolean getMqSubscribe() {
            return this.mqSubscribe;
        }

        public GetSlrConfigurationResponseBodyData setMqTopic(String mqTopic) {
            this.mqTopic = mqTopic;
            return this;
        }
        public String getMqTopic() {
            return this.mqTopic;
        }

        public GetSlrConfigurationResponseBodyData setMqTopicTest(String mqTopicTest) {
            this.mqTopicTest = mqTopicTest;
            return this;
        }
        public String getMqTopicTest() {
            return this.mqTopicTest;
        }

    }

}
