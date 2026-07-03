// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ResetGatewayQuotaRuleRequest extends TeaModel {
    /**
     * <p>The conflict snapshot hash, used to prevent concurrent dirty overwrites during confirmation. Obtain this value from the response data of a previous dryRun=true call.</p>
     * <p>This parameter is not required in the following cases: no conflict exists, the request is a dry run (dryRun=true), or overwrite=false (overwrite not confirmed).</p>
     * <p>When dryRun=false and overwrite=true, if this parameter is not provided or the value has expired and no longer matches, the backend returns accepted=false with a new conflict preview. You must perform a dry run again to confirm the new conflict.</p>
     * 
     * <strong>example:</strong>
     * <p>f8f44dc6cf369a017d56b7197eb4fb5ac4bbb6b09a92b9b41999541fxxxxxxxx</p>
     */
    @NameInMap("conflictHash")
    public String conflictHash;

    /**
     * <p>Specifies whether to perform only a dry run without delivering the actual configuration. A dry run checks whether conflicting rules exist on the bound consumers. For example, a consumer that already has a calendar-day quota cannot have another calendar-day quota rule added.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    /**
     * <p>Specifies whether to allow overwriting on conflict. If overwriting is allowed, the conflicting entity (consumer) is unbound from the old rule and bound to the new rule.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("overwrite")
    public Boolean overwrite;

    /**
     * <p>The period multiplier, indicating how many periods elapse before the quota resets. Returned when the rule uses a custom period. Minimum value: 1. Maximum value: 60.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("periodMultiplier")
    public Long periodMultiplier;

    /**
     * <p>The period type. Valid values: day, week, or month.</p>
     * 
     * <strong>example:</strong>
     * <p>week</p>
     */
    @NameInMap("periodType")
    public String periodType;

    /**
     * <p>The total available quota per period after the reset.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("quotaLimit")
    public Long quotaLimit;

    /**
     * <p>The time zone corresponding to the calendar period (UTC+x format).</p>
     * 
     * <strong>example:</strong>
     * <p>UTC+8</p>
     */
    @NameInMap("timezone")
    public String timezone;

    /**
     * <p>The period type after the reset. Currently only calendar periods are supported, which means windowAlignment=&quot;calendar&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>calendar</p>
     */
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
