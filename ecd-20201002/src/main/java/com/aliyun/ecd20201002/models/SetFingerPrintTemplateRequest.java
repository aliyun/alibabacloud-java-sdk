// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class SetFingerPrintTemplateRequest extends TeaModel {
    @NameInMap("ClientId")
    public String clientId;

    @NameInMap("Description")
    public String description;

    @NameInMap("EncryptedFingerPrintTemplate")
    public String encryptedFingerPrintTemplate;

    @NameInMap("EncryptedKey")
    public String encryptedKey;

    @NameInMap("FingerPrintTemplate")
    public String fingerPrintTemplate;

    @NameInMap("LoginToken")
    public String loginToken;

    @NameInMap("Password")
    public String password;

    @NameInMap("RegionId")
    public String regionId;

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
