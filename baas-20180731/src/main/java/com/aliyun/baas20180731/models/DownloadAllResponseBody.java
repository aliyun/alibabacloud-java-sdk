// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DownloadAllResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DownloadAllResponseBodyResult result;

    public static DownloadAllResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DownloadAllResponseBody self = new DownloadAllResponseBody();
        return TeaModel.build(map, self);
    }

    public DownloadAllResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DownloadAllResponseBody setResult(DownloadAllResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DownloadAllResponseBodyResult getResult() {
        return this.result;
    }

    public static class DownloadAllResponseBodyResult extends TeaModel {
        @NameInMap("BizviewUrl")
        public String bizviewUrl;

        @NameInMap("CertUrl")
        public String certUrl;

        @NameInMap("SdkUrl")
        public String sdkUrl;

        public static DownloadAllResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DownloadAllResponseBodyResult self = new DownloadAllResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DownloadAllResponseBodyResult setBizviewUrl(String bizviewUrl) {
            this.bizviewUrl = bizviewUrl;
            return this;
        }
        public String getBizviewUrl() {
            return this.bizviewUrl;
        }

        public DownloadAllResponseBodyResult setCertUrl(String certUrl) {
            this.certUrl = certUrl;
            return this;
        }
        public String getCertUrl() {
            return this.certUrl;
        }

        public DownloadAllResponseBodyResult setSdkUrl(String sdkUrl) {
            this.sdkUrl = sdkUrl;
            return this;
        }
        public String getSdkUrl() {
            return this.sdkUrl;
        }

    }

}
