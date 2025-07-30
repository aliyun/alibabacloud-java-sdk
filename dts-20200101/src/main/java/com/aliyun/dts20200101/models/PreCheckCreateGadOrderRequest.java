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

    @NameInMap("MasterDatabaseName")
    public String masterDatabaseName;

    @NameInMap("MasterEngineArchType")
    public String masterEngineArchType;

    @NameInMap("MasterShardAccountName")
    public String masterShardAccountName;

    @NameInMap("MasterShardAccountPassword")
    public String masterShardAccountPassword;

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

    @NameInMap("SlaveDatabaseName")
    public String slaveDatabaseName;

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

    @NameInMap("SlaveEngineArchType")
    public String slaveEngineArchType;

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

    public PreCheckCreateGadOrderRequest setMasterDatabaseName(String masterDatabaseName) {
        this.masterDatabaseName = masterDatabaseName;
        return this;
    }
    public String getMasterDatabaseName() {
        return this.masterDatabaseName;
    }

    public PreCheckCreateGadOrderRequest setMasterEngineArchType(String masterEngineArchType) {
        this.masterEngineArchType = masterEngineArchType;
        return this;
    }
    public String getMasterEngineArchType() {
        return this.masterEngineArchType;
    }

    public PreCheckCreateGadOrderRequest setMasterShardAccountName(String masterShardAccountName) {
        this.masterShardAccountName = masterShardAccountName;
        return this;
    }
    public String getMasterShardAccountName() {
        return this.masterShardAccountName;
    }

    public PreCheckCreateGadOrderRequest setMasterShardAccountPassword(String masterShardAccountPassword) {
        this.masterShardAccountPassword = masterShardAccountPassword;
        return this;
    }
    public String getMasterShardAccountPassword() {
        return this.masterShardAccountPassword;
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

    public PreCheckCreateGadOrderRequest setSlaveDatabaseName(String slaveDatabaseName) {
        this.slaveDatabaseName = slaveDatabaseName;
        return this;
    }
    public String getSlaveDatabaseName() {
        return this.slaveDatabaseName;
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

    public PreCheckCreateGadOrderRequest setSlaveEngineArchType(String slaveEngineArchType) {
        this.slaveEngineArchType = slaveEngineArchType;
        return this;
    }
    public String getSlaveEngineArchType() {
        return this.slaveEngineArchType;
    }

}
