// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribePublicAntChainDownloadPathsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribePublicAntChainDownloadPathsResponseBodyResult result;

    public static DescribePublicAntChainDownloadPathsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePublicAntChainDownloadPathsResponseBody self = new DescribePublicAntChainDownloadPathsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePublicAntChainDownloadPathsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePublicAntChainDownloadPathsResponseBody setResult(DescribePublicAntChainDownloadPathsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribePublicAntChainDownloadPathsResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribePublicAntChainDownloadPathsResponseBodyResult extends TeaModel {
        @NameInMap("CaCrtUrl")
        public String caCrtUrl;

        @NameInMap("ClientCrtUrl")
        public String clientCrtUrl;

        @NameInMap("SdkUrl")
        public String sdkUrl;

        @NameInMap("TrustCaUrl")
        public String trustCaUrl;

        public static DescribePublicAntChainDownloadPathsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribePublicAntChainDownloadPathsResponseBodyResult self = new DescribePublicAntChainDownloadPathsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribePublicAntChainDownloadPathsResponseBodyResult setCaCrtUrl(String caCrtUrl) {
            this.caCrtUrl = caCrtUrl;
            return this;
        }
        public String getCaCrtUrl() {
            return this.caCrtUrl;
        }

        public DescribePublicAntChainDownloadPathsResponseBodyResult setClientCrtUrl(String clientCrtUrl) {
            this.clientCrtUrl = clientCrtUrl;
            return this;
        }
        public String getClientCrtUrl() {
            return this.clientCrtUrl;
        }

        public DescribePublicAntChainDownloadPathsResponseBodyResult setSdkUrl(String sdkUrl) {
            this.sdkUrl = sdkUrl;
            return this;
        }
        public String getSdkUrl() {
            return this.sdkUrl;
        }

        public DescribePublicAntChainDownloadPathsResponseBodyResult setTrustCaUrl(String trustCaUrl) {
            this.trustCaUrl = trustCaUrl;
            return this;
        }
        public String getTrustCaUrl() {
            return this.trustCaUrl;
        }

    }

}
