// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeInstanceSpecsRequest extends TeaModel {
    /**
     * <p>The ID of the Anti-DDoS Origin Enterprise instance. This parameter value is a string consisting of JSON arrays. Each element in a JSON array indicates an instance ID. If you want to query more than one instance, separate instance IDs with commas (,).</p>
     * <br>
     * <p>>  You can call the [DescribeInstanceList](~~118698~~) operation to query the IDs of all Anti-DDoS Origin Enterprise instances in a specific region.</p>
     */
    @NameInMap("InstanceIdList")
    public String instanceIdList;

    /**
     * <p>The region ID of the Anti-DDoS Origin Enterprise instance. Default value: **cn-hangzhou**, which indicates the China (Hangzhou) region.</p>
     * <br>
     * <p>>  If your instance does not reside in the China (Hangzhou) region, you must specify this parameter to the region ID of your instance. You can call the [DescribeRegions](~~118703~~) operation to query the regions of cloud assets that are supported by an Anti-DDoS Origin instance.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the Anti-DDoS Origin Enterprise instance belongs in Resource Management. This parameter is empty by default, which indicates that the Anti-DDoS Origin Enterprise instance belongs to the default resource group.</p>
     * <br>
     * <p>For more information about resource groups, see [Create a resource group](~~94485~~).</p>
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
