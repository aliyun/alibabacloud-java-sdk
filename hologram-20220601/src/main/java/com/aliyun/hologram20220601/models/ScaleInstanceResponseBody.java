// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class ScaleInstanceResponseBody extends TeaModel {
    @NameInMap("Data")
    public ScaleInstanceResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ScaleInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ScaleInstanceResponseBody self = new ScaleInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ScaleInstanceResponseBody setData(ScaleInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ScaleInstanceResponseBodyData getData() {
        return this.data;
    }

    public ScaleInstanceResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ScaleInstanceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ScaleInstanceResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ScaleInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ScaleInstanceResponseBodyData extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("OrderId")
        public String orderId;

        @NameInMap("Success")
        public Boolean success;

        public static ScaleInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ScaleInstanceResponseBodyData self = new ScaleInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ScaleInstanceResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ScaleInstanceResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ScaleInstanceResponseBodyData setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public ScaleInstanceResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
