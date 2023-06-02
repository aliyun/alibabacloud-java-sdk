// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeInstanceIdsRequest extends TeaModel {
    @NameInMap("Edition")
    public Integer edition;

    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DescribeInstanceIdsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceIdsRequest self = new DescribeInstanceIdsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceIdsRequest setEdition(Integer edition) {
        this.edition = edition;
        return this;
    }
    public Integer getEdition() {
        return this.edition;
    }

    public DescribeInstanceIdsRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public DescribeInstanceIdsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
