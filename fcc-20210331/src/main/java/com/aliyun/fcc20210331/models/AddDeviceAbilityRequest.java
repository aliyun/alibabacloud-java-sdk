// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class AddDeviceAbilityRequest extends TeaModel {
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
    public java.util.Map<String, ?> scheduleTimes;

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

    public static AddDeviceAbilityRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDeviceAbilityRequest self = new AddDeviceAbilityRequest();
        return TeaModel.build(map, self);
    }

    public AddDeviceAbilityRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public AddDeviceAbilityRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public AddDeviceAbilityRequest setAbilityType(String abilityType) {
        this.abilityType = abilityType;
        return this;
    }
    public String getAbilityType() {
        return this.abilityType;
    }

    public AddDeviceAbilityRequest setAbilityName(String abilityName) {
        this.abilityName = abilityName;
        return this;
    }
    public String getAbilityName() {
        return this.abilityName;
    }

    public AddDeviceAbilityRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public AddDeviceAbilityRequest setConfigInfo(String configInfo) {
        this.configInfo = configInfo;
        return this;
    }
    public String getConfigInfo() {
        return this.configInfo;
    }

    public AddDeviceAbilityRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddDeviceAbilityRequest setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
        return this;
    }
    public String getScheduleType() {
        return this.scheduleType;
    }

    public AddDeviceAbilityRequest setScheduleCycleDate(String scheduleCycleDate) {
        this.scheduleCycleDate = scheduleCycleDate;
        return this;
    }
    public String getScheduleCycleDate() {
        return this.scheduleCycleDate;
    }

    public AddDeviceAbilityRequest setScheduleTimes(java.util.Map<String, ?> scheduleTimes) {
        this.scheduleTimes = scheduleTimes;
        return this;
    }
    public java.util.Map<String, ?> getScheduleTimes() {
        return this.scheduleTimes;
    }

    public AddDeviceAbilityRequest setIsPolling(String isPolling) {
        this.isPolling = isPolling;
        return this;
    }
    public String getIsPolling() {
        return this.isPolling;
    }

    public AddDeviceAbilityRequest setOverallExecutionTime(String overallExecutionTime) {
        this.overallExecutionTime = overallExecutionTime;
        return this;
    }
    public String getOverallExecutionTime() {
        return this.overallExecutionTime;
    }

    public AddDeviceAbilityRequest setSliceExecutionTime(String sliceExecutionTime) {
        this.sliceExecutionTime = sliceExecutionTime;
        return this;
    }
    public String getSliceExecutionTime() {
        return this.sliceExecutionTime;
    }

    public AddDeviceAbilityRequest setComputeFrequencyType(String computeFrequencyType) {
        this.computeFrequencyType = computeFrequencyType;
        return this;
    }
    public String getComputeFrequencyType() {
        return this.computeFrequencyType;
    }

    public AddDeviceAbilityRequest setAlgorithmId(String algorithmId) {
        this.algorithmId = algorithmId;
        return this;
    }
    public String getAlgorithmId() {
        return this.algorithmId;
    }

    public AddDeviceAbilityRequest setValidYear(Integer validYear) {
        this.validYear = validYear;
        return this;
    }
    public Integer getValidYear() {
        return this.validYear;
    }

    public AddDeviceAbilityRequest setValidMonth(Integer validMonth) {
        this.validMonth = validMonth;
        return this;
    }
    public Integer getValidMonth() {
        return this.validMonth;
    }

    public AddDeviceAbilityRequest setValidDay(Integer validDay) {
        this.validDay = validDay;
        return this;
    }
    public Integer getValidDay() {
        return this.validDay;
    }

}
