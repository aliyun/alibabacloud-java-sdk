// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class AddSmarttagTemplateRequest extends TeaModel {
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

    @NameInMap("TemplateName")
    public String templateName;

    public static AddSmarttagTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        AddSmarttagTemplateRequest self = new AddSmarttagTemplateRequest();
        return TeaModel.build(map, self);
    }

    public AddSmarttagTemplateRequest setAnalyseTypes(String analyseTypes) {
        this.analyseTypes = analyseTypes;
        return this;
    }
    public String getAnalyseTypes() {
        return this.analyseTypes;
    }

    public AddSmarttagTemplateRequest setFaceCategoryIds(String faceCategoryIds) {
        this.faceCategoryIds = faceCategoryIds;
        return this;
    }
    public String getFaceCategoryIds() {
        return this.faceCategoryIds;
    }

    public AddSmarttagTemplateRequest setIndustry(String industry) {
        this.industry = industry;
        return this;
    }
    public String getIndustry() {
        return this.industry;
    }

    public AddSmarttagTemplateRequest setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public AddSmarttagTemplateRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AddSmarttagTemplateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddSmarttagTemplateRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AddSmarttagTemplateRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AddSmarttagTemplateRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public AddSmarttagTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

}
