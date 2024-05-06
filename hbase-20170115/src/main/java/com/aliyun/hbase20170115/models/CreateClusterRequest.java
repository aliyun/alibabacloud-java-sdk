// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class CreateClusterRequest extends TeaModel {
    @NameInMap("AutoRenew")
    public String autoRenew;

    @NameInMap("BackupId")
    public String backupId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("CloudType")
    public String cloudType;

    @NameInMap("ClusterName")
    public String clusterName;

    @NameInMap("ColdStorageSize")
    public String coldStorageSize;

    @NameInMap("CoreDiskQuantity")
    public String coreDiskQuantity;

    @NameInMap("CoreDiskSize")
    public String coreDiskSize;

    @NameInMap("CoreDiskType")
    public String coreDiskType;

    @NameInMap("CoreInstanceQuantity")
    public String coreInstanceQuantity;

    @NameInMap("CoreInstanceType")
    public String coreInstanceType;

    @NameInMap("DbInstanceConnType")
    public String dbInstanceConnType;

    @NameInMap("DbInstanceType")
    public String dbInstanceType;

    @NameInMap("DbType")
    public String dbType;

    @NameInMap("DepMode")
    public String depMode;

    @NameInMap("Duration")
    public String duration;

    @NameInMap("Engine")
    public String engine;

    @NameInMap("EngineVersion")
    public String engineVersion;

    @NameInMap("IsColdStorage")
    public String isColdStorage;

    @NameInMap("MasterInstanceType")
    public String masterInstanceType;

    @NameInMap("NetType")
    public String netType;

    @NameInMap("PayType")
    public String payType;

    @NameInMap("PricingCycle")
    public String pricingCycle;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RestoreTime")
    public String restoreTime;

    @NameInMap("SecurityIPList")
    public String securityIPList;

    @NameInMap("SrcDBInstanceId")
    public String srcDBInstanceId;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterRequest self = new CreateClusterRequest();
        return TeaModel.build(map, self);
    }

    public CreateClusterRequest setAutoRenew(String autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public String getAutoRenew() {
        return this.autoRenew;
    }

    public CreateClusterRequest setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }
    public String getBackupId() {
        return this.backupId;
    }

    public CreateClusterRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateClusterRequest setCloudType(String cloudType) {
        this.cloudType = cloudType;
        return this;
    }
    public String getCloudType() {
        return this.cloudType;
    }

    public CreateClusterRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public CreateClusterRequest setColdStorageSize(String coldStorageSize) {
        this.coldStorageSize = coldStorageSize;
        return this;
    }
    public String getColdStorageSize() {
        return this.coldStorageSize;
    }

    public CreateClusterRequest setCoreDiskQuantity(String coreDiskQuantity) {
        this.coreDiskQuantity = coreDiskQuantity;
        return this;
    }
    public String getCoreDiskQuantity() {
        return this.coreDiskQuantity;
    }

    public CreateClusterRequest setCoreDiskSize(String coreDiskSize) {
        this.coreDiskSize = coreDiskSize;
        return this;
    }
    public String getCoreDiskSize() {
        return this.coreDiskSize;
    }

    public CreateClusterRequest setCoreDiskType(String coreDiskType) {
        this.coreDiskType = coreDiskType;
        return this;
    }
    public String getCoreDiskType() {
        return this.coreDiskType;
    }

    public CreateClusterRequest setCoreInstanceQuantity(String coreInstanceQuantity) {
        this.coreInstanceQuantity = coreInstanceQuantity;
        return this;
    }
    public String getCoreInstanceQuantity() {
        return this.coreInstanceQuantity;
    }

    public CreateClusterRequest setCoreInstanceType(String coreInstanceType) {
        this.coreInstanceType = coreInstanceType;
        return this;
    }
    public String getCoreInstanceType() {
        return this.coreInstanceType;
    }

    public CreateClusterRequest setDbInstanceConnType(String dbInstanceConnType) {
        this.dbInstanceConnType = dbInstanceConnType;
        return this;
    }
    public String getDbInstanceConnType() {
        return this.dbInstanceConnType;
    }

    public CreateClusterRequest setDbInstanceType(String dbInstanceType) {
        this.dbInstanceType = dbInstanceType;
        return this;
    }
    public String getDbInstanceType() {
        return this.dbInstanceType;
    }

    public CreateClusterRequest setDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }
    public String getDbType() {
        return this.dbType;
    }

    public CreateClusterRequest setDepMode(String depMode) {
        this.depMode = depMode;
        return this;
    }
    public String getDepMode() {
        return this.depMode;
    }

    public CreateClusterRequest setDuration(String duration) {
        this.duration = duration;
        return this;
    }
    public String getDuration() {
        return this.duration;
    }

    public CreateClusterRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public CreateClusterRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public CreateClusterRequest setIsColdStorage(String isColdStorage) {
        this.isColdStorage = isColdStorage;
        return this;
    }
    public String getIsColdStorage() {
        return this.isColdStorage;
    }

    public CreateClusterRequest setMasterInstanceType(String masterInstanceType) {
        this.masterInstanceType = masterInstanceType;
        return this;
    }
    public String getMasterInstanceType() {
        return this.masterInstanceType;
    }

    public CreateClusterRequest setNetType(String netType) {
        this.netType = netType;
        return this;
    }
    public String getNetType() {
        return this.netType;
    }

    public CreateClusterRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreateClusterRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public CreateClusterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateClusterRequest setRestoreTime(String restoreTime) {
        this.restoreTime = restoreTime;
        return this;
    }
    public String getRestoreTime() {
        return this.restoreTime;
    }

    public CreateClusterRequest setSecurityIPList(String securityIPList) {
        this.securityIPList = securityIPList;
        return this;
    }
    public String getSecurityIPList() {
        return this.securityIPList;
    }

    public CreateClusterRequest setSrcDBInstanceId(String srcDBInstanceId) {
        this.srcDBInstanceId = srcDBInstanceId;
        return this;
    }
    public String getSrcDBInstanceId() {
        return this.srcDBInstanceId;
    }

    public CreateClusterRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateClusterRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateClusterRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
