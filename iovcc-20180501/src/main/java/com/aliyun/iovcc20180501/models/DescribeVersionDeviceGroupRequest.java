// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeVersionDeviceGroupRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("Id")
    public String id;

    public static DescribeVersionDeviceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVersionDeviceGroupRequest self = new DescribeVersionDeviceGroupRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVersionDeviceGroupRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DescribeVersionDeviceGroupRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
