// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class CountActivatedOrNewRegistrationDeviceRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("DeviceType")
    public String deviceType;

    @NameInMap("DeviceBrandId")
    public String deviceBrandId;

    @NameInMap("DeviceBrand")
    public String deviceBrand;

    @NameInMap("DeviceModelId")
    public String deviceModelId;

    @NameInMap("DeviceModel")
    public String deviceModel;

    @NameInMap("DeviceCountStatType")
    public String deviceCountStatType;

    @NameInMap("IsQueryNewRegistrationDevice")
    public String isQueryNewRegistrationDevice;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("IsQueryYearlyActivate")
    public String isQueryYearlyActivate;

    public static CountActivatedOrNewRegistrationDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        CountActivatedOrNewRegistrationDeviceRequest self = new CountActivatedOrNewRegistrationDeviceRequest();
        return TeaModel.build(map, self);
    }

    public CountActivatedOrNewRegistrationDeviceRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CountActivatedOrNewRegistrationDeviceRequest setDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }
    public String getDeviceType() {
        return this.deviceType;
    }

    public CountActivatedOrNewRegistrationDeviceRequest setDeviceBrandId(String deviceBrandId) {
        this.deviceBrandId = deviceBrandId;
        return this;
    }
    public String getDeviceBrandId() {
        return this.deviceBrandId;
    }

    public CountActivatedOrNewRegistrationDeviceRequest setDeviceBrand(String deviceBrand) {
        this.deviceBrand = deviceBrand;
        return this;
    }
    public String getDeviceBrand() {
        return this.deviceBrand;
    }

    public CountActivatedOrNewRegistrationDeviceRequest setDeviceModelId(String deviceModelId) {
        this.deviceModelId = deviceModelId;
        return this;
    }
    public String getDeviceModelId() {
        return this.deviceModelId;
    }

    public CountActivatedOrNewRegistrationDeviceRequest setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
        return this;
    }
    public String getDeviceModel() {
        return this.deviceModel;
    }

    public CountActivatedOrNewRegistrationDeviceRequest setDeviceCountStatType(String deviceCountStatType) {
        this.deviceCountStatType = deviceCountStatType;
        return this;
    }
    public String getDeviceCountStatType() {
        return this.deviceCountStatType;
    }

    public CountActivatedOrNewRegistrationDeviceRequest setIsQueryNewRegistrationDevice(String isQueryNewRegistrationDevice) {
        this.isQueryNewRegistrationDevice = isQueryNewRegistrationDevice;
        return this;
    }
    public String getIsQueryNewRegistrationDevice() {
        return this.isQueryNewRegistrationDevice;
    }

    public CountActivatedOrNewRegistrationDeviceRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public CountActivatedOrNewRegistrationDeviceRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CountActivatedOrNewRegistrationDeviceRequest setIsQueryYearlyActivate(String isQueryYearlyActivate) {
        this.isQueryYearlyActivate = isQueryYearlyActivate;
        return this;
    }
    public String getIsQueryYearlyActivate() {
        return this.isQueryYearlyActivate;
    }

}
