// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeDtsJobsRequest extends TeaModel {
    /**
     * <p>The ID of the DTS dedicated cluster on which the task runs.</p>
     * 
     * <strong>example:</strong>
     * <p>dtscluster_atyl3b5214uk***</p>
     */
    @NameInMap("DedicatedClusterId")
    public String dedicatedClusterId;

    @NameInMap("DestProductType")
    public String destProductType;

    /**
     * <p>The environment tag of the DTS instance. Valid values:</p>
     * <ul>
     * <li><strong>normal</strong></li>
     * <li><strong>online</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("DtsBisLabel")
    public String dtsBisLabel;

    /**
     * <p>The ID of the data migration, data synchronization, or change tracking instance.</p>
     * 
     * <strong>example:</strong>
     * <p>dtsi03e3zty16i****</p>
     */
    @NameInMap("DtsInstanceId")
    public String dtsInstanceId;

    /**
     * <p>The ID of the data migration, data synchronization, or change tracking task.</p>
     * 
     * <strong>example:</strong>
     * <p>qa110wq5r93hb49</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

    /**
     * <p>The ID of the parent task.</p>
     * <blockquote>
     * <p> In most cases, you do not need to specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>pk13r731m****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The type of the DTS task. Valid values:</p>
     * <ul>
     * <li><strong>MIGRATION</strong>: data migration. This is the default value.</li>
     * <li><strong>SYNC</strong>: data synchronization.</li>
     * <li><strong>SUBSCRIBE</strong>: change tracking.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MIGRATION</p>
     */
    @NameInMap("JobType")
    public String jobType;

    /**
     * <p>The basis on which the returned DTS tasks are sorted. Valid values:</p>
     * <ul>
     * <li><strong>CreateTime</strong>: sorts the DTS tasks based on the points in time when the DTS tasks are created.</li>
     * <li><strong>FinishTime</strong>: sorts the DTS tasks based on the points in time when the DTS tasks are complete.</li>
     * <li><strong>duLimit</strong> sorts the DTS tasks based on the upper limits on DTS Units (DUs) that the DTS tasks can use. This option applies only to the DTS tasks that are run on a DTS dedicated cluster.</li>
     * </ul>
     * <blockquote>
     * <p> You can also set the <strong>OrderDirection</strong> parameter to specify whether to sort the DTS tasks in ascending or descending order.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>CreateTime</p>
     */
    @NameInMap("OrderColumn")
    public String orderColumn;

    /**
     * <p>The order in which the returned DTS tasks are sorted. Valid values:</p>
     * <ul>
     * <li><strong>ASC</strong>: sorts the DTS tasks in ascending order. This is the default value.</li>
     * <li><strong>DESC</strong>: sorts the DTS tasks in descending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ASC</p>
     */
    @NameInMap("OrderDirection")
    public String orderDirection;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The number of the page to return. The value must be an integer that is greater than <strong>0</strong> and does not exceed the maximum value of the Integer data type. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Valid values: <strong>30</strong>, <strong>50</strong>, and <strong>100</strong>. Default value: <strong>30</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The content of the query condition.</p>
     * <blockquote>
     * <p> You must set the <strong>Type</strong> parameter to specify the type of the query condition.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>dtspk3f13r731m****</p>
     */
    @NameInMap("Params")
    public String params;

    /**
     * <p>The ID of the region in which the DTS instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">List of supported regions</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>This parameter is discontinued.</p>
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
     * <p>rg-acfmzawhxxc****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("SrcProductType")
    public String srcProductType;

    /**
     * <p>The state of the DTS task.</p>
     * <p>Valid values for a data migration task:</p>
     * <ul>
     * <li><strong>NotStarted</strong>: The task is not started.</li>
     * <li><strong>Prechecking</strong>: The task is being prechecked.</li>
     * <li><strong>PrecheckFailed</strong>: The task failed to pass the precheck.</li>
     * <li><strong>PreCheckPass</strong>: The task passed the precheck.</li>
     * <li><strong>NotConfigured</strong>: The task is not configured.</li>
     * <li><strong>Migrating</strong>: The task is in progress.</li>
     * <li><strong>Suspending</strong>: The task is paused.</li>
     * <li><strong>MigrationFailed</strong>: The task failed.</li>
     * <li><strong>Finished</strong>: The task is complete.</li>
     * <li><strong>Retrying</strong>: The task is being retried.</li>
     * <li><strong>Upgrade</strong>: The task is being upgraded.</li>
     * <li><strong>Locked</strong>: The task is locked.</li>
     * <li><strong>Downgrade</strong>: The task is being downgraded.</li>
     * </ul>
     * <p>Valid values for a data synchronization task:</p>
     * <ul>
     * <li><strong>NotStarted</strong>: The task is not started.</li>
     * <li><strong>Prechecking</strong>: The task is being prechecked.</li>
     * <li><strong>PrecheckFailed</strong>: The task failed to pass the precheck.</li>
     * <li><strong>PreCheckPass</strong>: The task passed the precheck.</li>
     * <li><strong>NotConfigured</strong>: The task is not configured.</li>
     * <li><strong>Initializing</strong>: The task is being initialized.</li>
     * <li><strong>InitializeFailed</strong>: Initialization failed.</li>
     * <li><strong>Synchronizing</strong>: The task is in progress.</li>
     * <li><strong>Failed</strong>: The task failed.</li>
     * <li><strong>Suspending</strong>: The task is paused.</li>
     * <li><strong>Modifying</strong>: The objects in the task are being modified.</li>
     * <li><strong>Finished</strong>: The task is complete.</li>
     * <li><strong>Retrying</strong>: The task is being retried.</li>
     * <li><strong>Upgrade</strong>: The task is being upgraded.</li>
     * <li><strong>Locked</strong>: The task is locked.</li>
     * <li><strong>Downgrade</strong>: The task is being downgraded.</li>
     * </ul>
     * <p>Valid values for a change tracking task:</p>
     * <ul>
     * <li><strong>NotConfigured</strong>: The task is not configured.</li>
     * <li><strong>NotStarted</strong>: The task is not started.</li>
     * <li><strong>Prechecking</strong>: The task is being prechecked.</li>
     * <li><strong>PrecheckFailed</strong>: The task failed to pass the precheck.</li>
     * <li><strong>PreCheckPass</strong>: The task passed the precheck.</li>
     * <li><strong>Starting</strong>: The task is being started.</li>
     * <li><strong>Normal</strong>: The task is running as expected.</li>
     * <li><strong>Retrying</strong>: The task is being retried.</li>
     * <li><strong>Abnormal</strong>: The task is not running as expected.</li>
     * <li><strong>Upgrade</strong>: The task is being upgraded.</li>
     * <li><strong>Locked</strong>: The task is locked.</li>
     * <li><strong>Downgrade</strong>: The task is being downgraded.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Migrating</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tags of the DTS task to be queried. Specify tags in the JSON format.</p>
     * <blockquote>
     * <p> You can call the <strong>ListTagResources</strong> operation to query the tag key and tag value.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[     {         \&quot;key\&quot;: \&quot;testK\&quot;,         \&quot;value\&quot;: \&quot;testV\&quot;     }  ]</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <p>The type of the query condition. Valid values:</p>
     * <ul>
     * <li><strong>instance</strong>: queries DTS tasks based on the ID of a DTS instance.</li>
     * <li><strong>name</strong>: queries DTS tasks based on the name of a DTS instance. Fuzzy match is supported.</li>
     * <li><strong>srcRds</strong>: queries DTS tasks based on the ID of an ApsaraDB RDS instance. The ApsaraDB RDS instance is the source instance of a DTS task.</li>
     * <li><strong>rds</strong>: queries DTS tasks based on the ID of an ApsaraDB RDS instance. The ApsaraDB RDS instance is the destination instance of a DTS task.</li>
     * </ul>
     * <blockquote>
     * <p> You must set the <strong>Params</strong> parameter to specify the content of the query condition.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>instance</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>Specifies whether to skip the <strong>DbObject</strong> parameter in the response. The DbObject parameter specifies the objects of the data migration, data synchronization, or change tracking task. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: does not return <strong>DbObject</strong>.</li>
     * <li><strong>false</strong>: returns <strong>DbObject</strong>. If you set this parameter to false, the response time is shortened.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("WithoutDbList")
    public Boolean withoutDbList;

    @NameInMap("ZeroEtlJob")
    public Boolean zeroEtlJob;

    public static DescribeDtsJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDtsJobsRequest self = new DescribeDtsJobsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDtsJobsRequest setDedicatedClusterId(String dedicatedClusterId) {
        this.dedicatedClusterId = dedicatedClusterId;
        return this;
    }
    public String getDedicatedClusterId() {
        return this.dedicatedClusterId;
    }

    public DescribeDtsJobsRequest setDestProductType(String destProductType) {
        this.destProductType = destProductType;
        return this;
    }
    public String getDestProductType() {
        return this.destProductType;
    }

    public DescribeDtsJobsRequest setDtsBisLabel(String dtsBisLabel) {
        this.dtsBisLabel = dtsBisLabel;
        return this;
    }
    public String getDtsBisLabel() {
        return this.dtsBisLabel;
    }

    public DescribeDtsJobsRequest setDtsInstanceId(String dtsInstanceId) {
        this.dtsInstanceId = dtsInstanceId;
        return this;
    }
    public String getDtsInstanceId() {
        return this.dtsInstanceId;
    }

    public DescribeDtsJobsRequest setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public DescribeDtsJobsRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeDtsJobsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeDtsJobsRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeDtsJobsRequest setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public DescribeDtsJobsRequest setOrderColumn(String orderColumn) {
        this.orderColumn = orderColumn;
        return this;
    }
    public String getOrderColumn() {
        return this.orderColumn;
    }

    public DescribeDtsJobsRequest setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
        return this;
    }
    public String getOrderDirection() {
        return this.orderDirection;
    }

    public DescribeDtsJobsRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public DescribeDtsJobsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDtsJobsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDtsJobsRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public DescribeDtsJobsRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeDtsJobsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDtsJobsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeDtsJobsRequest setSrcProductType(String srcProductType) {
        this.srcProductType = srcProductType;
        return this;
    }
    public String getSrcProductType() {
        return this.srcProductType;
    }

    public DescribeDtsJobsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeDtsJobsRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public DescribeDtsJobsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeDtsJobsRequest setWithoutDbList(Boolean withoutDbList) {
        this.withoutDbList = withoutDbList;
        return this;
    }
    public Boolean getWithoutDbList() {
        return this.withoutDbList;
    }

    public DescribeDtsJobsRequest setZeroEtlJob(Boolean zeroEtlJob) {
        this.zeroEtlJob = zeroEtlJob;
        return this;
    }
    public Boolean getZeroEtlJob() {
        return this.zeroEtlJob;
    }

}
