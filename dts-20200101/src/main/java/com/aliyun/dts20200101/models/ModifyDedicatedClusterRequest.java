// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ModifyDedicatedClusterRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * <blockquote>
     * <p> You must specify one of the <strong>InstanceId</strong> and <strong>DedicatedClusterId</strong> parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>dtscluster_h3fl1cs217sx952</p>
     */
    @NameInMap("DedicatedClusterId")
    public String dedicatedClusterId;

    /**
     * <p>The name of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>dtscluster_test_001</p>
     */
    @NameInMap("DedicatedClusterName")
    public String dedicatedClusterName;

    /**
     * <p>The ID of the instance.</p>
     * <blockquote>
     * <p> You must specify one of the <strong>InstanceId</strong> and <strong>DedicatedClusterId</strong> parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rm-bp1162kryivb8****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The overcommit ratio. Unit: %.</p>
     * 
     * <strong>example:</strong>
     * <p>150</p>
     */
    @NameInMap("OversoldRatio")
    public Integer oversoldRatio;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The ID of the region in which the Data Transmission Service (DTS) instance resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzawhxxc****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static ModifyDedicatedClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDedicatedClusterRequest self = new ModifyDedicatedClusterRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDedicatedClusterRequest setDedicatedClusterId(String dedicatedClusterId) {
        this.dedicatedClusterId = dedicatedClusterId;
        return this;
    }
    public String getDedicatedClusterId() {
        return this.dedicatedClusterId;
    }

    public ModifyDedicatedClusterRequest setDedicatedClusterName(String dedicatedClusterName) {
        this.dedicatedClusterName = dedicatedClusterName;
        return this;
    }
    public String getDedicatedClusterName() {
        return this.dedicatedClusterName;
    }

    public ModifyDedicatedClusterRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyDedicatedClusterRequest setOversoldRatio(Integer oversoldRatio) {
        this.oversoldRatio = oversoldRatio;
        return this;
    }
    public Integer getOversoldRatio() {
        return this.oversoldRatio;
    }

    public ModifyDedicatedClusterRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public ModifyDedicatedClusterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDedicatedClusterRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
