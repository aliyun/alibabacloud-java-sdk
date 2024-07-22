// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210220.models;

import com.aliyun.tea.*;

public class GetLoginTokenRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>182901</p>
     */
    @NameInMap("AuthenticationCode")
    public String authenticationCode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>05967f80-6f51-46cb-a27c-****</p>
     */
    @NameInMap("ClientId")
    public String clientId;

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

    public static GetLoginTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLoginTokenRequest self = new GetLoginTokenRequest();
        return TeaModel.build(map, self);
    }

    public GetLoginTokenRequest setAuthenticationCode(String authenticationCode) {
        this.authenticationCode = authenticationCode;
        return this;
    }
    public String getAuthenticationCode() {
        return this.authenticationCode;
    }

    public GetLoginTokenRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public GetLoginTokenRequest setClientOS(String clientOS) {
        this.clientOS = clientOS;
        return this;
    }
    public String getClientOS() {
        return this.clientOS;
    }

    public GetLoginTokenRequest setClientType(String clientType) {
        this.clientType = clientType;
        return this;
    }
    public String getClientType() {
        return this.clientType;
    }

    public GetLoginTokenRequest setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
        return this;
    }
    public String getClientVersion() {
        return this.clientVersion;
    }

    public GetLoginTokenRequest setCurrentStage(String currentStage) {
        this.currentStage = currentStage;
        return this;
    }
    public String getCurrentStage() {
        return this.currentStage;
    }

    public GetLoginTokenRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public GetLoginTokenRequest setEncryptedFingerPrintData(String encryptedFingerPrintData) {
        this.encryptedFingerPrintData = encryptedFingerPrintData;
        return this;
    }
    public String getEncryptedFingerPrintData() {
        return this.encryptedFingerPrintData;
    }

    public GetLoginTokenRequest setEncryptedKey(String encryptedKey) {
        this.encryptedKey = encryptedKey;
        return this;
    }
    public String getEncryptedKey() {
        return this.encryptedKey;
    }

    public GetLoginTokenRequest setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
        return this;
    }
    public String getEncryptedPassword() {
        return this.encryptedPassword;
    }

    public GetLoginTokenRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public GetLoginTokenRequest setFingerPrintData(String fingerPrintData) {
        this.fingerPrintData = fingerPrintData;
        return this;
    }
    public String getFingerPrintData() {
        return this.fingerPrintData;
    }

    public GetLoginTokenRequest setIdpId(String idpId) {
        this.idpId = idpId;
        return this;
    }
    public String getIdpId() {
        return this.idpId;
    }

    public GetLoginTokenRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public GetLoginTokenRequest setKeepAlive(Boolean keepAlive) {
        this.keepAlive = keepAlive;
        return this;
    }
    public Boolean getKeepAlive() {
        return this.keepAlive;
    }

    public GetLoginTokenRequest setKeepAliveToken(String keepAliveToken) {
        this.keepAliveToken = keepAliveToken;
        return this;
    }
    public String getKeepAliveToken() {
        return this.keepAliveToken;
    }

    public GetLoginTokenRequest setLoginIdentifier(String loginIdentifier) {
        this.loginIdentifier = loginIdentifier;
        return this;
    }
    public String getLoginIdentifier() {
        return this.loginIdentifier;
    }

    public GetLoginTokenRequest setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

    public GetLoginTokenRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public GetLoginTokenRequest setNewPassword(String newPassword) {
        this.newPassword = newPassword;
        return this;
    }
    public String getNewPassword() {
        return this.newPassword;
    }

    public GetLoginTokenRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public GetLoginTokenRequest setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
        return this;
    }
    public String getOldPassword() {
        return this.oldPassword;
    }

    public GetLoginTokenRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public GetLoginTokenRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public GetLoginTokenRequest setPhoneVerifyCode(String phoneVerifyCode) {
        this.phoneVerifyCode = phoneVerifyCode;
        return this;
    }
    public String getPhoneVerifyCode() {
        return this.phoneVerifyCode;
    }

    public GetLoginTokenRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetLoginTokenRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public GetLoginTokenRequest setSsoExtendsCookies(String ssoExtendsCookies) {
        this.ssoExtendsCookies = ssoExtendsCookies;
        return this;
    }
    public String getSsoExtendsCookies() {
        return this.ssoExtendsCookies;
    }

    public GetLoginTokenRequest setSsoSessionToken(String ssoSessionToken) {
        this.ssoSessionToken = ssoSessionToken;
        return this;
    }
    public String getSsoSessionToken() {
        return this.ssoSessionToken;
    }

    public GetLoginTokenRequest setTokenCode(String tokenCode) {
        this.tokenCode = tokenCode;
        return this;
    }
    public String getTokenCode() {
        return this.tokenCode;
    }

    public GetLoginTokenRequest setUmidToken(String umidToken) {
        this.umidToken = umidToken;
        return this;
    }
    public String getUmidToken() {
        return this.umidToken;
    }

    public GetLoginTokenRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
