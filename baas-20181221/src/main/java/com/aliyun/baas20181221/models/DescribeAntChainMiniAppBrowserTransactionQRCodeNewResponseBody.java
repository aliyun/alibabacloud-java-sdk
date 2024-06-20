// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponseBody extends TeaModel {
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
     * <p>D68D66B6-1964-4073-8714-B49F5EF1AEFC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponseBodyResult result;

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

    public static DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponseBody self = new DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponseBody setResult(DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>8bd720bde18c4b37b0f4a1c7834db163</p>
         */
        @NameInMap("AntChainId")
        public String antChainId;

        /**
         * <strong>example:</strong>
         * <p>iVBORw0KGgoAAAANSUhEUgAAAPAAAADwCAIAAACxN37FAAAcb0lEQVR42u3dCZAc1XkAYGlPSRZIGIwEtos4tlM4lE05hhBsU</p>
         */
        @NameInMap("Base64QRCodePNG")
        public String base64QRCodePNG;

        /**
         * <strong>example:</strong>
         * <p><a href="https://render.antfin.com/p/s/miniapp-web/?type=trans&from=aliyun&bizid=8bd720bde18c4b37b0f4a1c7834db163&hash=ac73c8fa158436513e0b398632d9a082e04cee3eac6f9fb50087a46d801bdfd1&contractId=">https://render.antfin.com/p/s/miniapp-web/?type=trans&amp;from=aliyun&amp;bizid=8bd720bde18c4b37b0f4a1c7834db163&amp;hash=ac73c8fa158436513e0b398632d9a082e04cee3eac6f9fb50087a46d801bdfd1&amp;contractId=</a></p>
         */
        @NameInMap("QRCodeContent")
        public String QRCodeContent;

        /**
         * <strong>example:</strong>
         * <p>ac73c8fa158436513e0b398632d9a082e04cee3eac6f9fb50087a46d801bdfd1</p>
         */
        @NameInMap("TransactionHash")
        public String transactionHash;

        public static DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponseBodyResult self = new DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponseBodyResult setAntChainId(String antChainId) {
            this.antChainId = antChainId;
            return this;
        }
        public String getAntChainId() {
            return this.antChainId;
        }

        public DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponseBodyResult setBase64QRCodePNG(String base64QRCodePNG) {
            this.base64QRCodePNG = base64QRCodePNG;
            return this;
        }
        public String getBase64QRCodePNG() {
            return this.base64QRCodePNG;
        }

        public DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponseBodyResult setQRCodeContent(String QRCodeContent) {
            this.QRCodeContent = QRCodeContent;
            return this;
        }
        public String getQRCodeContent() {
            return this.QRCodeContent;
        }

        public DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponseBodyResult setTransactionHash(String transactionHash) {
            this.transactionHash = transactionHash;
            return this;
        }
        public String getTransactionHash() {
            return this.transactionHash;
        }

    }

}
