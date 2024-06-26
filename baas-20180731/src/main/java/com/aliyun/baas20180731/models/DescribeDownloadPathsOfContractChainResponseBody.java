// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeDownloadPathsOfContractChainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeDownloadPathsOfContractChainResponseBodyResult result;

    public static DescribeDownloadPathsOfContractChainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDownloadPathsOfContractChainResponseBody self = new DescribeDownloadPathsOfContractChainResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDownloadPathsOfContractChainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDownloadPathsOfContractChainResponseBody setResult(DescribeDownloadPathsOfContractChainResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeDownloadPathsOfContractChainResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeDownloadPathsOfContractChainResponseBodyResult extends TeaModel {
        @NameInMap("CaUrl")
        public String caUrl;

        @NameInMap("CertUrl")
        public String certUrl;

        @NameInMap("TrustCaUrl")
        public String trustCaUrl;

        public static DescribeDownloadPathsOfContractChainResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeDownloadPathsOfContractChainResponseBodyResult self = new DescribeDownloadPathsOfContractChainResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeDownloadPathsOfContractChainResponseBodyResult setCaUrl(String caUrl) {
            this.caUrl = caUrl;
            return this;
        }
        public String getCaUrl() {
            return this.caUrl;
        }

        public DescribeDownloadPathsOfContractChainResponseBodyResult setCertUrl(String certUrl) {
            this.certUrl = certUrl;
            return this;
        }
        public String getCertUrl() {
            return this.certUrl;
        }

        public DescribeDownloadPathsOfContractChainResponseBodyResult setTrustCaUrl(String trustCaUrl) {
            this.trustCaUrl = trustCaUrl;
            return this;
        }
        public String getTrustCaUrl() {
            return this.trustCaUrl;
        }

    }

}
