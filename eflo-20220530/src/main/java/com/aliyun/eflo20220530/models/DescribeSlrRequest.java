// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class DescribeSlrRequest extends TeaModel {
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DescribeSlrRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlrRequest self = new DescribeSlrRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSlrRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
