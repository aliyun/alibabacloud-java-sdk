// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class UpdateAggregateCompliancePackRequest extends TeaModel {
    /**
     * <p>The ID of the account group.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/255797.html">ListAggregators</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ca-f632626622af0079****</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

    /**
     * <p>A client token. It is used to ensure the idempotence of the request. Generate a value that is unique among different requests. The <code>ClientToken</code> parameter can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>1594295238-f9361358-5843-4294-8d30-b5183fac****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the compliance pack.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/262059.html">ListAggregateCompliancePacks</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cp-fdc8626622af00f9****</p>
     */
    @NameInMap("CompliancePackId")
    public String compliancePackId;

    /**
     * <p>The name of the compliance pack.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/262059.html">ListAggregateCompliancePacks</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>等保三级预检合规包</p>
     */
    @NameInMap("CompliancePackName")
    public String compliancePackName;

    /**
     * <p>The rules in the compliance pack.</p>
     * <p>If you leave this parameter empty when you modify the compliance pack, the existing rules are not changed. If you specify new rules, the new rules replace the existing ones.</p>
     */
    @NameInMap("ConfigRules")
    public java.util.List<UpdateAggregateCompliancePackRequestConfigRules> configRules;

    /**
     * <p>The description of the compliance pack.</p>
     * 
     * <strong>example:</strong>
     * <p>基于等保2.0三级标准，提供持续检测合规性的建议模板，帮助您提前自检并修复问题，以便快速通过正式检测。</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The rules are not effective for resources in the specified regions. Resources in these regions are not evaluated. Separate multiple region IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("ExcludeRegionIdsScope")
    public String excludeRegionIdsScope;

    /**
     * <p>The rules are not effective for resources in the specified resource groups. Resources in these resource groups are not evaluated. Separate multiple resource group IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>rg-bnczc6r7rml****</p>
     */
    @NameInMap("ExcludeResourceGroupIdsScope")
    public String excludeResourceGroupIdsScope;

    /**
     * <p>The compliance pack is not effective for the specified resources. The specified resources are not evaluated. Separate multiple resource IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>eip-8vbf3x310fn56ijfd****</p>
     */
    @NameInMap("ExcludeResourceIdsScope")
    public String excludeResourceIdsScope;

    /**
     * <p>The excluded tag scope.</p>
     */
    @NameInMap("ExcludeTagsScope")
    public java.util.List<UpdateAggregateCompliancePackRequestExcludeTagsScope> excludeTagsScope;

    /**
     * <p>The compliance pack is effective only for resources in the specified regions. Separate multiple region IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionIdsScope")
    public String regionIdsScope;

    /**
     * <p>The compliance pack is effective only for resources in the specified resource groups. Separate multiple resource group IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzc7r7rhx****</p>
     */
    @NameInMap("ResourceGroupIdsScope")
    public String resourceGroupIdsScope;

    /**
     * <p>The rules are effective only for the specified resources. Separate multiple resource IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>lb-5cmbowstbkss9ta03****</p>
     */
    @NameInMap("ResourceIdsScope")
    public String resourceIdsScope;

    /**
     * <p>The risk level of the compliance pack. Valid values:</p>
     * <ul>
     * <li><p>1: high risk.</p>
     * </li>
     * <li><p>2: medium risk.</p>
     * </li>
     * <li><p>3: low risk.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RiskLevel")
    public Integer riskLevel;

    /**
     * <p>The tags of the resource. This parameter is deprecated and no longer takes effect.</p>
     * <p>You can add up to 20 tags.</p>
     */
    @NameInMap("Tag")
    @Deprecated
    public java.util.List<UpdateAggregateCompliancePackRequestTag> tag;

    /**
     * <p>The compliance pack is effective only for resources that have the specified tag key.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS</p>
     */
    @NameInMap("TagKeyScope")
    public String tagKeyScope;

    /**
     * <p>The compliance pack is effective only for resources that have the specified tag key and tag value.</p>
     * <blockquote>
     * <p>You must specify TagValueScope together with TagKeyScope.</p>
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
    public java.util.List<UpdateAggregateCompliancePackRequestTagsScope> tagsScope;

    public static UpdateAggregateCompliancePackRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAggregateCompliancePackRequest self = new UpdateAggregateCompliancePackRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAggregateCompliancePackRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    public UpdateAggregateCompliancePackRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateAggregateCompliancePackRequest setCompliancePackId(String compliancePackId) {
        this.compliancePackId = compliancePackId;
        return this;
    }
    public String getCompliancePackId() {
        return this.compliancePackId;
    }

    public UpdateAggregateCompliancePackRequest setCompliancePackName(String compliancePackName) {
        this.compliancePackName = compliancePackName;
        return this;
    }
    public String getCompliancePackName() {
        return this.compliancePackName;
    }

    public UpdateAggregateCompliancePackRequest setConfigRules(java.util.List<UpdateAggregateCompliancePackRequestConfigRules> configRules) {
        this.configRules = configRules;
        return this;
    }
    public java.util.List<UpdateAggregateCompliancePackRequestConfigRules> getConfigRules() {
        return this.configRules;
    }

    public UpdateAggregateCompliancePackRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateAggregateCompliancePackRequest setExcludeRegionIdsScope(String excludeRegionIdsScope) {
        this.excludeRegionIdsScope = excludeRegionIdsScope;
        return this;
    }
    public String getExcludeRegionIdsScope() {
        return this.excludeRegionIdsScope;
    }

    public UpdateAggregateCompliancePackRequest setExcludeResourceGroupIdsScope(String excludeResourceGroupIdsScope) {
        this.excludeResourceGroupIdsScope = excludeResourceGroupIdsScope;
        return this;
    }
    public String getExcludeResourceGroupIdsScope() {
        return this.excludeResourceGroupIdsScope;
    }

    public UpdateAggregateCompliancePackRequest setExcludeResourceIdsScope(String excludeResourceIdsScope) {
        this.excludeResourceIdsScope = excludeResourceIdsScope;
        return this;
    }
    public String getExcludeResourceIdsScope() {
        return this.excludeResourceIdsScope;
    }

    public UpdateAggregateCompliancePackRequest setExcludeTagsScope(java.util.List<UpdateAggregateCompliancePackRequestExcludeTagsScope> excludeTagsScope) {
        this.excludeTagsScope = excludeTagsScope;
        return this;
    }
    public java.util.List<UpdateAggregateCompliancePackRequestExcludeTagsScope> getExcludeTagsScope() {
        return this.excludeTagsScope;
    }

    public UpdateAggregateCompliancePackRequest setRegionIdsScope(String regionIdsScope) {
        this.regionIdsScope = regionIdsScope;
        return this;
    }
    public String getRegionIdsScope() {
        return this.regionIdsScope;
    }

    public UpdateAggregateCompliancePackRequest setResourceGroupIdsScope(String resourceGroupIdsScope) {
        this.resourceGroupIdsScope = resourceGroupIdsScope;
        return this;
    }
    public String getResourceGroupIdsScope() {
        return this.resourceGroupIdsScope;
    }

    public UpdateAggregateCompliancePackRequest setResourceIdsScope(String resourceIdsScope) {
        this.resourceIdsScope = resourceIdsScope;
        return this;
    }
    public String getResourceIdsScope() {
        return this.resourceIdsScope;
    }

    public UpdateAggregateCompliancePackRequest setRiskLevel(Integer riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public Integer getRiskLevel() {
        return this.riskLevel;
    }

    @Deprecated
    public UpdateAggregateCompliancePackRequest setTag(java.util.List<UpdateAggregateCompliancePackRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<UpdateAggregateCompliancePackRequestTag> getTag() {
        return this.tag;
    }

    public UpdateAggregateCompliancePackRequest setTagKeyScope(String tagKeyScope) {
        this.tagKeyScope = tagKeyScope;
        return this;
    }
    public String getTagKeyScope() {
        return this.tagKeyScope;
    }

    public UpdateAggregateCompliancePackRequest setTagValueScope(String tagValueScope) {
        this.tagValueScope = tagValueScope;
        return this;
    }
    public String getTagValueScope() {
        return this.tagValueScope;
    }

    public UpdateAggregateCompliancePackRequest setTagsScope(java.util.List<UpdateAggregateCompliancePackRequestTagsScope> tagsScope) {
        this.tagsScope = tagsScope;
        return this;
    }
    public java.util.List<UpdateAggregateCompliancePackRequestTagsScope> getTagsScope() {
        return this.tagsScope;
    }

    public static class UpdateAggregateCompliancePackRequestConfigRulesConfigRuleParameters extends TeaModel {
        /**
         * <p>The name of the rule parameter.</p>
         * <p>You must specify <code>ParameterName</code> and <code>ParameterValue</code> together, or leave both empty. If a rule template has a parameter without a default value, you must specify the parameter. For more information, see <a href="https://help.aliyun.com/document_detail/261176.html">ListCompliancePackTemplates</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>bandwidth</p>
         */
        @NameInMap("ParameterName")
        public String parameterName;

        /**
         * <p>The value of the rule parameter.</p>
         * <p>You must specify <code>ParameterName</code> and <code>ParameterValue</code> together, or leave both empty. If a rule template has a parameter without a default value, you must specify the parameter. For more information, see <a href="https://help.aliyun.com/document_detail/261176.html">ListCompliancePackTemplates</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("ParameterValue")
        public String parameterValue;

        public static UpdateAggregateCompliancePackRequestConfigRulesConfigRuleParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateAggregateCompliancePackRequestConfigRulesConfigRuleParameters self = new UpdateAggregateCompliancePackRequestConfigRulesConfigRuleParameters();
            return TeaModel.build(map, self);
        }

        public UpdateAggregateCompliancePackRequestConfigRulesConfigRuleParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public UpdateAggregateCompliancePackRequestConfigRulesConfigRuleParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

    public static class UpdateAggregateCompliancePackRequestConfigRules extends TeaModel {
        /**
         * <p>The rule ID. CloudConfig adds the existing rule to the compliance pack.</p>
         * <p>You must specify either <code>ManagedRuleIdentifier</code> or <code>ConfigRuleId</code>. If you specify both parameters, <code>ConfigRuleId</code> takes precedence. For more information, see <a href="https://help.aliyun.com/document_detail/264148.html">ListAggregateConfigRules</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>cr-e918626622af000f****</p>
         */
        @NameInMap("ConfigRuleId")
        public String configRuleId;

        /**
         * <p>The name of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>检测闲置弹性公网IP</p>
         */
        @NameInMap("ConfigRuleName")
        public String configRuleName;

        /**
         * <p>The parameters of the rule.</p>
         */
        @NameInMap("ConfigRuleParameters")
        public java.util.List<UpdateAggregateCompliancePackRequestConfigRulesConfigRuleParameters> configRuleParameters;

        /**
         * <p>The description of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>弹性公网已绑定到ECS或者NAT实例，非闲置状态，视为“合规”。</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The identifier of the rule template. CloudConfig automatically creates a rule based on the rule template identifier and adds the rule to the compliance pack.</p>
         * <p>You must specify either <code>ManagedRuleIdentifier</code> or <code>ConfigRuleId</code>. If you specify both parameters, <code>ConfigRuleId</code> takes precedence. For more information, see <a href="https://help.aliyun.com/document_detail/261176.html">ListCompliancePackTemplates</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>eip-bandwidth-limit</p>
         */
        @NameInMap("ManagedRuleIdentifier")
        public String managedRuleIdentifier;

        /**
         * <p>The risk level of the rule. Valid values:</p>
         * <ul>
         * <li><p>1: high risk.</p>
         * </li>
         * <li><p>2: medium risk.</p>
         * </li>
         * <li><p>3: low risk.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RiskLevel")
        public Integer riskLevel;

        public static UpdateAggregateCompliancePackRequestConfigRules build(java.util.Map<String, ?> map) throws Exception {
            UpdateAggregateCompliancePackRequestConfigRules self = new UpdateAggregateCompliancePackRequestConfigRules();
            return TeaModel.build(map, self);
        }

        public UpdateAggregateCompliancePackRequestConfigRules setConfigRuleId(String configRuleId) {
            this.configRuleId = configRuleId;
            return this;
        }
        public String getConfigRuleId() {
            return this.configRuleId;
        }

        public UpdateAggregateCompliancePackRequestConfigRules setConfigRuleName(String configRuleName) {
            this.configRuleName = configRuleName;
            return this;
        }
        public String getConfigRuleName() {
            return this.configRuleName;
        }

        public UpdateAggregateCompliancePackRequestConfigRules setConfigRuleParameters(java.util.List<UpdateAggregateCompliancePackRequestConfigRulesConfigRuleParameters> configRuleParameters) {
            this.configRuleParameters = configRuleParameters;
            return this;
        }
        public java.util.List<UpdateAggregateCompliancePackRequestConfigRulesConfigRuleParameters> getConfigRuleParameters() {
            return this.configRuleParameters;
        }

        public UpdateAggregateCompliancePackRequestConfigRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateAggregateCompliancePackRequestConfigRules setManagedRuleIdentifier(String managedRuleIdentifier) {
            this.managedRuleIdentifier = managedRuleIdentifier;
            return this;
        }
        public String getManagedRuleIdentifier() {
            return this.managedRuleIdentifier;
        }

        public UpdateAggregateCompliancePackRequestConfigRules setRiskLevel(Integer riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

    }

    public static class UpdateAggregateCompliancePackRequestExcludeTagsScope extends TeaModel {
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

        public static UpdateAggregateCompliancePackRequestExcludeTagsScope build(java.util.Map<String, ?> map) throws Exception {
            UpdateAggregateCompliancePackRequestExcludeTagsScope self = new UpdateAggregateCompliancePackRequestExcludeTagsScope();
            return TeaModel.build(map, self);
        }

        public UpdateAggregateCompliancePackRequestExcludeTagsScope setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public UpdateAggregateCompliancePackRequestExcludeTagsScope setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class UpdateAggregateCompliancePackRequestTag extends TeaModel {
        /**
         * <p>The tag key of the resource.</p>
         * <p>You can add up to 20 tag keys.</p>
         * 
         * <strong>example:</strong>
         * <p>key-1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the resource.</p>
         * <p>You can add up to 20 tag values.</p>
         * 
         * <strong>example:</strong>
         * <p>value-1</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateAggregateCompliancePackRequestTag build(java.util.Map<String, ?> map) throws Exception {
            UpdateAggregateCompliancePackRequestTag self = new UpdateAggregateCompliancePackRequestTag();
            return TeaModel.build(map, self);
        }

        public UpdateAggregateCompliancePackRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateAggregateCompliancePackRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateAggregateCompliancePackRequestTagsScope extends TeaModel {
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

        public static UpdateAggregateCompliancePackRequestTagsScope build(java.util.Map<String, ?> map) throws Exception {
            UpdateAggregateCompliancePackRequestTagsScope self = new UpdateAggregateCompliancePackRequestTagsScope();
            return TeaModel.build(map, self);
        }

        public UpdateAggregateCompliancePackRequestTagsScope setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public UpdateAggregateCompliancePackRequestTagsScope setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
