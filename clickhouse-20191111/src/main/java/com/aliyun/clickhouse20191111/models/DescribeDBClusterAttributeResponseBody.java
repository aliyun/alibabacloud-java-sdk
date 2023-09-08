// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeDBClusterAttributeResponseBody extends TeaModel {
    @NameInMap("DBCluster")
    public DescribeDBClusterAttributeResponseBodyDBCluster DBCluster;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBClusterAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterAttributeResponseBody self = new DescribeDBClusterAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterAttributeResponseBody setDBCluster(DescribeDBClusterAttributeResponseBodyDBCluster DBCluster) {
        this.DBCluster = DBCluster;
        return this;
    }
    public DescribeDBClusterAttributeResponseBodyDBCluster getDBCluster() {
        return this.DBCluster;
    }

    public DescribeDBClusterAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBClusterAttributeResponseBodyDBClusterScaleOutStatus extends TeaModel {
        @NameInMap("Progress")
        public String progress;

        @NameInMap("Ratio")
        public String ratio;

        public static DescribeDBClusterAttributeResponseBodyDBClusterScaleOutStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterAttributeResponseBodyDBClusterScaleOutStatus self = new DescribeDBClusterAttributeResponseBodyDBClusterScaleOutStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterAttributeResponseBodyDBClusterScaleOutStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeDBClusterAttributeResponseBodyDBClusterScaleOutStatus setRatio(String ratio) {
            this.ratio = ratio;
            return this;
        }
        public String getRatio() {
            return this.ratio;
        }

    }

    public static class DescribeDBClusterAttributeResponseBodyDBClusterTagsTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeDBClusterAttributeResponseBodyDBClusterTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterAttributeResponseBodyDBClusterTagsTag self = new DescribeDBClusterAttributeResponseBodyDBClusterTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterAttributeResponseBodyDBClusterTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDBClusterAttributeResponseBodyDBClusterTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDBClusterAttributeResponseBodyDBClusterTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeDBClusterAttributeResponseBodyDBClusterTagsTag> tag;

        public static DescribeDBClusterAttributeResponseBodyDBClusterTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterAttributeResponseBodyDBClusterTags self = new DescribeDBClusterAttributeResponseBodyDBClusterTags();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterAttributeResponseBodyDBClusterTags setTag(java.util.List<DescribeDBClusterAttributeResponseBodyDBClusterTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeDBClusterAttributeResponseBodyDBClusterTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeDBClusterAttributeResponseBodyDBCluster extends TeaModel {
        @NameInMap("AliUid")
        public String aliUid;

        @NameInMap("AppointmentRestartTime")
        public String appointmentRestartTime;

        @NameInMap("Bid")
        public String bid;

        @NameInMap("Category")
        public String category;

        @NameInMap("CommodityCode")
        public String commodityCode;

        @NameInMap("ConnectionString")
        public String connectionString;

        @NameInMap("ControlVersion")
        public String controlVersion;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DBClusterDescription")
        public String DBClusterDescription;

        @NameInMap("DBClusterId")
        public String DBClusterId;

        @NameInMap("DBClusterNetworkType")
        public String DBClusterNetworkType;

        @NameInMap("DBClusterStatus")
        public String DBClusterStatus;

        @NameInMap("DBClusterType")
        public String DBClusterType;

        @NameInMap("DBNodeClass")
        public String DBNodeClass;

        @NameInMap("DBNodeCount")
        public Long DBNodeCount;

        @NameInMap("DBNodeStorage")
        public Long DBNodeStorage;

        @NameInMap("EncryptionKey")
        public String encryptionKey;

        @NameInMap("EncryptionType")
        public String encryptionType;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("EngineLatestMinorVersion")
        public String engineLatestMinorVersion;

        @NameInMap("EngineMinorVersion")
        public String engineMinorVersion;

        @NameInMap("EngineVersion")
        public String engineVersion;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("ExtStorageSize")
        public Integer extStorageSize;

        @NameInMap("ExtStorageType")
        public String extStorageType;

        @NameInMap("IsExpired")
        public String isExpired;

        @NameInMap("LockMode")
        public String lockMode;

        @NameInMap("LockReason")
        public String lockReason;

        @NameInMap("MaintainAutoType")
        public Boolean maintainAutoType;

        @NameInMap("MaintainTime")
        public String maintainTime;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("PublicConnectionString")
        public String publicConnectionString;

        @NameInMap("PublicIpAddr")
        public String publicIpAddr;

        @NameInMap("PublicPort")
        public String publicPort;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("ScaleOutStatus")
        public DescribeDBClusterAttributeResponseBodyDBClusterScaleOutStatus scaleOutStatus;

        @NameInMap("StorageType")
        public String storageType;

        @NameInMap("SupportBackup")
        public Integer supportBackup;

        @NameInMap("SupportHttpsPort")
        public Boolean supportHttpsPort;

        @NameInMap("SupportMysqlPort")
        public Boolean supportMysqlPort;

        @NameInMap("SupportOss")
        public Integer supportOss;

        @NameInMap("Tags")
        public DescribeDBClusterAttributeResponseBodyDBClusterTags tags;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("VpcCloudInstanceId")
        public String vpcCloudInstanceId;

        /**
         * <p>VPC ID。</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VpcIpAddr")
        public String vpcIpAddr;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("ZookeeperClass")
        public String zookeeperClass;

        public static DescribeDBClusterAttributeResponseBodyDBCluster build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterAttributeResponseBodyDBCluster self = new DescribeDBClusterAttributeResponseBodyDBCluster();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setAliUid(String aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public String getAliUid() {
            return this.aliUid;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setAppointmentRestartTime(String appointmentRestartTime) {
            this.appointmentRestartTime = appointmentRestartTime;
            return this;
        }
        public String getAppointmentRestartTime() {
            return this.appointmentRestartTime;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setBid(String bid) {
            this.bid = bid;
            return this;
        }
        public String getBid() {
            return this.bid;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setControlVersion(String controlVersion) {
            this.controlVersion = controlVersion;
            return this;
        }
        public String getControlVersion() {
            return this.controlVersion;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setDBClusterDescription(String DBClusterDescription) {
            this.DBClusterDescription = DBClusterDescription;
            return this;
        }
        public String getDBClusterDescription() {
            return this.DBClusterDescription;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setDBClusterNetworkType(String DBClusterNetworkType) {
            this.DBClusterNetworkType = DBClusterNetworkType;
            return this;
        }
        public String getDBClusterNetworkType() {
            return this.DBClusterNetworkType;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setDBClusterStatus(String DBClusterStatus) {
            this.DBClusterStatus = DBClusterStatus;
            return this;
        }
        public String getDBClusterStatus() {
            return this.DBClusterStatus;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setDBClusterType(String DBClusterType) {
            this.DBClusterType = DBClusterType;
            return this;
        }
        public String getDBClusterType() {
            return this.DBClusterType;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setDBNodeClass(String DBNodeClass) {
            this.DBNodeClass = DBNodeClass;
            return this;
        }
        public String getDBNodeClass() {
            return this.DBNodeClass;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setDBNodeCount(Long DBNodeCount) {
            this.DBNodeCount = DBNodeCount;
            return this;
        }
        public Long getDBNodeCount() {
            return this.DBNodeCount;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setDBNodeStorage(Long DBNodeStorage) {
            this.DBNodeStorage = DBNodeStorage;
            return this;
        }
        public Long getDBNodeStorage() {
            return this.DBNodeStorage;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setEncryptionKey(String encryptionKey) {
            this.encryptionKey = encryptionKey;
            return this;
        }
        public String getEncryptionKey() {
            return this.encryptionKey;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setEncryptionType(String encryptionType) {
            this.encryptionType = encryptionType;
            return this;
        }
        public String getEncryptionType() {
            return this.encryptionType;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setEngineLatestMinorVersion(String engineLatestMinorVersion) {
            this.engineLatestMinorVersion = engineLatestMinorVersion;
            return this;
        }
        public String getEngineLatestMinorVersion() {
            return this.engineLatestMinorVersion;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setEngineMinorVersion(String engineMinorVersion) {
            this.engineMinorVersion = engineMinorVersion;
            return this;
        }
        public String getEngineMinorVersion() {
            return this.engineMinorVersion;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setExtStorageSize(Integer extStorageSize) {
            this.extStorageSize = extStorageSize;
            return this;
        }
        public Integer getExtStorageSize() {
            return this.extStorageSize;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setExtStorageType(String extStorageType) {
            this.extStorageType = extStorageType;
            return this;
        }
        public String getExtStorageType() {
            return this.extStorageType;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setIsExpired(String isExpired) {
            this.isExpired = isExpired;
            return this;
        }
        public String getIsExpired() {
            return this.isExpired;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setMaintainAutoType(Boolean maintainAutoType) {
            this.maintainAutoType = maintainAutoType;
            return this;
        }
        public Boolean getMaintainAutoType() {
            return this.maintainAutoType;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setMaintainTime(String maintainTime) {
            this.maintainTime = maintainTime;
            return this;
        }
        public String getMaintainTime() {
            return this.maintainTime;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setPublicConnectionString(String publicConnectionString) {
            this.publicConnectionString = publicConnectionString;
            return this;
        }
        public String getPublicConnectionString() {
            return this.publicConnectionString;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setPublicIpAddr(String publicIpAddr) {
            this.publicIpAddr = publicIpAddr;
            return this;
        }
        public String getPublicIpAddr() {
            return this.publicIpAddr;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setPublicPort(String publicPort) {
            this.publicPort = publicPort;
            return this;
        }
        public String getPublicPort() {
            return this.publicPort;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setScaleOutStatus(DescribeDBClusterAttributeResponseBodyDBClusterScaleOutStatus scaleOutStatus) {
            this.scaleOutStatus = scaleOutStatus;
            return this;
        }
        public DescribeDBClusterAttributeResponseBodyDBClusterScaleOutStatus getScaleOutStatus() {
            return this.scaleOutStatus;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setSupportBackup(Integer supportBackup) {
            this.supportBackup = supportBackup;
            return this;
        }
        public Integer getSupportBackup() {
            return this.supportBackup;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setSupportHttpsPort(Boolean supportHttpsPort) {
            this.supportHttpsPort = supportHttpsPort;
            return this;
        }
        public Boolean getSupportHttpsPort() {
            return this.supportHttpsPort;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setSupportMysqlPort(Boolean supportMysqlPort) {
            this.supportMysqlPort = supportMysqlPort;
            return this;
        }
        public Boolean getSupportMysqlPort() {
            return this.supportMysqlPort;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setSupportOss(Integer supportOss) {
            this.supportOss = supportOss;
            return this;
        }
        public Integer getSupportOss() {
            return this.supportOss;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setTags(DescribeDBClusterAttributeResponseBodyDBClusterTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeDBClusterAttributeResponseBodyDBClusterTags getTags() {
            return this.tags;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setVpcCloudInstanceId(String vpcCloudInstanceId) {
            this.vpcCloudInstanceId = vpcCloudInstanceId;
            return this;
        }
        public String getVpcCloudInstanceId() {
            return this.vpcCloudInstanceId;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setVpcIpAddr(String vpcIpAddr) {
            this.vpcIpAddr = vpcIpAddr;
            return this;
        }
        public String getVpcIpAddr() {
            return this.vpcIpAddr;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setZookeeperClass(String zookeeperClass) {
            this.zookeeperClass = zookeeperClass;
            return this;
        }
        public String getZookeeperClass() {
            return this.zookeeperClass;
        }

    }

}
