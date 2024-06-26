// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainMiniAppBrowserTransactionQRCodeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeAntChainMiniAppBrowserTransactionQRCodeResponseBodyResult result;

    public static DescribeAntChainMiniAppBrowserTransactionQRCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainMiniAppBrowserTransactionQRCodeResponseBody self = new DescribeAntChainMiniAppBrowserTransactionQRCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainMiniAppBrowserTransactionQRCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAntChainMiniAppBrowserTransactionQRCodeResponseBody setResult(DescribeAntChainMiniAppBrowserTransactionQRCodeResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeAntChainMiniAppBrowserTransactionQRCodeResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeAntChainMiniAppBrowserTransactionQRCodeResponseBodyResult extends TeaModel {
        @NameInMap("AntChainId")
        public String antChainId;

        @NameInMap("Base64QRCodePNG")
        public String base64QRCodePNG;

        @NameInMap("QRCodeContent")
        public String QRCodeContent;

        @NameInMap("TransactionHash")
        public String transactionHash;

        public static DescribeAntChainMiniAppBrowserTransactionQRCodeResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainMiniAppBrowserTransactionQRCodeResponseBodyResult self = new DescribeAntChainMiniAppBrowserTransactionQRCodeResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainMiniAppBrowserTransactionQRCodeResponseBodyResult setAntChainId(String antChainId) {
            this.antChainId = antChainId;
            return this;
        }
        public String getAntChainId() {
            return this.antChainId;
        }

        public DescribeAntChainMiniAppBrowserTransactionQRCodeResponseBodyResult setBase64QRCodePNG(String base64QRCodePNG) {
            this.base64QRCodePNG = base64QRCodePNG;
            return this;
        }
        public String getBase64QRCodePNG() {
            return this.base64QRCodePNG;
        }

        public DescribeAntChainMiniAppBrowserTransactionQRCodeResponseBodyResult setQRCodeContent(String QRCodeContent) {
            this.QRCodeContent = QRCodeContent;
            return this;
        }
        public String getQRCodeContent() {
            return this.QRCodeContent;
        }

        public DescribeAntChainMiniAppBrowserTransactionQRCodeResponseBodyResult setTransactionHash(String transactionHash) {
            this.transactionHash = transactionHash;
            return this;
        }
        public String getTransactionHash() {
            return this.transactionHash;
        }

    }

}
