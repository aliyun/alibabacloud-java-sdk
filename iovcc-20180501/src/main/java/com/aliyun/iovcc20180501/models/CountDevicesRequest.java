// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class CountDevicesRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("DeviceModelId")
    public Integer deviceModelId;

    @NameInMap("DeviceModel")
    public String deviceModel;

    public static CountDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        CountDevicesRequest self = new CountDevicesRequest();
        return TeaModel.build(map, self);
    }

    public CountDevicesRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CountDevicesRequest setDeviceModelId(Integer deviceModelId) {
        this.deviceModelId = deviceModelId;
        return this;
    }
    public Integer getDeviceModelId() {
        return this.deviceModelId;
    }

    public CountDevicesRequest setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
        return this;
    }
    public String getDeviceModel() {
        return this.deviceModel;
    }

}
