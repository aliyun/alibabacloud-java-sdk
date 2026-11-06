// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ResetGatewayQuotaRuleRequest extends TeaModel {
    /**
     * <p>The conflict snapshot hash, which is used to prevent concurrent dirty overwrites when overwriting is confirmed. You can obtain this value by first executing a request with dryRun=true and extracting it from the returned data.</p>
     * <p>This parameter is not required in the following scenarios: no conflicts exist; the request is only a dry run with dryRun=true; overwrite=false, meaning overwriting is not confirmed.</p>
     * <p>If dryRun=false and overwrite=true but this parameter is not provided or has expired and does not match, the backend returns accepted=false along with a new conflict preview. You must perform a dry run again to confirm the new conflicts.</p>
     * 
     * <strong>example:</strong>
     * <p>f8f44dc6cf369a017d56b7197eb4fb5ac4bbb6b09a92b9b41999541fxxxxxxxx</p>
     */
    @NameInMap("conflictHash")
    public String conflictHash;

    /**
     * <p>Specifies whether to perform a dry run only without saving to the database or delivering actual configurations. This is used to check whether conflicting rules exist on the bound subjects. A single subject cannot be configured with two natural period quotas of the same period. For example, a subject that already has a natural daily quota cannot be added with another natural daily quota rule.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    /**
     * <p>Specifies whether to allow overwriting when a conflict occurs. Note that if overwriting is allowed, the conflicting subjects (consumers or consumer groups) are unbound from the old rule and bound to the new rule.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("overwrite")
    public Boolean overwrite;

    /**
     * <p>The period multiplier, which specifies the number of periods after which the quota is reset. This parameter is returned when the rule uses a custom period. Minimum value: 1. Maximum value: 60.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("periodMultiplier")
    public Long periodMultiplier;

    /**
     * <p>The period type. Natural periods support daily, weekly, and monthly statistics, and valid values are day, week, and month. Custom periods support only daily statistics, and the fixed value is day.</p>
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
     * <p>The time zone corresponding to the natural period, in UTC+x format.</p>
     * 
     * <strong>example:</strong>
     * <p>UTC+8</p>
     */
    @NameInMap("timezone")
    public String timezone;

    /**
     * <p>The period type for the reset. Natural periods (windowAlignment=calendar) and custom periods (windowAlignment=epoch) are supported.</p>
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
