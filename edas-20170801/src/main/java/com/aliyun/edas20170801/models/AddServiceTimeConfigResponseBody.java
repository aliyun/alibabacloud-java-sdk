// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class AddServiceTimeConfigResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public AddServiceTimeConfigResponseBodyData data;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Success")
    public Boolean success;

    public static AddServiceTimeConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddServiceTimeConfigResponseBody self = new AddServiceTimeConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public AddServiceTimeConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddServiceTimeConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddServiceTimeConfigResponseBody setData(AddServiceTimeConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddServiceTimeConfigResponseBodyData getData() {
        return this.data;
    }

    public AddServiceTimeConfigResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public AddServiceTimeConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AddServiceTimeConfigResponseBodyData extends TeaModel {
        @NameInMap("Timeout")
        public String timeout;

        @NameInMap("ConsumerAppName")
        public String consumerAppName;

        @NameInMap("Path")
        public String path;

        @NameInMap("ConsumerAppId")
        public String consumerAppId;

        @NameInMap("Id")
        public Long id;

        public static AddServiceTimeConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddServiceTimeConfigResponseBodyData self = new AddServiceTimeConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddServiceTimeConfigResponseBodyData setTimeout(String timeout) {
            this.timeout = timeout;
            return this;
        }
        public String getTimeout() {
            return this.timeout;
        }

        public AddServiceTimeConfigResponseBodyData setConsumerAppName(String consumerAppName) {
            this.consumerAppName = consumerAppName;
            return this;
        }
        public String getConsumerAppName() {
            return this.consumerAppName;
        }

        public AddServiceTimeConfigResponseBodyData setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public AddServiceTimeConfigResponseBodyData setConsumerAppId(String consumerAppId) {
            this.consumerAppId = consumerAppId;
            return this;
        }
        public String getConsumerAppId() {
            return this.consumerAppId;
        }

        public AddServiceTimeConfigResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
