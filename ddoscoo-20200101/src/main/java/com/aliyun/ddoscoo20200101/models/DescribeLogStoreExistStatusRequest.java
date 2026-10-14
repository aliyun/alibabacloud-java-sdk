// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeLogStoreExistStatusRequest extends TeaModel {
    /**
     * <p>The ID of the resource group to which the instance belongs in Resource Management. This parameter is empty by default, which indicates that the instance belongs to the default resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DescribeLogStoreExistStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogStoreExistStatusRequest self = new DescribeLogStoreExistStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLogStoreExistStatusRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
