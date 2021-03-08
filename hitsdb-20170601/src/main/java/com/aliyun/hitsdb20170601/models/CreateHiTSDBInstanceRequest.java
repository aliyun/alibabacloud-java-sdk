// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20170601.models;

import com.aliyun.tea.*;

public class CreateHiTSDBInstanceRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("AppKey")
    public String appKey;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("InstanceAlias")
    public String instanceAlias;

    @NameInMap("InstanceClass")
    public String instanceClass;

    @NameInMap("InstanceStorage")
    public String instanceStorage;

    @NameInMap("PayType")
    public String payType;

    @NameInMap("VPCId")
    public String VPCId;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("MaxTimelineLimit")
    public String maxTimelineLimit;

    @NameInMap("InstanceTps")
    public String instanceTps;

    @NameInMap("EngineType")
    public String engineType;

    @NameInMap("MaxSeriesPerDatabase")
    public String maxSeriesPerDatabase;

    @NameInMap("MaxDatabaseLimit")
    public String maxDatabaseLimit;

    @NameInMap("PricingCycle")
    public String pricingCycle;

    @NameInMap("Duration")
    public String duration;

    @NameInMap("TSDBVersion")
    public String TSDBVersion;

    @NameInMap("DiskCategory")
    public String diskCategory;

    @NameInMap("ClientToken")
    public String clientToken;

    public static CreateHiTSDBInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateHiTSDBInstanceRequest self = new CreateHiTSDBInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateHiTSDBInstanceRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public CreateHiTSDBInstanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateHiTSDBInstanceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateHiTSDBInstanceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateHiTSDBInstanceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateHiTSDBInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateHiTSDBInstanceRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public CreateHiTSDBInstanceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public CreateHiTSDBInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateHiTSDBInstanceRequest setInstanceAlias(String instanceAlias) {
        this.instanceAlias = instanceAlias;
        return this;
    }
    public String getInstanceAlias() {
        return this.instanceAlias;
    }

    public CreateHiTSDBInstanceRequest setInstanceClass(String instanceClass) {
        this.instanceClass = instanceClass;
        return this;
    }
    public String getInstanceClass() {
        return this.instanceClass;
    }

    public CreateHiTSDBInstanceRequest setInstanceStorage(String instanceStorage) {
        this.instanceStorage = instanceStorage;
        return this;
    }
    public String getInstanceStorage() {
        return this.instanceStorage;
    }

    public CreateHiTSDBInstanceRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreateHiTSDBInstanceRequest setVPCId(String VPCId) {
        this.VPCId = VPCId;
        return this;
    }
    public String getVPCId() {
        return this.VPCId;
    }

    public CreateHiTSDBInstanceRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateHiTSDBInstanceRequest setMaxTimelineLimit(String maxTimelineLimit) {
        this.maxTimelineLimit = maxTimelineLimit;
        return this;
    }
    public String getMaxTimelineLimit() {
        return this.maxTimelineLimit;
    }

    public CreateHiTSDBInstanceRequest setInstanceTps(String instanceTps) {
        this.instanceTps = instanceTps;
        return this;
    }
    public String getInstanceTps() {
        return this.instanceTps;
    }

    public CreateHiTSDBInstanceRequest setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }
    public String getEngineType() {
        return this.engineType;
    }

    public CreateHiTSDBInstanceRequest setMaxSeriesPerDatabase(String maxSeriesPerDatabase) {
        this.maxSeriesPerDatabase = maxSeriesPerDatabase;
        return this;
    }
    public String getMaxSeriesPerDatabase() {
        return this.maxSeriesPerDatabase;
    }

    public CreateHiTSDBInstanceRequest setMaxDatabaseLimit(String maxDatabaseLimit) {
        this.maxDatabaseLimit = maxDatabaseLimit;
        return this;
    }
    public String getMaxDatabaseLimit() {
        return this.maxDatabaseLimit;
    }

    public CreateHiTSDBInstanceRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public CreateHiTSDBInstanceRequest setDuration(String duration) {
        this.duration = duration;
        return this;
    }
    public String getDuration() {
        return this.duration;
    }

    public CreateHiTSDBInstanceRequest setTSDBVersion(String TSDBVersion) {
        this.TSDBVersion = TSDBVersion;
        return this;
    }
    public String getTSDBVersion() {
        return this.TSDBVersion;
    }

    public CreateHiTSDBInstanceRequest setDiskCategory(String diskCategory) {
        this.diskCategory = diskCategory;
        return this;
    }
    public String getDiskCategory() {
        return this.diskCategory;
    }

    public CreateHiTSDBInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
