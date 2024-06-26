// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeDownloadPathsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeDownloadPathsResponseBodyResult result;

    public static DescribeDownloadPathsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDownloadPathsResponseBody self = new DescribeDownloadPathsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDownloadPathsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDownloadPathsResponseBody setResult(DescribeDownloadPathsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeDownloadPathsResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeDownloadPathsResponseBodyResult extends TeaModel {
        @NameInMap("BizviewUrl")
        public String bizviewUrl;

        @NameInMap("CertUrl")
        public String certUrl;

        @NameInMap("SdkUrl")
        public String sdkUrl;

        public static DescribeDownloadPathsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeDownloadPathsResponseBodyResult self = new DescribeDownloadPathsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeDownloadPathsResponseBodyResult setBizviewUrl(String bizviewUrl) {
            this.bizviewUrl = bizviewUrl;
            return this;
        }
        public String getBizviewUrl() {
            return this.bizviewUrl;
        }

        public DescribeDownloadPathsResponseBodyResult setCertUrl(String certUrl) {
            this.certUrl = certUrl;
            return this;
        }
        public String getCertUrl() {
            return this.certUrl;
        }

        public DescribeDownloadPathsResponseBodyResult setSdkUrl(String sdkUrl) {
            this.sdkUrl = sdkUrl;
            return this;
        }
        public String getSdkUrl() {
            return this.sdkUrl;
        }

    }

}
