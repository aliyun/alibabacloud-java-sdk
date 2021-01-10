// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeAssistWSServerAddressRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("DeviceId")
    public String deviceId;

    public static DescribeAssistWSServerAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAssistWSServerAddressRequest self = new DescribeAssistWSServerAddressRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAssistWSServerAddressRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DescribeAssistWSServerAddressRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

}
