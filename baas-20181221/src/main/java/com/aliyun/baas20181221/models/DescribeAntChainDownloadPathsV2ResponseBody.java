// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainDownloadPathsV2ResponseBody extends TeaModel {
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
    public DescribeAntChainDownloadPathsV2ResponseBodyResult result;

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

    public static DescribeAntChainDownloadPathsV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainDownloadPathsV2ResponseBody self = new DescribeAntChainDownloadPathsV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainDownloadPathsV2ResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAntChainDownloadPathsV2ResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeAntChainDownloadPathsV2ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAntChainDownloadPathsV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAntChainDownloadPathsV2ResponseBody setResult(DescribeAntChainDownloadPathsV2ResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeAntChainDownloadPathsV2ResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeAntChainDownloadPathsV2ResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DescribeAntChainDownloadPathsV2ResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DescribeAntChainDownloadPathsV2ResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAntChainDownloadPathsV2ResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>http://***ca.crt</p>
         */
        @NameInMap("CaCrtUrl")
        public String caCrtUrl;

        /**
         * <strong>example:</strong>
         * <p>http://***client.crt</p>
         */
        @NameInMap("ClientCrtUrl")
        public String clientCrtUrl;

        /**
         * <strong>example:</strong>
         * <p>http://***</p>
         */
        @NameInMap("SdkUrl")
        public String sdkUrl;

        /**
         * <strong>example:</strong>
         * <p>http://***trustCa</p>
         */
        @NameInMap("TrustCaUrl")
        public String trustCaUrl;

        public static DescribeAntChainDownloadPathsV2ResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainDownloadPathsV2ResponseBodyResult self = new DescribeAntChainDownloadPathsV2ResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainDownloadPathsV2ResponseBodyResult setCaCrtUrl(String caCrtUrl) {
            this.caCrtUrl = caCrtUrl;
            return this;
        }
        public String getCaCrtUrl() {
            return this.caCrtUrl;
        }

        public DescribeAntChainDownloadPathsV2ResponseBodyResult setClientCrtUrl(String clientCrtUrl) {
            this.clientCrtUrl = clientCrtUrl;
            return this;
        }
        public String getClientCrtUrl() {
            return this.clientCrtUrl;
        }

        public DescribeAntChainDownloadPathsV2ResponseBodyResult setSdkUrl(String sdkUrl) {
            this.sdkUrl = sdkUrl;
            return this;
        }
        public String getSdkUrl() {
            return this.sdkUrl;
        }

        public DescribeAntChainDownloadPathsV2ResponseBodyResult setTrustCaUrl(String trustCaUrl) {
            this.trustCaUrl = trustCaUrl;
            return this;
        }
        public String getTrustCaUrl() {
            return this.trustCaUrl;
        }

    }

}
