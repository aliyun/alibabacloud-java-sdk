// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ResourceExceptionsWithTimeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ResourceExceptionsWithTimeResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ResourceExceptionsWithTimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResourceExceptionsWithTimeResponseBody self = new ResourceExceptionsWithTimeResponseBody();
        return TeaModel.build(map, self);
    }

    public ResourceExceptionsWithTimeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ResourceExceptionsWithTimeResponseBody setData(java.util.List<ResourceExceptionsWithTimeResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ResourceExceptionsWithTimeResponseBodyData> getData() {
        return this.data;
    }

    public ResourceExceptionsWithTimeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ResourceExceptionsWithTimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ResourceExceptionsWithTimeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ResourceExceptionsWithTimeResponseBodyData extends TeaModel {
        @NameInMap("Detail")
        public String detail;

        @NameInMap("Exception")
        public String exception;

        @NameInMap("Num")
        public Integer num;

        @NameInMap("Timestamp")
        public Long timestamp;

        public static ResourceExceptionsWithTimeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ResourceExceptionsWithTimeResponseBodyData self = new ResourceExceptionsWithTimeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ResourceExceptionsWithTimeResponseBodyData setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public ResourceExceptionsWithTimeResponseBodyData setException(String exception) {
            this.exception = exception;
            return this;
        }
        public String getException() {
            return this.exception;
        }

        public ResourceExceptionsWithTimeResponseBodyData setNum(Integer num) {
            this.num = num;
            return this;
        }
        public Integer getNum() {
            return this.num;
        }

        public ResourceExceptionsWithTimeResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

}
