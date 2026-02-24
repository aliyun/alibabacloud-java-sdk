// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class UpdateCompliancePackRequest extends TeaModel {
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
    public java.util.List<UpdateCompliancePackRequestConfigRules> configRules;

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
    public java.util.List<UpdateCompliancePackRequestExcludeTagsScope> excludeTagsScope;

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
    public java.util.List<UpdateCompliancePackRequestTag> tag;

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
    public java.util.List<UpdateCompliancePackRequestTagsScope> tagsScope;

    public static UpdateCompliancePackRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCompliancePackRequest self = new UpdateCompliancePackRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCompliancePackRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateCompliancePackRequest setCompliancePackId(String compliancePackId) {
        this.compliancePackId = compliancePackId;
        return this;
    }
    public String getCompliancePackId() {
        return this.compliancePackId;
    }

    public UpdateCompliancePackRequest setCompliancePackName(String compliancePackName) {
        this.compliancePackName = compliancePackName;
        return this;
    }
    public String getCompliancePackName() {
        return this.compliancePackName;
    }

    public UpdateCompliancePackRequest setConfigRules(java.util.List<UpdateCompliancePackRequestConfigRules> configRules) {
        this.configRules = configRules;
        return this;
    }
    public java.util.List<UpdateCompliancePackRequestConfigRules> getConfigRules() {
        return this.configRules;
    }

    public UpdateCompliancePackRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateCompliancePackRequest setExcludeRegionIdsScope(String excludeRegionIdsScope) {
        this.excludeRegionIdsScope = excludeRegionIdsScope;
        return this;
    }
    public String getExcludeRegionIdsScope() {
        return this.excludeRegionIdsScope;
    }

    public UpdateCompliancePackRequest setExcludeResourceGroupIdsScope(String excludeResourceGroupIdsScope) {
        this.excludeResourceGroupIdsScope = excludeResourceGroupIdsScope;
        return this;
    }
    public String getExcludeResourceGroupIdsScope() {
        return this.excludeResourceGroupIdsScope;
    }

    public UpdateCompliancePackRequest setExcludeResourceIdsScope(String excludeResourceIdsScope) {
        this.excludeResourceIdsScope = excludeResourceIdsScope;
        return this;
    }
    public String getExcludeResourceIdsScope() {
        return this.excludeResourceIdsScope;
    }

    public UpdateCompliancePackRequest setExcludeTagsScope(java.util.List<UpdateCompliancePackRequestExcludeTagsScope> excludeTagsScope) {
        this.excludeTagsScope = excludeTagsScope;
        return this;
    }
    public java.util.List<UpdateCompliancePackRequestExcludeTagsScope> getExcludeTagsScope() {
        return this.excludeTagsScope;
    }

    public UpdateCompliancePackRequest setRegionIdsScope(String regionIdsScope) {
        this.regionIdsScope = regionIdsScope;
        return this;
    }
    public String getRegionIdsScope() {
        return this.regionIdsScope;
    }

    public UpdateCompliancePackRequest setResourceGroupIdsScope(String resourceGroupIdsScope) {
        this.resourceGroupIdsScope = resourceGroupIdsScope;
        return this;
    }
    public String getResourceGroupIdsScope() {
        return this.resourceGroupIdsScope;
    }

    public UpdateCompliancePackRequest setResourceIdsScope(String resourceIdsScope) {
        this.resourceIdsScope = resourceIdsScope;
        return this;
    }
    public String getResourceIdsScope() {
        return this.resourceIdsScope;
    }

    public UpdateCompliancePackRequest setRiskLevel(Integer riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public Integer getRiskLevel() {
        return this.riskLevel;
    }

    @Deprecated
    public UpdateCompliancePackRequest setTag(java.util.List<UpdateCompliancePackRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<UpdateCompliancePackRequestTag> getTag() {
        return this.tag;
    }

    public UpdateCompliancePackRequest setTagKeyScope(String tagKeyScope) {
        this.tagKeyScope = tagKeyScope;
        return this;
    }
    public String getTagKeyScope() {
        return this.tagKeyScope;
    }

    public UpdateCompliancePackRequest setTagValueScope(String tagValueScope) {
        this.tagValueScope = tagValueScope;
        return this;
    }
    public String getTagValueScope() {
        return this.tagValueScope;
    }

    public UpdateCompliancePackRequest setTagsScope(java.util.List<UpdateCompliancePackRequestTagsScope> tagsScope) {
        this.tagsScope = tagsScope;
        return this;
    }
    public java.util.List<UpdateCompliancePackRequestTagsScope> getTagsScope() {
        return this.tagsScope;
    }

    public static class UpdateCompliancePackRequestConfigRulesConfigRuleParameters extends TeaModel {
        /**
         * <p>The name of the rule parameter.</p>
         * <p>You must specify <code>ParameterName</code> and <code>ParameterValue</code> together, or leave them both empty. If a rule template has a parameter without a default value, you must specify this parameter. For more information, see <a href="https://help.aliyun.com/document_detail/261176.html">ListCompliancePackTemplates</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>bandwidth</p>
         */
        @NameInMap("ParameterName")
        public String parameterName;

        /**
         * <p>The value of the rule parameter.</p>
         * <p>You must specify <code>ParameterName</code> and <code>ParameterValue</code> together, or leave them both empty. If a rule template has a parameter without a default value, you must specify this parameter. For more information, see <a href="https://help.aliyun.com/document_detail/261176.html">ListCompliancePackTemplates</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("ParameterValue")
        public String parameterValue;

        public static UpdateCompliancePackRequestConfigRulesConfigRuleParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateCompliancePackRequestConfigRulesConfigRuleParameters self = new UpdateCompliancePackRequestConfigRulesConfigRuleParameters();
            return TeaModel.build(map, self);
        }

        public UpdateCompliancePackRequestConfigRulesConfigRuleParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public UpdateCompliancePackRequestConfigRulesConfigRuleParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

    public static class UpdateCompliancePackRequestConfigRules extends TeaModel {
        /**
         * <p>The rule ID. CloudConfig adds an existing rule to the compliance pack.</p>
         * <p>You must specify either <code>ManagedRuleIdentifier</code> or <code>ConfigRuleId</code>. If you specify both parameters, <code>ConfigRuleId</code> takes precedence. For more information, see <a href="https://help.aliyun.com/document_detail/169607.html">ListConfigRules</a>.</p>
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
        public java.util.List<UpdateCompliancePackRequestConfigRulesConfigRuleParameters> configRuleParameters;

        /**
         * <p>The description of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>弹性公网已绑定到ECS或者NAT实例，非闲置状态，视为“合规”。</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The identifier of the rule template. CloudConfig automatically creates a rule based on this identifier and adds the rule to the compliance pack.</p>
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

        public static UpdateCompliancePackRequestConfigRules build(java.util.Map<String, ?> map) throws Exception {
            UpdateCompliancePackRequestConfigRules self = new UpdateCompliancePackRequestConfigRules();
            return TeaModel.build(map, self);
        }

        public UpdateCompliancePackRequestConfigRules setConfigRuleId(String configRuleId) {
            this.configRuleId = configRuleId;
            return this;
        }
        public String getConfigRuleId() {
            return this.configRuleId;
        }

        public UpdateCompliancePackRequestConfigRules setConfigRuleName(String configRuleName) {
            this.configRuleName = configRuleName;
            return this;
        }
        public String getConfigRuleName() {
            return this.configRuleName;
        }

        public UpdateCompliancePackRequestConfigRules setConfigRuleParameters(java.util.List<UpdateCompliancePackRequestConfigRulesConfigRuleParameters> configRuleParameters) {
            this.configRuleParameters = configRuleParameters;
            return this;
        }
        public java.util.List<UpdateCompliancePackRequestConfigRulesConfigRuleParameters> getConfigRuleParameters() {
            return this.configRuleParameters;
        }

        public UpdateCompliancePackRequestConfigRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateCompliancePackRequestConfigRules setManagedRuleIdentifier(String managedRuleIdentifier) {
            this.managedRuleIdentifier = managedRuleIdentifier;
            return this;
        }
        public String getManagedRuleIdentifier() {
            return this.managedRuleIdentifier;
        }

        public UpdateCompliancePackRequestConfigRules setRiskLevel(Integer riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

    }

    public static class UpdateCompliancePackRequestExcludeTagsScope extends TeaModel {
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

        public static UpdateCompliancePackRequestExcludeTagsScope build(java.util.Map<String, ?> map) throws Exception {
            UpdateCompliancePackRequestExcludeTagsScope self = new UpdateCompliancePackRequestExcludeTagsScope();
            return TeaModel.build(map, self);
        }

        public UpdateCompliancePackRequestExcludeTagsScope setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public UpdateCompliancePackRequestExcludeTagsScope setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class UpdateCompliancePackRequestTag extends TeaModel {
        /**
         * <p>The tag key of the resource.</p>
         * <p>If you specify this parameter, it cannot be an empty string. The tag key can be up to 64 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https:// </code>.</p>
         * <p>You can specify the tag keys of up to 20 tags at a time.</p>
         * 
         * <strong>example:</strong>
         * <p>key-1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the resource. You can specify up to 20 tag values. If you specify this parameter, it can be an empty string.</p>
         * <p>The tag value can be up to 128 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>value-1</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateCompliancePackRequestTag build(java.util.Map<String, ?> map) throws Exception {
            UpdateCompliancePackRequestTag self = new UpdateCompliancePackRequestTag();
            return TeaModel.build(map, self);
        }

        public UpdateCompliancePackRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateCompliancePackRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateCompliancePackRequestTagsScope extends TeaModel {
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

        public static UpdateCompliancePackRequestTagsScope build(java.util.Map<String, ?> map) throws Exception {
            UpdateCompliancePackRequestTagsScope self = new UpdateCompliancePackRequestTagsScope();
            return TeaModel.build(map, self);
        }

        public UpdateCompliancePackRequestTagsScope setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public UpdateCompliancePackRequestTagsScope setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
