// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class GetLoginTokenRequest extends TeaModel {
    @NameInMap("AuthenticationCode")
    public String authenticationCode;

    @NameInMap("ClientId")
    public String clientId;

    @NameInMap("ClientOS")
    public String clientOS;

    @NameInMap("ClientVersion")
    public String clientVersion;

    @NameInMap("CurrentStage")
    public String currentStage;

    @NameInMap("DirectoryId")
    public String directoryId;

    @NameInMap("EncryptedFingerPrintData")
    public String encryptedFingerPrintData;

    @NameInMap("EncryptedKey")
    public String encryptedKey;

    @NameInMap("EncryptedPassword")
    public String encryptedPassword;

    @NameInMap("EndUserId")
    public String endUserId;

    @NameInMap("FingerPrintData")
    public String fingerPrintData;

    @NameInMap("ImageUrl")
    public String imageUrl;

    @NameInMap("KeepAlive")
    public Boolean keepAlive;

    @NameInMap("KeepAliveToken")
    public String keepAliveToken;

    @NameInMap("NewPassword")
    public String newPassword;

    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    @NameInMap("OldPassword")
    public String oldPassword;

    @NameInMap("Password")
    public String password;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("SsoSessionToken")
    public String ssoSessionToken;

    @NameInMap("TokenCode")
    public String tokenCode;

    @NameInMap("UmidToken")
    public String umidToken;

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
