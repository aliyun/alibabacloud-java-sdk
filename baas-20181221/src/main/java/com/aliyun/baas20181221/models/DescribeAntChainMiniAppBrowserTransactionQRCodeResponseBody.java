// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainMiniAppBrowserTransactionQRCodeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>D68D66B6-1964-4073-8714-B49F5EF1AEFC</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>bDXK6boZ</p>
         */
        @NameInMap("AntChainId")
        public String antChainId;

        /**
         * <strong>example:</strong>
         * <p>iVBORw0KGgo......ABJRU5ErkJggg==</p>
         */
        @NameInMap("Base64QRCodePNG")
        public String base64QRCodePNG;

        /**
         * <strong>example:</strong>
         * <p><a href="https://render.antfin.com/p/s/miniapp-web/?type=trans&from=aliyun&bizid=bDXK6boZ&hash=10692388f8b729cbb42d2985eebd3567812def357eb826a7ec810ce97e1f295e">https://render.antfin.com/p/s/miniapp-web/?type=trans&amp;from=aliyun&amp;bizid=bDXK6boZ&amp;hash=10692388f8b729cbb42d2985eebd3567812def357eb826a7ec810ce97e1f295e</a></p>
         */
        @NameInMap("QRCodeContent")
        public String QRCodeContent;

        /**
         * <strong>example:</strong>
         * <p>10692388f8b729cbb42d2985eebd3567812def357eb826a7ec810ce97e1f295e</p>
         */
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
