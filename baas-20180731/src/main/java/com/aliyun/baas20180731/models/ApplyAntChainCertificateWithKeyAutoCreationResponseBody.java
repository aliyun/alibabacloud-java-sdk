// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class ApplyAntChainCertificateWithKeyAutoCreationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public ApplyAntChainCertificateWithKeyAutoCreationResponseBodyResult result;

    public static ApplyAntChainCertificateWithKeyAutoCreationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplyAntChainCertificateWithKeyAutoCreationResponseBody self = new ApplyAntChainCertificateWithKeyAutoCreationResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplyAntChainCertificateWithKeyAutoCreationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ApplyAntChainCertificateWithKeyAutoCreationResponseBody setResult(ApplyAntChainCertificateWithKeyAutoCreationResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ApplyAntChainCertificateWithKeyAutoCreationResponseBodyResult getResult() {
        return this.result;
    }

    public static class ApplyAntChainCertificateWithKeyAutoCreationResponseBodyResultDownloadPath extends TeaModel {
        @NameInMap("CaCrtUrl")
        public String caCrtUrl;

        @NameInMap("ClientCrtUrl")
        public String clientCrtUrl;

        @NameInMap("SdkUrl")
        public String sdkUrl;

        @NameInMap("TrustCaUrl")
        public String trustCaUrl;

        public static ApplyAntChainCertificateWithKeyAutoCreationResponseBodyResultDownloadPath build(java.util.Map<String, ?> map) throws Exception {
            ApplyAntChainCertificateWithKeyAutoCreationResponseBodyResultDownloadPath self = new ApplyAntChainCertificateWithKeyAutoCreationResponseBodyResultDownloadPath();
            return TeaModel.build(map, self);
        }

        public ApplyAntChainCertificateWithKeyAutoCreationResponseBodyResultDownloadPath setCaCrtUrl(String caCrtUrl) {
            this.caCrtUrl = caCrtUrl;
            return this;
        }
        public String getCaCrtUrl() {
            return this.caCrtUrl;
        }

        public ApplyAntChainCertificateWithKeyAutoCreationResponseBodyResultDownloadPath setClientCrtUrl(String clientCrtUrl) {
            this.clientCrtUrl = clientCrtUrl;
            return this;
        }
        public String getClientCrtUrl() {
            return this.clientCrtUrl;
        }

        public ApplyAntChainCertificateWithKeyAutoCreationResponseBodyResultDownloadPath setSdkUrl(String sdkUrl) {
            this.sdkUrl = sdkUrl;
            return this;
        }
        public String getSdkUrl() {
            return this.sdkUrl;
        }

        public ApplyAntChainCertificateWithKeyAutoCreationResponseBodyResultDownloadPath setTrustCaUrl(String trustCaUrl) {
            this.trustCaUrl = trustCaUrl;
            return this;
        }
        public String getTrustCaUrl() {
            return this.trustCaUrl;
        }

    }

    public static class ApplyAntChainCertificateWithKeyAutoCreationResponseBodyResult extends TeaModel {
        @NameInMap("DownloadPath")
        public ApplyAntChainCertificateWithKeyAutoCreationResponseBodyResultDownloadPath downloadPath;

        @NameInMap("PrivateKey")
        public String privateKey;

        public static ApplyAntChainCertificateWithKeyAutoCreationResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ApplyAntChainCertificateWithKeyAutoCreationResponseBodyResult self = new ApplyAntChainCertificateWithKeyAutoCreationResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ApplyAntChainCertificateWithKeyAutoCreationResponseBodyResult setDownloadPath(ApplyAntChainCertificateWithKeyAutoCreationResponseBodyResultDownloadPath downloadPath) {
            this.downloadPath = downloadPath;
            return this;
        }
        public ApplyAntChainCertificateWithKeyAutoCreationResponseBodyResultDownloadPath getDownloadPath() {
            return this.downloadPath;
        }

        public ApplyAntChainCertificateWithKeyAutoCreationResponseBodyResult setPrivateKey(String privateKey) {
            this.privateKey = privateKey;
            return this;
        }
        public String getPrivateKey() {
            return this.privateKey;
        }

    }

}
