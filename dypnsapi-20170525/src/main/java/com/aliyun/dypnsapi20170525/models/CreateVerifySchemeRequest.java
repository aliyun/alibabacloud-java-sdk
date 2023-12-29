// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class CreateVerifySchemeRequest extends TeaModel {
    /**
     * <p>The app name.</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The verification type. You can select multiple types only when the phone number verification is supported. Separate multiple types with commas (,).</p>
     * <br>
     * <p>*   **1**: phone number verification</p>
     * <p>*   **2**: SMS verification</p>
     */
    @NameInMap("AuthType")
    public String authType;

    /**
     * <p>The bundle ID. This parameter is required when OsType is set to iOS. The bundle ID must be 1 to 128 characters in length and can contain digits, letters, hyphens (-), underscores (\_), and periods (.).</p>
     */
    @NameInMap("BundleId")
    public String bundleId;

    /**
     * <p>The channel code of China Mobile.</p>
     */
    @NameInMap("CmApiCode")
    public Long cmApiCode;

    /**
     * <p>The channel code of China Telecom.</p>
     */
    @NameInMap("CtApiCode")
    public Long ctApiCode;

    /**
     * <p>The channel code of China Unicom.</p>
     */
    @NameInMap("CuApiCode")
    public Long cuApiCode;

    /**
     * <p>The email address that receives the key.</p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>The IP address whitelist.</p>
     */
    @NameInMap("IpWhiteList")
    public String ipWhiteList;

    /**
     * <p>The source URL of the HTML5 app page. We recommend that you specify this parameter as a domain name.</p>
     */
    @NameInMap("Origin")
    public String origin;

    /**
     * <p>The type of the operating system for the terminal. Valid values: iOS and Android.</p>
     */
    @NameInMap("OsType")
    public String osType;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The package name. This parameter is required when OsType is set to Android. The name must be 1 to 128 characters in length and can contain digits, letters, hyphens (-), underscores (\_), and periods (.).</p>
     */
    @NameInMap("PackName")
    public String packName;

    /**
     * <p>The package signature. This parameter is required when OsType is set to Android. The signature must be 32 characters in length and can contain digits and letters.</p>
     */
    @NameInMap("PackSign")
    public String packSign;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The service type.</p>
     */
    @NameInMap("SceneType")
    public String sceneType;

    /**
     * <p>The service name.</p>
     */
    @NameInMap("SchemeName")
    public String schemeName;

    /**
     * <p>The bound SMS signature. This parameter is valid only when AuthType is set to 2. The signature must be approved.</p>
     */
    @NameInMap("SmsSignName")
    public String smsSignName;

    /**
     * <p>The URL of the HTML5 app page.</p>
     */
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
