// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class ListOpenPlatformConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecretList")
    public java.util.List<ListOpenPlatformConfigResponseBodySecretList> secretList;

    public static ListOpenPlatformConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOpenPlatformConfigResponseBody self = new ListOpenPlatformConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOpenPlatformConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOpenPlatformConfigResponseBody setSecretList(java.util.List<ListOpenPlatformConfigResponseBodySecretList> secretList) {
        this.secretList = secretList;
        return this;
    }
    public java.util.List<ListOpenPlatformConfigResponseBodySecretList> getSecretList() {
        return this.secretList;
    }

    public static class ListOpenPlatformConfigResponseBodySecretList extends TeaModel {
        @NameInMap("SpaceId")
        public String spaceId;

        @NameInMap("AppSecret")
        public String appSecret;

        @NameInMap("PublicCert")
        public String publicCert;

        @NameInMap("AppCert")
        public String appCert;

        @NameInMap("PrivateKey")
        public String privateKey;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("RootCert")
        public String rootCert;

        @NameInMap("PublicKey")
        public String publicKey;

        @NameInMap("Platform")
        public String platform;

        @NameInMap("SignMode")
        public String signMode;

        public static ListOpenPlatformConfigResponseBodySecretList build(java.util.Map<String, ?> map) throws Exception {
            ListOpenPlatformConfigResponseBodySecretList self = new ListOpenPlatformConfigResponseBodySecretList();
            return TeaModel.build(map, self);
        }

        public ListOpenPlatformConfigResponseBodySecretList setSpaceId(String spaceId) {
            this.spaceId = spaceId;
            return this;
        }
        public String getSpaceId() {
            return this.spaceId;
        }

        public ListOpenPlatformConfigResponseBodySecretList setAppSecret(String appSecret) {
            this.appSecret = appSecret;
            return this;
        }
        public String getAppSecret() {
            return this.appSecret;
        }

        public ListOpenPlatformConfigResponseBodySecretList setPublicCert(String publicCert) {
            this.publicCert = publicCert;
            return this;
        }
        public String getPublicCert() {
            return this.publicCert;
        }

        public ListOpenPlatformConfigResponseBodySecretList setAppCert(String appCert) {
            this.appCert = appCert;
            return this;
        }
        public String getAppCert() {
            return this.appCert;
        }

        public ListOpenPlatformConfigResponseBodySecretList setPrivateKey(String privateKey) {
            this.privateKey = privateKey;
            return this;
        }
        public String getPrivateKey() {
            return this.privateKey;
        }

        public ListOpenPlatformConfigResponseBodySecretList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListOpenPlatformConfigResponseBodySecretList setRootCert(String rootCert) {
            this.rootCert = rootCert;
            return this;
        }
        public String getRootCert() {
            return this.rootCert;
        }

        public ListOpenPlatformConfigResponseBodySecretList setPublicKey(String publicKey) {
            this.publicKey = publicKey;
            return this;
        }
        public String getPublicKey() {
            return this.publicKey;
        }

        public ListOpenPlatformConfigResponseBodySecretList setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public ListOpenPlatformConfigResponseBodySecretList setSignMode(String signMode) {
            this.signMode = signMode;
            return this;
        }
        public String getSignMode() {
            return this.signMode;
        }

    }

}
