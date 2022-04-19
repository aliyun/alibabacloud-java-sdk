// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateApplicationMonitorRequest extends TeaModel {
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

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("TaskName")
    public String taskName;

    public static UpdateApplicationMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationMonitorRequest self = new UpdateApplicationMonitorRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationMonitorRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public UpdateApplicationMonitorRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateApplicationMonitorRequest setDetectEnable(Boolean detectEnable) {
        this.detectEnable = detectEnable;
        return this;
    }
    public Boolean getDetectEnable() {
        return this.detectEnable;
    }

    public UpdateApplicationMonitorRequest setDetectThreshold(Integer detectThreshold) {
        this.detectThreshold = detectThreshold;
        return this;
    }
    public Integer getDetectThreshold() {
        return this.detectThreshold;
    }

    public UpdateApplicationMonitorRequest setDetectTimes(Integer detectTimes) {
        this.detectTimes = detectTimes;
        return this;
    }
    public Integer getDetectTimes() {
        return this.detectTimes;
    }

    public UpdateApplicationMonitorRequest setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public UpdateApplicationMonitorRequest setOptionsJson(String optionsJson) {
        this.optionsJson = optionsJson;
        return this;
    }
    public String getOptionsJson() {
        return this.optionsJson;
    }

    public UpdateApplicationMonitorRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateApplicationMonitorRequest setSilenceTime(Integer silenceTime) {
        this.silenceTime = silenceTime;
        return this;
    }
    public Integer getSilenceTime() {
        return this.silenceTime;
    }

    public UpdateApplicationMonitorRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public UpdateApplicationMonitorRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
