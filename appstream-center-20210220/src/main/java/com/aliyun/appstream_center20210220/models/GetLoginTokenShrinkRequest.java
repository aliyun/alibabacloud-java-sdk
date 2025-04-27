// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210220.models;

import com.aliyun.tea.*;

public class GetLoginTokenShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>182901</p>
     */
    @NameInMap("AuthenticationCode")
    public String authenticationCode;

    @NameInMap("AvailableFeatures")
    public String availableFeaturesShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>05967f80-6f51-46cb-a27c-****</p>
     */
    @NameInMap("ClientId")
    public String clientId;

    @NameInMap("ClientName")
    public String clientName;

    /**
     * <strong>example:</strong>
     * <p>windows_\&quot;Windows 10 Pro\&quot; 10.0 (Build 22631)</p>
     */
    @NameInMap("ClientOS")
    public String clientOS;

    /**
     * <strong>example:</strong>
     * <p>windows</p>
     */
    @NameInMap("ClientType")
    public String clientType;

    /**
     * <strong>example:</strong>
     * <p>7.3.0-20240619.143924</p>
     */
    @NameInMap("ClientVersion")
    public String clientVersion;

    /**
     * <strong>example:</strong>
     * <p>SsoTokenLogin</p>
     */
    @NameInMap("CurrentStage")
    public String currentStage;

    /**
     * <strong>example:</strong>
     * <p>cn-beijing+dir-j9dd****</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("EncryptedFingerPrintData")
    public String encryptedFingerPrintData;

    /**
     * <strong>example:</strong>
     * <p>4d7****8e90bb0484fc</p>
     */
    @NameInMap("EncryptedKey")
    public String encryptedKey;

    /**
     * <strong>example:</strong>
     * <p>04d7****8e90bb0484fc;gJ1GLca1vQRRqQbRvByU0A==;5kOWZE7AtbQhki+4LAo69A==</p>
     */
    @NameInMap("EncryptedPassword")
    public String encryptedPassword;

    /**
     * <strong>example:</strong>
     * <p>user01</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("FingerPrintData")
    public String fingerPrintData;

    /**
     * <strong>example:</strong>
     * <p>idp-iwntrlbb98q7v****</p>
     */
    @NameInMap("IdpId")
    public String idpId;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("KeepAlive")
    public Boolean keepAlive;

    /**
     * <strong>example:</strong>
     * <p>00ugamMAoO1+u1MlhmgCeZJ75q094x3H/4kg7ZaTI3f/joVTVPIpJgfv9JFkPLNxnQjblrvsByNas08mc6FtVWvQPOE68fqmt6QMM4UbRtahm8luxEXvicF58qSPXW1hxOtV/Ev6d92VBz2Bck/N4CYyjD0iLocfN8jkBnt231****</p>
     */
    @NameInMap("KeepAliveToken")
    public String keepAliveToken;

    /**
     * <strong>example:</strong>
     * <p>Fe04****</p>
     */
    @NameInMap("LoginIdentifier")
    public String loginIdentifier;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("LoginName")
    public String loginName;

    @NameInMap("MfaType")
    public String mfaType;

    /**
     * <strong>example:</strong>
     * <p>INTERNET</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    /**
     * <strong>example:</strong>
     * <p>Admin@1234****</p>
     */
    @NameInMap("NewPassword")
    public String newPassword;

    /**
     * <strong>example:</strong>
     * <p>cn-beijing+dir-j9dd****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <strong>example:</strong>
     * <p>Admin@1234****</p>
     */
    @NameInMap("OldPassword")
    public String oldPassword;

    /**
     * <strong>example:</strong>
     * <p>Admin@1234****</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <strong>example:</strong>
     * <p>1822727****</p>
     */
    @NameInMap("Phone")
    public String phone;

    /**
     * <strong>example:</strong>
     * <p>321123</p>
     */
    @NameInMap("PhoneVerifyCode")
    public String phoneVerifyCode;

    @NameInMap("ProfileRegion")
    public String profileRegion;

    /**
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>c6f3cd91-65fc-4c7b-b189-2a73da0****</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("SsoExtendsCookies")
    public String ssoExtendsCookies;

    /**
     * <strong>example:</strong>
     * <p>04d707a6-fb23-44a7-aae7-8e90****</p>
     */
    @NameInMap("SsoSessionToken")
    public String ssoSessionToken;

    /**
     * <strong>example:</strong>
     * <p>1234***</p>
     */
    @NameInMap("TokenCode")
    public String tokenCode;

    /**
     * <strong>example:</strong>
     * <p>04d707a6-fb23-44a7-aae7-8e90bb04****</p>
     */
    @NameInMap("UmidToken")
    public String umidToken;

    /**
     * <strong>example:</strong>
     * <p>C50973691A6D2BE23F2CDD73B85B****</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static GetLoginTokenShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLoginTokenShrinkRequest self = new GetLoginTokenShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetLoginTokenShrinkRequest setAuthenticationCode(String authenticationCode) {
        this.authenticationCode = authenticationCode;
        return this;
    }
    public String getAuthenticationCode() {
        return this.authenticationCode;
    }

    public GetLoginTokenShrinkRequest setAvailableFeaturesShrink(String availableFeaturesShrink) {
        this.availableFeaturesShrink = availableFeaturesShrink;
        return this;
    }
    public String getAvailableFeaturesShrink() {
        return this.availableFeaturesShrink;
    }

    public GetLoginTokenShrinkRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public GetLoginTokenShrinkRequest setClientName(String clientName) {
        this.clientName = clientName;
        return this;
    }
    public String getClientName() {
        return this.clientName;
    }

    public GetLoginTokenShrinkRequest setClientOS(String clientOS) {
        this.clientOS = clientOS;
        return this;
    }
    public String getClientOS() {
        return this.clientOS;
    }

    public GetLoginTokenShrinkRequest setClientType(String clientType) {
        this.clientType = clientType;
        return this;
    }
    public String getClientType() {
        return this.clientType;
    }

    public GetLoginTokenShrinkRequest setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
        return this;
    }
    public String getClientVersion() {
        return this.clientVersion;
    }

    public GetLoginTokenShrinkRequest setCurrentStage(String currentStage) {
        this.currentStage = currentStage;
        return this;
    }
    public String getCurrentStage() {
        return this.currentStage;
    }

    public GetLoginTokenShrinkRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public GetLoginTokenShrinkRequest setEncryptedFingerPrintData(String encryptedFingerPrintData) {
        this.encryptedFingerPrintData = encryptedFingerPrintData;
        return this;
    }
    public String getEncryptedFingerPrintData() {
        return this.encryptedFingerPrintData;
    }

    public GetLoginTokenShrinkRequest setEncryptedKey(String encryptedKey) {
        this.encryptedKey = encryptedKey;
        return this;
    }
    public String getEncryptedKey() {
        return this.encryptedKey;
    }

    public GetLoginTokenShrinkRequest setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
        return this;
    }
    public String getEncryptedPassword() {
        return this.encryptedPassword;
    }

    public GetLoginTokenShrinkRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public GetLoginTokenShrinkRequest setFingerPrintData(String fingerPrintData) {
        this.fingerPrintData = fingerPrintData;
        return this;
    }
    public String getFingerPrintData() {
        return this.fingerPrintData;
    }

    public GetLoginTokenShrinkRequest setIdpId(String idpId) {
        this.idpId = idpId;
        return this;
    }
    public String getIdpId() {
        return this.idpId;
    }

    public GetLoginTokenShrinkRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public GetLoginTokenShrinkRequest setKeepAlive(Boolean keepAlive) {
        this.keepAlive = keepAlive;
        return this;
    }
    public Boolean getKeepAlive() {
        return this.keepAlive;
    }

    public GetLoginTokenShrinkRequest setKeepAliveToken(String keepAliveToken) {
        this.keepAliveToken = keepAliveToken;
        return this;
    }
    public String getKeepAliveToken() {
        return this.keepAliveToken;
    }

    public GetLoginTokenShrinkRequest setLoginIdentifier(String loginIdentifier) {
        this.loginIdentifier = loginIdentifier;
        return this;
    }
    public String getLoginIdentifier() {
        return this.loginIdentifier;
    }

    public GetLoginTokenShrinkRequest setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

    public GetLoginTokenShrinkRequest setMfaType(String mfaType) {
        this.mfaType = mfaType;
        return this;
    }
    public String getMfaType() {
        return this.mfaType;
    }

    public GetLoginTokenShrinkRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public GetLoginTokenShrinkRequest setNewPassword(String newPassword) {
        this.newPassword = newPassword;
        return this;
    }
    public String getNewPassword() {
        return this.newPassword;
    }

    public GetLoginTokenShrinkRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public GetLoginTokenShrinkRequest setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
        return this;
    }
    public String getOldPassword() {
        return this.oldPassword;
    }

    public GetLoginTokenShrinkRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public GetLoginTokenShrinkRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public GetLoginTokenShrinkRequest setPhoneVerifyCode(String phoneVerifyCode) {
        this.phoneVerifyCode = phoneVerifyCode;
        return this;
    }
    public String getPhoneVerifyCode() {
        return this.phoneVerifyCode;
    }

    public GetLoginTokenShrinkRequest setProfileRegion(String profileRegion) {
        this.profileRegion = profileRegion;
        return this;
    }
    public String getProfileRegion() {
        return this.profileRegion;
    }

    public GetLoginTokenShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetLoginTokenShrinkRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public GetLoginTokenShrinkRequest setSsoExtendsCookies(String ssoExtendsCookies) {
        this.ssoExtendsCookies = ssoExtendsCookies;
        return this;
    }
    public String getSsoExtendsCookies() {
        return this.ssoExtendsCookies;
    }

    public GetLoginTokenShrinkRequest setSsoSessionToken(String ssoSessionToken) {
        this.ssoSessionToken = ssoSessionToken;
        return this;
    }
    public String getSsoSessionToken() {
        return this.ssoSessionToken;
    }

    public GetLoginTokenShrinkRequest setTokenCode(String tokenCode) {
        this.tokenCode = tokenCode;
        return this;
    }
    public String getTokenCode() {
        return this.tokenCode;
    }

    public GetLoginTokenShrinkRequest setUmidToken(String umidToken) {
        this.umidToken = umidToken;
        return this;
    }
    public String getUmidToken() {
        return this.umidToken;
    }

    public GetLoginTokenShrinkRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
