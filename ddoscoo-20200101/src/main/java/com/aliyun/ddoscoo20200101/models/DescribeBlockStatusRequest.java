// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeBlockStatusRequest extends TeaModel {
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DescribeBlockStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBlockStatusRequest self = new DescribeBlockStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBlockStatusRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public DescribeBlockStatusRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
