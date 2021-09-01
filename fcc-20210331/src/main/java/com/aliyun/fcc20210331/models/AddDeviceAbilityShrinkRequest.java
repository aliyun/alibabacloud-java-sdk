// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class AddDeviceAbilityShrinkRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("AbilityType")
    public String abilityType;

    @NameInMap("AbilityName")
    public String abilityName;

    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("ConfigInfo")
    public String configInfo;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ScheduleType")
    public String scheduleType;

    @NameInMap("ScheduleCycleDate")
    public String scheduleCycleDate;

    @NameInMap("ScheduleTimes")
    public String scheduleTimesShrink;

    @NameInMap("IsPolling")
    public String isPolling;

    @NameInMap("OverallExecutionTime")
    public String overallExecutionTime;

    @NameInMap("SliceExecutionTime")
    public String sliceExecutionTime;

    @NameInMap("ComputeFrequencyType")
    public String computeFrequencyType;

    @NameInMap("AlgorithmId")
    public String algorithmId;

    @NameInMap("ValidYear")
    public Integer validYear;

    @NameInMap("ValidMonth")
    public Integer validMonth;

    @NameInMap("ValidDay")
    public Integer validDay;

    public static AddDeviceAbilityShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDeviceAbilityShrinkRequest self = new AddDeviceAbilityShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddDeviceAbilityShrinkRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public AddDeviceAbilityShrinkRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public AddDeviceAbilityShrinkRequest setAbilityType(String abilityType) {
        this.abilityType = abilityType;
        return this;
    }
    public String getAbilityType() {
        return this.abilityType;
    }

    public AddDeviceAbilityShrinkRequest setAbilityName(String abilityName) {
        this.abilityName = abilityName;
        return this;
    }
    public String getAbilityName() {
        return this.abilityName;
    }

    public AddDeviceAbilityShrinkRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public AddDeviceAbilityShrinkRequest setConfigInfo(String configInfo) {
        this.configInfo = configInfo;
        return this;
    }
    public String getConfigInfo() {
        return this.configInfo;
    }

    public AddDeviceAbilityShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddDeviceAbilityShrinkRequest setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
        return this;
    }
    public String getScheduleType() {
        return this.scheduleType;
    }

    public AddDeviceAbilityShrinkRequest setScheduleCycleDate(String scheduleCycleDate) {
        this.scheduleCycleDate = scheduleCycleDate;
        return this;
    }
    public String getScheduleCycleDate() {
        return this.scheduleCycleDate;
    }

    public AddDeviceAbilityShrinkRequest setScheduleTimesShrink(String scheduleTimesShrink) {
        this.scheduleTimesShrink = scheduleTimesShrink;
        return this;
    }
    public String getScheduleTimesShrink() {
        return this.scheduleTimesShrink;
    }

    public AddDeviceAbilityShrinkRequest setIsPolling(String isPolling) {
        this.isPolling = isPolling;
        return this;
    }
    public String getIsPolling() {
        return this.isPolling;
    }

    public AddDeviceAbilityShrinkRequest setOverallExecutionTime(String overallExecutionTime) {
        this.overallExecutionTime = overallExecutionTime;
        return this;
    }
    public String getOverallExecutionTime() {
        return this.overallExecutionTime;
    }

    public AddDeviceAbilityShrinkRequest setSliceExecutionTime(String sliceExecutionTime) {
        this.sliceExecutionTime = sliceExecutionTime;
        return this;
    }
    public String getSliceExecutionTime() {
        return this.sliceExecutionTime;
    }

    public AddDeviceAbilityShrinkRequest setComputeFrequencyType(String computeFrequencyType) {
        this.computeFrequencyType = computeFrequencyType;
        return this;
    }
    public String getComputeFrequencyType() {
        return this.computeFrequencyType;
    }

    public AddDeviceAbilityShrinkRequest setAlgorithmId(String algorithmId) {
        this.algorithmId = algorithmId;
        return this;
    }
    public String getAlgorithmId() {
        return this.algorithmId;
    }

    public AddDeviceAbilityShrinkRequest setValidYear(Integer validYear) {
        this.validYear = validYear;
        return this;
    }
    public Integer getValidYear() {
        return this.validYear;
    }

    public AddDeviceAbilityShrinkRequest setValidMonth(Integer validMonth) {
        this.validMonth = validMonth;
        return this;
    }
    public Integer getValidMonth() {
        return this.validMonth;
    }

    public AddDeviceAbilityShrinkRequest setValidDay(Integer validDay) {
        this.validDay = validDay;
        return this;
    }
    public Integer getValidDay() {
        return this.validDay;
    }

}
