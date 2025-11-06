// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class GetAckInfoOfMessageResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<GetAckInfoOfMessageResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetAckInfoOfMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAckInfoOfMessageResponseBody self = new GetAckInfoOfMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAckInfoOfMessageResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetAckInfoOfMessageResponseBody setData(java.util.List<GetAckInfoOfMessageResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetAckInfoOfMessageResponseBodyData> getData() {
        return this.data;
    }

    public GetAckInfoOfMessageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAckInfoOfMessageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAckInfoOfMessageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAckInfoOfMessageResponseBodyData extends TeaModel {
        @NameInMap("AckErrorInfo")
        public String ackErrorInfo;

        @NameInMap("AckResult")
        public String ackResult;

        @NameInMap("Action")
        public String action;

        @NameInMap("Code")
        public String code;

        @NameInMap("Property")
        public java.util.Map<String, ?> property;

        @NameInMap("TimeStamp")
        public String timeStamp;

        public static GetAckInfoOfMessageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAckInfoOfMessageResponseBodyData self = new GetAckInfoOfMessageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAckInfoOfMessageResponseBodyData setAckErrorInfo(String ackErrorInfo) {
            this.ackErrorInfo = ackErrorInfo;
            return this;
        }
        public String getAckErrorInfo() {
            return this.ackErrorInfo;
        }

        public GetAckInfoOfMessageResponseBodyData setAckResult(String ackResult) {
            this.ackResult = ackResult;
            return this;
        }
        public String getAckResult() {
            return this.ackResult;
        }

        public GetAckInfoOfMessageResponseBodyData setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public GetAckInfoOfMessageResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetAckInfoOfMessageResponseBodyData setProperty(java.util.Map<String, ?> property) {
            this.property = property;
            return this;
        }
        public java.util.Map<String, ?> getProperty() {
            return this.property;
        }

        public GetAckInfoOfMessageResponseBodyData setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

}
