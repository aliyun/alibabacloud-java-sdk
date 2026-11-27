// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class LlmSmartCallEncryptRequest extends TeaModel {
    /**
     * <p>The code of the large language model application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AD******45</p>
     */
    @NameInMap("ApplicationCode")
    public String applicationCode;

    /**
     * <p>The caller number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>132******65</p>
     */
    @NameInMap("CallerNumber")
    public String callerNumber;

    /**
     * <p>The encrypted called number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>140*********243</p>
     */
    @NameInMap("EncryptCalledNumber")
    public String encryptCalledNumber;

    /**
     * <p>The custom outId specified by the customer.</p>
     * 
     * <strong>example:</strong>
     * <p>dsa*******sad</p>
     */
    @NameInMap("OutId")
    public String outId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The prompt parameters for the large language model application.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;prompt&quot;:&quot;Recommend a movie&quot;}</p>
     */
    @NameInMap("PromptParam")
    public java.util.Map<String, ?> promptParam;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The greeting parameters for the large language model application.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;name&quot;:&quot;Xiao Ming&quot;,&quot;address&quot;:&quot;Hangzhou, Zhejiang&quot;}</p>
     */
    @NameInMap("StartWordParam")
    public java.util.Map<String, ?> startWordParam;

    public static LlmSmartCallEncryptRequest build(java.util.Map<String, ?> map) throws Exception {
        LlmSmartCallEncryptRequest self = new LlmSmartCallEncryptRequest();
        return TeaModel.build(map, self);
    }

    public LlmSmartCallEncryptRequest setApplicationCode(String applicationCode) {
        this.applicationCode = applicationCode;
        return this;
    }
    public String getApplicationCode() {
        return this.applicationCode;
    }

    public LlmSmartCallEncryptRequest setCallerNumber(String callerNumber) {
        this.callerNumber = callerNumber;
        return this;
    }
    public String getCallerNumber() {
        return this.callerNumber;
    }

    public LlmSmartCallEncryptRequest setEncryptCalledNumber(String encryptCalledNumber) {
        this.encryptCalledNumber = encryptCalledNumber;
        return this;
    }
    public String getEncryptCalledNumber() {
        return this.encryptCalledNumber;
    }

    public LlmSmartCallEncryptRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public LlmSmartCallEncryptRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public LlmSmartCallEncryptRequest setPromptParam(java.util.Map<String, ?> promptParam) {
        this.promptParam = promptParam;
        return this;
    }
    public java.util.Map<String, ?> getPromptParam() {
        return this.promptParam;
    }

    public LlmSmartCallEncryptRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public LlmSmartCallEncryptRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public LlmSmartCallEncryptRequest setStartWordParam(java.util.Map<String, ?> startWordParam) {
        this.startWordParam = startWordParam;
        return this;
    }
    public java.util.Map<String, ?> getStartWordParam() {
        return this.startWordParam;
    }

}
