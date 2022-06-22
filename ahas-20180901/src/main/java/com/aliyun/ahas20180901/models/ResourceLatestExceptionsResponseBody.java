// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ResourceLatestExceptionsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ResourceLatestExceptionsResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ResourceLatestExceptionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResourceLatestExceptionsResponseBody self = new ResourceLatestExceptionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ResourceLatestExceptionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ResourceLatestExceptionsResponseBody setData(java.util.List<ResourceLatestExceptionsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ResourceLatestExceptionsResponseBodyData> getData() {
        return this.data;
    }

    public ResourceLatestExceptionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ResourceLatestExceptionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ResourceLatestExceptionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ResourceLatestExceptionsResponseBodyData extends TeaModel {
        @NameInMap("Detail")
        public String detail;

        @NameInMap("Exception")
        public String exception;

        @NameInMap("Num")
        public Integer num;

        @NameInMap("Timestamp")
        public Long timestamp;

        public static ResourceLatestExceptionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ResourceLatestExceptionsResponseBodyData self = new ResourceLatestExceptionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ResourceLatestExceptionsResponseBodyData setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public ResourceLatestExceptionsResponseBodyData setException(String exception) {
            this.exception = exception;
            return this;
        }
        public String getException() {
            return this.exception;
        }

        public ResourceLatestExceptionsResponseBodyData setNum(Integer num) {
            this.num = num;
            return this;
        }
        public Integer getNum() {
            return this.num;
        }

        public ResourceLatestExceptionsResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

}
