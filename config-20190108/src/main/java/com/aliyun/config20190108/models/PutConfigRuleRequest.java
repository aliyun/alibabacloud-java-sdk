// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class PutConfigRuleRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the rule.</p>
     */
    @NameInMap("ConfigRuleId")
    public String configRuleId;

    /**
     * <p>The name of the rule.</p>
     */
    @NameInMap("ConfigRuleName")
    public String configRuleName;

    /**
     * <p>The description of the rule.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The settings of the input parameters for the rule.</p>
     */
    @NameInMap("InputParameters")
    public String inputParameters;

    /**
     * <p>This parameter is scheduled to be removed before 00:00:00, June 30, 2021. Account group-related APIs will be provided as an alternative before 00:00:00, May 30, 2021. If you are using this parameter, we recommend that you switch to account group-related APIs after 00:00:00, May 30, 2021. For more information, see [Account groups](~~211534~~).</p>
     */
    @NameInMap("MemberId")
    public Long memberId;

    /**
     * <p>This parameter is scheduled to be removed before 00:00:00, June 30, 2021. Account group-related APIs will be provided as an alternative before 00:00:00, May 30, 2021. If you are using this parameter, we recommend that you switch to account group-related APIs after 00:00:00, May 30, 2021. For more information, see [Account groups](~~211534~~).</p>
     */
    @NameInMap("MultiAccount")
    public Boolean multiAccount;

    /**
     * <p>The risk level of the non-compliant resource. Valid values:</p>
     * <br>
     * <p>*   1: high risk</p>
     * <p>*   2: medium risk</p>
     * <p>*   3: low risk</p>
     */
    @NameInMap("RiskLevel")
    public Integer riskLevel;

    /**
     * <p>The ID of the resource to be evaluated.</p>
     * <br>
     * <p>*   If you do not set this parameter, the rule evaluates resources of all the types specified by ScopeComplianceResourceTypes.</p>
     * <p>*   If you specify a resource ID, the rule evaluates the resource identified by the ID.</p>
     */
    @NameInMap("ScopeComplianceResourceId")
    public String scopeComplianceResourceId;

    /**
     * <p>The types of the resources to be evaluated.</p>
     */
    @NameInMap("ScopeComplianceResourceTypes")
    public String scopeComplianceResourceTypes;

    /**
     * <p>The trigger type of the rule. Valid values:</p>
     * <br>
     * <p>*   ConfigurationItemChangeNotification: The rule is triggered by configuration changes.</p>
     * <p>*   ScheduledNotification: The rule is triggered as scheduled.</p>
     */
    @NameInMap("SourceDetailMessageType")
    public String sourceDetailMessageType;

    /**
     * <p>The identifier of the rule.</p>
     * <br>
     * <p>*   For a managed rule, the value is the name of the managed rule.</p>
     * <p>*   For a custom rule, the value is the Alibaba Cloud Resource Name (ARN) of the custom rule.</p>
     */
    @NameInMap("SourceIdentifier")
    public String sourceIdentifier;

    /**
     * <p>The frequency at which the rule is executed. Valid values:</p>
     * <br>
     * <p>*   One_Hour: 1 hour</p>
     * <p>*   Three_Hours: 3 hours</p>
     * <p>*   Six_Hours: 6 hours</p>
     * <p>*   Twelve_Hours: 12 hours</p>
     * <p>*   TwentyFour_Hours: 24 hours</p>
     */
    @NameInMap("SourceMaximumExecutionFrequency")
    public String sourceMaximumExecutionFrequency;

    /**
     * <p>Indicates whether you or Alibaba Cloud owns and manages the rule. Valid values:</p>
     * <br>
     * <p>*   CUSTOM_FC: The rule is a custom rule that you own.</p>
     * <p>*   ALIYUN: The rule is a managed rule of Alibaba Cloud.</p>
     */
    @NameInMap("SourceOwner")
    public String sourceOwner;

    public static PutConfigRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        PutConfigRuleRequest self = new PutConfigRuleRequest();
        return TeaModel.build(map, self);
    }

    public PutConfigRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public PutConfigRuleRequest setConfigRuleId(String configRuleId) {
        this.configRuleId = configRuleId;
        return this;
    }
    public String getConfigRuleId() {
        return this.configRuleId;
    }

    public PutConfigRuleRequest setConfigRuleName(String configRuleName) {
        this.configRuleName = configRuleName;
        return this;
    }
    public String getConfigRuleName() {
        return this.configRuleName;
    }

    public PutConfigRuleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public PutConfigRuleRequest setInputParameters(String inputParameters) {
        this.inputParameters = inputParameters;
        return this;
    }
    public String getInputParameters() {
        return this.inputParameters;
    }

    public PutConfigRuleRequest setMemberId(Long memberId) {
        this.memberId = memberId;
        return this;
    }
    public Long getMemberId() {
        return this.memberId;
    }

    public PutConfigRuleRequest setMultiAccount(Boolean multiAccount) {
        this.multiAccount = multiAccount;
        return this;
    }
    public Boolean getMultiAccount() {
        return this.multiAccount;
    }

    public PutConfigRuleRequest setRiskLevel(Integer riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public Integer getRiskLevel() {
        return this.riskLevel;
    }

    public PutConfigRuleRequest setScopeComplianceResourceId(String scopeComplianceResourceId) {
        this.scopeComplianceResourceId = scopeComplianceResourceId;
        return this;
    }
    public String getScopeComplianceResourceId() {
        return this.scopeComplianceResourceId;
    }

    public PutConfigRuleRequest setScopeComplianceResourceTypes(String scopeComplianceResourceTypes) {
        this.scopeComplianceResourceTypes = scopeComplianceResourceTypes;
        return this;
    }
    public String getScopeComplianceResourceTypes() {
        return this.scopeComplianceResourceTypes;
    }

    public PutConfigRuleRequest setSourceDetailMessageType(String sourceDetailMessageType) {
        this.sourceDetailMessageType = sourceDetailMessageType;
        return this;
    }
    public String getSourceDetailMessageType() {
        return this.sourceDetailMessageType;
    }

    public PutConfigRuleRequest setSourceIdentifier(String sourceIdentifier) {
        this.sourceIdentifier = sourceIdentifier;
        return this;
    }
    public String getSourceIdentifier() {
        return this.sourceIdentifier;
    }

    public PutConfigRuleRequest setSourceMaximumExecutionFrequency(String sourceMaximumExecutionFrequency) {
        this.sourceMaximumExecutionFrequency = sourceMaximumExecutionFrequency;
        return this;
    }
    public String getSourceMaximumExecutionFrequency() {
        return this.sourceMaximumExecutionFrequency;
    }

    public PutConfigRuleRequest setSourceOwner(String sourceOwner) {
        this.sourceOwner = sourceOwner;
        return this;
    }
    public String getSourceOwner() {
        return this.sourceOwner;
    }

}
