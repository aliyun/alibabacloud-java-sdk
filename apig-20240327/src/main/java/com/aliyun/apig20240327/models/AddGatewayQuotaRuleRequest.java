// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class AddGatewayQuotaRuleRequest extends TeaModel {
    /**
     * <p>The hash of the conflict snapshot, which is used to prevent concurrent dirty overwrites when you confirm to overwrite. You can obtain this value by performing a dry run with dryRun set to true and extracting it from the response.</p>
     * <p>You do not need to specify this parameter in the following scenarios: no conflicts exist, you perform only a dry run with dryRun set to true, or you do not confirm to overwrite with overwrite set to false.</p>
     * <p>If you set dryRun to false and overwrite to true but do not specify this parameter or the parameter expires and does not match, the backend returns accepted=false and a new conflict preview. In this case, you must perform a dry run again to confirm the new conflicts.</p>
     * 
     * <strong>example:</strong>
     * <p>f8f44dc6cf369a017d56b7197eb4fb5ac4bbb6b09a92b9b41999541fxxxxxxxx</p>
     */
    @NameInMap("conflictHash")
    public String conflictHash;

    /**
     * <p>The IDs of the consumer groups to which the rule is bound.</p>
     * 
     * <strong>example:</strong>
     * <p>group1,group2</p>
     */
    @NameInMap("consumerGroupIds")
    public java.util.List<String> consumerGroupIds;

    /**
     * <p>The IDs of the consumers to which the rule is bound. You can specify up to 1,000 consumers at a time.</p>
     * 
     * <strong>example:</strong>
     * <p>1001,1002,1003</p>
     */
    @NameInMap("consumerIds")
    public java.util.List<String> consumerIds;

    /**
     * <p>Specifies whether to perform only a dry run without saving the configuration or delivering it to the gateway. A dry run checks whether conflicting rules exist on the bound subjects. A subject cannot have two natural period quotas with the same period. For example, if a subject already has a natural day quota, you cannot add another natural day quota rule to it.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    /**
     * <p>Specifies whether to allow overwriting when conflicts occur. If you allow overwriting, the conflicting subjects (consumers or consumer groups) are unbound from the old rule and bound to the new rule.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("overwrite")
    public Boolean overwrite;

    /**
     * <p>The period multiplier in days. This parameter is required when windowAlignment is set to epoch. Valid values: 1 to 106751. Do not set this parameter for a natural period.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("periodMultiplier")
    public Long periodMultiplier;

    /**
     * <p>The period type. For a natural period, valid values are day, week, and month. For a custom period, only day is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>week</p>
     */
    @NameInMap("periodType")
    public String periodType;

    /**
     * <p>The quota dimension or limit type. Valid values: token and credit.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>token</p>
     */
    @NameInMap("quotaDimension")
    public String quotaDimension;

    /**
     * <p>The total available quota (limit) per period.</p>
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
     * <p>The subject type of the rule. A value of consumer indicates a consumer, and a value of consumer_group indicates a consumer group. Default value: consumer.</p>
     * 
     * <strong>example:</strong>
     * <p>consumer_group</p>
     */
    @NameInMap("subjectType")
    public String subjectType;

    /**
     * <p>The time zone for the natural period, in UTC+x format.</p>
     * 
     * <strong>example:</strong>
     * <p>UTC+8</p>
     */
    @NameInMap("timezone")
    public String timezone;

    /**
     * <p>The reset period type. A value of calendar indicates a natural period, and a value of epoch indicates a custom period.</p>
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
