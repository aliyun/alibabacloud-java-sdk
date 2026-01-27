// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class DeleteFingerPrintTemplateRequest extends TeaModel {
    /**
     * <p>The client ID. The system generates a unique ID for each client.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>59e86b39-ccac-4dfa-93d7-1f724052****</p>
     */
    @NameInMap("ClientId")
    public String clientId;

    /**
     * <p>The client token to ensure the idempotence of the request. You can use the client to generate the value, but you ensure sure that the value is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>40401e62-5caf-4508-8de7-bf98af12****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The index.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Index")
    public Integer index;

    /**
     * <p>The logon token.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>v1c0436c721786529914f16516396228454fa6284c9b80f9917f25ebbec2aa30c10343e3f6f9aff64500ce13808aef****</p>
     */
    @NameInMap("LoginToken")
    public String loginToken;

    /**
     * <p>The region ID.</p>
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
     * <p>6df06330-3b75-4768-b334-41a73a64****</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    public static DeleteFingerPrintTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFingerPrintTemplateRequest self = new DeleteFingerPrintTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFingerPrintTemplateRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public DeleteFingerPrintTemplateRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteFingerPrintTemplateRequest setIndex(Integer index) {
        this.index = index;
        return this;
    }
    public Integer getIndex() {
        return this.index;
    }

    public DeleteFingerPrintTemplateRequest setLoginToken(String loginToken) {
        this.loginToken = loginToken;
        return this;
    }
    public String getLoginToken() {
        return this.loginToken;
    }

    public DeleteFingerPrintTemplateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteFingerPrintTemplateRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
