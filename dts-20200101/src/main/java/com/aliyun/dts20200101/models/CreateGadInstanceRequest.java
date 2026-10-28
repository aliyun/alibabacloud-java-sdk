// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class CreateGadInstanceRequest extends TeaModel {
    /**
     * <p>The name of the group. The name must be globally unique.</p>
     * 
     * <strong>example:</strong>
     * <p>gad-sqlserver-hk-set4</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The instance type. Valid values: DR (disaster recovery) and GAD (active geo-redundancy).</p>
     * 
     * <strong>example:</strong>
     * <p>DR</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The database engine. Valid values: MySQL, SQL Server, and PostgreSQL.</p>
     * 
     * <strong>example:</strong>
     * <p>SQLServer</p>
     */
    @NameInMap("MasterDbEngineType")
    public String masterDbEngineType;

    /**
     * <p>The ID of the primary ApsaraDB RDS instance.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-j6c685vh0j0y1k***</p>
     */
    @NameInMap("MasterDbInstanceId")
    public String masterDbInstanceId;

    /**
     * <p>The region of the primary instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hongkong</p>
     */
    @NameInMap("MasterDbInstanceRegion")
    public String masterDbInstanceRegion;

    /**
     * <p>The zone of the primary instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hongkong-b</p>
     */
    @NameInMap("MasterDbZoneId")
    public String masterDbZoneId;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The region of the primary instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hongkong</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aek3d****4mxya</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static CreateGadInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGadInstanceRequest self = new CreateGadInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateGadInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateGadInstanceRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateGadInstanceRequest setMasterDbEngineType(String masterDbEngineType) {
        this.masterDbEngineType = masterDbEngineType;
        return this;
    }
    public String getMasterDbEngineType() {
        return this.masterDbEngineType;
    }

    public CreateGadInstanceRequest setMasterDbInstanceId(String masterDbInstanceId) {
        this.masterDbInstanceId = masterDbInstanceId;
        return this;
    }
    public String getMasterDbInstanceId() {
        return this.masterDbInstanceId;
    }

    public CreateGadInstanceRequest setMasterDbInstanceRegion(String masterDbInstanceRegion) {
        this.masterDbInstanceRegion = masterDbInstanceRegion;
        return this;
    }
    public String getMasterDbInstanceRegion() {
        return this.masterDbInstanceRegion;
    }

    public CreateGadInstanceRequest setMasterDbZoneId(String masterDbZoneId) {
        this.masterDbZoneId = masterDbZoneId;
        return this;
    }
    public String getMasterDbZoneId() {
        return this.masterDbZoneId;
    }

    public CreateGadInstanceRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public CreateGadInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateGadInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
