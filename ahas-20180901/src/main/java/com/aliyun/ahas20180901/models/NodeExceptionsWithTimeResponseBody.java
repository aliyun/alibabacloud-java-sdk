// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class NodeExceptionsWithTimeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<NodeExceptionsWithTimeResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static NodeExceptionsWithTimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        NodeExceptionsWithTimeResponseBody self = new NodeExceptionsWithTimeResponseBody();
        return TeaModel.build(map, self);
    }

    public NodeExceptionsWithTimeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public NodeExceptionsWithTimeResponseBody setData(java.util.List<NodeExceptionsWithTimeResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<NodeExceptionsWithTimeResponseBodyData> getData() {
        return this.data;
    }

    public NodeExceptionsWithTimeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public NodeExceptionsWithTimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public NodeExceptionsWithTimeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class NodeExceptionsWithTimeResponseBodyData extends TeaModel {
        @NameInMap("Detail")
        public String detail;

        @NameInMap("Exception")
        public String exception;

        @NameInMap("Num")
        public Integer num;

        @NameInMap("Timestamp")
        public Long timestamp;

        public static NodeExceptionsWithTimeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            NodeExceptionsWithTimeResponseBodyData self = new NodeExceptionsWithTimeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public NodeExceptionsWithTimeResponseBodyData setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public NodeExceptionsWithTimeResponseBodyData setException(String exception) {
            this.exception = exception;
            return this;
        }
        public String getException() {
            return this.exception;
        }

        public NodeExceptionsWithTimeResponseBodyData setNum(Integer num) {
            this.num = num;
            return this;
        }
        public Integer getNum() {
            return this.num;
        }

        public NodeExceptionsWithTimeResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

}
