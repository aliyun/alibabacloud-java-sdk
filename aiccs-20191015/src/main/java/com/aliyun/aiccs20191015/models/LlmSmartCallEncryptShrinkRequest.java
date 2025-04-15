// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class LlmSmartCallEncryptShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ADDFA32145</p>
     */
    @NameInMap("ApplicationCode")
    public String applicationCode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ADDFA32145</p>
     */
    @NameInMap("CallerNumber")
    public String callerNumber;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>140432432432243</p>
     */
    @NameInMap("EncryptCalledNumber")
    public String encryptCalledNumber;

    /**
     * <strong>example:</strong>
     * <p>dsadsaasfdsad</p>
     */
    @NameInMap("OutId")
    public String outId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("PromptParam")
    public String promptParamShrink;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("StartWordParam")
    public String startWordParamShrink;

    public static LlmSmartCallEncryptShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        LlmSmartCallEncryptShrinkRequest self = new LlmSmartCallEncryptShrinkRequest();
        return TeaModel.build(map, self);
    }

    public LlmSmartCallEncryptShrinkRequest setApplicationCode(String applicationCode) {
        this.applicationCode = applicationCode;
        return this;
    }
    public String getApplicationCode() {
        return this.applicationCode;
    }

    public LlmSmartCallEncryptShrinkRequest setCallerNumber(String callerNumber) {
        this.callerNumber = callerNumber;
        return this;
    }
    public String getCallerNumber() {
        return this.callerNumber;
    }

    public LlmSmartCallEncryptShrinkRequest setEncryptCalledNumber(String encryptCalledNumber) {
        this.encryptCalledNumber = encryptCalledNumber;
        return this;
    }
    public String getEncryptCalledNumber() {
        return this.encryptCalledNumber;
    }

    public LlmSmartCallEncryptShrinkRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public LlmSmartCallEncryptShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public LlmSmartCallEncryptShrinkRequest setPromptParamShrink(String promptParamShrink) {
        this.promptParamShrink = promptParamShrink;
        return this;
    }
    public String getPromptParamShrink() {
        return this.promptParamShrink;
    }

    public LlmSmartCallEncryptShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public LlmSmartCallEncryptShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public LlmSmartCallEncryptShrinkRequest setStartWordParamShrink(String startWordParamShrink) {
        this.startWordParamShrink = startWordParamShrink;
        return this;
    }
    public String getStartWordParamShrink() {
        return this.startWordParamShrink;
    }

}
