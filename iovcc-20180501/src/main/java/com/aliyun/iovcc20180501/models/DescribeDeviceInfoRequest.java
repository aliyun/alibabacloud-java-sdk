// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeDeviceInfoRequest extends TeaModel {
    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("DeviceToken")
    public String deviceToken;

    @NameInMap("ProjectId")
    public String projectId;

    public static DescribeDeviceInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeviceInfoRequest self = new DescribeDeviceInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDeviceInfoRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public DescribeDeviceInfoRequest setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken;
        return this;
    }
    public String getDeviceToken() {
        return this.deviceToken;
    }

    public DescribeDeviceInfoRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
