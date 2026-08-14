// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeSlsOpenStatusRequest extends TeaModel {
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DescribeSlsOpenStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlsOpenStatusRequest self = new DescribeSlsOpenStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSlsOpenStatusRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
