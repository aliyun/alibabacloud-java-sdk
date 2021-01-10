// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetSlrConfigurationResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetSlrConfigurationResponseBodyData data;

    @NameInMap("Code")
    public String code;

    public static GetSlrConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSlrConfigurationResponseBody self = new GetSlrConfigurationResponseBody();
        return TeaModel.build(map, self);
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

    public GetSlrConfigurationResponseBody setData(GetSlrConfigurationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSlrConfigurationResponseBodyData getData() {
        return this.data;
    }

    public GetSlrConfigurationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class GetSlrConfigurationResponseBodyData extends TeaModel {
        @NameInMap("MqGroupId")
        public String mqGroupId;

        @NameInMap("MqTopic")
        public String mqTopic;

        @NameInMap("MqInstanceId")
        public String mqInstanceId;

        @NameInMap("MqEventList")
        public java.util.List<String> mqEventList;

        @NameInMap("MqEndpoint")
        public String mqEndpoint;

        @NameInMap("MqSubscribe")
        public Boolean mqSubscribe;

        public static GetSlrConfigurationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSlrConfigurationResponseBodyData self = new GetSlrConfigurationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSlrConfigurationResponseBodyData setMqGroupId(String mqGroupId) {
            this.mqGroupId = mqGroupId;
            return this;
        }
        public String getMqGroupId() {
            return this.mqGroupId;
        }

        public GetSlrConfigurationResponseBodyData setMqTopic(String mqTopic) {
            this.mqTopic = mqTopic;
            return this;
        }
        public String getMqTopic() {
            return this.mqTopic;
        }

        public GetSlrConfigurationResponseBodyData setMqInstanceId(String mqInstanceId) {
            this.mqInstanceId = mqInstanceId;
            return this;
        }
        public String getMqInstanceId() {
            return this.mqInstanceId;
        }

        public GetSlrConfigurationResponseBodyData setMqEventList(java.util.List<String> mqEventList) {
            this.mqEventList = mqEventList;
            return this;
        }
        public java.util.List<String> getMqEventList() {
            return this.mqEventList;
        }

        public GetSlrConfigurationResponseBodyData setMqEndpoint(String mqEndpoint) {
            this.mqEndpoint = mqEndpoint;
            return this;
        }
        public String getMqEndpoint() {
            return this.mqEndpoint;
        }

        public GetSlrConfigurationResponseBodyData setMqSubscribe(Boolean mqSubscribe) {
            this.mqSubscribe = mqSubscribe;
            return this;
        }
        public Boolean getMqSubscribe() {
            return this.mqSubscribe;
        }

    }

}
