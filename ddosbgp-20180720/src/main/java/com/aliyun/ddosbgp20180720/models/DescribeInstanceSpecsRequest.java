// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeInstanceSpecsRequest extends TeaModel {
    /**
     * <p>The ID of the resource group to which the Anti-DDoS Origin Enterprise instance belongs in Resource Management. This parameter is empty by default, which indicates that the Anti-DDoS Origin Enterprise instance belongs to the default resource group.</p>
     * <br>
     * <p>For more information about resource groups, see [Create a resource group](~~94485~~).</p>
     */
    @NameInMap("InstanceIdList")
    public String instanceIdList;

    /**
     * <p>The normal clean bandwidth. Unit: Mbit/s.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Indicates whether the unlimited protection feature is enabled. Valid values:</p>
     * <br>
     * <p>*   **0**: The unlimited protection feature is disabled.</p>
     * <p>*   **1**: The unlimited protection feature is enabled.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DescribeInstanceSpecsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceSpecsRequest self = new DescribeInstanceSpecsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceSpecsRequest setInstanceIdList(String instanceIdList) {
        this.instanceIdList = instanceIdList;
        return this;
    }
    public String getInstanceIdList() {
        return this.instanceIdList;
    }

    public DescribeInstanceSpecsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeInstanceSpecsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
