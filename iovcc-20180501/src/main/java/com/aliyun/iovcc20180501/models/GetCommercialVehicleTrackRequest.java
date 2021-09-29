// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class GetCommercialVehicleTrackRequest extends TeaModel {
    // 项目ID
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("ClientId")
    public String clientId;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("EndTime")
    public Long endTime;

    public static GetCommercialVehicleTrackRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCommercialVehicleTrackRequest self = new GetCommercialVehicleTrackRequest();
        return TeaModel.build(map, self);
    }

    public GetCommercialVehicleTrackRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public GetCommercialVehicleTrackRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public GetCommercialVehicleTrackRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public GetCommercialVehicleTrackRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

}
