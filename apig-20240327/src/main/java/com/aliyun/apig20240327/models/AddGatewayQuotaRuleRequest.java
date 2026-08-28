// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class AddGatewayQuotaRuleRequest extends TeaModel {
    /**
     * <p>The conflict snapshot hash, used to prevent concurrent dirty overwrites during confirmation. Obtain this value from the response of a previous dryRun=true request.</p>
     * <p>This parameter is not required in the following cases: no conflicts exist, the request is a dry run (dryRun=true), or overwrite=false (no overwrite confirmation).</p>
     * <p>When dryRun=false and overwrite=true, if this parameter is not provided or the value has expired and no longer matches, the backend returns accepted=false with a new conflict preview. Perform a dry run again to confirm the new conflicts.</p>
     * 
     * <strong>example:</strong>
     * <p>f8f44dc6cf369a017d56b7197eb4fb5ac4bbb6b09a92b9b41999541fxxxxxxxx</p>
     */
    @NameInMap("conflictHash")
    public String conflictHash;

    /**
     * <p>The list of consumer group IDs (not supported currently).</p>
     * 
     * <strong>example:</strong>
     * <p>group1,group2</p>
     */
    @NameInMap("consumerGroupIds")
    public java.util.List<String> consumerGroupIds;

    /**
     * <p>The list of consumer IDs to bind to the rule. A maximum of 1000 consumers can be specified in a single request.</p>
     * 
     * <strong>example:</strong>
     * <p>1001,1002,1003</p>
     */
    @NameInMap("consumerIds")
    public java.util.List<String> consumerIds;

    /**
     * <p>Specifies whether to perform only a dry run without applying the configuration. A dry run checks whether conflicting rules exist on the bound consumers. For example, a consumer that already has a calendar-day quota cannot have another calendar-day quota rule added.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    /**
     * <p>Specifies whether to allow overwriting when conflicts exist. If overwriting is allowed, the conflicting subjects (consumers) are unbound from the old rule and bound to the new rule.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("overwrite")
    public Boolean overwrite;

    /**
     * <p>The period multiplier. This parameter applies to epoch period rules.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("periodMultiplier")
    public Long periodMultiplier;

    /**
     * <p>The period type. For calendar periods, statistics are collected by day, week, or month. Valid values: day, week, and month. For epoch periods, only day is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>week</p>
     */
    @NameInMap("periodType")
    public String periodType;

    /**
     * <p>The quota dimension or throttling type. Valid values: token and credit. The credit quota applies only to dedicated instances running version 2.1.19 or later.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>token</p>
     */
    @NameInMap("quotaDimension")
    public String quotaDimension;

    /**
     * <p>The total available quota per period (limit).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("quotaLimit")
    public Long quotaLimit;

    /**
     * <p>The name of the rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>team-rule</p>
     */
    @NameInMap("ruleName")
    public String ruleName;

    /**
     * <p>The rule subject type. Valid values: consumer (a consumer) and consumer_group (a consumer group). Default value: consumer.</p>
     * 
     * <strong>example:</strong>
     * <p>consumer_group</p>
     */
    @NameInMap("subjectType")
    public String subjectType;

    /**
     * <p>The time zone for the calendar period, in UTC+x format.</p>
     * 
     * <strong>example:</strong>
     * <p>UTC+8</p>
     */
    @NameInMap("timezone")
    public String timezone;

    /**
     * <p>The reset period type. Valid values: calendar (the period starts from the beginning of a calendar day, week, or month) and epoch (the period starts from when the rule is applied). The epoch type applies only to dedicated instances running version 2.1.19 or later.</p>
     * 
     * <strong>example:</strong>
     * <p>calendar</p>
     */
    @NameInMap("windowAlignment")
    public String windowAlignment;

    public static AddGatewayQuotaRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        AddGatewayQuotaRuleRequest self = new AddGatewayQuotaRuleRequest();
        return TeaModel.build(map, self);
    }

    public AddGatewayQuotaRuleRequest setConflictHash(String conflictHash) {
        this.conflictHash = conflictHash;
        return this;
    }
    public String getConflictHash() {
        return this.conflictHash;
    }

    public AddGatewayQuotaRuleRequest setConsumerGroupIds(java.util.List<String> consumerGroupIds) {
        this.consumerGroupIds = consumerGroupIds;
        return this;
    }
    public java.util.List<String> getConsumerGroupIds() {
        return this.consumerGroupIds;
    }

    public AddGatewayQuotaRuleRequest setConsumerIds(java.util.List<String> consumerIds) {
        this.consumerIds = consumerIds;
        return this;
    }
    public java.util.List<String> getConsumerIds() {
        return this.consumerIds;
    }

    public AddGatewayQuotaRuleRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public AddGatewayQuotaRuleRequest setOverwrite(Boolean overwrite) {
        this.overwrite = overwrite;
        return this;
    }
    public Boolean getOverwrite() {
        return this.overwrite;
    }

    public AddGatewayQuotaRuleRequest setPeriodMultiplier(Long periodMultiplier) {
        this.periodMultiplier = periodMultiplier;
        return this;
    }
    public Long getPeriodMultiplier() {
        return this.periodMultiplier;
    }

    public AddGatewayQuotaRuleRequest setPeriodType(String periodType) {
        this.periodType = periodType;
        return this;
    }
    public String getPeriodType() {
        return this.periodType;
    }

    public AddGatewayQuotaRuleRequest setQuotaDimension(String quotaDimension) {
        this.quotaDimension = quotaDimension;
        return this;
    }
    public String getQuotaDimension() {
        return this.quotaDimension;
    }

    public AddGatewayQuotaRuleRequest setQuotaLimit(Long quotaLimit) {
        this.quotaLimit = quotaLimit;
        return this;
    }
    public Long getQuotaLimit() {
        return this.quotaLimit;
    }

    public AddGatewayQuotaRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public AddGatewayQuotaRuleRequest setSubjectType(String subjectType) {
        this.subjectType = subjectType;
        return this;
    }
    public String getSubjectType() {
        return this.subjectType;
    }

    public AddGatewayQuotaRuleRequest setTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }
    public String getTimezone() {
        return this.timezone;
    }

    public AddGatewayQuotaRuleRequest setWindowAlignment(String windowAlignment) {
        this.windowAlignment = windowAlignment;
        return this;
    }
    public String getWindowAlignment() {
        return this.windowAlignment;
    }

}
