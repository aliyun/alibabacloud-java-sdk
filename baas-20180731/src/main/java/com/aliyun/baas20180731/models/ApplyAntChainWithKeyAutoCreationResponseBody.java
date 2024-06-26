// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class ApplyAntChainWithKeyAutoCreationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public ApplyAntChainWithKeyAutoCreationResponseBodyResult result;

    public static ApplyAntChainWithKeyAutoCreationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplyAntChainWithKeyAutoCreationResponseBody self = new ApplyAntChainWithKeyAutoCreationResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplyAntChainWithKeyAutoCreationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ApplyAntChainWithKeyAutoCreationResponseBody setResult(ApplyAntChainWithKeyAutoCreationResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ApplyAntChainWithKeyAutoCreationResponseBodyResult getResult() {
        return this.result;
    }

    public static class ApplyAntChainWithKeyAutoCreationResponseBodyResultDownloadPath extends TeaModel {
        @NameInMap("CaCrtUrl")
        public String caCrtUrl;

        @NameInMap("ClientCrtUrl")
        public String clientCrtUrl;

        @NameInMap("SdkUrl")
        public String sdkUrl;

        @NameInMap("TrustCaUrl")
        public String trustCaUrl;

        public static ApplyAntChainWithKeyAutoCreationResponseBodyResultDownloadPath build(java.util.Map<String, ?> map) throws Exception {
            ApplyAntChainWithKeyAutoCreationResponseBodyResultDownloadPath self = new ApplyAntChainWithKeyAutoCreationResponseBodyResultDownloadPath();
            return TeaModel.build(map, self);
        }

        public ApplyAntChainWithKeyAutoCreationResponseBodyResultDownloadPath setCaCrtUrl(String caCrtUrl) {
            this.caCrtUrl = caCrtUrl;
            return this;
        }
        public String getCaCrtUrl() {
            return this.caCrtUrl;
        }

        public ApplyAntChainWithKeyAutoCreationResponseBodyResultDownloadPath setClientCrtUrl(String clientCrtUrl) {
            this.clientCrtUrl = clientCrtUrl;
            return this;
        }
        public String getClientCrtUrl() {
            return this.clientCrtUrl;
        }

        public ApplyAntChainWithKeyAutoCreationResponseBodyResultDownloadPath setSdkUrl(String sdkUrl) {
            this.sdkUrl = sdkUrl;
            return this;
        }
        public String getSdkUrl() {
            return this.sdkUrl;
        }

        public ApplyAntChainWithKeyAutoCreationResponseBodyResultDownloadPath setTrustCaUrl(String trustCaUrl) {
            this.trustCaUrl = trustCaUrl;
            return this;
        }
        public String getTrustCaUrl() {
            return this.trustCaUrl;
        }

    }

    public static class ApplyAntChainWithKeyAutoCreationResponseBodyResult extends TeaModel {
        @NameInMap("DownloadPath")
        public ApplyAntChainWithKeyAutoCreationResponseBodyResultDownloadPath downloadPath;

        @NameInMap("PrivateKey")
        public String privateKey;

        public static ApplyAntChainWithKeyAutoCreationResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ApplyAntChainWithKeyAutoCreationResponseBodyResult self = new ApplyAntChainWithKeyAutoCreationResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ApplyAntChainWithKeyAutoCreationResponseBodyResult setDownloadPath(ApplyAntChainWithKeyAutoCreationResponseBodyResultDownloadPath downloadPath) {
            this.downloadPath = downloadPath;
            return this;
        }
        public ApplyAntChainWithKeyAutoCreationResponseBodyResultDownloadPath getDownloadPath() {
            return this.downloadPath;
        }

        public ApplyAntChainWithKeyAutoCreationResponseBodyResult setPrivateKey(String privateKey) {
            this.privateKey = privateKey;
            return this;
        }
        public String getPrivateKey() {
            return this.privateKey;
        }

    }

}
