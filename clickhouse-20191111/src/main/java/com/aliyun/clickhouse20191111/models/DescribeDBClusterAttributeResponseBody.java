// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeDBClusterAttributeResponseBody extends TeaModel {
    /**
     * <p>The information about the cluster.</p>
     */
    @NameInMap("DBCluster")
    public DescribeDBClusterAttributeResponseBodyDBCluster DBCluster;

    /**
     * <p>The request ID.</p>
     */
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
        /**
         * <p>The progress of the data migration task in percentage.</p>
         * <br>
         * <p>>  This parameter is returned only when the cluster is in the SCALING_OUT state.</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The progress of the data migration task. This value is displayed in the following format: Data volume that has been migrated/Total data volume.</p>
         * <br>
         * <p>>  This parameter is returned only when the cluster is in the SCALING_OUT state.</p>
         */
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
        /**
         * <p>The tag name.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         */
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
        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         */
        @NameInMap("AliUid")
        public String aliUid;

        @NameInMap("AppointmentRestartTime")
        public String appointmentRestartTime;

        /**
         * <p>The site ID. Valid values:</p>
         * <br>
         * <p>*   **26842**: the China site (aliyun.com)</p>
         * <p>*   **26888**: the international site (alibabacloud.com)</p>
         */
        @NameInMap("Bid")
        public String bid;

        /**
         * <p>The edition of the cluster. Valid values:</p>
         * <br>
         * <p>*   **Basic**: Single-replica Edition</p>
         * <p>*   **HighAvailability**: Double-replica Edition</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The commodity code of the cluster.</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <p>The VPC endpoint of the cluster.</p>
         */
        @NameInMap("ConnectionString")
        public String connectionString;

        /**
         * <p>The version of the ApsaraDB for ClickHouse console that is used to manage the cluster. Valid values:</p>
         * <br>
         * <p>*   **v1**</p>
         * <p>*   **v2**</p>
         */
        @NameInMap("ControlVersion")
        public String controlVersion;

        /**
         * <p>The time when the cluster was created. The value is in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the cluster.</p>
         */
        @NameInMap("DBClusterDescription")
        public String DBClusterDescription;

        /**
         * <p>The cluster ID.</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <p>The network type of the cluster. Only VPC is supported.</p>
         */
        @NameInMap("DBClusterNetworkType")
        public String DBClusterNetworkType;

        /**
         * <p>The cluster state. Valid values:</p>
         * <br>
         * <p>*   **Preparing**: The cluster is being prepared.</p>
         * <p>*   **Creating**: The cluster is being created.</p>
         * <p>*   **Running**: The cluster is running.</p>
         * <p>*   **Deleting**: The cluster is being deleted.</p>
         * <p>*   **SCALING_OUT**: The storage capacity of the cluster is being expanded.</p>
         */
        @NameInMap("DBClusterStatus")
        public String DBClusterStatus;

        /**
         * <p>The type of the cluster. Valid values:</p>
         * <br>
         * <p>*   **Common**: a common cluster</p>
         * <p>*   **Readonly**: a read-only cluster</p>
         * <p>*   **Guard**: a disaster recovery cluster</p>
         */
        @NameInMap("DBClusterType")
        public String DBClusterType;

        /**
         * <p>The specifications of the cluster.</p>
         * <br>
         * <p>*   Valid values when the cluster is of Single-replica Edition:</p>
         * <br>
         * <p>    *   **S4-NEW**</p>
         * <p>    *   **S8**</p>
         * <p>    *   **S16**</p>
         * <p>    *   **S32**</p>
         * <p>    *   **S64**</p>
         * <p>    *   **S104**</p>
         * <br>
         * <p>*   Valid values when the cluster is of Double-replica Edition:</p>
         * <br>
         * <p>    *   **C4-NEW**</p>
         * <p>    *   **C8**</p>
         * <p>    *   **C16**</p>
         * <p>    *   **C32**</p>
         * <p>    *   **C64**</p>
         * <p>    *   **C104**</p>
         */
        @NameInMap("DBNodeClass")
        public String DBNodeClass;

        /**
         * <p>The number of nodes.</p>
         * <br>
         * <p>*   Valid values when the cluster is of Single-replica Edition: 1 to 48.</p>
         * <p>*   Valid values when the cluster is of Double-replica Edition: 1 to 24.</p>
         */
        @NameInMap("DBNodeCount")
        public Long DBNodeCount;

        /**
         * <p>The storage capacity of a single node of the cluster. Unit: GB.</p>
         * <br>
         * <p>Valid values: 100 to 32000.</p>
         * <br>
         * <p>>  This value is a multiple of 100.</p>
         */
        @NameInMap("DBNodeStorage")
        public Long DBNodeStorage;

        /**
         * <p>The Key Management Service (KMS) key that is used to encrypt data.</p>
         * <br>
         * <p>>  If the value of the EncryptionType parameter is off, an empty string is returned for this parameter.</p>
         */
        @NameInMap("EncryptionKey")
        public String encryptionKey;

        /**
         * <p>The encryption type. Valid values:</p>
         * <br>
         * <p>*   **CloudDisk**: Disk encryption is enabled.</p>
         * <p>*   **off**: Data is not encrypted.</p>
         */
        @NameInMap("EncryptionType")
        public String encryptionType;

        /**
         * <p>The type of the database engine.</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The latest minor version to which the cluster can be updated.</p>
         */
        @NameInMap("EngineLatestMinorVersion")
        public String engineLatestMinorVersion;

        /**
         * <p>The current minor version.</p>
         */
        @NameInMap("EngineMinorVersion")
        public String engineMinorVersion;

        /**
         * <p>The engine version.</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

        /**
         * <p>The time when the cluster expired. The time is in the yyyy-MM-ddTHH:mm:ssZ format.</p>
         * <br>
         * <p>>  Pay-as-you-go clusters never expire. If the cluster is a pay-as-you-go cluster, an empty string is returned for this parameter.</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("ExtStorageSize")
        public Integer extStorageSize;

        @NameInMap("ExtStorageType")
        public String extStorageType;

        /**
         * <p>Indicates whether the cluster has expired. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("IsExpired")
        public String isExpired;

        /**
         * <p>The lock mode of the cluster. Valid values:</p>
         * <br>
         * <p>*   **Unlock**: The cluster is not locked.</p>
         * <p>*   **ManualLock**: The cluster is manually locked.</p>
         * <p>*   **LockByExpiration**: The cluster is automatically locked due to cluster expiration.</p>
         * <p>*   **LockByRestoration**: The cluster is automatically locked because the cluster is about to be rolled back.</p>
         * <p>*   **LockByDiskQuota**: The cluster is automatically locked because the disk space is exhausted.</p>
         */
        @NameInMap("LockMode")
        public String lockMode;

        /**
         * <p>The cause why the cluster was locked.</p>
         * <br>
         * <p>>  If the value of the LockMode parameter is Unlock, an empty string is returned for this parameter.</p>
         */
        @NameInMap("LockReason")
        public String lockReason;

        /**
         * <p>The update type. If the value of the parameter is **false**, it indicates a manual update.</p>
         */
        @NameInMap("MaintainAutoType")
        public Boolean maintainAutoType;

        /**
         * <p>The maintenance window of the cluster. The value is in the HH:mmZ-HH:mmZ format. The time is displayed in UTC.</p>
         * <br>
         * <p>For example, if you set the maintenance window to 00:00Z-01:00Z, the cluster can be maintained from 08:00 (UTC+8) to 09:00 (UTC+8).</p>
         */
        @NameInMap("MaintainTime")
        public String maintainTime;

        /**
         * <p>The billing method of the cluster. Valid values:</p>
         * <br>
         * <p>*   **Postpaid**: indicates the pay-as-you-go billing method.</p>
         * <p>*   **Prepaid**: indicates the subscription billing method.</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>The HTTP port number.</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The public endpoint.</p>
         */
        @NameInMap("PublicConnectionString")
        public String publicConnectionString;

        /**
         * <p>The IP address that is used to connect to the cluster over the Internet.</p>
         */
        @NameInMap("PublicIpAddr")
        public String publicIpAddr;

        /**
         * <p>The TCP port number in the public endpoint.</p>
         */
        @NameInMap("PublicPort")
        public String publicPort;

        /**
         * <p>The region ID.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The status of the data migration task.</p>
         */
        @NameInMap("ScaleOutStatus")
        public DescribeDBClusterAttributeResponseBodyDBClusterScaleOutStatus scaleOutStatus;

        /**
         * <p>The storage type of the cluster. Valid values:</p>
         * <br>
         * <p>*   **CloudESSD**: The cluster uses an enhanced SSD (ESSD) of performance level (PL) 1.</p>
         * <p>*   **CloudESSD_PL2**: The cluster uses an ESSD of PL 2.</p>
         * <p>*   **CloudESSD_PL3**: The cluster uses an ESSD of PL 3.</p>
         * <p>*   **CloudEfficiency**: The cluster uses an ultra disk.</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        /**
         * <p>Indicates whether data backup is supported. Valid values:</p>
         * <br>
         * <p>*   **1**: Data backup is supported.</p>
         * <p>*   **2**: Data backup is not supported.</p>
         */
        @NameInMap("SupportBackup")
        public Integer supportBackup;

        /**
         * <p>Indicates whether the cluster supports an HTTP port. Valid values:</p>
         * <br>
         * <p>*   **true**: An HTTP port is supported.</p>
         * <p>*   **false**: An HTTP port is not supported.</p>
         */
        @NameInMap("SupportHttpsPort")
        public Boolean supportHttpsPort;

        /**
         * <p>Indicates whether the cluster supports a MySQL port. Valid values:</p>
         * <br>
         * <p>*   **true**: A MySQL port is supported.</p>
         * <p>*   **false**: A MySQL port is not supported.</p>
         */
        @NameInMap("SupportMysqlPort")
        public Boolean supportMysqlPort;

        /**
         * <p>Indicates whether tiered storage of hot data and cold data is supported. Valid values:</p>
         * <br>
         * <p>*   **1**: Tiered storage of hot data and cold data is supported.</p>
         * <p>*   **2**: Tiered storage of hot data and cold data is not supported.</p>
         */
        @NameInMap("SupportOss")
        public Integer supportOss;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("Tags")
        public DescribeDBClusterAttributeResponseBodyDBClusterTags tags;

        /**
         * <p>The vSwitch ID.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the VPC in which the cluster is deployed.</p>
         */
        @NameInMap("VpcCloudInstanceId")
        public String vpcCloudInstanceId;

        /**
         * <p>The virtual private cloud (VPC) ID.</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The IP address that is used to connect to the cluster over the VPC.</p>
         */
        @NameInMap("VpcIpAddr")
        public String vpcIpAddr;

        /**
         * <p>The zone ID.</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("ZoneIdVswitchMap")
        public java.util.Map<String, ?> zoneIdVswitchMap;

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

        public DescribeDBClusterAttributeResponseBodyDBCluster setZoneIdVswitchMap(java.util.Map<String, ?> zoneIdVswitchMap) {
            this.zoneIdVswitchMap = zoneIdVswitchMap;
            return this;
        }
        public java.util.Map<String, ?> getZoneIdVswitchMap() {
            return this.zoneIdVswitchMap;
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
