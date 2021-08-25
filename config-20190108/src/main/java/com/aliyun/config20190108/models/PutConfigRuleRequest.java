// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class PutConfigRuleRequest extends TeaModel {
    @NameInMap("ConfigRuleId")
    public String configRuleId;

    @NameInMap("ConfigRuleName")
    public String configRuleName;

    @NameInMap("Description")
    public String description;

    @NameInMap("InputParameters")
    public String inputParameters;

    @NameInMap("SourceOwner")
    public String sourceOwner;

    @NameInMap("SourceIdentifier")
    public String sourceIdentifier;

    @NameInMap("SourceDetailMessageType")
    public String sourceDetailMessageType;

    @NameInMap("SourceMaximumExecutionFrequency")
    public String sourceMaximumExecutionFrequency;

    @NameInMap("ScopeComplianceResourceId")
    public String scopeComplianceResourceId;

    @NameInMap("ScopeComplianceResourceTypes")
    public String scopeComplianceResourceTypes;

    @NameInMap("RiskLevel")
    public Integer riskLevel;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("MultiAccount")
    public Boolean multiAccount;

    @NameInMap("MemberId")
    public Long memberId;

    public static PutConfigRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        PutConfigRuleRequest self = new PutConfigRuleRequest();
        return TeaModel.build(map, self);
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

    public PutConfigRuleRequest setSourceOwner(String sourceOwner) {
        this.sourceOwner = sourceOwner;
        return this;
    }
    public String getSourceOwner() {
        return this.sourceOwner;
    }

    public PutConfigRuleRequest setSourceIdentifier(String sourceIdentifier) {
        this.sourceIdentifier = sourceIdentifier;
        return this;
    }
    public String getSourceIdentifier() {
        return this.sourceIdentifier;
    }

    public PutConfigRuleRequest setSourceDetailMessageType(String sourceDetailMessageType) {
        this.sourceDetailMessageType = sourceDetailMessageType;
        return this;
    }
    public String getSourceDetailMessageType() {
        return this.sourceDetailMessageType;
    }

    public PutConfigRuleRequest setSourceMaximumExecutionFrequency(String sourceMaximumExecutionFrequency) {
        this.sourceMaximumExecutionFrequency = sourceMaximumExecutionFrequency;
        return this;
    }
    public String getSourceMaximumExecutionFrequency() {
        return this.sourceMaximumExecutionFrequency;
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

    public PutConfigRuleRequest setRiskLevel(Integer riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public Integer getRiskLevel() {
        return this.riskLevel;
    }

    public PutConfigRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public PutConfigRuleRequest setMultiAccount(Boolean multiAccount) {
        this.multiAccount = multiAccount;
        return this;
    }
    public Boolean getMultiAccount() {
        return this.multiAccount;
    }

    public PutConfigRuleRequest setMemberId(Long memberId) {
        this.memberId = memberId;
        return this;
    }
    public Long getMemberId() {
        return this.memberId;
    }

}
