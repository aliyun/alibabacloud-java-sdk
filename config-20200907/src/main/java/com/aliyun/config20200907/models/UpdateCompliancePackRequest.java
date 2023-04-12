// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class UpdateCompliancePackRequest extends TeaModel {
    /**
     * <p>The client token that you want to use to ensure the idempotency of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.``</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the compliance package.</p>
     * <br>
     * <p>For more information about how to obtain the ID of a compliance package, see [ListCompliancePacks](~~263332~~).</p>
     */
    @NameInMap("CompliancePackId")
    public String compliancePackId;

    /**
     * <p>The name of the compliance package.</p>
     * <br>
     * <p>For more information about how to obtain the name of a compliance package, see [ListCompliancePacks](~~263332~~).</p>
     */
    @NameInMap("CompliancePackName")
    public String compliancePackName;

    /**
     * <p>The rules in the compliance package.</p>
     * <br>
     * <p>If you leave this parameter empty, the rules in the compliance package remain unchanged. If you configure this parameter, Cloud Config replaces the existing rules in the compliance package with the specified rules.</p>
     */
    @NameInMap("ConfigRules")
    public java.util.List<UpdateCompliancePackRequestConfigRules> configRules;

    /**
     * <p>The description of the compliance package.</p>
     * <br>
     * <p>For more information about how to obtain the description of a compliance package, see [ListCompliancePacks](~~263332~~).</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the resource that you do not want to evaluate by using the compliance package. Separate multiple resource IDs with commas (,).</p>
     */
    @NameInMap("ExcludeResourceIdsScope")
    public String excludeResourceIdsScope;

    /**
     * <p>The ID of the region whose resources you want to evaluate by using the compliance package. Separate multiple region IDs with commas (,).</p>
     */
    @NameInMap("RegionIdsScope")
    public String regionIdsScope;

    /**
     * <p>The ID of the resource group whose resources you want to evaluate by using the compliance package. Separate multiple resource group IDs with commas (,).</p>
     */
    @NameInMap("ResourceGroupIdsScope")
    public String resourceGroupIdsScope;

    /**
     * <p>The risk level of the resources that are not compliant with the rules in the compliance package. Valid values:</p>
     * <br>
     * <p>*   1: high risk level</p>
     * <p>*   2: medium risk level</p>
     * <p>*   3: low risk level</p>
     */
    @NameInMap("RiskLevel")
    public Integer riskLevel;

    /**
     * <p>The tag key of the resource that you want to evaluate by using the compliance package.</p>
     */
    @NameInMap("TagKeyScope")
    public String tagKeyScope;

    /**
     * <p>The tag value of the resource that you want to evaluate by using the compliance package.</p>
     * <br>
     * <p>>  You must configure the TagValueScope parameter together with the TagValueScope parameter.</p>
     */
    @NameInMap("TagValueScope")
    public String tagValueScope;

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

    public UpdateCompliancePackRequest setExcludeResourceIdsScope(String excludeResourceIdsScope) {
        this.excludeResourceIdsScope = excludeResourceIdsScope;
        return this;
    }
    public String getExcludeResourceIdsScope() {
        return this.excludeResourceIdsScope;
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

    public UpdateCompliancePackRequest setRiskLevel(Integer riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public Integer getRiskLevel() {
        return this.riskLevel;
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

    public static class UpdateCompliancePackRequestConfigRulesConfigRuleParameters extends TeaModel {
        /**
         * <p>The name of the input parameter.</p>
         * <br>
         * <p>You must configure the `ParameterName` and `ParameterValue` parameters or neither of them. If the managed rule has an input parameter but no default value exists, you must configure this parameter. For more information about how to obtain the name of an input parameter for a managed rule, see [ListCompliancePackTemplates](~~261176~~).</p>
         */
        @NameInMap("ParameterName")
        public String parameterName;

        /**
         * <p>The value of the input parameter.</p>
         * <br>
         * <p>You must configure the `ParameterName` and `ParameterValue` parameters or neither of them. If the managed rule has an input parameter but no default value exists, you must configure this parameter. For more information about how to obtain the value of an input parameter for a managed rule, see [ListCompliancePackTemplates](~~261176~~).</p>
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
         * <p>The ID of the rule. If you configure this parameter, Cloud Config adds the rule of the specified ID to the compliance package.</p>
         * <br>
         * <p>You only need to configure the `ManagedRuleIdentifier` or `ConfigRuleId` parameter. If you configure both parameters, the value of the `ConfigRuleId` parameter takes precedence. For more information about how to obtain the ID of a rule, see [ListConfigRules](~~169607~~).</p>
         */
        @NameInMap("ConfigRuleId")
        public String configRuleId;

        /**
         * <p>The name of the rule.</p>
         */
        @NameInMap("ConfigRuleName")
        public String configRuleName;

        /**
         * <p>The details of the input parameters of the rule.</p>
         */
        @NameInMap("ConfigRuleParameters")
        public java.util.List<UpdateCompliancePackRequestConfigRulesConfigRuleParameters> configRuleParameters;

        /**
         * <p>The description of the rule.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the managed rule. Cloud Config automatically create a managed rule of the specified ID and adds the rule to the compliance package.</p>
         * <br>
         * <p>You only need to configure the `ManagedRuleIdentifier` or `ConfigRuleId` parameter. If you configure both parameters, the value of the `ConfigRuleId` parameter take precedence. For more information about how to obtain the ID of a managed rule, see [ListCompliancePackTemplates](~~261176~~).</p>
         */
        @NameInMap("ManagedRuleIdentifier")
        public String managedRuleIdentifier;

        /**
         * <p>The risk level of the resources that are not compliant with the rule. Valid values:</p>
         * <br>
         * <p>*   1: high risk level</p>
         * <p>*   2: medium risk level</p>
         * <p>*   3: low risk level</p>
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

}
