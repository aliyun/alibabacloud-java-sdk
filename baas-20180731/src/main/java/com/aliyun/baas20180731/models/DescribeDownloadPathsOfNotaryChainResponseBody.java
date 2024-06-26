// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeDownloadPathsOfNotaryChainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeDownloadPathsOfNotaryChainResponseBodyResult result;

    public static DescribeDownloadPathsOfNotaryChainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDownloadPathsOfNotaryChainResponseBody self = new DescribeDownloadPathsOfNotaryChainResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDownloadPathsOfNotaryChainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDownloadPathsOfNotaryChainResponseBody setResult(DescribeDownloadPathsOfNotaryChainResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeDownloadPathsOfNotaryChainResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeDownloadPathsOfNotaryChainResponseBodyResult extends TeaModel {
        @NameInMap("BizviewUrl")
        public String bizviewUrl;

        @NameInMap("CertUrl")
        public String certUrl;

        @NameInMap("SdkUrl")
        public String sdkUrl;

        public static DescribeDownloadPathsOfNotaryChainResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeDownloadPathsOfNotaryChainResponseBodyResult self = new DescribeDownloadPathsOfNotaryChainResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeDownloadPathsOfNotaryChainResponseBodyResult setBizviewUrl(String bizviewUrl) {
            this.bizviewUrl = bizviewUrl;
            return this;
        }
        public String getBizviewUrl() {
            return this.bizviewUrl;
        }

        public DescribeDownloadPathsOfNotaryChainResponseBodyResult setCertUrl(String certUrl) {
            this.certUrl = certUrl;
            return this;
        }
        public String getCertUrl() {
            return this.certUrl;
        }

        public DescribeDownloadPathsOfNotaryChainResponseBodyResult setSdkUrl(String sdkUrl) {
            this.sdkUrl = sdkUrl;
            return this;
        }
        public String getSdkUrl() {
            return this.sdkUrl;
        }

    }

}
