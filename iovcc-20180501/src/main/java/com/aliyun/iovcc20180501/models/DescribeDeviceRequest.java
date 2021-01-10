// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeDeviceRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("DeviceId")
    public String deviceId;

    public static DescribeDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeviceRequest self = new DescribeDeviceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDeviceRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DescribeDeviceRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

}
