// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainMiniAppBrowserQRCodeAccessLogNewResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeAntChainMiniAppBrowserQRCodeAccessLogNewResponseBodyResult result;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeAntChainMiniAppBrowserQRCodeAccessLogNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainMiniAppBrowserQRCodeAccessLogNewResponseBody self = new DescribeAntChainMiniAppBrowserQRCodeAccessLogNewResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainMiniAppBrowserQRCodeAccessLogNewResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAntChainMiniAppBrowserQRCodeAccessLogNewResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeAntChainMiniAppBrowserQRCodeAccessLogNewResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAntChainMiniAppBrowserQRCodeAccessLogNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAntChainMiniAppBrowserQRCodeAccessLogNewResponseBody setResult(DescribeAntChainMiniAppBrowserQRCodeAccessLogNewResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeAntChainMiniAppBrowserQRCodeAccessLogNewResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeAntChainMiniAppBrowserQRCodeAccessLogNewResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DescribeAntChainMiniAppBrowserQRCodeAccessLogNewResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DescribeAntChainMiniAppBrowserQRCodeAccessLogNewResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAntChainMiniAppBrowserQRCodeAccessLogNewResponseBodyResult extends TeaModel {
        @NameInMap("AccessAlipayAccountCount")
        public Long accessAlipayAccountCount;

        @NameInMap("AccessCount")
        public Long accessCount;

        public static DescribeAntChainMiniAppBrowserQRCodeAccessLogNewResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainMiniAppBrowserQRCodeAccessLogNewResponseBodyResult self = new DescribeAntChainMiniAppBrowserQRCodeAccessLogNewResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainMiniAppBrowserQRCodeAccessLogNewResponseBodyResult setAccessAlipayAccountCount(Long accessAlipayAccountCount) {
            this.accessAlipayAccountCount = accessAlipayAccountCount;
            return this;
        }
        public Long getAccessAlipayAccountCount() {
            return this.accessAlipayAccountCount;
        }

        public DescribeAntChainMiniAppBrowserQRCodeAccessLogNewResponseBodyResult setAccessCount(Long accessCount) {
            this.accessCount = accessCount;
            return this;
        }
        public Long getAccessCount() {
            return this.accessCount;
        }

    }

}
