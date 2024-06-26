// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainDownloadPathsNewResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeAntChainDownloadPathsNewResponseBodyResult result;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeAntChainDownloadPathsNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainDownloadPathsNewResponseBody self = new DescribeAntChainDownloadPathsNewResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainDownloadPathsNewResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAntChainDownloadPathsNewResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeAntChainDownloadPathsNewResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAntChainDownloadPathsNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAntChainDownloadPathsNewResponseBody setResult(DescribeAntChainDownloadPathsNewResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeAntChainDownloadPathsNewResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeAntChainDownloadPathsNewResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DescribeAntChainDownloadPathsNewResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DescribeAntChainDownloadPathsNewResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAntChainDownloadPathsNewResponseBodyResult extends TeaModel {
        @NameInMap("CaCrtUrl")
        public String caCrtUrl;

        @NameInMap("ClientCrtUrl")
        public String clientCrtUrl;

        @NameInMap("SdkUrl")
        public String sdkUrl;

        @NameInMap("TrustCaUrl")
        public String trustCaUrl;

        public static DescribeAntChainDownloadPathsNewResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainDownloadPathsNewResponseBodyResult self = new DescribeAntChainDownloadPathsNewResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainDownloadPathsNewResponseBodyResult setCaCrtUrl(String caCrtUrl) {
            this.caCrtUrl = caCrtUrl;
            return this;
        }
        public String getCaCrtUrl() {
            return this.caCrtUrl;
        }

        public DescribeAntChainDownloadPathsNewResponseBodyResult setClientCrtUrl(String clientCrtUrl) {
            this.clientCrtUrl = clientCrtUrl;
            return this;
        }
        public String getClientCrtUrl() {
            return this.clientCrtUrl;
        }

        public DescribeAntChainDownloadPathsNewResponseBodyResult setSdkUrl(String sdkUrl) {
            this.sdkUrl = sdkUrl;
            return this;
        }
        public String getSdkUrl() {
            return this.sdkUrl;
        }

        public DescribeAntChainDownloadPathsNewResponseBodyResult setTrustCaUrl(String trustCaUrl) {
            this.trustCaUrl = trustCaUrl;
            return this;
        }
        public String getTrustCaUrl() {
            return this.trustCaUrl;
        }

    }

}
