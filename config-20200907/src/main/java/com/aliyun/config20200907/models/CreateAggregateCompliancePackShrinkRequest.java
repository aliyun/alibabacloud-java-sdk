// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CreateAggregateCompliancePackShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the account group.</p>
     * <p>For more information about how to obtain the ID of an account group, see <a href="https://help.aliyun.com/document_detail/255797.html">ListAggregators</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ca-f632626622af0079****</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

    /**
     * <p>A client token. It is used to ensure the idempotence of the request. Generate a value from your client to make sure that the value is unique among different requests. <code>ClientToken</code> supports only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>1594295238-f9361358-5843-4294-8d30-b5183fac****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The name of the compliance pack.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>等保三级预检合规包</p>
     */
    @NameInMap("CompliancePackName")
    public String compliancePackName;

    /**
     * <p>The ID of the compliance pack template.</p>
     * <p>For more information about how to obtain the ID of a compliance pack template, see <a href="https://help.aliyun.com/document_detail/261176.html">ListCompliancePackTemplates</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>ct-5f26ff4e06a300c4****</p>
     */
    @NameInMap("CompliancePackTemplateId")
    public String compliancePackTemplateId;

    /**
     * <p>The rules in the compliance pack.</p>
     * <blockquote>
     * <p>Specify either this parameter or <code>TemplateContent</code>.</p>
     * </blockquote>
     */
    @NameInMap("ConfigRules")
    public String configRulesShrink;

    /**
     * <p>Indicates whether the rule is enabled for quick activation. Valid values:</p>
     * <ul>
     * <li><p>true: The rule is enabled when you quickly activate the compliance pack.</p>
     * </li>
     * <li><p>false (default): The rule is not enabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DefaultEnable")
    public Boolean defaultEnable;

    /**
     * <p>The description of the compliance pack.</p>
     * 
     * <strong>example:</strong>
     * <p>基于等保三级的部分要求，对阿里云上资源的合规性做检测。</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The compliance pack does not take effect for resources in the specified regions. The resources in these regions are not evaluated. Separate multiple region IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("ExcludeRegionIdsScope")
    public String excludeRegionIdsScope;

    /**
     * <p>The compliance pack does not take effect for resources in the specified resource groups. The resources in these resource groups are not evaluated. Separate multiple resource group IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>rg-bnczc6r7rml****</p>
     */
    @NameInMap("ExcludeResourceGroupIdsScope")
    public String excludeResourceGroupIdsScope;

    /**
     * <p>The compliance pack does not take effect for the specified resources. The resources are not evaluated. Separate multiple resource IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>eip-8vbf3x310fn56ijfd****</p>
     */
    @NameInMap("ExcludeResourceIdsScope")
    public String excludeResourceIdsScope;

    /**
     * <p>The excluded tags.</p>
     */
    @NameInMap("ExcludeTagsScope")
    public java.util.List<CreateAggregateCompliancePackShrinkRequestExcludeTagsScope> excludeTagsScope;

    /**
     * <p>The compliance pack takes effect only for resources in the specified regions. Separate multiple region IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionIdsScope")
    public String regionIdsScope;

    /**
     * <p>The compliance pack takes effect only for resources in the specified resource groups. Separate multiple resource group IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzc7r7rhx****</p>
     */
    @NameInMap("ResourceGroupIdsScope")
    public String resourceGroupIdsScope;

    /**
     * <p>The compliance pack takes effect only for the specified resources. Separate multiple resource IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>lb-5cmbowstbkss9ta03****</p>
     */
    @NameInMap("ResourceIdsScope")
    public String resourceIdsScope;

    /**
     * <p>The risk level of the compliance pack. Valid values:</p>
     * <ul>
     * <li><p>1: High</p>
     * </li>
     * <li><p>2 (default): Medium</p>
     * </li>
     * <li><p>3: Low</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("RiskLevel")
    public Integer riskLevel;

    /**
     * <p>The tags of the resource.</p>
     * <p>You can add up to 20 tags.</p>
     */
    @NameInMap("Tag")
    public String tagShrink;

    /**
     * <p>The compliance pack takes effect only for resources that have the specified tag key.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS</p>
     */
    @NameInMap("TagKeyScope")
    public String tagKeyScope;

    /**
     * <p>The compliance pack takes effect only for resources that have the specified tag key-value pair.</p>
     * <blockquote>
     * <p>TagValueScope must be used with TagKeyScope.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("TagValueScope")
    public String tagValueScope;

    /**
     * <p>The effective tags.</p>
     */
    @NameInMap("TagsScope")
    public java.util.List<CreateAggregateCompliancePackShrinkRequestTagsScope> tagsScope;

    /**
     * <p>The template information that is used to generate the compliance pack. You can view the template content in the details of an existing compliance pack or create a template. For more information, see <a href="https://help.aliyun.com/document_detail/2659733.html">Create a configurable compliance pack template</a>.</p>
     * <blockquote>
     * <p>Specify either this parameter or <code>ConfigRules</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;configRuleTemplates&quot;: [
     *         {
     *             &quot;configRuleName&quot;: &quot;自定义条件规则示例&quot;,
     *             &quot;scope&quot;: {
     *                 &quot;complianceResourceTypes&quot;: [
     *                     &quot;ACS::ECS::Instance&quot;
     *                 ]
     *             },
     *             &quot;description&quot;: &quot;&quot;,
     *             &quot;source&quot;: {
     *                 &quot;owner&quot;: &quot;CUSTOM_CONFIGURATION&quot;,
     *                 &quot;identifier&quot;: &quot;acs-config-configuration&quot;,
     *                 &quot;sourceDetails&quot;: [
     *                     {
     *                         &quot;messageType&quot;: &quot;ScheduledNotification&quot;,
     *                         &quot;maximumExecutionFrequency&quot;: &quot;Twelve_Hours&quot;
     *                     },
     *                     {
     *                         &quot;messageType&quot;: &quot;ConfigurationItemChangeNotification&quot;
     *                     }
     *                 ],
     *                 &quot;conditions&quot;: &quot;{\&quot;ComplianceConditions\&quot;:\&quot;{\\\&quot;operator\\\&quot;:\\\&quot;and\\\&quot;,\\\&quot;children\\\&quot;:[{\\\&quot;operator\\\&quot;:\\\&quot;GreaterOrEquals\\\&quot;,\\\&quot;featurePath\\\&quot;:\\\&quot;$.Cpu\\\&quot;,\\\&quot;featureSource\\\&quot;:\\\&quot;CONFIGURATION\\\&quot;,\\\&quot;desired\\\&quot;:\\\&quot;2\\\&quot;}]}\&quot;}&quot;
     *             },
     *             &quot;inputParameters&quot;: {}
     *         },
     *         {
     *             &quot;configRuleName&quot;: &quot;OSS存储空间Referer在指定的防盗链白名单中&quot;,
     *             &quot;scope&quot;: {
     *                 &quot;complianceResourceTypes&quot;: [
     *                     &quot;ACS::OSS::Bucket&quot;
     *                 ]
     *             },
     *             &quot;description&quot;: &quot;OSS存储空间开启防盗链并且Referer在指定白名单中，视为“合规”。&quot;,
     *             &quot;source&quot;: {
     *                 &quot;owner&quot;: &quot;ALIYUN&quot;,
     *                 &quot;identifier&quot;: &quot;oss-bucket-referer-limit&quot;,
     *                 &quot;sourceDetails&quot;: [
     *                     {
     *                         &quot;messageType&quot;: &quot;ConfigurationItemChangeNotification&quot;
     *                     }
     *                 ]
     *             },
     *             &quot;inputParameters&quot;: {
     *                 &quot;allowEmptyReferer&quot;: &quot;true&quot;,
     *                 &quot;allowReferers&quot;: &quot;<a href="http://www.aliyun.com">http://www.aliyun.com</a>&quot;
     *             }
     *         }
     *     ]
     * }</p>
     */
    @NameInMap("TemplateContent")
    public String templateContent;

    public static CreateAggregateCompliancePackShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAggregateCompliancePackShrinkRequest self = new CreateAggregateCompliancePackShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateAggregateCompliancePackShrinkRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    public CreateAggregateCompliancePackShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateAggregateCompliancePackShrinkRequest setCompliancePackName(String compliancePackName) {
        this.compliancePackName = compliancePackName;
        return this;
    }
    public String getCompliancePackName() {
        return this.compliancePackName;
    }

    public CreateAggregateCompliancePackShrinkRequest setCompliancePackTemplateId(String compliancePackTemplateId) {
        this.compliancePackTemplateId = compliancePackTemplateId;
        return this;
    }
    public String getCompliancePackTemplateId() {
        return this.compliancePackTemplateId;
    }

    public CreateAggregateCompliancePackShrinkRequest setConfigRulesShrink(String configRulesShrink) {
        this.configRulesShrink = configRulesShrink;
        return this;
    }
    public String getConfigRulesShrink() {
        return this.configRulesShrink;
    }

    public CreateAggregateCompliancePackShrinkRequest setDefaultEnable(Boolean defaultEnable) {
        this.defaultEnable = defaultEnable;
        return this;
    }
    public Boolean getDefaultEnable() {
        return this.defaultEnable;
    }

    public CreateAggregateCompliancePackShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAggregateCompliancePackShrinkRequest setExcludeRegionIdsScope(String excludeRegionIdsScope) {
        this.excludeRegionIdsScope = excludeRegionIdsScope;
        return this;
    }
    public String getExcludeRegionIdsScope() {
        return this.excludeRegionIdsScope;
    }

    public CreateAggregateCompliancePackShrinkRequest setExcludeResourceGroupIdsScope(String excludeResourceGroupIdsScope) {
        this.excludeResourceGroupIdsScope = excludeResourceGroupIdsScope;
        return this;
    }
    public String getExcludeResourceGroupIdsScope() {
        return this.excludeResourceGroupIdsScope;
    }

    public CreateAggregateCompliancePackShrinkRequest setExcludeResourceIdsScope(String excludeResourceIdsScope) {
        this.excludeResourceIdsScope = excludeResourceIdsScope;
        return this;
    }
    public String getExcludeResourceIdsScope() {
        return this.excludeResourceIdsScope;
    }

    public CreateAggregateCompliancePackShrinkRequest setExcludeTagsScope(java.util.List<CreateAggregateCompliancePackShrinkRequestExcludeTagsScope> excludeTagsScope) {
        this.excludeTagsScope = excludeTagsScope;
        return this;
    }
    public java.util.List<CreateAggregateCompliancePackShrinkRequestExcludeTagsScope> getExcludeTagsScope() {
        return this.excludeTagsScope;
    }

    public CreateAggregateCompliancePackShrinkRequest setRegionIdsScope(String regionIdsScope) {
        this.regionIdsScope = regionIdsScope;
        return this;
    }
    public String getRegionIdsScope() {
        return this.regionIdsScope;
    }

    public CreateAggregateCompliancePackShrinkRequest setResourceGroupIdsScope(String resourceGroupIdsScope) {
        this.resourceGroupIdsScope = resourceGroupIdsScope;
        return this;
    }
    public String getResourceGroupIdsScope() {
        return this.resourceGroupIdsScope;
    }

    public CreateAggregateCompliancePackShrinkRequest setResourceIdsScope(String resourceIdsScope) {
        this.resourceIdsScope = resourceIdsScope;
        return this;
    }
    public String getResourceIdsScope() {
        return this.resourceIdsScope;
    }

    public CreateAggregateCompliancePackShrinkRequest setRiskLevel(Integer riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public Integer getRiskLevel() {
        return this.riskLevel;
    }

    public CreateAggregateCompliancePackShrinkRequest setTagShrink(String tagShrink) {
        this.tagShrink = tagShrink;
        return this;
    }
    public String getTagShrink() {
        return this.tagShrink;
    }

    public CreateAggregateCompliancePackShrinkRequest setTagKeyScope(String tagKeyScope) {
        this.tagKeyScope = tagKeyScope;
        return this;
    }
    public String getTagKeyScope() {
        return this.tagKeyScope;
    }

    public CreateAggregateCompliancePackShrinkRequest setTagValueScope(String tagValueScope) {
        this.tagValueScope = tagValueScope;
        return this;
    }
    public String getTagValueScope() {
        return this.tagValueScope;
    }

    public CreateAggregateCompliancePackShrinkRequest setTagsScope(java.util.List<CreateAggregateCompliancePackShrinkRequestTagsScope> tagsScope) {
        this.tagsScope = tagsScope;
        return this;
    }
    public java.util.List<CreateAggregateCompliancePackShrinkRequestTagsScope> getTagsScope() {
        return this.tagsScope;
    }

    public CreateAggregateCompliancePackShrinkRequest setTemplateContent(String templateContent) {
        this.templateContent = templateContent;
        return this;
    }
    public String getTemplateContent() {
        return this.templateContent;
    }

    public static class CreateAggregateCompliancePackShrinkRequestExcludeTagsScope extends TeaModel {
        /**
         * <p>The tag key of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static CreateAggregateCompliancePackShrinkRequestExcludeTagsScope build(java.util.Map<String, ?> map) throws Exception {
            CreateAggregateCompliancePackShrinkRequestExcludeTagsScope self = new CreateAggregateCompliancePackShrinkRequestExcludeTagsScope();
            return TeaModel.build(map, self);
        }

        public CreateAggregateCompliancePackShrinkRequestExcludeTagsScope setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public CreateAggregateCompliancePackShrinkRequestExcludeTagsScope setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class CreateAggregateCompliancePackShrinkRequestTagsScope extends TeaModel {
        /**
         * <p>The tag key of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>tagKey1</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>tagValue1</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static CreateAggregateCompliancePackShrinkRequestTagsScope build(java.util.Map<String, ?> map) throws Exception {
            CreateAggregateCompliancePackShrinkRequestTagsScope self = new CreateAggregateCompliancePackShrinkRequestTagsScope();
            return TeaModel.build(map, self);
        }

        public CreateAggregateCompliancePackShrinkRequestTagsScope setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public CreateAggregateCompliancePackShrinkRequestTagsScope setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
