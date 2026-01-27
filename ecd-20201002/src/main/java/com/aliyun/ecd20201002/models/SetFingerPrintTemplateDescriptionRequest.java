// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class SetFingerPrintTemplateDescriptionRequest extends TeaModel {
    /**
     * <p>The client ID. The system generates a unique ID for each client.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0764064c-1609-4d3c-8cb7-ab8d3feg****</p>
     */
    @NameInMap("ClientId")
    public String clientId;

    /**
     * <p>The client token to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>40401e62-5caf-4508-8de7-bf98af12****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Finger 1</p>
     */
    @NameInMap("Description")
    public String description;

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
     * <p>v14e5a2404c495249f7541646535779667ea0b5d87754b5d2d2a3099bda774f3832e24756ef3e66eb574b1f3e99078****</p>
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
     * <p>d28520d4-da0b-4a97-981d-683db865****</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    public static SetFingerPrintTemplateDescriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        SetFingerPrintTemplateDescriptionRequest self = new SetFingerPrintTemplateDescriptionRequest();
        return TeaModel.build(map, self);
    }

    public SetFingerPrintTemplateDescriptionRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public SetFingerPrintTemplateDescriptionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public SetFingerPrintTemplateDescriptionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SetFingerPrintTemplateDescriptionRequest setIndex(Integer index) {
        this.index = index;
        return this;
    }
    public Integer getIndex() {
        return this.index;
    }

    public SetFingerPrintTemplateDescriptionRequest setLoginToken(String loginToken) {
        this.loginToken = loginToken;
        return this;
    }
    public String getLoginToken() {
        return this.loginToken;
    }

    public SetFingerPrintTemplateDescriptionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SetFingerPrintTemplateDescriptionRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
