// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeDefaultSchemaRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("DeviceModelId")
    public String deviceModelId;

    public static DescribeDefaultSchemaRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefaultSchemaRequest self = new DescribeDefaultSchemaRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDefaultSchemaRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DescribeDefaultSchemaRequest setDeviceModelId(String deviceModelId) {
        this.deviceModelId = deviceModelId;
        return this;
    }
    public String getDeviceModelId() {
        return this.deviceModelId;
    }

}
