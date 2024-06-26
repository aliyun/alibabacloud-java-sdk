// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class ApplyPublicAntChainWithKeyAutoCreationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public ApplyPublicAntChainWithKeyAutoCreationResponseBodyResult result;

    public static ApplyPublicAntChainWithKeyAutoCreationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplyPublicAntChainWithKeyAutoCreationResponseBody self = new ApplyPublicAntChainWithKeyAutoCreationResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplyPublicAntChainWithKeyAutoCreationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ApplyPublicAntChainWithKeyAutoCreationResponseBody setResult(ApplyPublicAntChainWithKeyAutoCreationResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ApplyPublicAntChainWithKeyAutoCreationResponseBodyResult getResult() {
        return this.result;
    }

    public static class ApplyPublicAntChainWithKeyAutoCreationResponseBodyResultDownloadPath extends TeaModel {
        @NameInMap("CaCrtUrl")
        public String caCrtUrl;

        @NameInMap("ClientCrtUrl")
        public String clientCrtUrl;

        @NameInMap("SdkUrl")
        public String sdkUrl;

        @NameInMap("TrustCaUrl")
        public String trustCaUrl;

        public static ApplyPublicAntChainWithKeyAutoCreationResponseBodyResultDownloadPath build(java.util.Map<String, ?> map) throws Exception {
            ApplyPublicAntChainWithKeyAutoCreationResponseBodyResultDownloadPath self = new ApplyPublicAntChainWithKeyAutoCreationResponseBodyResultDownloadPath();
            return TeaModel.build(map, self);
        }

        public ApplyPublicAntChainWithKeyAutoCreationResponseBodyResultDownloadPath setCaCrtUrl(String caCrtUrl) {
            this.caCrtUrl = caCrtUrl;
            return this;
        }
        public String getCaCrtUrl() {
            return this.caCrtUrl;
        }

        public ApplyPublicAntChainWithKeyAutoCreationResponseBodyResultDownloadPath setClientCrtUrl(String clientCrtUrl) {
            this.clientCrtUrl = clientCrtUrl;
            return this;
        }
        public String getClientCrtUrl() {
            return this.clientCrtUrl;
        }

        public ApplyPublicAntChainWithKeyAutoCreationResponseBodyResultDownloadPath setSdkUrl(String sdkUrl) {
            this.sdkUrl = sdkUrl;
            return this;
        }
        public String getSdkUrl() {
            return this.sdkUrl;
        }

        public ApplyPublicAntChainWithKeyAutoCreationResponseBodyResultDownloadPath setTrustCaUrl(String trustCaUrl) {
            this.trustCaUrl = trustCaUrl;
            return this;
        }
        public String getTrustCaUrl() {
            return this.trustCaUrl;
        }

    }

    public static class ApplyPublicAntChainWithKeyAutoCreationResponseBodyResult extends TeaModel {
        @NameInMap("DownloadPath")
        public ApplyPublicAntChainWithKeyAutoCreationResponseBodyResultDownloadPath downloadPath;

        @NameInMap("PrivateKey")
        public String privateKey;

        public static ApplyPublicAntChainWithKeyAutoCreationResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ApplyPublicAntChainWithKeyAutoCreationResponseBodyResult self = new ApplyPublicAntChainWithKeyAutoCreationResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ApplyPublicAntChainWithKeyAutoCreationResponseBodyResult setDownloadPath(ApplyPublicAntChainWithKeyAutoCreationResponseBodyResultDownloadPath downloadPath) {
            this.downloadPath = downloadPath;
            return this;
        }
        public ApplyPublicAntChainWithKeyAutoCreationResponseBodyResultDownloadPath getDownloadPath() {
            return this.downloadPath;
        }

        public ApplyPublicAntChainWithKeyAutoCreationResponseBodyResult setPrivateKey(String privateKey) {
            this.privateKey = privateKey;
            return this;
        }
        public String getPrivateKey() {
            return this.privateKey;
        }

    }

}
