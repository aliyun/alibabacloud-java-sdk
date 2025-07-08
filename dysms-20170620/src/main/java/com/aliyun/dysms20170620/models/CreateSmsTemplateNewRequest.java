// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class CreateSmsTemplateNewRequest extends TeaModel {
    @NameInMap("AiTemplate")
    public Long aiTemplate;

    @NameInMap("AiTemplateUuid")
    public String aiTemplateUuid;

    @NameInMap("ApplicationSceneId")
    public Long applicationSceneId;

    @NameInMap("ApplySource")
    public String applySource;

    @NameInMap("BizType")
    public String bizType;

    @NameInMap("IntlType")
    public Integer intlType;

    @NameInMap("MoreData")
    public java.util.List<String> moreData;

    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("OssKeys")
    public String ossKeys;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("ProductUrl")
    public String productUrl;

    @NameInMap("RelatedSignName")
    public String relatedSignName;

    @NameInMap("RelatedSignOrderId")
    public String relatedSignOrderId;

    @NameInMap("RelatedSignUsageName")
    public String relatedSignUsageName;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RmdTemplateId")
    public Long rmdTemplateId;

    @NameInMap("TemplateCode")
    public String templateCode;

    @NameInMap("TemplateContent")
    public String templateContent;

    @NameInMap("TemplateName")
    public String templateName;

    @NameInMap("TemplateRule")
    public String templateRule;

    @NameInMap("UserViewFileName")
    public String userViewFileName;

    public static CreateSmsTemplateNewRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSmsTemplateNewRequest self = new CreateSmsTemplateNewRequest();
        return TeaModel.build(map, self);
    }

    public CreateSmsTemplateNewRequest setAiTemplate(Long aiTemplate) {
        this.aiTemplate = aiTemplate;
        return this;
    }
    public Long getAiTemplate() {
        return this.aiTemplate;
    }

    public CreateSmsTemplateNewRequest setAiTemplateUuid(String aiTemplateUuid) {
        this.aiTemplateUuid = aiTemplateUuid;
        return this;
    }
    public String getAiTemplateUuid() {
        return this.aiTemplateUuid;
    }

    public CreateSmsTemplateNewRequest setApplicationSceneId(Long applicationSceneId) {
        this.applicationSceneId = applicationSceneId;
        return this;
    }
    public Long getApplicationSceneId() {
        return this.applicationSceneId;
    }

    public CreateSmsTemplateNewRequest setApplySource(String applySource) {
        this.applySource = applySource;
        return this;
    }
    public String getApplySource() {
        return this.applySource;
    }

    public CreateSmsTemplateNewRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CreateSmsTemplateNewRequest setIntlType(Integer intlType) {
        this.intlType = intlType;
        return this;
    }
    public Integer getIntlType() {
        return this.intlType;
    }

    public CreateSmsTemplateNewRequest setMoreData(java.util.List<String> moreData) {
        this.moreData = moreData;
        return this;
    }
    public java.util.List<String> getMoreData() {
        return this.moreData;
    }

    public CreateSmsTemplateNewRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateSmsTemplateNewRequest setOssKeys(String ossKeys) {
        this.ossKeys = ossKeys;
        return this;
    }
    public String getOssKeys() {
        return this.ossKeys;
    }

    public CreateSmsTemplateNewRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateSmsTemplateNewRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public CreateSmsTemplateNewRequest setProductUrl(String productUrl) {
        this.productUrl = productUrl;
        return this;
    }
    public String getProductUrl() {
        return this.productUrl;
    }

    public CreateSmsTemplateNewRequest setRelatedSignName(String relatedSignName) {
        this.relatedSignName = relatedSignName;
        return this;
    }
    public String getRelatedSignName() {
        return this.relatedSignName;
    }

    public CreateSmsTemplateNewRequest setRelatedSignOrderId(String relatedSignOrderId) {
        this.relatedSignOrderId = relatedSignOrderId;
        return this;
    }
    public String getRelatedSignOrderId() {
        return this.relatedSignOrderId;
    }

    public CreateSmsTemplateNewRequest setRelatedSignUsageName(String relatedSignUsageName) {
        this.relatedSignUsageName = relatedSignUsageName;
        return this;
    }
    public String getRelatedSignUsageName() {
        return this.relatedSignUsageName;
    }

    public CreateSmsTemplateNewRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateSmsTemplateNewRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateSmsTemplateNewRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateSmsTemplateNewRequest setRmdTemplateId(Long rmdTemplateId) {
        this.rmdTemplateId = rmdTemplateId;
        return this;
    }
    public Long getRmdTemplateId() {
        return this.rmdTemplateId;
    }

    public CreateSmsTemplateNewRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public CreateSmsTemplateNewRequest setTemplateContent(String templateContent) {
        this.templateContent = templateContent;
        return this;
    }
    public String getTemplateContent() {
        return this.templateContent;
    }

    public CreateSmsTemplateNewRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public CreateSmsTemplateNewRequest setTemplateRule(String templateRule) {
        this.templateRule = templateRule;
        return this;
    }
    public String getTemplateRule() {
        return this.templateRule;
    }

    public CreateSmsTemplateNewRequest setUserViewFileName(String userViewFileName) {
        this.userViewFileName = userViewFileName;
        return this;
    }
    public String getUserViewFileName() {
        return this.userViewFileName;
    }

}
