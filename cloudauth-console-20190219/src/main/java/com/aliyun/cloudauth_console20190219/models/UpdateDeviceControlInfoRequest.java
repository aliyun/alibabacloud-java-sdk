// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class UpdateDeviceControlInfoRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("IotId")
    public Long iotId;

    @NameInMap("MultiPerson")
    public Integer multiPerson;

    @NameInMap("ControlDoorTime")
    public Integer controlDoorTime;

    @NameInMap("EnableMeasureTempurature")
    public Integer enableMeasureTempurature;

    @NameInMap("SpeedClock")
    public Integer speedClock;

    public static UpdateDeviceControlInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeviceControlInfoRequest self = new UpdateDeviceControlInfoRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDeviceControlInfoRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public UpdateDeviceControlInfoRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public UpdateDeviceControlInfoRequest setIotId(Long iotId) {
        this.iotId = iotId;
        return this;
    }
    public Long getIotId() {
        return this.iotId;
    }

    public UpdateDeviceControlInfoRequest setMultiPerson(Integer multiPerson) {
        this.multiPerson = multiPerson;
        return this;
    }
    public Integer getMultiPerson() {
        return this.multiPerson;
    }

    public UpdateDeviceControlInfoRequest setControlDoorTime(Integer controlDoorTime) {
        this.controlDoorTime = controlDoorTime;
        return this;
    }
    public Integer getControlDoorTime() {
        return this.controlDoorTime;
    }

    public UpdateDeviceControlInfoRequest setEnableMeasureTempurature(Integer enableMeasureTempurature) {
        this.enableMeasureTempurature = enableMeasureTempurature;
        return this;
    }
    public Integer getEnableMeasureTempurature() {
        return this.enableMeasureTempurature;
    }

    public UpdateDeviceControlInfoRequest setSpeedClock(Integer speedClock) {
        this.speedClock = speedClock;
        return this;
    }
    public Integer getSpeedClock() {
        return this.speedClock;
    }

}
