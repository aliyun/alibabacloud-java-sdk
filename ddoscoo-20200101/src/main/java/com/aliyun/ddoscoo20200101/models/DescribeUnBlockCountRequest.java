// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeUnBlockCountRequest extends TeaModel {
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DescribeUnBlockCountRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUnBlockCountRequest self = new DescribeUnBlockCountRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUnBlockCountRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
