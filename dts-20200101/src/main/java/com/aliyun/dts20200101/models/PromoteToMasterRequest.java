// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class PromoteToMasterRequest extends TeaModel {
    /**
     * <p>Instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>gad-bp162d4tp0500****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Primary instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-bp1756****</p>
     */
    @NameInMap("MasterDbInstanceId")
    public String masterDbInstanceId;

    /**
     * <p>Region ID. Specify this parameter to indicate the region where the instance resides. For more information, see the list of supported regions.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzawhxxc****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Secondary instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-bp1756****</p>
     */
    @NameInMap("SlaveDbInstanceId")
    public String slaveDbInstanceId;

    public static PromoteToMasterRequest build(java.util.Map<String, ?> map) throws Exception {
        PromoteToMasterRequest self = new PromoteToMasterRequest();
        return TeaModel.build(map, self);
    }

    public PromoteToMasterRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public PromoteToMasterRequest setMasterDbInstanceId(String masterDbInstanceId) {
        this.masterDbInstanceId = masterDbInstanceId;
        return this;
    }
    public String getMasterDbInstanceId() {
        return this.masterDbInstanceId;
    }

    public PromoteToMasterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public PromoteToMasterRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public PromoteToMasterRequest setSlaveDbInstanceId(String slaveDbInstanceId) {
        this.slaveDbInstanceId = slaveDbInstanceId;
        return this;
    }
    public String getSlaveDbInstanceId() {
        return this.slaveDbInstanceId;
    }

}
