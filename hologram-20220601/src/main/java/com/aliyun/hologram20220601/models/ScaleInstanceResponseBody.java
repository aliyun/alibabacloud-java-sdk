// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class ScaleInstanceResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public ScaleInstanceResponseBodyData data;

    /**
     * <p>The error code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D3AE84AB-0873-5FC7-A4C4-8CF869D2FA70</p>
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
        /**
         * <p>The error code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidScaleType.Unsupported</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The error details.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The ID of the order.</p>
         * 
         * <strong>example:</strong>
         * <p>219183853450000</p>
         */
        @NameInMap("OrderId")
        public String orderId;

        /**
         * <p>Indicates whether the change to specifications was successful.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>true</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>false</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
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
