// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DetachGadInstanceDbMemberRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>gad-bp162d4tp0500****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>rg-acfmzawhxxc****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <strong>example:</strong>
     * <p>rm-sdfghjk****</p>
     */
    @NameInMap("SlaveDbInstanceId")
    public String slaveDbInstanceId;

    public static DetachGadInstanceDbMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachGadInstanceDbMemberRequest self = new DetachGadInstanceDbMemberRequest();
        return TeaModel.build(map, self);
    }

    public DetachGadInstanceDbMemberRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DetachGadInstanceDbMemberRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public DetachGadInstanceDbMemberRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DetachGadInstanceDbMemberRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DetachGadInstanceDbMemberRequest setSlaveDbInstanceId(String slaveDbInstanceId) {
        this.slaveDbInstanceId = slaveDbInstanceId;
        return this;
    }
    public String getSlaveDbInstanceId() {
        return this.slaveDbInstanceId;
    }

}
