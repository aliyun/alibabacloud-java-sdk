// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeDBClustersResponseBody extends TeaModel {
    /**
     * <p>The details of the clusters.</p>
     */
    @NameInMap("DBClusters")
    public DescribeDBClustersResponseBodyDBClusters DBClusters;

    /**
     * <p>The total number of returned pages.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page. Valid values:</p>
     * <br>
     * <p>*   **30** (default)</p>
     * <p>*   **50**</p>
     * <p>*   **100**</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries that are returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDBClustersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClustersResponseBody self = new DescribeDBClustersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClustersResponseBody setDBClusters(DescribeDBClustersResponseBodyDBClusters DBClusters) {
        this.DBClusters = DBClusters;
        return this;
    }
    public DescribeDBClustersResponseBodyDBClusters getDBClusters() {
        return this.DBClusters;
    }

    public DescribeDBClustersResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDBClustersResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDBClustersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBClustersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDBClustersResponseBodyDBClustersDBClusterScaleOutStatus extends TeaModel {
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

        public static DescribeDBClustersResponseBodyDBClustersDBClusterScaleOutStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClustersResponseBodyDBClustersDBClusterScaleOutStatus self = new DescribeDBClustersResponseBodyDBClustersDBClusterScaleOutStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDBClustersResponseBodyDBClustersDBClusterScaleOutStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeDBClustersResponseBodyDBClustersDBClusterScaleOutStatus setRatio(String ratio) {
            this.ratio = ratio;
            return this;
        }
        public String getRatio() {
            return this.ratio;
        }

    }

    public static class DescribeDBClustersResponseBodyDBClustersDBClusterTagsTag extends TeaModel {
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

        public static DescribeDBClustersResponseBodyDBClustersDBClusterTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClustersResponseBodyDBClustersDBClusterTagsTag self = new DescribeDBClustersResponseBodyDBClustersDBClusterTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeDBClustersResponseBodyDBClustersDBClusterTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDBClustersResponseBodyDBClustersDBClusterTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDBClustersResponseBodyDBClustersDBClusterTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeDBClustersResponseBodyDBClustersDBClusterTagsTag> tag;

        public static DescribeDBClustersResponseBodyDBClustersDBClusterTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClustersResponseBodyDBClustersDBClusterTags self = new DescribeDBClustersResponseBodyDBClustersDBClusterTags();
            return TeaModel.build(map, self);
        }

        public DescribeDBClustersResponseBodyDBClustersDBClusterTags setTag(java.util.List<DescribeDBClustersResponseBodyDBClustersDBClusterTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeDBClustersResponseBodyDBClustersDBClusterTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeDBClustersResponseBodyDBClustersDBCluster extends TeaModel {
        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         */
        @NameInMap("AliUid")
        public String aliUid;

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
         * <p>The version number of the backend management system of ApsaraDB for ClickHouse. Valid values:</p>
         * <br>
         * <p>*   **v1**</p>
         * <p>*   **v2**</p>
         */
        @NameInMap("ControlVersion")
        public String controlVersion;

        /**
         * <p>The time when the cluster was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format.</p>
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
         * <p>The state of the cluster. Valid values:</p>
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
         * <p>The specifications of the cluster.</p>
         * <br>
         * <p>*   Valid values when the cluster is of Single-replica Edition: -**S4**: 4 CPU cores and 16 GB of memory -**S8**: 8 CPU cores and 32 GB of memory</p>
         * <br>
         * <p>    *   **S16**: 16 CPU cores and 64 GB of memory</p>
         * <p>    *   **S32**: 32 CPU cores and 128 GB of memory</p>
         * <p>    *   **S64**: 64 CPU cores and 256 GB of memory</p>
         * <p>    *   **S104**: 104 CPU cores and 384 GB of memory</p>
         * <br>
         * <p>*   Valid values when the cluster is of Double-replica Edition: -**C4**: 4 CPU cores and 16 GB of memory -**C8**: 8 CPU cores and 32 GB of memory -**C16**: 16 CPU cores and 64 GB of memory -**C32**: 32 CPU cores and 128 GB of memory -**C64**: 64 CPU cores and 256 GB of memory -**C104**: 104 CPU cores and 384 GB of memory</p>
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
         * <p>The storage capacity of each node. Valid values: 100 to 32000. Unit: GB.</p>
         * <br>
         * <p>>  This value is a multiple of 100.</p>
         */
        @NameInMap("DBNodeStorage")
        public Long DBNodeStorage;

        /**
         * <p>The time when the cluster expired. The time is in the yyyy-MM-ddTHH:mm:ssZ format.</p>
         * <br>
         * <p>>  Pay-as-you-go clusters never expire. If the cluster is a pay-as-you-go cluster, an empty string is returned for this parameter.</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The extended storage space.</p>
         */
        @NameInMap("ExtStorageSize")
        public Integer extStorageSize;

        /**
         * <p>The extended storage type. Valid values:</p>
         * <br>
         * <p>*   **CloudSSD**: standard SSD.</p>
         * <p>*   **CloudESSD**: The cluster uses an enhanced SSD (ESSD) of performance level (PL) 1.</p>
         * <p>*   **CloudESSD_PL2**: The cluster uses an ESSD of PL 2.</p>
         * <p>*   **CloudESSD_PL3**: The cluster uses an ESSD of PL 3.</p>
         * <p>*   **CloudEfficiency**: The cluster uses an ultra disk.</p>
         */
        @NameInMap("ExtStorageType")
        public String extStorageType;

        /**
         * <p>Indicates whether the cluster has expired. Valid values:</p>
         * <br>
         * <p>*   **true**: The cluster has expired.</p>
         * <p>*   **false**: The cluster has not expired.</p>
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
         * <p>The billing method of the cluster. Valid values:</p>
         * <br>
         * <p>*   **Postpaid**: The cluster uses the pay-as-you-go billing method.</p>
         * <p>*   **Prepaid**: The cluster uses the subscription billing method.</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>The HTTP port number.</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The region ID.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group to which the cluster belongs.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The status of a data migration task.</p>
         */
        @NameInMap("ScaleOutStatus")
        public DescribeDBClustersResponseBodyDBClustersDBClusterScaleOutStatus scaleOutStatus;

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
         * <p>The tags.</p>
         */
        @NameInMap("Tags")
        public DescribeDBClustersResponseBodyDBClustersDBClusterTags tags;

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
         * <p>The ID of the virtual private cloud (VPC) in which the cluster is deployed.</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The zone ID.</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDBClustersResponseBodyDBClustersDBCluster build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClustersResponseBodyDBClustersDBCluster self = new DescribeDBClustersResponseBodyDBClustersDBCluster();
            return TeaModel.build(map, self);
        }

        public DescribeDBClustersResponseBodyDBClustersDBCluster setAliUid(String aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public String getAliUid() {
            return this.aliUid;
        }

        public DescribeDBClustersResponseBodyDBClustersDBCluster setBid(String bid) {
            this.bid = bid;
            return this;
        }
        public String getBid() {
            return this.bid;
        }

        public DescribeDBClustersResponseBodyDBClustersDBCluster setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeDBClustersResponseBodyDBClustersDBCluster setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public DescribeDBClustersResponseBodyDBClustersDBCluster setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeDBClustersResponseBodyDBClustersDBCluster setControlVersion(String controlVersion) {
            this.controlVersion = controlVersion;
            return this;
        }
        public String getControlVersion() {
            return this.controlVersion;
        }

        public DescribeDBClustersResponseBodyDBClustersDBCluster setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDBClustersResponseBodyDBClustersDBCluster setDBClusterDescription(String DBClusterDescription) {
            this.DBClusterDescription = DBClusterDescription;
            return this;
        }
        public String getDBClusterDescription() {
            return this.DBClusterDescription;
        }

        public DescribeDBClustersResponseBodyDBClustersDBCluster setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeDBClustersResponseBodyDBClustersDBCluster setDBClusterNetworkType(String DBClusterNetworkType) {
            this.DBClusterNetworkType = DBClusterNetworkType;
            return this;
        }
        public String getDBClusterNetworkType() {
            return this.DBClusterNetworkType;
        }

        public DescribeDBClustersResponseBodyDBClustersDBCluster setDBClusterStatus(String DBClusterStatus) {
            this.DBClusterStatus = DBClusterStatus;
            return this;
        }
        public String getDBClusterStatus() {
            return this.DBClusterStatus;
        }

        public DescribeDBClustersResponseBodyDBClustersDBCluster setDBNodeClass(String DBNodeClass) {
            this.DBNodeClass = DBNodeClass;
            return this;
        }
        public String getDBNodeClass() {
            return this.DBNodeClass;
        }

        public DescribeDBClustersResponseBodyDBClustersDBCluster setDBNodeCount(Long DBNodeCount) {
            this.DBNodeCount = DBNodeCount;
            return this;
        }
        public Long getDBNodeCount() {
            return this.DBNodeCount;
        }

        public DescribeDBClustersResponseBodyDBClustersDBCluster setDBNodeStorage(Long DBNodeStorage) {
            this.DBNodeStorage = DBNodeStorage;
            return this;
        }
        public Long getDBNodeStorage() {
            return this.DBNodeStorage;
        }

        public DescribeDBClustersResponseBodyDBClustersDBCluster setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDBClustersResponseBodyDBClustersDBCluster setExtStorageSize(Integer extStorageSize) {
            this.extStorageSize = extStorageSize;
            return this;
        }
        public Integer getExtStorageSize() {
            return this.extStorageSize;
        }

        public DescribeDBClustersResponseBodyDBClustersDBCluster setExtStorageType(String extStorageType) {
            this.extStorageType = extStorageType;
            return this;
        }
        public String getExtStorageType() {
            return this.extStorageType;
        }

        public DescribeDBClustersResponseBodyDBClustersDBCluster setIsExpired(String isExpired) {
            this.isExpired = isExpired;
            return this;
        }
        public String getIsExpired() {
            return this.isExpired;
        }

        public DescribeDBClustersResponseBodyDBClustersDBCluster setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public DescribeDBClustersResponseBodyDBClustersDBCluster setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

        public DescribeDBClustersResponseBodyDBClustersDBCluster setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeDBClustersResponseBodyDBClustersDBCluster setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeDBClustersResponseBodyDBClustersDBCluster setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDBClustersResponseBodyDBClustersDBCluster setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDBClustersResponseBodyDBClustersDBCluster setScaleOutStatus(DescribeDBClustersResponseBodyDBClustersDBClusterScaleOutStatus scaleOutStatus) {
            this.scaleOutStatus = scaleOutStatus;
            return this;
        }
        public DescribeDBClustersResponseBodyDBClustersDBClusterScaleOutStatus getScaleOutStatus() {
            return this.scaleOutStatus;
        }

        public DescribeDBClustersResponseBodyDBClustersDBCluster setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public DescribeDBClustersResponseBodyDBClustersDBCluster setTags(DescribeDBClustersResponseBodyDBClustersDBClusterTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeDBClustersResponseBodyDBClustersDBClusterTags getTags() {
            return this.tags;
        }

        public DescribeDBClustersResponseBodyDBClustersDBCluster setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeDBClustersResponseBodyDBClustersDBCluster setVpcCloudInstanceId(String vpcCloudInstanceId) {
            this.vpcCloudInstanceId = vpcCloudInstanceId;
            return this;
        }
        public String getVpcCloudInstanceId() {
            return this.vpcCloudInstanceId;
        }

        public DescribeDBClustersResponseBodyDBClustersDBCluster setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeDBClustersResponseBodyDBClustersDBCluster setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeDBClustersResponseBodyDBClusters extends TeaModel {
        @NameInMap("DBCluster")
        public java.util.List<DescribeDBClustersResponseBodyDBClustersDBCluster> DBCluster;

        public static DescribeDBClustersResponseBodyDBClusters build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClustersResponseBodyDBClusters self = new DescribeDBClustersResponseBodyDBClusters();
            return TeaModel.build(map, self);
        }

        public DescribeDBClustersResponseBodyDBClusters setDBCluster(java.util.List<DescribeDBClustersResponseBodyDBClustersDBCluster> DBCluster) {
            this.DBCluster = DBCluster;
            return this;
        }
        public java.util.List<DescribeDBClustersResponseBodyDBClustersDBCluster> getDBCluster() {
            return this.DBCluster;
        }

    }

}
