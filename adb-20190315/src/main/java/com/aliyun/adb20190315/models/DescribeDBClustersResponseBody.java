// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeDBClustersResponseBody extends TeaModel {
    /**
     * <p>The queried cluster information.</p>
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
     * <p>D65A809F-34CE-4550-9BC1-0ED21ETG380</p>
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
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/179253.html">TagResources</a> operation to add a tag to the cluster.</p>
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
        /**
         * <p>The end time of the job step. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-10T10:28:34Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The start time of the job step. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-10T09:28:34Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The description of the job step.</p>
         * 
         * <strong>example:</strong>
         * <p>Apply resource</p>
         */
        @NameInMap("StepDesc")
        public String stepDesc;

        /**
         * <p>The name of the job step.</p>
         * 
         * <strong>example:</strong>
         * <p>ApplyResource</p>
         */
        @NameInMap("StepName")
        public String stepName;

        /**
         * <p>The progress of the job step. Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("StepProgress")
        public String stepProgress;

        /**
         * <p>The status of the job step. Valid values:</p>
         * <ul>
         * <li><strong>NOT_RUN</strong></li>
         * <li><strong>RUNNING</strong></li>
         * <li><strong>SUCCEED</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUCCEED</p>
         */
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
        /**
         * <p>The name of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>analyticDBFlexibleScaleOut</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The progress of the job. Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The status of the job. Valid values:</p>
         * <ul>
         * <li><strong>NOT_RUN</strong></li>
         * <li><strong>RUNNING</strong></li>
         * <li><strong>SUCCEED</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The job step.</p>
         */
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
        /**
         * <p>The edition of the cluster. Valid values:</p>
         * <ul>
         * <li><strong>BASIC</strong>: reserved mode for Basic Edition.</li>
         * <li><strong>CLUSTER</strong>: reserved mode for Cluster Edition.</li>
         * <li><strong>MIXED_STORAGE</strong>: elastic mode for Cluster Edition.</li>
         * </ul>
         * <blockquote>
         * <p> For more information about cluster editions, see <a href="https://help.aliyun.com/document_detail/205001.html">Editions</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>MIXED_STORAGE</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The commodity code. <strong>ads</strong> is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>ads</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <p>The specifications of computing resources that are used in the cluster in elastic mode. Computing resources are used to compute data. The increase in the computing resources can accelerate queries. You can scale computing resources based on your business requirements.</p>
         * 
         * <strong>example:</strong>
         * <p>8Core32GB</p>
         */
        @NameInMap("ComputeResource")
        public String computeResource;

        /**
         * <p>The public endpoint that is used to connect to the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>am-bp163885f8q21****.ads.aliyuncs.com</p>
         */
        @NameInMap("ConnectionString")
        public String connectionString;

        /**
         * <p>The time when the cluster was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mm:ssZ</em> format. The time is displayed in UTC. Example: <em>2021-04-01T09:50:18Z</em>.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-04-01T09:50:18Z</p>
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
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>am-bp163885f8q21****</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <p>The network type of the cluster. <strong>VPC</strong> is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        @NameInMap("DBClusterNetworkType")
        public String DBClusterNetworkType;

        /**
         * <p>The status of the cluster. For more information, see <a href="https://help.aliyun.com/document_detail/143075.html">Cluster states</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("DBClusterStatus")
        public String DBClusterStatus;

        /**
         * <p>The type of the cluster. Valid values:</p>
         * <ul>
         * <li><strong>Common</strong>: common cluster.</li>
         * <li><strong>RDS_ANALYSIS</strong>: MySQL analytic instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Common</p>
         */
        @NameInMap("DBClusterType")
        public String DBClusterType;

        /**
         * <p>The specifications of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>E8</p>
         */
        @NameInMap("DBNodeClass")
        public String DBNodeClass;

        /**
         * <p>The number of node groups.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DBNodeCount")
        public Long DBNodeCount;

        /**
         * <p>The storage capacity of the cluster. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("DBNodeStorage")
        public Long DBNodeStorage;

        /**
         * <p>The version of the database engine. <strong>3.0</strong> is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>3.0</p>
         */
        @NameInMap("DBVersion")
        public String DBVersion;

        /**
         * <p>The disk type of the cluster. Valid values:</p>
         * <ul>
         * <li><strong>local_ssd</strong>: local SSD.</li>
         * <li><strong>cloud</strong>: basic disk.</li>
         * <li><strong>cloud_ssd</strong>: standard SSD.</li>
         * <li><strong>cloud_efficiency</strong>: ultra disk.</li>
         * <li><strong>cloud_essd0</strong>: PL0 Enterprise SSD (ESSD).</li>
         * <li><strong>cloud_essd</strong>: PL1 ESSD.</li>
         * <li><strong>cloud_essd2</strong>: PL2 ESSD.</li>
         * <li><strong>cloud_essd3</strong>: PL3 ESSD.</li>
         * </ul>
         * <blockquote>
         * <p> For more information about ESSDs, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSDs</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cloud_essd</p>
         */
        @NameInMap("DiskType")
        public String diskType;

        /**
         * <p>The ID of the Data Transmission Service (DTS) synchronization job. This parameter is returned only for MySQL analytic instances.</p>
         * 
         * <strong>example:</strong>
         * <p>dtsb1578j90XXXX</p>
         */
        @NameInMap("DtsJobId")
        public String dtsJobId;

        /**
         * <p>The number of elastic I/O units (EIUs). For more information, see <a href="https://help.aliyun.com/document_detail/189505.html">Elasticity of the storage layer</a>.</p>
         * <blockquote>
         * <p> This parameter is returned only for clusters in elastic mode.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
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

        /**
         * <p>The number of compute nodes that are used by the cluster in elastic mode.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ExecutorCount")
        public String executorCount;

        /**
         * <p>The expiration time of the cluster. The time follows the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mm:ssZ</em> format. The time is displayed in UTC. Example: <em>2999-09-08T16:00:00Z</em>.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>If the billing method of the cluster is subscription, the actual expiration time is returned.</p>
         * </li>
         * <li><p>If the billing method of the cluster is pay-as-you-go, <strong>2999-09-08T16:00:00Z</strong> is returned.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2999-09-08T16:00:00Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>Indicates whether the cluster has expired. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Expired")
        public String expired;

        /**
         * <p>The public IP address of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>10.1.xx.xx</p>
         */
        @NameInMap("InnerIp")
        public String innerIp;

        /**
         * <p>The port number that is used to connect to the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("InnerPort")
        public String innerPort;

        /**
         * <p>The lock mode of the cluster. Valid values:</p>
         * <ul>
         * <li><strong>Unlock</strong>: The cluster is not locked.</li>
         * <li><strong>ManualLock</strong>: The cluster is manually locked.</li>
         * <li><strong>LockByExpiration</strong>: The cluster is automatically locked due to cluster expiration.</li>
         * <li><strong>LockByRestoration</strong>: The cluster is automatically locked due to cluster restoration.</li>
         * <li><strong>LockByDiskQuota</strong>: The cluster is automatically locked when 90% of the cluster storage is used.</li>
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
         * <p>instance_expired</p>
         */
        @NameInMap("LockReason")
        public String lockReason;

        /**
         * <p>The mode of the cluster. Valid values:</p>
         * <ul>
         * <li><strong>flexible</strong>: elastic mode.</li>
         * <li><strong>reserver</strong>: reserved mode.</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li>For more information about cluster modes, see <a href="https://help.aliyun.com/document_detail/205001.html">Editions</a>.</li>
         * </ul>
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
         * <p>Postpaid</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>The port number that is used to connect to the cluster. Default value: 3306.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The edition of the cluster. Valid values:</p>
         * <ul>
         * <li><strong>BasicVersion</strong>: Basic Edition.</li>
         * <li><strong>EnterpriseVersion</strong>: Enterprise Edition.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EnterpriseVersion</p>
         */
        @NameInMap("ProductVersion")
        public String productVersion;

        /**
         * <p>The ID of the ApsaraDB RDS instance from which data is synchronized to the cluster. This parameter is returned only for MySQL analytic instances.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp11q28kvl688****</p>
         */
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
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmyiu4ekp****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The specifications of storage resources that are used in the cluster in elastic mode. Storage resources are used to read and write data. The increase in the storage resources can improve the read and write performance of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>8Core32GB</p>
         */
        @NameInMap("StorageResource")
        public String storageResource;

        /**
         * <p>The tags that are added to the cluster.</p>
         */
        @NameInMap("Tags")
        public DescribeDBClustersResponseBodyItemsDBClusterTags tags;

        /**
         * <p>The job progress.</p>
         */
        @NameInMap("TaskInfo")
        public DescribeDBClustersResponseBodyItemsDBClusterTaskInfo taskInfo;

        /**
         * <p>The ID of the cluster that resides in the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>am-bp163885f8q21****-controller</p>
         */
        @NameInMap("VPCCloudInstanceId")
        public String VPCCloudInstanceId;

        /**
         * <p>The virtual private cloud (VPC) ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp13h7uzhulpuxvnpXXXX</p>
         */
        @NameInMap("VPCId")
        public String VPCId;

        /**
         * <p>The vSwitch ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1syh8vvw8yech7nXXXX</p>
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
