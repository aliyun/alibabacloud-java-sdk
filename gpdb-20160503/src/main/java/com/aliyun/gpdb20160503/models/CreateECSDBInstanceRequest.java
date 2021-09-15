// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateECSDBInstanceRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("EngineVersion")
    public String engineVersion;

    @NameInMap("Engine")
    public String engine;

    @NameInMap("InstanceSpec")
    public String instanceSpec;

    @NameInMap("SegNodeNum")
    public Integer segNodeNum;

    @NameInMap("SegStorageType")
    public String segStorageType;

    @NameInMap("StorageSize")
    public Integer storageSize;

    @NameInMap("DBInstanceDescription")
    public String DBInstanceDescription;

    @NameInMap("SecurityIPList")
    public String securityIPList;

    @NameInMap("PayType")
    public String payType;

    @NameInMap("Period")
    public String period;

    @NameInMap("UsedTime")
    public String usedTime;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    @NameInMap("VPCId")
    public String VPCId;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    @NameInMap("EncryptionKey")
    public String encryptionKey;

    @NameInMap("EncryptionType")
    public String encryptionType;

    @NameInMap("MasterNodeNum")
    public Integer masterNodeNum;

    @NameInMap("SrcDbInstanceName")
    public String srcDbInstanceName;

    @NameInMap("BackupId")
    public String backupId;

    public static CreateECSDBInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateECSDBInstanceRequest self = new CreateECSDBInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateECSDBInstanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateECSDBInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateECSDBInstanceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public CreateECSDBInstanceRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public CreateECSDBInstanceRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public CreateECSDBInstanceRequest setInstanceSpec(String instanceSpec) {
        this.instanceSpec = instanceSpec;
        return this;
    }
    public String getInstanceSpec() {
        return this.instanceSpec;
    }

    public CreateECSDBInstanceRequest setSegNodeNum(Integer segNodeNum) {
        this.segNodeNum = segNodeNum;
        return this;
    }
    public Integer getSegNodeNum() {
        return this.segNodeNum;
    }

    public CreateECSDBInstanceRequest setSegStorageType(String segStorageType) {
        this.segStorageType = segStorageType;
        return this;
    }
    public String getSegStorageType() {
        return this.segStorageType;
    }

    public CreateECSDBInstanceRequest setStorageSize(Integer storageSize) {
        this.storageSize = storageSize;
        return this;
    }
    public Integer getStorageSize() {
        return this.storageSize;
    }

    public CreateECSDBInstanceRequest setDBInstanceDescription(String DBInstanceDescription) {
        this.DBInstanceDescription = DBInstanceDescription;
        return this;
    }
    public String getDBInstanceDescription() {
        return this.DBInstanceDescription;
    }

    public CreateECSDBInstanceRequest setSecurityIPList(String securityIPList) {
        this.securityIPList = securityIPList;
        return this;
    }
    public String getSecurityIPList() {
        return this.securityIPList;
    }

    public CreateECSDBInstanceRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreateECSDBInstanceRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public CreateECSDBInstanceRequest setUsedTime(String usedTime) {
        this.usedTime = usedTime;
        return this;
    }
    public String getUsedTime() {
        return this.usedTime;
    }

    public CreateECSDBInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateECSDBInstanceRequest setInstanceNetworkType(String instanceNetworkType) {
        this.instanceNetworkType = instanceNetworkType;
        return this;
    }
    public String getInstanceNetworkType() {
        return this.instanceNetworkType;
    }

    public CreateECSDBInstanceRequest setVPCId(String VPCId) {
        this.VPCId = VPCId;
        return this;
    }
    public String getVPCId() {
        return this.VPCId;
    }

    public CreateECSDBInstanceRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateECSDBInstanceRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public CreateECSDBInstanceRequest setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
        return this;
    }
    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    public CreateECSDBInstanceRequest setEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
        return this;
    }
    public String getEncryptionType() {
        return this.encryptionType;
    }

    public CreateECSDBInstanceRequest setMasterNodeNum(Integer masterNodeNum) {
        this.masterNodeNum = masterNodeNum;
        return this;
    }
    public Integer getMasterNodeNum() {
        return this.masterNodeNum;
    }

    public CreateECSDBInstanceRequest setSrcDbInstanceName(String srcDbInstanceName) {
        this.srcDbInstanceName = srcDbInstanceName;
        return this;
    }
    public String getSrcDbInstanceName() {
        return this.srcDbInstanceName;
    }

    public CreateECSDBInstanceRequest setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }
    public String getBackupId() {
        return this.backupId;
    }

}
