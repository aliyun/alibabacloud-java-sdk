// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateApplicationMonitorRequest extends TeaModel {
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    @NameInMap("Address")
    public String address;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DetectEnable")
    public Boolean detectEnable;

    @NameInMap("DetectThreshold")
    public Integer detectThreshold;

    @NameInMap("DetectTimes")
    public Integer detectTimes;

    @NameInMap("ListenerId")
    public String listenerId;

    @NameInMap("OptionsJson")
    public String optionsJson;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SilenceTime")
    public Integer silenceTime;

    @NameInMap("TaskName")
    public String taskName;

    public static CreateApplicationMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationMonitorRequest self = new CreateApplicationMonitorRequest();
        return TeaModel.build(map, self);
    }

    public CreateApplicationMonitorRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public CreateApplicationMonitorRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public CreateApplicationMonitorRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateApplicationMonitorRequest setDetectEnable(Boolean detectEnable) {
        this.detectEnable = detectEnable;
        return this;
    }
    public Boolean getDetectEnable() {
        return this.detectEnable;
    }

    public CreateApplicationMonitorRequest setDetectThreshold(Integer detectThreshold) {
        this.detectThreshold = detectThreshold;
        return this;
    }
    public Integer getDetectThreshold() {
        return this.detectThreshold;
    }

    public CreateApplicationMonitorRequest setDetectTimes(Integer detectTimes) {
        this.detectTimes = detectTimes;
        return this;
    }
    public Integer getDetectTimes() {
        return this.detectTimes;
    }

    public CreateApplicationMonitorRequest setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public CreateApplicationMonitorRequest setOptionsJson(String optionsJson) {
        this.optionsJson = optionsJson;
        return this;
    }
    public String getOptionsJson() {
        return this.optionsJson;
    }

    public CreateApplicationMonitorRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateApplicationMonitorRequest setSilenceTime(Integer silenceTime) {
        this.silenceTime = silenceTime;
        return this;
    }
    public Integer getSilenceTime() {
        return this.silenceTime;
    }

    public CreateApplicationMonitorRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
