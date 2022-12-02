// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetDeviceConfigDiffRequest extends TeaModel {
    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("StartDate")
    public String startDate;

    public static GetDeviceConfigDiffRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceConfigDiffRequest self = new GetDeviceConfigDiffRequest();
        return TeaModel.build(map, self);
    }

    public GetDeviceConfigDiffRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public GetDeviceConfigDiffRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public GetDeviceConfigDiffRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetDeviceConfigDiffRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
