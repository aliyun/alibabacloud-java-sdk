// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DeleteBlackholeRequest extends TeaModel {
    /**
     * <p>DeleteBlackhole</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Deactivates blackhole filtering for a protected IP address.</p>
     */
    @NameInMap("Ip")
    public String ip;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>WB269094</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DeleteBlackholeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBlackholeRequest self = new DeleteBlackholeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBlackholeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteBlackholeRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public DeleteBlackholeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteBlackholeRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
