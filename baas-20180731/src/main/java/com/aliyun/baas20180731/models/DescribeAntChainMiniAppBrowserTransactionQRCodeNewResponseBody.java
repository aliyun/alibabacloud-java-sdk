// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponseBodyResult result;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

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
        @NameInMap("AntChainId")
        public String antChainId;

        @NameInMap("Base64QRCodePNG")
        public String base64QRCodePNG;

        @NameInMap("QRCodeContent")
        public String QRCodeContent;

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
