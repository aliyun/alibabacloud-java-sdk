// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateGatewayQuotaRuleRequest extends TeaModel {
    /**
     * <p>The list of subject (consumer) IDs to associate.</p>
     * 
     * <strong>example:</strong>
     * <p>cs-001,cs-002</p>
     */
    @NameInMap("addIds")
    public java.util.List<String> addIds;

    /**
     * <p>The conflict snapshot hash, which is used to prevent concurrent dirty overwrites when you confirm an overwrite. You can obtain this value by first executing a request with dryRun=true and extracting it from the response.</p>
     * <p>You do not need to specify this parameter in the following scenarios: no conflicts exist; the request is a dry run with dryRun=true; or overwrite=false, which means overwriting is not confirmed.</p>
     * <p>If dryRun=false and overwrite=true, but this parameter is not provided or has expired and does not match, the backend returns accepted=false along with a new conflict preview. In this case, you must perform a dry run again to confirm the new conflicts.</p>
     * 
     * <strong>example:</strong>
     * <p>f8f44dc6cf369a017d56b7197eb4fb5ac4bbb6b09a92b9b41999541f50xxxxxx</p>
     */
    @NameInMap("conflictHash")
    public String conflictHash;

    /**
     * <p><strong>[Deprecated]</strong> The list of consumer group IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>group1,group2</p>
     */
    @NameInMap("consumerGroupIds")
    @Deprecated
    public java.util.List<String> consumerGroupIds;

    /**
     * <p>Specifies whether to perform a dry run only without saving the configuration to the database or delivering the actual configuration. This parameter is used to check whether conflicting rules exist on the associated consumers. A single consumer cannot be configured with two natural period quotas of the same period. For example, a consumer that already has a natural daily quota cannot be assigned another natural daily quota rule.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    /**
     * <p>Specifies whether to allow overwriting when conflicts occur. Note that if overwriting is allowed, the conflicting subjects (consumers or consumer groups) will be disassociated from the old rule and associated with the new rule.</p>
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
     * <p>The list of subject (consumer) IDs to disassociate.</p>
     * 
     * <strong>example:</strong>
     * <p>cs003,cs-004</p>
     */
    @NameInMap("removeIds")
    public java.util.List<String> removeIds;

    /**
     * <p>The updated name of the rule.</p>
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
