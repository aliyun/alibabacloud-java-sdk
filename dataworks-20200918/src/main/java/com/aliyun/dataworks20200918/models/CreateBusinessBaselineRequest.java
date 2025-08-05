// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class CreateBusinessBaselineRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AlertFlag")
    public Boolean alertFlag;

    @NameInMap("AlertInterval")
    public Integer alertInterval;

    @NameInMap("AlertTarget")
    public String alertTarget;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BaselineDescription")
    public String baselineDescription;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BaselineName")
    public String baselineName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BaselineType")
    public String baselineType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BizName")
    public String bizName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DefaultParentNodeId")
    public Long defaultParentNodeId;

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

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("SlaHour")
    public Integer slaHour;

    @NameInMap("SlaMinu")
    public Integer slaMinu;

    @NameInMap("SlowRule")
    public String slowRule;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UseFlag")
    public Boolean useFlag;

    public static CreateBusinessBaselineRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBusinessBaselineRequest self = new CreateBusinessBaselineRequest();
        return TeaModel.build(map, self);
    }

    public CreateBusinessBaselineRequest setAlertFlag(Boolean alertFlag) {
        this.alertFlag = alertFlag;
        return this;
    }
    public Boolean getAlertFlag() {
        return this.alertFlag;
    }

    public CreateBusinessBaselineRequest setAlertInterval(Integer alertInterval) {
        this.alertInterval = alertInterval;
        return this;
    }
    public Integer getAlertInterval() {
        return this.alertInterval;
    }

    public CreateBusinessBaselineRequest setAlertTarget(String alertTarget) {
        this.alertTarget = alertTarget;
        return this;
    }
    public String getAlertTarget() {
        return this.alertTarget;
    }

    public CreateBusinessBaselineRequest setBaselineDescription(String baselineDescription) {
        this.baselineDescription = baselineDescription;
        return this;
    }
    public String getBaselineDescription() {
        return this.baselineDescription;
    }

    public CreateBusinessBaselineRequest setBaselineName(String baselineName) {
        this.baselineName = baselineName;
        return this;
    }
    public String getBaselineName() {
        return this.baselineName;
    }

    public CreateBusinessBaselineRequest setBaselineType(String baselineType) {
        this.baselineType = baselineType;
        return this;
    }
    public String getBaselineType() {
        return this.baselineType;
    }

    public CreateBusinessBaselineRequest setBizName(String bizName) {
        this.bizName = bizName;
        return this;
    }
    public String getBizName() {
        return this.bizName;
    }

    public CreateBusinessBaselineRequest setDefaultParentNodeId(Long defaultParentNodeId) {
        this.defaultParentNodeId = defaultParentNodeId;
        return this;
    }
    public Long getDefaultParentNodeId() {
        return this.defaultParentNodeId;
    }

    public CreateBusinessBaselineRequest setErrorRule(String errorRule) {
        this.errorRule = errorRule;
        return this;
    }
    public String getErrorRule() {
        return this.errorRule;
    }

    public CreateBusinessBaselineRequest setExpHour(Integer expHour) {
        this.expHour = expHour;
        return this;
    }
    public Integer getExpHour() {
        return this.expHour;
    }

    public CreateBusinessBaselineRequest setExpMinu(Integer expMinu) {
        this.expMinu = expMinu;
        return this;
    }
    public Integer getExpMinu() {
        return this.expMinu;
    }

    public CreateBusinessBaselineRequest setHourExpDetail(String hourExpDetail) {
        this.hourExpDetail = hourExpDetail;
        return this;
    }
    public String getHourExpDetail() {
        return this.hourExpDetail;
    }

    public CreateBusinessBaselineRequest setHourSlaDetail(String hourSlaDetail) {
        this.hourSlaDetail = hourSlaDetail;
        return this;
    }
    public String getHourSlaDetail() {
        return this.hourSlaDetail;
    }

    public CreateBusinessBaselineRequest setMaxAlertTimes(Integer maxAlertTimes) {
        this.maxAlertTimes = maxAlertTimes;
        return this;
    }
    public Integer getMaxAlertTimes() {
        return this.maxAlertTimes;
    }

    public CreateBusinessBaselineRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public CreateBusinessBaselineRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public CreateBusinessBaselineRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateBusinessBaselineRequest setSlaHour(Integer slaHour) {
        this.slaHour = slaHour;
        return this;
    }
    public Integer getSlaHour() {
        return this.slaHour;
    }

    public CreateBusinessBaselineRequest setSlaMinu(Integer slaMinu) {
        this.slaMinu = slaMinu;
        return this;
    }
    public Integer getSlaMinu() {
        return this.slaMinu;
    }

    public CreateBusinessBaselineRequest setSlowRule(String slowRule) {
        this.slowRule = slowRule;
        return this;
    }
    public String getSlowRule() {
        return this.slowRule;
    }

    public CreateBusinessBaselineRequest setUseFlag(Boolean useFlag) {
        this.useFlag = useFlag;
        return this;
    }
    public Boolean getUseFlag() {
        return this.useFlag;
    }

}
