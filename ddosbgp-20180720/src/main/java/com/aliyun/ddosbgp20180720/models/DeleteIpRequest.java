// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DeleteIpRequest extends TeaModel {
    /**
     * <p>The ID of the Anti-DDoS Origin Enterprise instance.</p>
     * <br>
     * <p>>  You can call the [DescribeInstanceList](~~118698~~) operation to query the IDs of all Anti-DDoS Origin Enterprise instances.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The list of IP addresses that you want to remove from the Anti-DDoS Origin Enterprise instance. This parameter is a string consisting of JSON arrays. Each element in a JSON array is a JSON struct that includes the following field:</p>
     * <br>
     * <p>*   **ip**: required. The IP address that you want to remove. Data type: string.</p>
     * <br>
     * <p>    > The IP addresses that you want to remove must be protected by the Anti-DDoS Origin Enterprise instance.</p>
     */
    @NameInMap("IpList")
    public String ipList;

    /**
     * <p>The region ID of the Anti-DDoS Origin Enterprise instance.</p>
     * <br>
     * <p>>  You can call the [DescribeRegions](~~118703~~) operation to query all regions supported by Anti-DDoS Origin.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the Anti-DDoS Origin Enterprise instance belongs in Resource Management. This parameter is empty by default, which indicates that the instance belongs to the default resource group.</p>
     * <br>
     * <p>For more information about resource groups, see [Create a resource group](~~94485~~).</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DeleteIpRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteIpRequest self = new DeleteIpRequest();
        return TeaModel.build(map, self);
    }

    public DeleteIpRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteIpRequest setIpList(String ipList) {
        this.ipList = ipList;
        return this;
    }
    public String getIpList() {
        return this.ipList;
    }

    public DeleteIpRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteIpRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
