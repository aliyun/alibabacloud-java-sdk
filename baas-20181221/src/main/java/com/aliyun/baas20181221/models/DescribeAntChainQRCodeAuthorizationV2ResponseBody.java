// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainQRCodeAuthorizationV2ResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>980061FC-058D-4298-8598-D9DDB10D0ED4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeAntChainQRCodeAuthorizationV2ResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("ResultCode")
    public String resultCode;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("ResultMessage")
    public String resultMessage;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeAntChainQRCodeAuthorizationV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainQRCodeAuthorizationV2ResponseBody self = new DescribeAntChainQRCodeAuthorizationV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainQRCodeAuthorizationV2ResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAntChainQRCodeAuthorizationV2ResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeAntChainQRCodeAuthorizationV2ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAntChainQRCodeAuthorizationV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAntChainQRCodeAuthorizationV2ResponseBody setResult(DescribeAntChainQRCodeAuthorizationV2ResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeAntChainQRCodeAuthorizationV2ResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeAntChainQRCodeAuthorizationV2ResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DescribeAntChainQRCodeAuthorizationV2ResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DescribeAntChainQRCodeAuthorizationV2ResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAntChainQRCodeAuthorizationV2ResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>8bd720bde18c4b37b0f4a1c7834db163</p>
         */
        @NameInMap("AntChainId")
        public String antChainId;

        /**
         * <strong>example:</strong>
         * <p>ALL_USER_AUTHORIZATION</p>
         */
        @NameInMap("AuthorizationType")
        public String authorizationType;

        /**
         * <strong>example:</strong>
         * <p>MINI_APP_BROWSER_TRANSACTION</p>
         */
        @NameInMap("QRCodeType")
        public String QRCodeType;

        public static DescribeAntChainQRCodeAuthorizationV2ResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainQRCodeAuthorizationV2ResponseBodyResult self = new DescribeAntChainQRCodeAuthorizationV2ResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainQRCodeAuthorizationV2ResponseBodyResult setAntChainId(String antChainId) {
            this.antChainId = antChainId;
            return this;
        }
        public String getAntChainId() {
            return this.antChainId;
        }

        public DescribeAntChainQRCodeAuthorizationV2ResponseBodyResult setAuthorizationType(String authorizationType) {
            this.authorizationType = authorizationType;
            return this;
        }
        public String getAuthorizationType() {
            return this.authorizationType;
        }

        public DescribeAntChainQRCodeAuthorizationV2ResponseBodyResult setQRCodeType(String QRCodeType) {
            this.QRCodeType = QRCodeType;
            return this;
        }
        public String getQRCodeType() {
            return this.QRCodeType;
        }

    }

}
