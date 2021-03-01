// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DeleteServiceTimeConfigResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public DeleteServiceTimeConfigResponseBodyData data;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Success")
    public Boolean success;

    public static DeleteServiceTimeConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceTimeConfigResponseBody self = new DeleteServiceTimeConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteServiceTimeConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteServiceTimeConfigResponseBody setData(DeleteServiceTimeConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteServiceTimeConfigResponseBodyData getData() {
        return this.data;
    }

    public DeleteServiceTimeConfigResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DeleteServiceTimeConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteServiceTimeConfigResponseBodyData extends TeaModel {
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

        public static DeleteServiceTimeConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteServiceTimeConfigResponseBodyData self = new DeleteServiceTimeConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteServiceTimeConfigResponseBodyData setTimeout(String timeout) {
            this.timeout = timeout;
            return this;
        }
        public String getTimeout() {
            return this.timeout;
        }

        public DeleteServiceTimeConfigResponseBodyData setConsumerAppName(String consumerAppName) {
            this.consumerAppName = consumerAppName;
            return this;
        }
        public String getConsumerAppName() {
            return this.consumerAppName;
        }

        public DeleteServiceTimeConfigResponseBodyData setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DeleteServiceTimeConfigResponseBodyData setConsumerAppId(String consumerAppId) {
            this.consumerAppId = consumerAppId;
            return this;
        }
        public String getConsumerAppId() {
            return this.consumerAppId;
        }

        public DeleteServiceTimeConfigResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
