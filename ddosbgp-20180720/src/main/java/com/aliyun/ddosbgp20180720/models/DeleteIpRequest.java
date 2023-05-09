// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DeleteIpRequest extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the Anti-DDoS Origin Enterprise instance.</p>
     * <br>
     * <p>>  You can call the [DescribeRegions](~~118703~~) operation to query all regions supported by Anti-DDoS Origin.</p>
     */
    @NameInMap("IpList")
    public String ipList;

    /**
     * <p>All Alibaba Cloud API operations must include common request parameters. For more information about common request parameters, see [Common parameters](~~118841~~).</p>
     * <br>
     * <p>For more information about sample requests, see the **"Examples"** section of this topic.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The Anti-DDoS Origin Enterprise instance no longer protects the IP addresses that are removed.</p>
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
