// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeDBClusterAttributeResponseBody extends TeaModel {
    /**
     * <p>The queried cluster information.</p>
     */
    @NameInMap("Items")
    public DescribeDBClusterAttributeResponseBodyItems items;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2895BB82-B2C1-408E-AA73-DB8D59******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBClusterAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterAttributeResponseBody self = new DescribeDBClusterAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterAttributeResponseBody setItems(DescribeDBClusterAttributeResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeDBClusterAttributeResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeDBClusterAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBClusterAttributeResponseBodyItemsDBClusterTagsTag extends TeaModel {
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

        public static DescribeDBClusterAttributeResponseBodyItemsDBClusterTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterAttributeResponseBodyItemsDBClusterTagsTag self = new DescribeDBClusterAttributeResponseBodyItemsDBClusterTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBClusterTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBClusterTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDBClusterAttributeResponseBodyItemsDBClusterTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeDBClusterAttributeResponseBodyItemsDBClusterTagsTag> tag;

        public static DescribeDBClusterAttributeResponseBodyItemsDBClusterTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterAttributeResponseBodyItemsDBClusterTags self = new DescribeDBClusterAttributeResponseBodyItemsDBClusterTags();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBClusterTags setTag(java.util.List<DescribeDBClusterAttributeResponseBodyItemsDBClusterTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeDBClusterAttributeResponseBodyItemsDBClusterTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeDBClusterAttributeResponseBodyItemsDBClusterTaskInfoStepListStepList extends TeaModel {
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

        public static DescribeDBClusterAttributeResponseBodyItemsDBClusterTaskInfoStepListStepList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterAttributeResponseBodyItemsDBClusterTaskInfoStepListStepList self = new DescribeDBClusterAttributeResponseBodyItemsDBClusterTaskInfoStepListStepList();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBClusterTaskInfoStepListStepList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBClusterTaskInfoStepListStepList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBClusterTaskInfoStepListStepList setStepDesc(String stepDesc) {
            this.stepDesc = stepDesc;
            return this;
        }
        public String getStepDesc() {
            return this.stepDesc;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBClusterTaskInfoStepListStepList setStepName(String stepName) {
            this.stepName = stepName;
            return this;
        }
        public String getStepName() {
            return this.stepName;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBClusterTaskInfoStepListStepList setStepProgress(String stepProgress) {
            this.stepProgress = stepProgress;
            return this;
        }
        public String getStepProgress() {
            return this.stepProgress;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBClusterTaskInfoStepListStepList setStepStatus(String stepStatus) {
            this.stepStatus = stepStatus;
            return this;
        }
        public String getStepStatus() {
            return this.stepStatus;
        }

    }

    public static class DescribeDBClusterAttributeResponseBodyItemsDBClusterTaskInfoStepList extends TeaModel {
        @NameInMap("StepList")
        public java.util.List<DescribeDBClusterAttributeResponseBodyItemsDBClusterTaskInfoStepListStepList> stepList;

        public static DescribeDBClusterAttributeResponseBodyItemsDBClusterTaskInfoStepList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterAttributeResponseBodyItemsDBClusterTaskInfoStepList self = new DescribeDBClusterAttributeResponseBodyItemsDBClusterTaskInfoStepList();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBClusterTaskInfoStepList setStepList(java.util.List<DescribeDBClusterAttributeResponseBodyItemsDBClusterTaskInfoStepListStepList> stepList) {
            this.stepList = stepList;
            return this;
        }
        public java.util.List<DescribeDBClusterAttributeResponseBodyItemsDBClusterTaskInfoStepListStepList> getStepList() {
            return this.stepList;
        }

    }

    public static class DescribeDBClusterAttributeResponseBodyItemsDBClusterTaskInfo extends TeaModel {
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
         * <p>The job steps.</p>
         */
        @NameInMap("StepList")
        public DescribeDBClusterAttributeResponseBodyItemsDBClusterTaskInfoStepList stepList;

        public static DescribeDBClusterAttributeResponseBodyItemsDBClusterTaskInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterAttributeResponseBodyItemsDBClusterTaskInfo self = new DescribeDBClusterAttributeResponseBodyItemsDBClusterTaskInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBClusterTaskInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBClusterTaskInfo setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBClusterTaskInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBClusterTaskInfo setStepList(DescribeDBClusterAttributeResponseBodyItemsDBClusterTaskInfoStepList stepList) {
            this.stepList = stepList;
            return this;
        }
        public DescribeDBClusterAttributeResponseBodyItemsDBClusterTaskInfoStepList getStepList() {
            return this.stepList;
        }

    }

    public static class DescribeDBClusterAttributeResponseBodyItemsDBCluster extends TeaModel {
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
         * <p>The billing method of the cluster. Valid values:</p>
         * <ul>
         * <li><strong>ads</strong>: pay-as-you-go.</li>
         * <li><strong>ads_pre</strong>: subscription.</li>
         * </ul>
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
         * <p>The Virtual Private Cloud (VPC) endpoint that is used to connect to the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>am-bp111m2cfrdl1****.ads.aliyuncs.com</p>
         */
        @NameInMap("ConnectionString")
        public String connectionString;

        /**
         * <p>The time when the cluster was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mm:ssZ</em> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-04-01T09:50:18Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>adb_test</p>
         */
        @NameInMap("DBClusterDescription")
        public String DBClusterDescription;

        /**
         * <p>The ID of the AnalyticDB for MySQL Data Warehouse Edition (V3.0) cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>am-bp111m2cfrdl1****</p>
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
         * <p>The instance type of the cluster.</p>
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
         * <p>The engine version of the cluster. <strong>3.0</strong> is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>3.0</p>
         */
        @NameInMap("DBVersion")
        public String DBVersion;

        /**
         * <p>Indicates whether disk encryption is enabled. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DiskEncryption")
        public Boolean diskEncryption;

        /**
         * <p>The ESSD performance level.</p>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("DiskPerformanceLevel")
        public String diskPerformanceLevel;

        /**
         * <p>The disk type of the cluster. Valid values:</p>
         * <ul>
         * <li><strong>local_ssd</strong>: local disk.</li>
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
         * <p>dtsb1hp3790****</p>
         */
        @NameInMap("DtsJobId")
        public String dtsJobId;

        /**
         * <p>The number of elastic I/O units (EIUs).</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ElasticIOResource")
        public Integer elasticIOResource;

        /**
         * <p>The single-node specifications of an EIU. Valid values:</p>
         * <ul>
         * <li>8Core64GB: If this value is returned, the specifications of an EIU are 24 cores and 192 GB memory.</li>
         * <li>12Core96GB: If this value is returned, the specifications of an EIU are 36 cores and 288 GB memory.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>8Core64GB</p>
         */
        @NameInMap("ElasticIOResourceSize")
        public String elasticIOResourceSize;

        /**
         * <p>Indicates whether an Airflow cluster was created. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableAirflow")
        public Boolean enableAirflow;

        /**
         * <p>Indicates whether a Spark cluster was created. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableSpark")
        public Boolean enableSpark;

        /**
         * <p>The database engine of the cluster. <strong>AnalyticDB</strong> is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>AnalyticDB</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The minor version of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>3.1.1.9</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

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
         * <p>10.1.XX.XX</p>
         */
        @NameInMap("InnerIp")
        public String innerIp;

        /**
         * <p>The public port number.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("InnerPort")
        public String innerPort;

        /**
         * <p>The ID of the key that is used to encrypt disk data.</p>
         * <blockquote>
         * <p> This parameter is returned only when disk encryption is enabled.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>e1935511-cf88-1123-a0f8-1be8d251****</p>
         */
        @NameInMap("KmsId")
        public String kmsId;

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
         * <p>The maintenance window of the cluster. The time is displayed in the <em>HH:mmZ-HH:mmZ</em> format in UTC. Example: <em>04:00Z-05:00Z</em>, which indicates that routine maintenance is performed from 04:00 to 05:00.</p>
         * <blockquote>
         * <p> For more information about maintenance windows, see <a href="https://help.aliyun.com/document_detail/122569.html">Configure a maintenance window</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>04:00Z-05:00Z</p>
         */
        @NameInMap("MaintainTime")
        public String maintainTime;

        /**
         * <p>The mode of the cluster. Valid values:</p>
         * <ul>
         * <li><strong>flexible</strong>: elastic mode.</li>
         * <li><strong>reserver</strong>: reserved mode.</li>
         * </ul>
         * <blockquote>
         * <p> For more information about cluster modes, see <a href="https://help.aliyun.com/document_detail/205001.html">Editions</a>.</p>
         * </blockquote>
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
         * <p>The port number that is used to connect to the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The edition of the cluster. Valid values:</p>
         * <ul>
         * <li><strong>BasicVersion</strong>: Basic Edition.</li>
         * <li><strong>EnterpriseVersion</strong>: Enterprise Edition.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BasicVersion</p>
         */
        @NameInMap("ProductVersion")
        public String productVersion;

        /**
         * <p>The ID of the ApsaraDB RDS instance from which data is synchronized to the cluster. This parameter is returned only for MySQL analytic instances.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp837jsdp2****</p>
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
        public DescribeDBClusterAttributeResponseBodyItemsDBClusterTags tags;

        /**
         * <p>The job information.</p>
         */
        @NameInMap("TaskInfo")
        public DescribeDBClusterAttributeResponseBodyItemsDBClusterTaskInfo taskInfo;

        /**
         * <p>Indicates whether Elastic Network Interface (ENI) is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("UserENIStatus")
        public Boolean userENIStatus;

        /**
         * <p>The ID of the cluster that resides in the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>am-bp111m2cfrdl1****-controller</p>
         */
        @NameInMap("VPCCloudInstanceId")
        public String VPCCloudInstanceId;

        /**
         * <p>The VPC ID of the cluster.</p>
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

        public static DescribeDBClusterAttributeResponseBodyItemsDBCluster build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterAttributeResponseBodyItemsDBCluster self = new DescribeDBClusterAttributeResponseBodyItemsDBCluster();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setComputeResource(String computeResource) {
            this.computeResource = computeResource;
            return this;
        }
        public String getComputeResource() {
            return this.computeResource;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setDBClusterDescription(String DBClusterDescription) {
            this.DBClusterDescription = DBClusterDescription;
            return this;
        }
        public String getDBClusterDescription() {
            return this.DBClusterDescription;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setDBClusterNetworkType(String DBClusterNetworkType) {
            this.DBClusterNetworkType = DBClusterNetworkType;
            return this;
        }
        public String getDBClusterNetworkType() {
            return this.DBClusterNetworkType;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setDBClusterStatus(String DBClusterStatus) {
            this.DBClusterStatus = DBClusterStatus;
            return this;
        }
        public String getDBClusterStatus() {
            return this.DBClusterStatus;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setDBClusterType(String DBClusterType) {
            this.DBClusterType = DBClusterType;
            return this;
        }
        public String getDBClusterType() {
            return this.DBClusterType;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setDBNodeClass(String DBNodeClass) {
            this.DBNodeClass = DBNodeClass;
            return this;
        }
        public String getDBNodeClass() {
            return this.DBNodeClass;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setDBNodeCount(Long DBNodeCount) {
            this.DBNodeCount = DBNodeCount;
            return this;
        }
        public Long getDBNodeCount() {
            return this.DBNodeCount;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setDBNodeStorage(Long DBNodeStorage) {
            this.DBNodeStorage = DBNodeStorage;
            return this;
        }
        public Long getDBNodeStorage() {
            return this.DBNodeStorage;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setDBVersion(String DBVersion) {
            this.DBVersion = DBVersion;
            return this;
        }
        public String getDBVersion() {
            return this.DBVersion;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setDiskEncryption(Boolean diskEncryption) {
            this.diskEncryption = diskEncryption;
            return this;
        }
        public Boolean getDiskEncryption() {
            return this.diskEncryption;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setDiskPerformanceLevel(String diskPerformanceLevel) {
            this.diskPerformanceLevel = diskPerformanceLevel;
            return this;
        }
        public String getDiskPerformanceLevel() {
            return this.diskPerformanceLevel;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setDtsJobId(String dtsJobId) {
            this.dtsJobId = dtsJobId;
            return this;
        }
        public String getDtsJobId() {
            return this.dtsJobId;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setElasticIOResource(Integer elasticIOResource) {
            this.elasticIOResource = elasticIOResource;
            return this;
        }
        public Integer getElasticIOResource() {
            return this.elasticIOResource;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setElasticIOResourceSize(String elasticIOResourceSize) {
            this.elasticIOResourceSize = elasticIOResourceSize;
            return this;
        }
        public String getElasticIOResourceSize() {
            return this.elasticIOResourceSize;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setEnableAirflow(Boolean enableAirflow) {
            this.enableAirflow = enableAirflow;
            return this;
        }
        public Boolean getEnableAirflow() {
            return this.enableAirflow;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setEnableSpark(Boolean enableSpark) {
            this.enableSpark = enableSpark;
            return this;
        }
        public Boolean getEnableSpark() {
            return this.enableSpark;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setExecutorCount(String executorCount) {
            this.executorCount = executorCount;
            return this;
        }
        public String getExecutorCount() {
            return this.executorCount;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setExpired(String expired) {
            this.expired = expired;
            return this;
        }
        public String getExpired() {
            return this.expired;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setInnerIp(String innerIp) {
            this.innerIp = innerIp;
            return this;
        }
        public String getInnerIp() {
            return this.innerIp;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setInnerPort(String innerPort) {
            this.innerPort = innerPort;
            return this;
        }
        public String getInnerPort() {
            return this.innerPort;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setKmsId(String kmsId) {
            this.kmsId = kmsId;
            return this;
        }
        public String getKmsId() {
            return this.kmsId;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setMaintainTime(String maintainTime) {
            this.maintainTime = maintainTime;
            return this;
        }
        public String getMaintainTime() {
            return this.maintainTime;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setProductVersion(String productVersion) {
            this.productVersion = productVersion;
            return this;
        }
        public String getProductVersion() {
            return this.productVersion;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setRdsInstanceId(String rdsInstanceId) {
            this.rdsInstanceId = rdsInstanceId;
            return this;
        }
        public String getRdsInstanceId() {
            return this.rdsInstanceId;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setStorageResource(String storageResource) {
            this.storageResource = storageResource;
            return this;
        }
        public String getStorageResource() {
            return this.storageResource;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setTags(DescribeDBClusterAttributeResponseBodyItemsDBClusterTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeDBClusterAttributeResponseBodyItemsDBClusterTags getTags() {
            return this.tags;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setTaskInfo(DescribeDBClusterAttributeResponseBodyItemsDBClusterTaskInfo taskInfo) {
            this.taskInfo = taskInfo;
            return this;
        }
        public DescribeDBClusterAttributeResponseBodyItemsDBClusterTaskInfo getTaskInfo() {
            return this.taskInfo;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setUserENIStatus(Boolean userENIStatus) {
            this.userENIStatus = userENIStatus;
            return this;
        }
        public Boolean getUserENIStatus() {
            return this.userENIStatus;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setVPCCloudInstanceId(String VPCCloudInstanceId) {
            this.VPCCloudInstanceId = VPCCloudInstanceId;
            return this;
        }
        public String getVPCCloudInstanceId() {
            return this.VPCCloudInstanceId;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setVPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }
        public String getVPCId() {
            return this.VPCId;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeDBClusterAttributeResponseBodyItems extends TeaModel {
        @NameInMap("DBCluster")
        public java.util.List<DescribeDBClusterAttributeResponseBodyItemsDBCluster> DBCluster;

        public static DescribeDBClusterAttributeResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterAttributeResponseBodyItems self = new DescribeDBClusterAttributeResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterAttributeResponseBodyItems setDBCluster(java.util.List<DescribeDBClusterAttributeResponseBodyItemsDBCluster> DBCluster) {
            this.DBCluster = DBCluster;
            return this;
        }
        public java.util.List<DescribeDBClusterAttributeResponseBodyItemsDBCluster> getDBCluster() {
            return this.DBCluster;
        }

    }

}
