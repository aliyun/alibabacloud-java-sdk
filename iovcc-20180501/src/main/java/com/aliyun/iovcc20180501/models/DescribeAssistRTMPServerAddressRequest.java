// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeAssistRTMPServerAddressRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("DeviceId")
    public String deviceId;

    public static DescribeAssistRTMPServerAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAssistRTMPServerAddressRequest self = new DescribeAssistRTMPServerAddressRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAssistRTMPServerAddressRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DescribeAssistRTMPServerAddressRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

}
