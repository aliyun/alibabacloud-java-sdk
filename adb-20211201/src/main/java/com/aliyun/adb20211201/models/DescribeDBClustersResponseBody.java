// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeDBClustersResponseBody extends TeaModel {
    /**
     * <p>The queried clusters.</p>
     */
    @NameInMap("Items")
    public DescribeDBClustersResponseBodyItems items;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A5EDBA27-AF3E-5966-9503-FD1557E19167</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDBClustersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClustersResponseBody self = new DescribeDBClustersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClustersResponseBody setItems(DescribeDBClustersResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeDBClustersResponseBodyItems getItems() {
        return this.items;
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

    public static class DescribeDBClustersResponseBodyItemsDBClusterTagsTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/179253.html">TagResources</a> operation to add tags to a cluster.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>tag1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>test1</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDBClustersResponseBodyItemsDBClusterTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClustersResponseBodyItemsDBClusterTagsTag self = new DescribeDBClustersResponseBodyItemsDBClusterTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeDBClustersResponseBodyItemsDBClusterTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDBClustersResponseBodyItemsDBClusterTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDBClustersResponseBodyItemsDBClusterTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeDBClustersResponseBodyItemsDBClusterTagsTag> tag;

        public static DescribeDBClustersResponseBodyItemsDBClusterTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClustersResponseBodyItemsDBClusterTags self = new DescribeDBClustersResponseBodyItemsDBClusterTags();
            return TeaModel.build(map, self);
        }

        public DescribeDBClustersResponseBodyItemsDBClusterTags setTag(java.util.List<DescribeDBClustersResponseBodyItemsDBClusterTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeDBClustersResponseBodyItemsDBClusterTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeDBClustersResponseBodyItemsDBClusterTaskInfoStepListStepList extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("StepDesc")
        public String stepDesc;

        @NameInMap("StepName")
        public String stepName;

        @NameInMap("StepProgress")
        public String stepProgress;

        @NameInMap("StepStatus")
        public String stepStatus;

        public static DescribeDBClustersResponseBodyItemsDBClusterTaskInfoStepListStepList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClustersResponseBodyItemsDBClusterTaskInfoStepListStepList self = new DescribeDBClustersResponseBodyItemsDBClusterTaskInfoStepListStepList();
            return TeaModel.build(map, self);
        }

        public DescribeDBClustersResponseBodyItemsDBClusterTaskInfoStepListStepList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeDBClustersResponseBodyItemsDBClusterTaskInfoStepListStepList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeDBClustersResponseBodyItemsDBClusterTaskInfoStepListStepList setStepDesc(String stepDesc) {
            this.stepDesc = stepDesc;
            return this;
        }
        public String getStepDesc() {
            return this.stepDesc;
        }

        public DescribeDBClustersResponseBodyItemsDBClusterTaskInfoStepListStepList setStepName(String stepName) {
            this.stepName = stepName;
            return this;
        }
        public String getStepName() {
            return this.stepName;
        }

        public DescribeDBClustersResponseBodyItemsDBClusterTaskInfoStepListStepList setStepProgress(String stepProgress) {
            this.stepProgress = stepProgress;
            return this;
        }
        public String getStepProgress() {
            return this.stepProgress;
        }

        public DescribeDBClustersResponseBodyItemsDBClusterTaskInfoStepListStepList setStepStatus(String stepStatus) {
            this.stepStatus = stepStatus;
            return this;
        }
        public String getStepStatus() {
            return this.stepStatus;
        }

    }

    public static class DescribeDBClustersResponseBodyItemsDBClusterTaskInfoStepList extends TeaModel {
        @NameInMap("StepList")
        public java.util.List<DescribeDBClustersResponseBodyItemsDBClusterTaskInfoStepListStepList> stepList;

        public static DescribeDBClustersResponseBodyItemsDBClusterTaskInfoStepList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClustersResponseBodyItemsDBClusterTaskInfoStepList self = new DescribeDBClustersResponseBodyItemsDBClusterTaskInfoStepList();
            return TeaModel.build(map, self);
        }

        public DescribeDBClustersResponseBodyItemsDBClusterTaskInfoStepList setStepList(java.util.List<DescribeDBClustersResponseBodyItemsDBClusterTaskInfoStepListStepList> stepList) {
            this.stepList = stepList;
            return this;
        }
        public java.util.List<DescribeDBClustersResponseBodyItemsDBClusterTaskInfoStepListStepList> getStepList() {
            return this.stepList;
        }

    }

    public static class DescribeDBClustersResponseBodyItemsDBClusterTaskInfo extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("Status")
        public String status;

        @NameInMap("StepList")
        public DescribeDBClustersResponseBodyItemsDBClusterTaskInfoStepList stepList;

        public static DescribeDBClustersResponseBodyItemsDBClusterTaskInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClustersResponseBodyItemsDBClusterTaskInfo self = new DescribeDBClustersResponseBodyItemsDBClusterTaskInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDBClustersResponseBodyItemsDBClusterTaskInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDBClustersResponseBodyItemsDBClusterTaskInfo setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeDBClustersResponseBodyItemsDBClusterTaskInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDBClustersResponseBodyItemsDBClusterTaskInfo setStepList(DescribeDBClustersResponseBodyItemsDBClusterTaskInfoStepList stepList) {
            this.stepList = stepList;
            return this;
        }
        public DescribeDBClustersResponseBodyItemsDBClusterTaskInfoStepList getStepList() {
            return this.stepList;
        }

    }

    public static class DescribeDBClustersResponseBodyItemsDBCluster extends TeaModel {
        @NameInMap("Category")
        public String category;

        /**
         * <p>The billing method of the cluster. Valid values:</p>
         * <ul>
         * <li><strong>ads</strong>: pay-as-you-go.</li>
         * <li><strong>ads_pre</strong>: subscription.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ads_pre</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <p>The specifications of reserved computing resources. Each ACU is approximately equal to 1 core and 4 GB memory. Computing resources are used to compute data. The increase in the computing resources can accelerate queries. You can scale computing resources based on your business requirements.</p>
         * 
         * <strong>example:</strong>
         * <p>16ACU</p>
         */
        @NameInMap("ComputeResource")
        public String computeResource;

        /**
         * <p>The public endpoint that is used to connect to the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-bp163885f8q21****.ads.aliyuncs.com</p>
         */
        @NameInMap("ConnectionString")
        public String connectionString;

        /**
         * <p>The time when the cluster was created. The time follows the ISO 8601 standard in the <em>yyyy-mm-ddThh:mm:ssZ</em> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-04-01T09:50:18Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>adb_test</p>
         */
        @NameInMap("DBClusterDescription")
        public String DBClusterDescription;

        /**
         * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-bp163885f8q21****</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <p>The network type of the cluster. <strong>VPC</strong> is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("DBClusterNetworkType")
        public String DBClusterNetworkType;

        /**
         * <p>The status of the cluster. Valid values:</p>
         * <ul>
         * <li><strong>Preparing</strong></li>
         * </ul>
         * <!---->
         * 
         * <ul>
         * <li><strong>Creating</strong></li>
         * <li><strong>Running</strong></li>
         * <li><strong>Deleting</strong></li>
         * </ul>
         * <!---->
         * 
         * <ul>
         * <li><strong>Restoring</strong></li>
         * </ul>
         * <!---->
         * 
         * <ul>
         * <li><strong>ClassChanging</strong></li>
         * <li><strong>NetAddressCreating</strong></li>
         * <li><strong>NetAddressDeleting</strong></li>
         * <li><strong>NetAddressModifying</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("DBClusterStatus")
        public String DBClusterStatus;

        /**
         * <p>The type of the cluster. By default, <strong>Common</strong> is returned, which indicates a common cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>Common</p>
         */
        @NameInMap("DBClusterType")
        public String DBClusterType;

        @NameInMap("DBNodeClass")
        public String DBNodeClass;

        @NameInMap("DBNodeCount")
        public Long DBNodeCount;

        @NameInMap("DBNodeStorage")
        public Long DBNodeStorage;

        /**
         * <p>The engine version of the AnalyticDB for MySQL Data Lakehouse Edition cluster. <strong>5.0</strong> is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>5.0</p>
         */
        @NameInMap("DBVersion")
        public String DBVersion;

        @NameInMap("DiskType")
        public String diskType;

        @NameInMap("DtsJobId")
        public String dtsJobId;

        @NameInMap("ElasticIOResource")
        public Integer elasticIOResource;

        /**
         * <p>The engine of the cluster. <strong>AnalyticDB</strong> is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>AnalyticDB</p>
         */
        @NameInMap("Engine")
        public String engine;

        @NameInMap("ExecutorCount")
        public String executorCount;

        /**
         * <p>The time when the cluster expires. The time follows the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mm:ssZ</em> format. The time is displayed in UTC.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>If the billing method of the cluster is subscription, the actual expiration time is returned.</p>
         * </li>
         * <li><p>If the billing method of the cluster is pay-as-you-go, null is returned.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2022-07-01T09:50:18Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>Indicates whether the subscription cluster has expired. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>If the cluster has expired, the system locks or releases the cluster within a period of time. We recommend that you renew the expired cluster. For more information, see <a href="https://help.aliyun.com/document_detail/135246.html">Renewal policy</a>.</p>
         * </li>
         * <li><p>This parameter is not returned for pay-as-you-go clusters.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Expired")
        public String expired;

        @NameInMap("InnerIp")
        public String innerIp;

        @NameInMap("InnerPort")
        public String innerPort;

        /**
         * <p>The lock status of the cluster. Valid values:</p>
         * <ul>
         * <li><strong>Unlock</strong>: The cluster is not locked.</li>
         * <li><strong>ManualLock</strong>: The cluster is manually locked.</li>
         * <li><strong>LockByExpiration</strong>: The cluster is automatically locked due to cluster expiration.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Unlock</p>
         */
        @NameInMap("LockMode")
        public String lockMode;

        /**
         * <p>The reason why the cluster is locked.</p>
         * <blockquote>
         * <p> This parameter is returned only when the cluster was locked. <strong>instance_expire</strong> is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>instance_expire</p>
         */
        @NameInMap("LockReason")
        public String lockReason;

        /**
         * <p>The mode of the cluster. By default, <strong>flexible</strong> is returned, which indicates that the cluster is in elastic mode.</p>
         * 
         * <strong>example:</strong>
         * <p>flexible</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The billing method of the cluster. Valid values:</p>
         * <ul>
         * <li><strong>Postpaid</strong>: pay-as-you-go.</li>
         * <li><strong>Prepaid</strong>: subscription.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Prepaid</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>The port number that is used to connect to the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public String port;

        @NameInMap("ProductForm")
        public String productForm;

        @NameInMap("ProductVersion")
        public String productVersion;

        @NameInMap("RdsInstanceId")
        public String rdsInstanceId;

        /**
         * <p>The region ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The remaining reserved computing resources that are available in the cluster. Each ACU is approximately equal to 1 core and 4 GB memory.</p>
         * 
         * <strong>example:</strong>
         * <p>32ACU</p>
         */
        @NameInMap("ReservedACU")
        public String reservedACU;

        @NameInMap("ReservedNodeCount")
        public Integer reservedNodeCount;

        @NameInMap("ReservedNodeSize")
        public String reservedNodeSize;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmyiu4ekp****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The specifications of reserved storage resources. Each AnalyticDB compute unit (ACU) is approximately equal to 1 core and 4 GB memory. Storage resources are used to read and write data. The increase in the storage resources can improve the read and write performance of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>24ACU</p>
         */
        @NameInMap("StorageResource")
        public String storageResource;

        /**
         * <p>The tags that are added to the cluster.</p>
         */
        @NameInMap("Tags")
        public DescribeDBClustersResponseBodyItemsDBClusterTags tags;

        @NameInMap("TaskInfo")
        public DescribeDBClustersResponseBodyItemsDBClusterTaskInfo taskInfo;

        @NameInMap("VPCCloudInstanceId")
        public String VPCCloudInstanceId;

        /**
         * <p>The virtual private cloud (VPC) ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp13h7uzhulpuxvnp****</p>
         */
        @NameInMap("VPCId")
        public String VPCId;

        /**
         * <p>The vSwitch ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1syh8vvw8yech7n****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The zone ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDBClustersResponseBodyItemsDBCluster build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClustersResponseBodyItemsDBCluster self = new DescribeDBClustersResponseBodyItemsDBCluster();
            return TeaModel.build(map, self);
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setComputeResource(String computeResource) {
            this.computeResource = computeResource;
            return this;
        }
        public String getComputeResource() {
            return this.computeResource;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setDBClusterDescription(String DBClusterDescription) {
            this.DBClusterDescription = DBClusterDescription;
            return this;
        }
        public String getDBClusterDescription() {
            return this.DBClusterDescription;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setDBClusterNetworkType(String DBClusterNetworkType) {
            this.DBClusterNetworkType = DBClusterNetworkType;
            return this;
        }
        public String getDBClusterNetworkType() {
            return this.DBClusterNetworkType;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setDBClusterStatus(String DBClusterStatus) {
            this.DBClusterStatus = DBClusterStatus;
            return this;
        }
        public String getDBClusterStatus() {
            return this.DBClusterStatus;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setDBClusterType(String DBClusterType) {
            this.DBClusterType = DBClusterType;
            return this;
        }
        public String getDBClusterType() {
            return this.DBClusterType;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setDBNodeClass(String DBNodeClass) {
            this.DBNodeClass = DBNodeClass;
            return this;
        }
        public String getDBNodeClass() {
            return this.DBNodeClass;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setDBNodeCount(Long DBNodeCount) {
            this.DBNodeCount = DBNodeCount;
            return this;
        }
        public Long getDBNodeCount() {
            return this.DBNodeCount;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setDBNodeStorage(Long DBNodeStorage) {
            this.DBNodeStorage = DBNodeStorage;
            return this;
        }
        public Long getDBNodeStorage() {
            return this.DBNodeStorage;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setDBVersion(String DBVersion) {
            this.DBVersion = DBVersion;
            return this;
        }
        public String getDBVersion() {
            return this.DBVersion;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setDtsJobId(String dtsJobId) {
            this.dtsJobId = dtsJobId;
            return this;
        }
        public String getDtsJobId() {
            return this.dtsJobId;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setElasticIOResource(Integer elasticIOResource) {
            this.elasticIOResource = elasticIOResource;
            return this;
        }
        public Integer getElasticIOResource() {
            return this.elasticIOResource;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setExecutorCount(String executorCount) {
            this.executorCount = executorCount;
            return this;
        }
        public String getExecutorCount() {
            return this.executorCount;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setExpired(String expired) {
            this.expired = expired;
            return this;
        }
        public String getExpired() {
            return this.expired;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setInnerIp(String innerIp) {
            this.innerIp = innerIp;
            return this;
        }
        public String getInnerIp() {
            return this.innerIp;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setInnerPort(String innerPort) {
            this.innerPort = innerPort;
            return this;
        }
        public String getInnerPort() {
            return this.innerPort;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setProductForm(String productForm) {
            this.productForm = productForm;
            return this;
        }
        public String getProductForm() {
            return this.productForm;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setProductVersion(String productVersion) {
            this.productVersion = productVersion;
            return this;
        }
        public String getProductVersion() {
            return this.productVersion;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setRdsInstanceId(String rdsInstanceId) {
            this.rdsInstanceId = rdsInstanceId;
            return this;
        }
        public String getRdsInstanceId() {
            return this.rdsInstanceId;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setReservedACU(String reservedACU) {
            this.reservedACU = reservedACU;
            return this;
        }
        public String getReservedACU() {
            return this.reservedACU;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setReservedNodeCount(Integer reservedNodeCount) {
            this.reservedNodeCount = reservedNodeCount;
            return this;
        }
        public Integer getReservedNodeCount() {
            return this.reservedNodeCount;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setReservedNodeSize(String reservedNodeSize) {
            this.reservedNodeSize = reservedNodeSize;
            return this;
        }
        public String getReservedNodeSize() {
            return this.reservedNodeSize;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setStorageResource(String storageResource) {
            this.storageResource = storageResource;
            return this;
        }
        public String getStorageResource() {
            return this.storageResource;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setTags(DescribeDBClustersResponseBodyItemsDBClusterTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeDBClustersResponseBodyItemsDBClusterTags getTags() {
            return this.tags;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setTaskInfo(DescribeDBClustersResponseBodyItemsDBClusterTaskInfo taskInfo) {
            this.taskInfo = taskInfo;
            return this;
        }
        public DescribeDBClustersResponseBodyItemsDBClusterTaskInfo getTaskInfo() {
            return this.taskInfo;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setVPCCloudInstanceId(String VPCCloudInstanceId) {
            this.VPCCloudInstanceId = VPCCloudInstanceId;
            return this;
        }
        public String getVPCCloudInstanceId() {
            return this.VPCCloudInstanceId;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setVPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }
        public String getVPCId() {
            return this.VPCId;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeDBClustersResponseBodyItems extends TeaModel {
        @NameInMap("DBCluster")
        public java.util.List<DescribeDBClustersResponseBodyItemsDBCluster> DBCluster;

        public static DescribeDBClustersResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClustersResponseBodyItems self = new DescribeDBClustersResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBClustersResponseBodyItems setDBCluster(java.util.List<DescribeDBClustersResponseBodyItemsDBCluster> DBCluster) {
            this.DBCluster = DBCluster;
            return this;
        }
        public java.util.List<DescribeDBClustersResponseBodyItemsDBCluster> getDBCluster() {
            return this.DBCluster;
        }

    }

}
