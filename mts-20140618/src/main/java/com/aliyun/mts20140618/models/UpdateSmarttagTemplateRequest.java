// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UpdateSmarttagTemplateRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ocr,asr</p>
     */
    @NameInMap("AnalyseTypes")
    public String analyseTypes;

    /**
     * <strong>example:</strong>
     * <p>celebrity</p>
     */
    @NameInMap("FaceCategoryIds")
    public String faceCategoryIds;

    /**
     * <strong>example:</strong>
     * <p>{ &quot;faceDetThreshold&quot;:0.999, &quot;faceRegThreshold&quot;:0.9 }</p>
     */
    @NameInMap("FaceCustomParamsConfig")
    public String faceCustomParamsConfig;

    /**
     * <strong>example:</strong>
     * <p>common</p>
     */
    @NameInMap("Industry")
    public String industry;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsDefault")
    public Boolean isDefault;

    /**
     * <strong>example:</strong>
     * <p>{ &quot;type&quot;: &quot;name,location,organization,other&quot; }</p>
     */
    @NameInMap("KeywordConfig")
    public String keywordConfig;

    /**
     * <strong>example:</strong>
     * <p>{ &quot;movie&quot;:&quot;name,alias,chnl,genre&quot;, &quot;music&quot;:&quot;songName,artistName&quot;, &quot;person&quot;:&quot;name,gender&quot; }</p>
     */
    @NameInMap("KnowledgeConfig")
    public String knowledgeConfig;

    /**
     * <strong>example:</strong>
     * <p>hmi</p>
     */
    @NameInMap("LabelType")
    public String labelType;

    /**
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("LabelVersion")
    public String labelVersion;

    /**
     * <strong>example:</strong>
     * <p>common</p>
     */
    @NameInMap("LandmarkGroupIds")
    public String landmarkGroupIds;

    /**
     * <strong>example:</strong>
     * <p>general,item,weapon,animal</p>
     */
    @NameInMap("ObjectGroupIds")
    public String objectGroupIds;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <strong>example:</strong>
     * <p>search</p>
     */
    @NameInMap("Scene")
    public String scene;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>05de22f255284c7a8d2aab535dde****</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <strong>example:</strong>
     * <p>template-example-****</p>
     */
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

    public UpdateSmarttagTemplateRequest setFaceCustomParamsConfig(String faceCustomParamsConfig) {
        this.faceCustomParamsConfig = faceCustomParamsConfig;
        return this;
    }
    public String getFaceCustomParamsConfig() {
        return this.faceCustomParamsConfig;
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

    public UpdateSmarttagTemplateRequest setKeywordConfig(String keywordConfig) {
        this.keywordConfig = keywordConfig;
        return this;
    }
    public String getKeywordConfig() {
        return this.keywordConfig;
    }

    public UpdateSmarttagTemplateRequest setKnowledgeConfig(String knowledgeConfig) {
        this.knowledgeConfig = knowledgeConfig;
        return this;
    }
    public String getKnowledgeConfig() {
        return this.knowledgeConfig;
    }

    public UpdateSmarttagTemplateRequest setLabelType(String labelType) {
        this.labelType = labelType;
        return this;
    }
    public String getLabelType() {
        return this.labelType;
    }

    public UpdateSmarttagTemplateRequest setLabelVersion(String labelVersion) {
        this.labelVersion = labelVersion;
        return this;
    }
    public String getLabelVersion() {
        return this.labelVersion;
    }

    public UpdateSmarttagTemplateRequest setLandmarkGroupIds(String landmarkGroupIds) {
        this.landmarkGroupIds = landmarkGroupIds;
        return this;
    }
    public String getLandmarkGroupIds() {
        return this.landmarkGroupIds;
    }

    public UpdateSmarttagTemplateRequest setObjectGroupIds(String objectGroupIds) {
        this.objectGroupIds = objectGroupIds;
        return this;
    }
    public String getObjectGroupIds() {
        return this.objectGroupIds;
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
