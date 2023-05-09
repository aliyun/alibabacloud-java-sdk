// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class ModifyRemarkRequest extends TeaModel {
    /**
     * <p>Adds remarks for a specific Anti-DDoS Origin instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>ModifyRemark</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>WB269094</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static ModifyRemarkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyRemarkRequest self = new ModifyRemarkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyRemarkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyRemarkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyRemarkRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public ModifyRemarkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
