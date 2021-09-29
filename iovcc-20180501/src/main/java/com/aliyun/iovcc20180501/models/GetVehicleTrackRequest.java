// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class GetVehicleTrackRequest extends TeaModel {
    // 项目ID
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Vin")
    public String vin;

    public static GetVehicleTrackRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVehicleTrackRequest self = new GetVehicleTrackRequest();
        return TeaModel.build(map, self);
    }

    public GetVehicleTrackRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public GetVehicleTrackRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public GetVehicleTrackRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public GetVehicleTrackRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetVehicleTrackRequest setVin(String vin) {
        this.vin = vin;
        return this;
    }
    public String getVin() {
        return this.vin;
    }

}
