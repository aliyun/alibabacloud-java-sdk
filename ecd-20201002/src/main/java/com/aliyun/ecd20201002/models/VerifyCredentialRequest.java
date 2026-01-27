// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class VerifyCredentialRequest extends TeaModel {
    /**
     * <p>The client ID. The system generates a unique ID for each client.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d0b95762-0541-4b53-a0e4-7ed09f39****</p>
     */
    @NameInMap("ClientId")
    public String clientId;

    /**
     * <p>The credential.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789cyG</p>
     */
    @NameInMap("Credential")
    public String credential;

    /**
     * <p>The type of the logon credential that you want to clear.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>MfaPasscode: the multi-factor verification code.</li>
     * <li>FingerPrint: the fingerprint.</li>
     * <li>Password: the password.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Password</p>
     */
    @NameInMap("CredentialType")
    public String credentialType;

    /**
     * <p>The ID of the key that you want to encrypt.</p>
     * 
     * <strong>example:</strong>
     * <p>drjfs****</p>
     */
    @NameInMap("EncryptedKey")
    public String encryptedKey;

    /**
     * <p>The logon token.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>v1f5772a1c60dbea9fd8e1648567079018086448d234b5bc8e30bec0ba6e80c41c767c4dd0db51e9e5c4e0f111431a****</p>
     */
    @NameInMap("LoginToken")
    public String loginToken;

    /**
     * <p>The office network ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai+dir-227468****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The session ID.</p>
     * 
     * <strong>example:</strong>
     * <p>eb17af2e-1dd6-4cc4-a3ee-3a14d0d7****</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    public static VerifyCredentialRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyCredentialRequest self = new VerifyCredentialRequest();
        return TeaModel.build(map, self);
    }

    public VerifyCredentialRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public VerifyCredentialRequest setCredential(String credential) {
        this.credential = credential;
        return this;
    }
    public String getCredential() {
        return this.credential;
    }

    public VerifyCredentialRequest setCredentialType(String credentialType) {
        this.credentialType = credentialType;
        return this;
    }
    public String getCredentialType() {
        return this.credentialType;
    }

    public VerifyCredentialRequest setEncryptedKey(String encryptedKey) {
        this.encryptedKey = encryptedKey;
        return this;
    }
    public String getEncryptedKey() {
        return this.encryptedKey;
    }

    public VerifyCredentialRequest setLoginToken(String loginToken) {
        this.loginToken = loginToken;
        return this;
    }
    public String getLoginToken() {
        return this.loginToken;
    }

    public VerifyCredentialRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public VerifyCredentialRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public VerifyCredentialRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
