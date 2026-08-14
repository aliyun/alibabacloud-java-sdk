// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeSlsAuthStatusRequest extends TeaModel {
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DescribeSlsAuthStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlsAuthStatusRequest self = new DescribeSlsAuthStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSlsAuthStatusRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
