// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ResetGatewayQuotaRuleRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>f8f44dc6cf369a017d56b7197eb4fb5ac4bbb6b09a92b9b41999541fxxxxxxxx</p>
     */
    @NameInMap("conflictHash")
    public String conflictHash;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    @NameInMap("overwrite")
    public Boolean overwrite;

    @NameInMap("periodMultiplier")
    public Long periodMultiplier;

    /**
     * <strong>example:</strong>
     * <p>week</p>
     */
    @NameInMap("periodType")
    public String periodType;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("quotaLimit")
    public Long quotaLimit;

    /**
     * <strong>example:</strong>
     * <p>UTC+8</p>
     */
    @NameInMap("timezone")
    public String timezone;

    @NameInMap("windowAlignment")
    public String windowAlignment;

    public static ResetGatewayQuotaRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetGatewayQuotaRuleRequest self = new ResetGatewayQuotaRuleRequest();
        return TeaModel.build(map, self);
    }

    public ResetGatewayQuotaRuleRequest setConflictHash(String conflictHash) {
        this.conflictHash = conflictHash;
        return this;
    }
    public String getConflictHash() {
        return this.conflictHash;
    }

    public ResetGatewayQuotaRuleRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ResetGatewayQuotaRuleRequest setOverwrite(Boolean overwrite) {
        this.overwrite = overwrite;
        return this;
    }
    public Boolean getOverwrite() {
        return this.overwrite;
    }

    public ResetGatewayQuotaRuleRequest setPeriodMultiplier(Long periodMultiplier) {
        this.periodMultiplier = periodMultiplier;
        return this;
    }
    public Long getPeriodMultiplier() {
        return this.periodMultiplier;
    }

    public ResetGatewayQuotaRuleRequest setPeriodType(String periodType) {
        this.periodType = periodType;
        return this;
    }
    public String getPeriodType() {
        return this.periodType;
    }

    public ResetGatewayQuotaRuleRequest setQuotaLimit(Long quotaLimit) {
        this.quotaLimit = quotaLimit;
        return this;
    }
    public Long getQuotaLimit() {
        return this.quotaLimit;
    }

    public ResetGatewayQuotaRuleRequest setTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }
    public String getTimezone() {
        return this.timezone;
    }

    public ResetGatewayQuotaRuleRequest setWindowAlignment(String windowAlignment) {
        this.windowAlignment = windowAlignment;
        return this;
    }
    public String getWindowAlignment() {
        return this.windowAlignment;
    }

}
