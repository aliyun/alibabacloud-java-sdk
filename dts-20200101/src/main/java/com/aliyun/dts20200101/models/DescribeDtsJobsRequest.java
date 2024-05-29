// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeDtsJobsRequest extends TeaModel {
    /**
     * <p>The ID of the DTS dedicated cluster on which the task runs.</p>
     */
    @NameInMap("DedicatedClusterId")
    public String dedicatedClusterId;

    /**
     * <p>The environment tag of the DTS instance. Valid values:</p>
     * <br>
     * <p>- **normal**</p>
     * <p>- **online**</p>
     */
    @NameInMap("DtsBisLabel")
    public String dtsBisLabel;

    /**
     * <p>The ID of the data migration, data synchronization, or change tracking instance.</p>
     */
    @NameInMap("DtsInstanceId")
    public String dtsInstanceId;

    /**
     * <p>The ID of the data migration, data synchronization, or change tracking task.</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

    /**
     * <p>The ID of the parent task.</p>
     * <br>
     * <p>>  In most cases, you do not need to specify this parameter.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The type of the DTS task. Valid values:</p>
     * <br>
     * <p>*   **MIGRATION**: data migration. This is the default value.</p>
     * <p>*   **SYNC**: data synchronization.</p>
     * <p>*   **SUBSCRIBE**: change tracking.</p>
     */
    @NameInMap("JobType")
    public String jobType;

    /**
     * <p>The basis on which the returned DTS tasks are sorted. Valid values:</p>
     * <br>
     * <p>*   **CreateTime**: sorts the DTS tasks based on the points in time when the DTS tasks are created.</p>
     * <p>*   **FinishTime**: sorts the DTS tasks based on the points in time when the DTS tasks are complete.</p>
     * <p>*   **duLimit** sorts the DTS tasks based on the upper limits on DTS Units (DUs) that the DTS tasks can use. This option applies only to the DTS tasks that are run on a DTS dedicated cluster.</p>
     * <br>
     * <p>>  You can also set the **OrderDirection** parameter to specify whether to sort the DTS tasks in ascending or descending order.</p>
     */
    @NameInMap("OrderColumn")
    public String orderColumn;

    /**
     * <p>The order in which the returned DTS tasks are sorted. Valid values:</p>
     * <br>
     * <p>*   **ASC**: sorts the DTS tasks in ascending order. This is the default value.</p>
     * <p>*   **DESC**: sorts the DTS tasks in descending order.</p>
     */
    @NameInMap("OrderDirection")
    public String orderDirection;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The number of the page to return. The value must be an integer that is greater than **0** and does not exceed the maximum value of the Integer data type. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Valid values: **30**, **50**, and **100**. Default value: **30**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The content of the query condition.</p>
     * <br>
     * <p>>  You must set the **Type** parameter to specify the type of the query condition.</p>
     */
    @NameInMap("Params")
    public String params;

    /**
     * <p>The ID of the region in which the DTS instance resides. For more information, see [List of supported regions](https://help.aliyun.com/document_detail/141033.html).</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>This parameter is discontinued.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The state of the DTS task.</p>
     * <br>
     * <p>Valid values for a data migration task:</p>
     * <br>
     * <p>*   **NotStarted**: The task is not started.</p>
     * <p>*   **Prechecking**: The task is being prechecked.</p>
     * <p>*   **PrecheckFailed**: The task failed to pass the precheck.</p>
     * <p>*   **PreCheckPass**: The task passed the precheck.</p>
     * <p>*   **NotConfigured**: The task is not configured.</p>
     * <p>*   **Migrating**: The task is in progress.</p>
     * <p>*   **Suspending**: The task is paused.</p>
     * <p>*   **MigrationFailed**: The task failed.</p>
     * <p>*   **Finished**: The task is complete.</p>
     * <p>*   **Retrying**: The task is being retried.</p>
     * <p>*   **Upgrade**: The task is being upgraded.</p>
     * <p>*   **Locked**: The task is locked.</p>
     * <p>*   **Downgrade**: The task is being downgraded.</p>
     * <br>
     * <p>Valid values for a data synchronization task:</p>
     * <br>
     * <p>*   **NotStarted**: The task is not started.</p>
     * <p>*   **Prechecking**: The task is being prechecked.</p>
     * <p>*   **PrecheckFailed**: The task failed to pass the precheck.</p>
     * <p>*   **PreCheckPass**: The task passed the precheck.</p>
     * <p>*   **NotConfigured**: The task is not configured.</p>
     * <p>*   **Initializing**: The task is being initialized.</p>
     * <p>*   **InitializeFailed**: Initialization failed.</p>
     * <p>*   **Synchronizing**: The task is in progress.</p>
     * <p>*   **Failed**: The task failed.</p>
     * <p>*   **Suspending**: The task is paused.</p>
     * <p>*   **Modifying**: The objects in the task are being modified.</p>
     * <p>*   **Finished**: The task is complete.</p>
     * <p>*   **Retrying**: The task is being retried.</p>
     * <p>*   **Upgrade**: The task is being upgraded.</p>
     * <p>*   **Locked**: The task is locked.</p>
     * <p>*   **Downgrade**: The task is being downgraded.</p>
     * <br>
     * <p>Valid values for a change tracking task:</p>
     * <br>
     * <p>*   **NotConfigured**: The task is not configured.</p>
     * <p>*   **NotStarted**: The task is not started.</p>
     * <p>*   **Prechecking**: The task is being prechecked.</p>
     * <p>*   **PrecheckFailed**: The task failed to pass the precheck.</p>
     * <p>*   **PreCheckPass**: The task passed the precheck.</p>
     * <p>*   **Starting**: The task is being started.</p>
     * <p>*   **Normal**: The task is running as expected.</p>
     * <p>*   **Retrying**: The task is being retried.</p>
     * <p>*   **Abnormal**: The task is not running as expected.</p>
     * <p>*   **Upgrade**: The task is being upgraded.</p>
     * <p>*   **Locked**: The task is locked.</p>
     * <p>*   **Downgrade**: The task is being downgraded.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tags of the DTS task to be queried. Specify tags in the JSON format.</p>
     * <br>
     * <p>>  You can call the **ListTagResources** operation to query the tag key and tag value.</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <p>The type of the query condition. Valid values:</p>
     * <br>
     * <p>*   **instance**: queries DTS tasks based on the ID of a DTS instance.</p>
     * <p>*   **name**: queries DTS tasks based on the name of a DTS instance. Fuzzy match is supported.</p>
     * <p>*   **srcRds**: queries DTS tasks based on the ID of an ApsaraDB RDS instance. The ApsaraDB RDS instance is the source instance of a DTS task.</p>
     * <p>*   **rds**: queries DTS tasks based on the ID of an ApsaraDB RDS instance. The ApsaraDB RDS instance is the destination instance of a DTS task.</p>
     * <br>
     * <p>>  You must set the **Params** parameter to specify the content of the query condition.</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>Specifies whether to skip the **DbObject** parameter in the response. The DbObject parameter specifies the objects of the data migration, data synchronization, or change tracking task. Valid values:</p>
     * <br>
     * <p>- **true**: does not return **DbObject**.</p>
     * <p>- **false**: returns **DbObject**. If you set this parameter to false, the response time is shortened.</p>
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
