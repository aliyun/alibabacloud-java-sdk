// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class CreateVerifySchemeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("AuthType")
    public String authType;

    /**
     * <strong>example:</strong>
     * <p>os.guituke.live</p>
     */
    @NameInMap("BundleId")
    public String bundleId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CmApiCode")
    public Long cmApiCode;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("CtApiCode")
    public Long ctApiCode;

    /**
     * <strong>example:</strong>
     * <p>9</p>
     */
    @NameInMap("CuApiCode")
    public Long cuApiCode;

    /**
     * <strong>example:</strong>
     * <p>****@***.com</p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <strong>example:</strong>
     * <p>5765880207855506803</p>
     */
    @NameInMap("HmAppIdentifier")
    public String hmAppIdentifier;

    /**
     * <strong>example:</strong>
     * <p>com.smzdm.client.hmos</p>
     */
    @NameInMap("HmPackageName")
    public String hmPackageName;

    /**
     * <strong>example:</strong>
     * <p>a3a249d0b901938ff50c12fc93f6c7eb8ecd0e37f84f55970de486150349bc09</p>
     */
    @NameInMap("HmSignName")
    public String hmSignName;

    /**
     * <strong>example:</strong>
     * <p>100.104.147.128/26</p>
     */
    @NameInMap("IpWhiteList")
    public String ipWhiteList;

    @NameInMap("Origin")
    public String origin;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>iOS</p>
     */
    @NameInMap("OsType")
    public String osType;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <strong>example:</strong>
     * <p>uni.UNI1521AD6</p>
     */
    @NameInMap("PackName")
    public String packName;

    /**
     * <strong>example:</strong>
     * <p>ce15084d6f2a2e106e5c6b6bfcab635e</p>
     */
    @NameInMap("PackSign")
    public String packSign;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SceneType")
    public String sceneType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SchemeName")
    public String schemeName;

    @NameInMap("SmsSignName")
    public String smsSignName;

    @NameInMap("Url")
    public String url;

    public static CreateVerifySchemeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVerifySchemeRequest self = new CreateVerifySchemeRequest();
        return TeaModel.build(map, self);
    }

    public CreateVerifySchemeRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateVerifySchemeRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public CreateVerifySchemeRequest setBundleId(String bundleId) {
        this.bundleId = bundleId;
        return this;
    }
    public String getBundleId() {
        return this.bundleId;
    }

    public CreateVerifySchemeRequest setCmApiCode(Long cmApiCode) {
        this.cmApiCode = cmApiCode;
        return this;
    }
    public Long getCmApiCode() {
        return this.cmApiCode;
    }

    public CreateVerifySchemeRequest setCtApiCode(Long ctApiCode) {
        this.ctApiCode = ctApiCode;
        return this;
    }
    public Long getCtApiCode() {
        return this.ctApiCode;
    }

    public CreateVerifySchemeRequest setCuApiCode(Long cuApiCode) {
        this.cuApiCode = cuApiCode;
        return this;
    }
    public Long getCuApiCode() {
        return this.cuApiCode;
    }

    public CreateVerifySchemeRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public CreateVerifySchemeRequest setHmAppIdentifier(String hmAppIdentifier) {
        this.hmAppIdentifier = hmAppIdentifier;
        return this;
    }
    public String getHmAppIdentifier() {
        return this.hmAppIdentifier;
    }

    public CreateVerifySchemeRequest setHmPackageName(String hmPackageName) {
        this.hmPackageName = hmPackageName;
        return this;
    }
    public String getHmPackageName() {
        return this.hmPackageName;
    }

    public CreateVerifySchemeRequest setHmSignName(String hmSignName) {
        this.hmSignName = hmSignName;
        return this;
    }
    public String getHmSignName() {
        return this.hmSignName;
    }

    public CreateVerifySchemeRequest setIpWhiteList(String ipWhiteList) {
        this.ipWhiteList = ipWhiteList;
        return this;
    }
    public String getIpWhiteList() {
        return this.ipWhiteList;
    }

    public CreateVerifySchemeRequest setOrigin(String origin) {
        this.origin = origin;
        return this;
    }
    public String getOrigin() {
        return this.origin;
    }

    public CreateVerifySchemeRequest setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public CreateVerifySchemeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateVerifySchemeRequest setPackName(String packName) {
        this.packName = packName;
        return this;
    }
    public String getPackName() {
        return this.packName;
    }

    public CreateVerifySchemeRequest setPackSign(String packSign) {
        this.packSign = packSign;
        return this;
    }
    public String getPackSign() {
        return this.packSign;
    }

    public CreateVerifySchemeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateVerifySchemeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateVerifySchemeRequest setSceneType(String sceneType) {
        this.sceneType = sceneType;
        return this;
    }
    public String getSceneType() {
        return this.sceneType;
    }

    public CreateVerifySchemeRequest setSchemeName(String schemeName) {
        this.schemeName = schemeName;
        return this;
    }
    public String getSchemeName() {
        return this.schemeName;
    }

    public CreateVerifySchemeRequest setSmsSignName(String smsSignName) {
        this.smsSignName = smsSignName;
        return this;
    }
    public String getSmsSignName() {
        return this.smsSignName;
    }

    public CreateVerifySchemeRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
