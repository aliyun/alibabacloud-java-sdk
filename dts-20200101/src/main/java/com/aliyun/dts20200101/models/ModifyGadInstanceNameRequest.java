// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ModifyGadInstanceNameRequest extends TeaModel {
    /**
     * <p>The instance ID of the active-active instance group.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-bp1i99e8l7913****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the active-active instance group.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6b0m001ir8mr9i9</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The ID of the region where the task resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aek26mat2ldb4oy</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static ModifyGadInstanceNameRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyGadInstanceNameRequest self = new ModifyGadInstanceNameRequest();
        return TeaModel.build(map, self);
    }

    public ModifyGadInstanceNameRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyGadInstanceNameRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ModifyGadInstanceNameRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public ModifyGadInstanceNameRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyGadInstanceNameRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
