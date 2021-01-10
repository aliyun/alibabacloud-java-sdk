// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class SaveAntOpenPlatformConfigRequest extends TeaModel {
    @NameInMap("SpaceId")
    public String spaceId;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("PublicKey")
    public String publicKey;

    @NameInMap("PrivateKey")
    public String privateKey;

    @NameInMap("SignMode")
    public String signMode;

    @NameInMap("AppCert")
    public String appCert;

    @NameInMap("PublicCert")
    public String publicCert;

    @NameInMap("RootCert")
    public String rootCert;

    public static SaveAntOpenPlatformConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveAntOpenPlatformConfigRequest self = new SaveAntOpenPlatformConfigRequest();
        return TeaModel.build(map, self);
    }

    public SaveAntOpenPlatformConfigRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public SaveAntOpenPlatformConfigRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SaveAntOpenPlatformConfigRequest setPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }
    public String getPublicKey() {
        return this.publicKey;
    }

    public SaveAntOpenPlatformConfigRequest setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }
    public String getPrivateKey() {
        return this.privateKey;
    }

    public SaveAntOpenPlatformConfigRequest setSignMode(String signMode) {
        this.signMode = signMode;
        return this;
    }
    public String getSignMode() {
        return this.signMode;
    }

    public SaveAntOpenPlatformConfigRequest setAppCert(String appCert) {
        this.appCert = appCert;
        return this;
    }
    public String getAppCert() {
        return this.appCert;
    }

    public SaveAntOpenPlatformConfigRequest setPublicCert(String publicCert) {
        this.publicCert = publicCert;
        return this;
    }
    public String getPublicCert() {
        return this.publicCert;
    }

    public SaveAntOpenPlatformConfigRequest setRootCert(String rootCert) {
        this.rootCert = rootCert;
        return this;
    }
    public String getRootCert() {
        return this.rootCert;
    }

}
