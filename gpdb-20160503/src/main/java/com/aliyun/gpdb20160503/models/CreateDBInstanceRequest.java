// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateDBInstanceRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DBInstanceCategory")
    public String DBInstanceCategory;

    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    @NameInMap("DBInstanceDescription")
    public String DBInstanceDescription;

    @NameInMap("DBInstanceGroupCount")
    public String DBInstanceGroupCount;

    @NameInMap("DBInstanceMode")
    public String DBInstanceMode;

    @NameInMap("Engine")
    public String engine;

    @NameInMap("EngineVersion")
    public String engineVersion;

    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    @NameInMap("InstanceSpec")
    public String instanceSpec;

    @NameInMap("MasterNodeNum")
    public String masterNodeNum;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PayType")
    public String payType;

    @NameInMap("Period")
    public String period;

    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SecurityIPList")
    public String securityIPList;

    @NameInMap("SegNodeNum")
    public String segNodeNum;

    @NameInMap("SegStorageType")
    public String segStorageType;

    @NameInMap("StorageSize")
    public Long storageSize;

    @NameInMap("StorageType")
    public String storageType;

    @NameInMap("UsedTime")
    public String usedTime;

    @NameInMap("VPCId")
    public String VPCId;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateDBInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDBInstanceRequest self = new CreateDBInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateDBInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDBInstanceRequest setDBInstanceCategory(String DBInstanceCategory) {
        this.DBInstanceCategory = DBInstanceCategory;
        return this;
    }
    public String getDBInstanceCategory() {
        return this.DBInstanceCategory;
    }

    public CreateDBInstanceRequest setDBInstanceClass(String DBInstanceClass) {
        this.DBInstanceClass = DBInstanceClass;
        return this;
    }
    public String getDBInstanceClass() {
        return this.DBInstanceClass;
    }

    public CreateDBInstanceRequest setDBInstanceDescription(String DBInstanceDescription) {
        this.DBInstanceDescription = DBInstanceDescription;
        return this;
    }
    public String getDBInstanceDescription() {
        return this.DBInstanceDescription;
    }

    public CreateDBInstanceRequest setDBInstanceGroupCount(String DBInstanceGroupCount) {
        this.DBInstanceGroupCount = DBInstanceGroupCount;
        return this;
    }
    public String getDBInstanceGroupCount() {
        return this.DBInstanceGroupCount;
    }

    public CreateDBInstanceRequest setDBInstanceMode(String DBInstanceMode) {
        this.DBInstanceMode = DBInstanceMode;
        return this;
    }
    public String getDBInstanceMode() {
        return this.DBInstanceMode;
    }

    public CreateDBInstanceRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public CreateDBInstanceRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public CreateDBInstanceRequest setInstanceNetworkType(String instanceNetworkType) {
        this.instanceNetworkType = instanceNetworkType;
        return this;
    }
    public String getInstanceNetworkType() {
        return this.instanceNetworkType;
    }

    public CreateDBInstanceRequest setInstanceSpec(String instanceSpec) {
        this.instanceSpec = instanceSpec;
        return this;
    }
    public String getInstanceSpec() {
        return this.instanceSpec;
    }

    public CreateDBInstanceRequest setMasterNodeNum(String masterNodeNum) {
        this.masterNodeNum = masterNodeNum;
        return this;
    }
    public String getMasterNodeNum() {
        return this.masterNodeNum;
    }

    public CreateDBInstanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateDBInstanceRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreateDBInstanceRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public CreateDBInstanceRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public CreateDBInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDBInstanceRequest setSecurityIPList(String securityIPList) {
        this.securityIPList = securityIPList;
        return this;
    }
    public String getSecurityIPList() {
        return this.securityIPList;
    }

    public CreateDBInstanceRequest setSegNodeNum(String segNodeNum) {
        this.segNodeNum = segNodeNum;
        return this;
    }
    public String getSegNodeNum() {
        return this.segNodeNum;
    }

    public CreateDBInstanceRequest setSegStorageType(String segStorageType) {
        this.segStorageType = segStorageType;
        return this;
    }
    public String getSegStorageType() {
        return this.segStorageType;
    }

    public CreateDBInstanceRequest setStorageSize(Long storageSize) {
        this.storageSize = storageSize;
        return this;
    }
    public Long getStorageSize() {
        return this.storageSize;
    }

    public CreateDBInstanceRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

    public CreateDBInstanceRequest setUsedTime(String usedTime) {
        this.usedTime = usedTime;
        return this;
    }
    public String getUsedTime() {
        return this.usedTime;
    }

    public CreateDBInstanceRequest setVPCId(String VPCId) {
        this.VPCId = VPCId;
        return this;
    }
    public String getVPCId() {
        return this.VPCId;
    }

    public CreateDBInstanceRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateDBInstanceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
