// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateGatewayQuotaRuleRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cs-001,cs-002</p>
     */
    @NameInMap("addIds")
    public java.util.List<String> addIds;

    /**
     * <strong>example:</strong>
     * <p>f8f44dc6cf369a017d56b7197eb4fb5ac4bbb6b09a92b9b41999541f50xxxxxx</p>
     */
    @NameInMap("conflictHash")
    public String conflictHash;

    /**
     * <strong>example:</strong>
     * <p>group1,group2</p>
     */
    @NameInMap("consumerGroupIds")
    public java.util.List<String> consumerGroupIds;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    @NameInMap("overwrite")
    public Boolean overwrite;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("quotaLimit")
    public Long quotaLimit;

    /**
     * <strong>example:</strong>
     * <p>cs003,cs-004</p>
     */
    @NameInMap("removeIds")
    public java.util.List<String> removeIds;

    /**
     * <p>This parameter is required.</p>
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
