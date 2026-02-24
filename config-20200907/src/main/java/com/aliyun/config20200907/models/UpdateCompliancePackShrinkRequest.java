// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class UpdateCompliancePackShrinkRequest extends TeaModel {
    /**
     * <p>A client token to ensure the idempotence of the request. Generate a unique token for each request. The <code>ClientToken</code> value can contain only ASCII characters and must be no more than 64 characters long.</p>
     * 
     * <strong>example:</strong>
     * <p>1594295238-f9361358-5843-4294-8d30-b5183fac****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the compliance pack.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/263332.html">ListCompliancePacks</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cp-a8a8626622af0082****</p>
     */
    @NameInMap("CompliancePackId")
    public String compliancePackId;

    /**
     * <p>The name of the compliance pack.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/263332.html">ListCompliancePacks</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>等保三级预检合规包</p>
     */
    @NameInMap("CompliancePackName")
    public String compliancePackName;

    /**
     * <p>The rules in the compliance pack.</p>
     * <p>If you leave this parameter empty when you modify the compliance pack, the original rules are retained. If you specify new rules, they replace the original rules.</p>
     */
    @NameInMap("ConfigRules")
    public String configRulesShrink;

    /**
     * <p>The description of the compliance pack.</p>
     * 
     * <strong>example:</strong>
     * <p>基于等保2.0三级标准，提供持续检测合规性的建议模板，帮助您提前自检并修复问题，以便快速通过正式检测。</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The compliance pack does not evaluate resources in the specified regions. Separate multiple region IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("ExcludeRegionIdsScope")
    public String excludeRegionIdsScope;

    /**
     * <p>The compliance pack does not evaluate resources in the specified resource groups. Separate multiple resource group IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>rg-bnczc6r7rml****</p>
     */
    @NameInMap("ExcludeResourceGroupIdsScope")
    public String excludeResourceGroupIdsScope;

    /**
     * <p>The compliance pack does not evaluate the specified resources. Separate multiple resource IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>23642660635687****</p>
     */
    @NameInMap("ExcludeResourceIdsScope")
    public String excludeResourceIdsScope;

    /**
     * <p>The excluded tag scope.</p>
     */
    @NameInMap("ExcludeTagsScope")
    public java.util.List<UpdateCompliancePackShrinkRequestExcludeTagsScope> excludeTagsScope;

    /**
     * <p>The compliance pack evaluates only resources in the specified regions. Separate multiple region IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionIdsScope")
    public String regionIdsScope;

    /**
     * <p>The compliance pack evaluates only resources in the specified resource groups. Separate multiple resource group IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzdibsjjc****</p>
     */
    @NameInMap("ResourceGroupIdsScope")
    public String resourceGroupIdsScope;

    /**
     * <p>The compliance pack evaluates only the specified resources. Separate multiple resource IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>lb-5cmbowstbkss9ta03****</p>
     */
    @NameInMap("ResourceIdsScope")
    public String resourceIdsScope;

    /**
     * <p>The risk level of the compliance pack. Valid values:</p>
     * <ul>
     * <li><p>1: High risk.</p>
     * </li>
     * <li><p>2: Medium risk.</p>
     * </li>
     * <li><p>3: Low risk.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RiskLevel")
    public Integer riskLevel;

    /**
     * <p>The tags of the resource. This parameter is deprecated. Ignore this parameter because it is no longer valid.</p>
     * <p>You can add up to 20 tags.</p>
     */
    @NameInMap("Tag")
    @Deprecated
    public String tagShrink;

    /**
     * <p>The compliance pack evaluates only resources that have the specified tag key.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS</p>
     */
    @NameInMap("TagKeyScope")
    public String tagKeyScope;

    /**
     * <p>The compliance pack evaluates only resources that have the specified tag key and value.</p>
     * <blockquote>
     * <p>You must use TagValueScope with TagKeyScope.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("TagValueScope")
    public String tagValueScope;

    /**
     * <p>The tag scope.</p>
     */
    @NameInMap("TagsScope")
    public java.util.List<UpdateCompliancePackShrinkRequestTagsScope> tagsScope;

    public static UpdateCompliancePackShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCompliancePackShrinkRequest self = new UpdateCompliancePackShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCompliancePackShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateCompliancePackShrinkRequest setCompliancePackId(String compliancePackId) {
        this.compliancePackId = compliancePackId;
        return this;
    }
    public String getCompliancePackId() {
        return this.compliancePackId;
    }

    public UpdateCompliancePackShrinkRequest setCompliancePackName(String compliancePackName) {
        this.compliancePackName = compliancePackName;
        return this;
    }
    public String getCompliancePackName() {
        return this.compliancePackName;
    }

    public UpdateCompliancePackShrinkRequest setConfigRulesShrink(String configRulesShrink) {
        this.configRulesShrink = configRulesShrink;
        return this;
    }
    public String getConfigRulesShrink() {
        return this.configRulesShrink;
    }

    public UpdateCompliancePackShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateCompliancePackShrinkRequest setExcludeRegionIdsScope(String excludeRegionIdsScope) {
        this.excludeRegionIdsScope = excludeRegionIdsScope;
        return this;
    }
    public String getExcludeRegionIdsScope() {
        return this.excludeRegionIdsScope;
    }

    public UpdateCompliancePackShrinkRequest setExcludeResourceGroupIdsScope(String excludeResourceGroupIdsScope) {
        this.excludeResourceGroupIdsScope = excludeResourceGroupIdsScope;
        return this;
    }
    public String getExcludeResourceGroupIdsScope() {
        return this.excludeResourceGroupIdsScope;
    }

    public UpdateCompliancePackShrinkRequest setExcludeResourceIdsScope(String excludeResourceIdsScope) {
        this.excludeResourceIdsScope = excludeResourceIdsScope;
        return this;
    }
    public String getExcludeResourceIdsScope() {
        return this.excludeResourceIdsScope;
    }

    public UpdateCompliancePackShrinkRequest setExcludeTagsScope(java.util.List<UpdateCompliancePackShrinkRequestExcludeTagsScope> excludeTagsScope) {
        this.excludeTagsScope = excludeTagsScope;
        return this;
    }
    public java.util.List<UpdateCompliancePackShrinkRequestExcludeTagsScope> getExcludeTagsScope() {
        return this.excludeTagsScope;
    }

    public UpdateCompliancePackShrinkRequest setRegionIdsScope(String regionIdsScope) {
        this.regionIdsScope = regionIdsScope;
        return this;
    }
    public String getRegionIdsScope() {
        return this.regionIdsScope;
    }

    public UpdateCompliancePackShrinkRequest setResourceGroupIdsScope(String resourceGroupIdsScope) {
        this.resourceGroupIdsScope = resourceGroupIdsScope;
        return this;
    }
    public String getResourceGroupIdsScope() {
        return this.resourceGroupIdsScope;
    }

    public UpdateCompliancePackShrinkRequest setResourceIdsScope(String resourceIdsScope) {
        this.resourceIdsScope = resourceIdsScope;
        return this;
    }
    public String getResourceIdsScope() {
        return this.resourceIdsScope;
    }

    public UpdateCompliancePackShrinkRequest setRiskLevel(Integer riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public Integer getRiskLevel() {
        return this.riskLevel;
    }

    @Deprecated
    public UpdateCompliancePackShrinkRequest setTagShrink(String tagShrink) {
        this.tagShrink = tagShrink;
        return this;
    }
    public String getTagShrink() {
        return this.tagShrink;
    }

    public UpdateCompliancePackShrinkRequest setTagKeyScope(String tagKeyScope) {
        this.tagKeyScope = tagKeyScope;
        return this;
    }
    public String getTagKeyScope() {
        return this.tagKeyScope;
    }

    public UpdateCompliancePackShrinkRequest setTagValueScope(String tagValueScope) {
        this.tagValueScope = tagValueScope;
        return this;
    }
    public String getTagValueScope() {
        return this.tagValueScope;
    }

    public UpdateCompliancePackShrinkRequest setTagsScope(java.util.List<UpdateCompliancePackShrinkRequestTagsScope> tagsScope) {
        this.tagsScope = tagsScope;
        return this;
    }
    public java.util.List<UpdateCompliancePackShrinkRequestTagsScope> getTagsScope() {
        return this.tagsScope;
    }

    public static class UpdateCompliancePackShrinkRequestExcludeTagsScope extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>key-2</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>value-2</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static UpdateCompliancePackShrinkRequestExcludeTagsScope build(java.util.Map<String, ?> map) throws Exception {
            UpdateCompliancePackShrinkRequestExcludeTagsScope self = new UpdateCompliancePackShrinkRequestExcludeTagsScope();
            return TeaModel.build(map, self);
        }

        public UpdateCompliancePackShrinkRequestExcludeTagsScope setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public UpdateCompliancePackShrinkRequestExcludeTagsScope setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class UpdateCompliancePackShrinkRequestTagsScope extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>key-1</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>value-1</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static UpdateCompliancePackShrinkRequestTagsScope build(java.util.Map<String, ?> map) throws Exception {
            UpdateCompliancePackShrinkRequestTagsScope self = new UpdateCompliancePackShrinkRequestTagsScope();
            return TeaModel.build(map, self);
        }

        public UpdateCompliancePackShrinkRequestTagsScope setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public UpdateCompliancePackShrinkRequestTagsScope setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
