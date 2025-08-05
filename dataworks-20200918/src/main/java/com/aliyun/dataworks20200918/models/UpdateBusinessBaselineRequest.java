// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class UpdateBusinessBaselineRequest extends TeaModel {
    @NameInMap("AlertFlag")
    public Boolean alertFlag;

    @NameInMap("AlertInterval")
    public Integer alertInterval;

    @NameInMap("AlertTarget")
    public String alertTarget;

    @NameInMap("BaselineDescription")
    public String baselineDescription;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BaselineId")
    public Long baselineId;

    @NameInMap("BaselineName")
    public String baselineName;

    @NameInMap("ErrorRule")
    public String errorRule;

    @NameInMap("ExpHour")
    public Integer expHour;

    @NameInMap("ExpMinu")
    public Integer expMinu;

    @NameInMap("HourExpDetail")
    public String hourExpDetail;

    @NameInMap("HourSlaDetail")
    public String hourSlaDetail;

    @NameInMap("MaxAlertTimes")
    public Integer maxAlertTimes;

    @NameInMap("Owner")
    public String owner;

    @NameInMap("Priority")
    public Integer priority;

    @NameInMap("SlaHour")
    public Integer slaHour;

    @NameInMap("SlaMinu")
    public Integer slaMinu;

    @NameInMap("SlowRule")
    public String slowRule;

    @NameInMap("UseFlag")
    public Boolean useFlag;

    public static UpdateBusinessBaselineRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBusinessBaselineRequest self = new UpdateBusinessBaselineRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBusinessBaselineRequest setAlertFlag(Boolean alertFlag) {
        this.alertFlag = alertFlag;
        return this;
    }
    public Boolean getAlertFlag() {
        return this.alertFlag;
    }

    public UpdateBusinessBaselineRequest setAlertInterval(Integer alertInterval) {
        this.alertInterval = alertInterval;
        return this;
    }
    public Integer getAlertInterval() {
        return this.alertInterval;
    }

    public UpdateBusinessBaselineRequest setAlertTarget(String alertTarget) {
        this.alertTarget = alertTarget;
        return this;
    }
    public String getAlertTarget() {
        return this.alertTarget;
    }

    public UpdateBusinessBaselineRequest setBaselineDescription(String baselineDescription) {
        this.baselineDescription = baselineDescription;
        return this;
    }
    public String getBaselineDescription() {
        return this.baselineDescription;
    }

    public UpdateBusinessBaselineRequest setBaselineId(Long baselineId) {
        this.baselineId = baselineId;
        return this;
    }
    public Long getBaselineId() {
        return this.baselineId;
    }

    public UpdateBusinessBaselineRequest setBaselineName(String baselineName) {
        this.baselineName = baselineName;
        return this;
    }
    public String getBaselineName() {
        return this.baselineName;
    }

    public UpdateBusinessBaselineRequest setErrorRule(String errorRule) {
        this.errorRule = errorRule;
        return this;
    }
    public String getErrorRule() {
        return this.errorRule;
    }

    public UpdateBusinessBaselineRequest setExpHour(Integer expHour) {
        this.expHour = expHour;
        return this;
    }
    public Integer getExpHour() {
        return this.expHour;
    }

    public UpdateBusinessBaselineRequest setExpMinu(Integer expMinu) {
        this.expMinu = expMinu;
        return this;
    }
    public Integer getExpMinu() {
        return this.expMinu;
    }

    public UpdateBusinessBaselineRequest setHourExpDetail(String hourExpDetail) {
        this.hourExpDetail = hourExpDetail;
        return this;
    }
    public String getHourExpDetail() {
        return this.hourExpDetail;
    }

    public UpdateBusinessBaselineRequest setHourSlaDetail(String hourSlaDetail) {
        this.hourSlaDetail = hourSlaDetail;
        return this;
    }
    public String getHourSlaDetail() {
        return this.hourSlaDetail;
    }

    public UpdateBusinessBaselineRequest setMaxAlertTimes(Integer maxAlertTimes) {
        this.maxAlertTimes = maxAlertTimes;
        return this;
    }
    public Integer getMaxAlertTimes() {
        return this.maxAlertTimes;
    }

    public UpdateBusinessBaselineRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public UpdateBusinessBaselineRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public UpdateBusinessBaselineRequest setSlaHour(Integer slaHour) {
        this.slaHour = slaHour;
        return this;
    }
    public Integer getSlaHour() {
        return this.slaHour;
    }

    public UpdateBusinessBaselineRequest setSlaMinu(Integer slaMinu) {
        this.slaMinu = slaMinu;
        return this;
    }
    public Integer getSlaMinu() {
        return this.slaMinu;
    }

    public UpdateBusinessBaselineRequest setSlowRule(String slowRule) {
        this.slowRule = slowRule;
        return this;
    }
    public String getSlowRule() {
        return this.slowRule;
    }

    public UpdateBusinessBaselineRequest setUseFlag(Boolean useFlag) {
        this.useFlag = useFlag;
        return this;
    }
    public Boolean getUseFlag() {
        return this.useFlag;
    }

}
