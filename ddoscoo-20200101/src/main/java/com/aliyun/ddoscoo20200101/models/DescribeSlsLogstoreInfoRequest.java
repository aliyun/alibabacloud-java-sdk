// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeSlsLogstoreInfoRequest extends TeaModel {
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DescribeSlsLogstoreInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlsLogstoreInfoRequest self = new DescribeSlsLogstoreInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSlsLogstoreInfoRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
