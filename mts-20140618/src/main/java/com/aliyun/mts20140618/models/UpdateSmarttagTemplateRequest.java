// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UpdateSmarttagTemplateRequest extends TeaModel {
    @NameInMap("AnalyseTypes")
    public String analyseTypes;

    @NameInMap("FaceCategoryIds")
    public String faceCategoryIds;

    @NameInMap("Industry")
    public String industry;

    @NameInMap("IsDefault")
    public Boolean isDefault;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Scene")
    public String scene;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("TemplateName")
    public String templateName;

    public static UpdateSmarttagTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSmarttagTemplateRequest self = new UpdateSmarttagTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSmarttagTemplateRequest setAnalyseTypes(String analyseTypes) {
        this.analyseTypes = analyseTypes;
        return this;
    }
    public String getAnalyseTypes() {
        return this.analyseTypes;
    }

    public UpdateSmarttagTemplateRequest setFaceCategoryIds(String faceCategoryIds) {
        this.faceCategoryIds = faceCategoryIds;
        return this;
    }
    public String getFaceCategoryIds() {
        return this.faceCategoryIds;
    }

    public UpdateSmarttagTemplateRequest setIndustry(String industry) {
        this.industry = industry;
        return this;
    }
    public String getIndustry() {
        return this.industry;
    }

    public UpdateSmarttagTemplateRequest setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public UpdateSmarttagTemplateRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UpdateSmarttagTemplateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateSmarttagTemplateRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateSmarttagTemplateRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdateSmarttagTemplateRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public UpdateSmarttagTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public UpdateSmarttagTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

}
