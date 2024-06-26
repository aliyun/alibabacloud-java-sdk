// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainDownloadPathsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeAntChainDownloadPathsResponseBodyResult result;

    public static DescribeAntChainDownloadPathsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainDownloadPathsResponseBody self = new DescribeAntChainDownloadPathsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainDownloadPathsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAntChainDownloadPathsResponseBody setResult(DescribeAntChainDownloadPathsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeAntChainDownloadPathsResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeAntChainDownloadPathsResponseBodyResult extends TeaModel {
        @NameInMap("CaCrtUrl")
        public String caCrtUrl;

        @NameInMap("ClientCrtUrl")
        public String clientCrtUrl;

        @NameInMap("SdkUrl")
        public String sdkUrl;

        @NameInMap("TrustCaUrl")
        public String trustCaUrl;

        public static DescribeAntChainDownloadPathsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainDownloadPathsResponseBodyResult self = new DescribeAntChainDownloadPathsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainDownloadPathsResponseBodyResult setCaCrtUrl(String caCrtUrl) {
            this.caCrtUrl = caCrtUrl;
            return this;
        }
        public String getCaCrtUrl() {
            return this.caCrtUrl;
        }

        public DescribeAntChainDownloadPathsResponseBodyResult setClientCrtUrl(String clientCrtUrl) {
            this.clientCrtUrl = clientCrtUrl;
            return this;
        }
        public String getClientCrtUrl() {
            return this.clientCrtUrl;
        }

        public DescribeAntChainDownloadPathsResponseBodyResult setSdkUrl(String sdkUrl) {
            this.sdkUrl = sdkUrl;
            return this;
        }
        public String getSdkUrl() {
            return this.sdkUrl;
        }

        public DescribeAntChainDownloadPathsResponseBodyResult setTrustCaUrl(String trustCaUrl) {
            this.trustCaUrl = trustCaUrl;
            return this;
        }
        public String getTrustCaUrl() {
            return this.trustCaUrl;
        }

    }

}
