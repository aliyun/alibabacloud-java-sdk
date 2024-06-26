// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class ApplyBlockchainWithKeyAutoCreationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public ApplyBlockchainWithKeyAutoCreationResponseBodyResult result;

    public static ApplyBlockchainWithKeyAutoCreationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplyBlockchainWithKeyAutoCreationResponseBody self = new ApplyBlockchainWithKeyAutoCreationResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplyBlockchainWithKeyAutoCreationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ApplyBlockchainWithKeyAutoCreationResponseBody setResult(ApplyBlockchainWithKeyAutoCreationResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ApplyBlockchainWithKeyAutoCreationResponseBodyResult getResult() {
        return this.result;
    }

    public static class ApplyBlockchainWithKeyAutoCreationResponseBodyResultDownloadPath extends TeaModel {
        @NameInMap("BizviewUrl")
        public String bizviewUrl;

        @NameInMap("CertUrl")
        public String certUrl;

        @NameInMap("SdkUrl")
        public String sdkUrl;

        public static ApplyBlockchainWithKeyAutoCreationResponseBodyResultDownloadPath build(java.util.Map<String, ?> map) throws Exception {
            ApplyBlockchainWithKeyAutoCreationResponseBodyResultDownloadPath self = new ApplyBlockchainWithKeyAutoCreationResponseBodyResultDownloadPath();
            return TeaModel.build(map, self);
        }

        public ApplyBlockchainWithKeyAutoCreationResponseBodyResultDownloadPath setBizviewUrl(String bizviewUrl) {
            this.bizviewUrl = bizviewUrl;
            return this;
        }
        public String getBizviewUrl() {
            return this.bizviewUrl;
        }

        public ApplyBlockchainWithKeyAutoCreationResponseBodyResultDownloadPath setCertUrl(String certUrl) {
            this.certUrl = certUrl;
            return this;
        }
        public String getCertUrl() {
            return this.certUrl;
        }

        public ApplyBlockchainWithKeyAutoCreationResponseBodyResultDownloadPath setSdkUrl(String sdkUrl) {
            this.sdkUrl = sdkUrl;
            return this;
        }
        public String getSdkUrl() {
            return this.sdkUrl;
        }

    }

    public static class ApplyBlockchainWithKeyAutoCreationResponseBodyResult extends TeaModel {
        @NameInMap("DownloadPath")
        public ApplyBlockchainWithKeyAutoCreationResponseBodyResultDownloadPath downloadPath;

        @NameInMap("PrivateKey")
        public String privateKey;

        public static ApplyBlockchainWithKeyAutoCreationResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ApplyBlockchainWithKeyAutoCreationResponseBodyResult self = new ApplyBlockchainWithKeyAutoCreationResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ApplyBlockchainWithKeyAutoCreationResponseBodyResult setDownloadPath(ApplyBlockchainWithKeyAutoCreationResponseBodyResultDownloadPath downloadPath) {
            this.downloadPath = downloadPath;
            return this;
        }
        public ApplyBlockchainWithKeyAutoCreationResponseBodyResultDownloadPath getDownloadPath() {
            return this.downloadPath;
        }

        public ApplyBlockchainWithKeyAutoCreationResponseBodyResult setPrivateKey(String privateKey) {
            this.privateKey = privateKey;
            return this;
        }
        public String getPrivateKey() {
            return this.privateKey;
        }

    }

}
