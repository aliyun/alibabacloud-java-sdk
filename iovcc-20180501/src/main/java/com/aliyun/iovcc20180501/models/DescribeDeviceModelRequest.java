// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeDeviceModelRequest extends TeaModel {
    @NameInMap("DeviceModelId")
    public Integer deviceModelId;

    @NameInMap("DeviceModel")
    public String deviceModel;

    @NameInMap("ProjectId")
    public String projectId;

    public static DescribeDeviceModelRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeviceModelRequest self = new DescribeDeviceModelRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDeviceModelRequest setDeviceModelId(Integer deviceModelId) {
        this.deviceModelId = deviceModelId;
        return this;
    }
    public Integer getDeviceModelId() {
        return this.deviceModelId;
    }

    public DescribeDeviceModelRequest setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
        return this;
    }
    public String getDeviceModel() {
        return this.deviceModel;
    }

    public DescribeDeviceModelRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
