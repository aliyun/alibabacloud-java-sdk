// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class PreCheckCreateGadOrderRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>gad-bp1i99e8l7913****</p>
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
     * <p>rg-acfntftbiobqyky</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <strong>example:</strong>
     * <p>rm-bp17562h64****</p>
     */
    @NameInMap("SlaveDbInstanceId")
    public String slaveDbInstanceId;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("SlaveDbInstanceRegion")
    public String slaveDbInstanceRegion;

    public static PreCheckCreateGadOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        PreCheckCreateGadOrderRequest self = new PreCheckCreateGadOrderRequest();
        return TeaModel.build(map, self);
    }

    public PreCheckCreateGadOrderRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public PreCheckCreateGadOrderRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public PreCheckCreateGadOrderRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public PreCheckCreateGadOrderRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public PreCheckCreateGadOrderRequest setSlaveDbInstanceId(String slaveDbInstanceId) {
        this.slaveDbInstanceId = slaveDbInstanceId;
        return this;
    }
    public String getSlaveDbInstanceId() {
        return this.slaveDbInstanceId;
    }

    public PreCheckCreateGadOrderRequest setSlaveDbInstanceRegion(String slaveDbInstanceRegion) {
        this.slaveDbInstanceRegion = slaveDbInstanceRegion;
        return this;
    }
    public String getSlaveDbInstanceRegion() {
        return this.slaveDbInstanceRegion;
    }

}
