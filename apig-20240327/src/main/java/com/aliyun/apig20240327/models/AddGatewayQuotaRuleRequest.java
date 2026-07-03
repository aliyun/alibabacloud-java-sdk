// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class AddGatewayQuotaRuleRequest extends TeaModel {
    /**
     * <p>The conflict snapshot hash used to prevent concurrent dirty overwrites during confirmation. Obtain this value from the response of a previous dryRun=true call.</p>
     * <p>You do not need to specify this parameter in the following cases: no conflict exists, the request is a dry run (dryRun=true), or overwrite=false.</p>
     * <p>When dryRun=false and overwrite=true, if this parameter is not specified or the value has expired, the backend returns accepted=false with a new conflict preview. Perform a dry run again to confirm the new conflict.</p>
     * 
     * <strong>example:</strong>
     * <p>f8f44dc6cf369a017d56b7197eb4fb5ac4bbb6b09a92b9b41999541fxxxxxxxx</p>
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
     * <p>The list of consumer IDs to bind to the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>1001,1002,1003</p>
     */
    @NameInMap("consumerIds")
    public java.util.List<String> consumerIds;

    /**
     * <p>Specifies whether to perform only a dry run without persisting or applying the configuration. A dry run checks whether conflicting rules exist on the bound consumers. For example, a consumer that already has a daily calendar quota cannot have another daily calendar quota rule added.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    /**
     * <p>Specifies whether to allow overwriting on conflict. If overwriting is allowed, the conflicting principals (consumers) are unbound from the old rule and bound to the new rule.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("overwrite")
    public Boolean overwrite;

    /**
     * <p>The period multiplier.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("periodMultiplier")
    public Long periodMultiplier;

    /**
     * <p>The period type. Valid values: day (calendar day), week (calendar week), and month (calendar month).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>week</p>
     */
    @NameInMap("periodType")
    public String periodType;

    /**
     * <p>The quota dimension or throttling type. Currently, only token is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>token</p>
     */
    @NameInMap("quotaDimension")
    public String quotaDimension;

    /**
     * <p>The total available quota per period.</p>
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
     * <p>团队规则</p>
     */
    @NameInMap("ruleName")
    public String ruleName;

    /**
     * <p>The time zone for the calendar period, in UTC+x format.</p>
     * 
     * <strong>example:</strong>
     * <p>UTC+8</p>
     */
    @NameInMap("timezone")
    public String timezone;

    /**
     * <p>The reset period alignment type. Currently, only calendar alignment is supported, which means windowAlignment=&quot;calendar&quot;.</p>
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

    @Deprecated
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
