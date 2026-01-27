// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class SetFingerPrintTemplateRequest extends TeaModel {
    /**
     * <p>The client ID. The system generates a unique ID for each client.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>347431a9-90f6-448e-82c4-42bc84a9****</p>
     */
    @NameInMap("ClientId")
    public String clientId;

    /**
     * <p>The client token to ensure the idempotency of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the node.</p>
     * 
     * <strong>example:</strong>
     * <p>testDescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The encrypted fingerprint template.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAAAAAAAAAA</p>
     */
    @NameInMap("EncryptedFingerPrintTemplate")
    public String encryptedFingerPrintTemplate;

    /**
     * <p>The encryption key.</p>
     * 
     * <strong>example:</strong>
     * <p>drjfspchj</p>
     */
    @NameInMap("EncryptedKey")
    public String encryptedKey;

    /**
     * <p>The fingerprint template.</p>
     * 
     * <strong>example:</strong>
     * <p>goG3gG8AAABhujtscn</p>
     */
    @NameInMap("FingerPrintTemplate")
    public String fingerPrintTemplate;

    /**
     * <p>The logon credentials.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>v11c73e7af0cb43ff39301651142485099ffb447085d76c4147519dbaa21c3bd90d53045e327c1f525ee6331c52556****</p>
     */
    @NameInMap("LoginToken")
    public String loginToken;

    /**
     * <p>The password that you want to encrypt.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>As53328794</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The region ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The session ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8b42538a-246e-45a1-95ea-e5c65b09****</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    public static SetFingerPrintTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        SetFingerPrintTemplateRequest self = new SetFingerPrintTemplateRequest();
        return TeaModel.build(map, self);
    }

    public SetFingerPrintTemplateRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public SetFingerPrintTemplateRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public SetFingerPrintTemplateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SetFingerPrintTemplateRequest setEncryptedFingerPrintTemplate(String encryptedFingerPrintTemplate) {
        this.encryptedFingerPrintTemplate = encryptedFingerPrintTemplate;
        return this;
    }
    public String getEncryptedFingerPrintTemplate() {
        return this.encryptedFingerPrintTemplate;
    }

    public SetFingerPrintTemplateRequest setEncryptedKey(String encryptedKey) {
        this.encryptedKey = encryptedKey;
        return this;
    }
    public String getEncryptedKey() {
        return this.encryptedKey;
    }

    public SetFingerPrintTemplateRequest setFingerPrintTemplate(String fingerPrintTemplate) {
        this.fingerPrintTemplate = fingerPrintTemplate;
        return this;
    }
    public String getFingerPrintTemplate() {
        return this.fingerPrintTemplate;
    }

    public SetFingerPrintTemplateRequest setLoginToken(String loginToken) {
        this.loginToken = loginToken;
        return this;
    }
    public String getLoginToken() {
        return this.loginToken;
    }

    public SetFingerPrintTemplateRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public SetFingerPrintTemplateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SetFingerPrintTemplateRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
