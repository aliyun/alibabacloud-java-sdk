// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainMiniAppBrowserQRCodeAccessLogV2ResponseBody extends TeaModel {
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
    public DescribeAntChainMiniAppBrowserQRCodeAccessLogV2ResponseBodyResult result;

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

    public static DescribeAntChainMiniAppBrowserQRCodeAccessLogV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainMiniAppBrowserQRCodeAccessLogV2ResponseBody self = new DescribeAntChainMiniAppBrowserQRCodeAccessLogV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainMiniAppBrowserQRCodeAccessLogV2ResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAntChainMiniAppBrowserQRCodeAccessLogV2ResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeAntChainMiniAppBrowserQRCodeAccessLogV2ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAntChainMiniAppBrowserQRCodeAccessLogV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAntChainMiniAppBrowserQRCodeAccessLogV2ResponseBody setResult(DescribeAntChainMiniAppBrowserQRCodeAccessLogV2ResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeAntChainMiniAppBrowserQRCodeAccessLogV2ResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeAntChainMiniAppBrowserQRCodeAccessLogV2ResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DescribeAntChainMiniAppBrowserQRCodeAccessLogV2ResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DescribeAntChainMiniAppBrowserQRCodeAccessLogV2ResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAntChainMiniAppBrowserQRCodeAccessLogV2ResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("AccessAlipayAccountCount")
        public Long accessAlipayAccountCount;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("AccessCount")
        public Long accessCount;

        public static DescribeAntChainMiniAppBrowserQRCodeAccessLogV2ResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainMiniAppBrowserQRCodeAccessLogV2ResponseBodyResult self = new DescribeAntChainMiniAppBrowserQRCodeAccessLogV2ResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainMiniAppBrowserQRCodeAccessLogV2ResponseBodyResult setAccessAlipayAccountCount(Long accessAlipayAccountCount) {
            this.accessAlipayAccountCount = accessAlipayAccountCount;
            return this;
        }
        public Long getAccessAlipayAccountCount() {
            return this.accessAlipayAccountCount;
        }

        public DescribeAntChainMiniAppBrowserQRCodeAccessLogV2ResponseBodyResult setAccessCount(Long accessCount) {
            this.accessCount = accessCount;
            return this;
        }
        public Long getAccessCount() {
            return this.accessCount;
        }

    }

}
