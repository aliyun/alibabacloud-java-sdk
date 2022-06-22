// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class NodeExceptionsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<NodeExceptionsResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static NodeExceptionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        NodeExceptionsResponseBody self = new NodeExceptionsResponseBody();
        return TeaModel.build(map, self);
    }

    public NodeExceptionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public NodeExceptionsResponseBody setData(java.util.List<NodeExceptionsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<NodeExceptionsResponseBodyData> getData() {
        return this.data;
    }

    public NodeExceptionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public NodeExceptionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public NodeExceptionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class NodeExceptionsResponseBodyData extends TeaModel {
        @NameInMap("Detail")
        public String detail;

        @NameInMap("Exception")
        public String exception;

        @NameInMap("Num")
        public Integer num;

        @NameInMap("Timestamp")
        public Long timestamp;

        public static NodeExceptionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            NodeExceptionsResponseBodyData self = new NodeExceptionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public NodeExceptionsResponseBodyData setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public NodeExceptionsResponseBodyData setException(String exception) {
            this.exception = exception;
            return this;
        }
        public String getException() {
            return this.exception;
        }

        public NodeExceptionsResponseBodyData setNum(Integer num) {
            this.num = num;
            return this;
        }
        public Integer getNum() {
            return this.num;
        }

        public NodeExceptionsResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

}
