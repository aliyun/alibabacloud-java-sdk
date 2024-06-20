// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainMiniAppBrowserQRCodeAccessLogResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>D68D66B6-1964-4073-8714-B49F5EF1AEFC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeAntChainMiniAppBrowserQRCodeAccessLogResponseBodyResult result;

    public static DescribeAntChainMiniAppBrowserQRCodeAccessLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainMiniAppBrowserQRCodeAccessLogResponseBody self = new DescribeAntChainMiniAppBrowserQRCodeAccessLogResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainMiniAppBrowserQRCodeAccessLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAntChainMiniAppBrowserQRCodeAccessLogResponseBody setResult(DescribeAntChainMiniAppBrowserQRCodeAccessLogResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeAntChainMiniAppBrowserQRCodeAccessLogResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeAntChainMiniAppBrowserQRCodeAccessLogResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("AccessAlipayAccountCount")
        public Long accessAlipayAccountCount;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("AccessCount")
        public Long accessCount;

        public static DescribeAntChainMiniAppBrowserQRCodeAccessLogResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainMiniAppBrowserQRCodeAccessLogResponseBodyResult self = new DescribeAntChainMiniAppBrowserQRCodeAccessLogResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainMiniAppBrowserQRCodeAccessLogResponseBodyResult setAccessAlipayAccountCount(Long accessAlipayAccountCount) {
            this.accessAlipayAccountCount = accessAlipayAccountCount;
            return this;
        }
        public Long getAccessAlipayAccountCount() {
            return this.accessAlipayAccountCount;
        }

        public DescribeAntChainMiniAppBrowserQRCodeAccessLogResponseBodyResult setAccessCount(Long accessCount) {
            this.accessCount = accessCount;
            return this;
        }
        public Long getAccessCount() {
            return this.accessCount;
        }

    }

}
