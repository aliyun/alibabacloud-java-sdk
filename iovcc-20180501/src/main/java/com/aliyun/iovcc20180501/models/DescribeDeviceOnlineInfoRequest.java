// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeDeviceOnlineInfoRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("Type")
    public String type;

    @NameInMap("Value")
    public String value;

    public static DescribeDeviceOnlineInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeviceOnlineInfoRequest self = new DescribeDeviceOnlineInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDeviceOnlineInfoRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DescribeDeviceOnlineInfoRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeDeviceOnlineInfoRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
