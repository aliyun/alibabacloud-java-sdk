// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ModifyChatappTemplatePropertiesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AllowSend")
    public Boolean allowSend;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CategoryChangePaused")
    public Boolean categoryChangePaused;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cams-idk***</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>zh_CN</p>
     */
    @NameInMap("Language")
    public String language;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>929938***</p>
     */
    @NameInMap("TemplateCode")
    public String templateCode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>WHATSAPP</p>
     */
    @NameInMap("TemplateType")
    public String templateType;

    public static ModifyChatappTemplatePropertiesRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyChatappTemplatePropertiesRequest self = new ModifyChatappTemplatePropertiesRequest();
        return TeaModel.build(map, self);
    }

    public ModifyChatappTemplatePropertiesRequest setAllowSend(Boolean allowSend) {
        this.allowSend = allowSend;
        return this;
    }
    public Boolean getAllowSend() {
        return this.allowSend;
    }

    public ModifyChatappTemplatePropertiesRequest setCategoryChangePaused(Boolean categoryChangePaused) {
        this.categoryChangePaused = categoryChangePaused;
        return this;
    }
    public Boolean getCategoryChangePaused() {
        return this.categoryChangePaused;
    }

    public ModifyChatappTemplatePropertiesRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public ModifyChatappTemplatePropertiesRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public ModifyChatappTemplatePropertiesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyChatappTemplatePropertiesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyChatappTemplatePropertiesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyChatappTemplatePropertiesRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public ModifyChatappTemplatePropertiesRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

}
