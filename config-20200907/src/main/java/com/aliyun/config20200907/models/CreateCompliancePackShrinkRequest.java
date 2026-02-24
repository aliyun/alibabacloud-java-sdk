// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CreateCompliancePackShrinkRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CompliancePackName")
    public String compliancePackName;

    @NameInMap("CompliancePackTemplateId")
    public String compliancePackTemplateId;

    /**
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("ConfigRules")
    public String configRulesShrink;

    @NameInMap("DefaultEnable")
    public Boolean defaultEnable;

    @NameInMap("Description")
    public String description;

    @NameInMap("ExcludeRegionIdsScope")
    public String excludeRegionIdsScope;

    @NameInMap("ExcludeResourceGroupIdsScope")
    public String excludeResourceGroupIdsScope;

    @NameInMap("ExcludeResourceIdsScope")
    public String excludeResourceIdsScope;

    @NameInMap("ExcludeTagsScope")
    public java.util.List<CreateCompliancePackShrinkRequestExcludeTagsScope> excludeTagsScope;

    @NameInMap("RegionIdsScope")
    public String regionIdsScope;

    @NameInMap("ResourceGroupIdsScope")
    public String resourceGroupIdsScope;

    @NameInMap("ResourceIdsScope")
    public String resourceIdsScope;

    @NameInMap("RiskLevel")
    public Integer riskLevel;

    @NameInMap("Tag")
    public String tagShrink;

    @NameInMap("TagKeyScope")
    public String tagKeyScope;

    @NameInMap("TagValueScope")
    public String tagValueScope;

    @NameInMap("TagsScope")
    public java.util.List<CreateCompliancePackShrinkRequestTagsScope> tagsScope;

    @NameInMap("TemplateContent")
    public String templateContent;

    public static CreateCompliancePackShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCompliancePackShrinkRequest self = new CreateCompliancePackShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateCompliancePackShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateCompliancePackShrinkRequest setCompliancePackName(String compliancePackName) {
        this.compliancePackName = compliancePackName;
        return this;
    }
    public String getCompliancePackName() {
        return this.compliancePackName;
    }

    public CreateCompliancePackShrinkRequest setCompliancePackTemplateId(String compliancePackTemplateId) {
        this.compliancePackTemplateId = compliancePackTemplateId;
        return this;
    }
    public String getCompliancePackTemplateId() {
        return this.compliancePackTemplateId;
    }

    public CreateCompliancePackShrinkRequest setConfigRulesShrink(String configRulesShrink) {
        this.configRulesShrink = configRulesShrink;
        return this;
    }
    public String getConfigRulesShrink() {
        return this.configRulesShrink;
    }

    public CreateCompliancePackShrinkRequest setDefaultEnable(Boolean defaultEnable) {
        this.defaultEnable = defaultEnable;
        return this;
    }
    public Boolean getDefaultEnable() {
        return this.defaultEnable;
    }

    public CreateCompliancePackShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateCompliancePackShrinkRequest setExcludeRegionIdsScope(String excludeRegionIdsScope) {
        this.excludeRegionIdsScope = excludeRegionIdsScope;
        return this;
    }
    public String getExcludeRegionIdsScope() {
        return this.excludeRegionIdsScope;
    }

    public CreateCompliancePackShrinkRequest setExcludeResourceGroupIdsScope(String excludeResourceGroupIdsScope) {
        this.excludeResourceGroupIdsScope = excludeResourceGroupIdsScope;
        return this;
    }
    public String getExcludeResourceGroupIdsScope() {
        return this.excludeResourceGroupIdsScope;
    }

    public CreateCompliancePackShrinkRequest setExcludeResourceIdsScope(String excludeResourceIdsScope) {
        this.excludeResourceIdsScope = excludeResourceIdsScope;
        return this;
    }
    public String getExcludeResourceIdsScope() {
        return this.excludeResourceIdsScope;
    }

    public CreateCompliancePackShrinkRequest setExcludeTagsScope(java.util.List<CreateCompliancePackShrinkRequestExcludeTagsScope> excludeTagsScope) {
        this.excludeTagsScope = excludeTagsScope;
        return this;
    }
    public java.util.List<CreateCompliancePackShrinkRequestExcludeTagsScope> getExcludeTagsScope() {
        return this.excludeTagsScope;
    }

    public CreateCompliancePackShrinkRequest setRegionIdsScope(String regionIdsScope) {
        this.regionIdsScope = regionIdsScope;
        return this;
    }
    public String getRegionIdsScope() {
        return this.regionIdsScope;
    }

    public CreateCompliancePackShrinkRequest setResourceGroupIdsScope(String resourceGroupIdsScope) {
        this.resourceGroupIdsScope = resourceGroupIdsScope;
        return this;
    }
    public String getResourceGroupIdsScope() {
        return this.resourceGroupIdsScope;
    }

    public CreateCompliancePackShrinkRequest setResourceIdsScope(String resourceIdsScope) {
        this.resourceIdsScope = resourceIdsScope;
        return this;
    }
    public String getResourceIdsScope() {
        return this.resourceIdsScope;
    }

    public CreateCompliancePackShrinkRequest setRiskLevel(Integer riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public Integer getRiskLevel() {
        return this.riskLevel;
    }

    public CreateCompliancePackShrinkRequest setTagShrink(String tagShrink) {
        this.tagShrink = tagShrink;
        return this;
    }
    public String getTagShrink() {
        return this.tagShrink;
    }

    public CreateCompliancePackShrinkRequest setTagKeyScope(String tagKeyScope) {
        this.tagKeyScope = tagKeyScope;
        return this;
    }
    public String getTagKeyScope() {
        return this.tagKeyScope;
    }

    public CreateCompliancePackShrinkRequest setTagValueScope(String tagValueScope) {
        this.tagValueScope = tagValueScope;
        return this;
    }
    public String getTagValueScope() {
        return this.tagValueScope;
    }

    public CreateCompliancePackShrinkRequest setTagsScope(java.util.List<CreateCompliancePackShrinkRequestTagsScope> tagsScope) {
        this.tagsScope = tagsScope;
        return this;
    }
    public java.util.List<CreateCompliancePackShrinkRequestTagsScope> getTagsScope() {
        return this.tagsScope;
    }

    public CreateCompliancePackShrinkRequest setTemplateContent(String templateContent) {
        this.templateContent = templateContent;
        return this;
    }
    public String getTemplateContent() {
        return this.templateContent;
    }

    public static class CreateCompliancePackShrinkRequestExcludeTagsScope extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static CreateCompliancePackShrinkRequestExcludeTagsScope build(java.util.Map<String, ?> map) throws Exception {
            CreateCompliancePackShrinkRequestExcludeTagsScope self = new CreateCompliancePackShrinkRequestExcludeTagsScope();
            return TeaModel.build(map, self);
        }

        public CreateCompliancePackShrinkRequestExcludeTagsScope setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public CreateCompliancePackShrinkRequestExcludeTagsScope setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class CreateCompliancePackShrinkRequestTagsScope extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static CreateCompliancePackShrinkRequestTagsScope build(java.util.Map<String, ?> map) throws Exception {
            CreateCompliancePackShrinkRequestTagsScope self = new CreateCompliancePackShrinkRequestTagsScope();
            return TeaModel.build(map, self);
        }

        public CreateCompliancePackShrinkRequestTagsScope setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public CreateCompliancePackShrinkRequestTagsScope setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
