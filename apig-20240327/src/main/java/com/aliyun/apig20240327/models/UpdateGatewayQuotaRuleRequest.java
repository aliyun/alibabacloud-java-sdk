// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateGatewayQuotaRuleRequest extends TeaModel {
    /**
     * <p>The list of principal (consumer) IDs to bind.</p>
     * 
     * <strong>example:</strong>
     * <p>cs-001,cs-002</p>
     */
    @NameInMap("addIds")
    public java.util.List<String> addIds;

    /**
     * <p>The conflict snapshot hash, used to prevent concurrent dirty overwrites when confirming an overwrite. Obtain this value from the response of a prior dryRun=true call.</p>
     * <p>This parameter is not required in the following cases: no conflicts exist, the call is a dry run (dryRun=true), or overwrite is set to false.</p>
     * <p>When dryRun is set to false and overwrite is set to true, if this parameter is missing or the value has expired and no longer matches, the backend returns accepted=false with a new conflict preview. Perform the dry run again to confirm the new conflicts.</p>
     * 
     * <strong>example:</strong>
     * <p>f8f44dc6cf369a017d56b7197eb4fb5ac4bbb6b09a92b9b41999541f50xxxxxx</p>
     */
    @NameInMap("conflictHash")
    public String conflictHash;

    /**
     * <p>The list of consumer group IDs. This parameter is not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>group1,group2</p>
     */
    @NameInMap("consumerGroupIds")
    @Deprecated
    public java.util.List<String> consumerGroupIds;

    /**
     * <p>Specifies whether to perform a dry run only without persisting or applying the configuration. A dry run checks whether conflicting rules exist on the bound consumers. For example, a consumer that already has a calendar-day quota cannot have another calendar-day quota rule added.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    /**
     * <p>Specifies whether to allow overwriting when a conflict exists. If overwriting is allowed, the conflicting principals (consumers) are unbound from the old rule and bound to the new rule.</p>
     */
    @NameInMap("overwrite")
    public Boolean overwrite;

    /**
     * <p>The updated total available quota.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("quotaLimit")
    public Long quotaLimit;

    /**
     * <p>The list of principal (consumer) IDs to unbind.</p>
     * 
     * <strong>example:</strong>
     * <p>cs003,cs-004</p>
     */
    @NameInMap("removeIds")
    public java.util.List<String> removeIds;

    /**
     * <p>The updated rule name.</p>
     * 
     * <strong>example:</strong>
     * <p>team-rule</p>
     */
    @NameInMap("ruleName")
    public String ruleName;

    public static UpdateGatewayQuotaRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayQuotaRuleRequest self = new UpdateGatewayQuotaRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayQuotaRuleRequest setAddIds(java.util.List<String> addIds) {
        this.addIds = addIds;
        return this;
    }
    public java.util.List<String> getAddIds() {
        return this.addIds;
    }

    public UpdateGatewayQuotaRuleRequest setConflictHash(String conflictHash) {
        this.conflictHash = conflictHash;
        return this;
    }
    public String getConflictHash() {
        return this.conflictHash;
    }

    @Deprecated
    public UpdateGatewayQuotaRuleRequest setConsumerGroupIds(java.util.List<String> consumerGroupIds) {
        this.consumerGroupIds = consumerGroupIds;
        return this;
    }
    public java.util.List<String> getConsumerGroupIds() {
        return this.consumerGroupIds;
    }

    public UpdateGatewayQuotaRuleRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateGatewayQuotaRuleRequest setOverwrite(Boolean overwrite) {
        this.overwrite = overwrite;
        return this;
    }
    public Boolean getOverwrite() {
        return this.overwrite;
    }

    public UpdateGatewayQuotaRuleRequest setQuotaLimit(Long quotaLimit) {
        this.quotaLimit = quotaLimit;
        return this;
    }
    public Long getQuotaLimit() {
        return this.quotaLimit;
    }

    public UpdateGatewayQuotaRuleRequest setRemoveIds(java.util.List<String> removeIds) {
        this.removeIds = removeIds;
        return this;
    }
    public java.util.List<String> getRemoveIds() {
        return this.removeIds;
    }

    public UpdateGatewayQuotaRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

}
