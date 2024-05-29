// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class CountJobByConditionRequest extends TeaModel {
    /**
     * <p>The type of the destination database.</p>
     */
    @NameInMap("DestDbType")
    public String destDbType;

    /**
     * <p>The ID of the DTS task.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The type of the DTS task. Valid values:</p>
     * <br>
     * <p>*   **MIGRATION**: data migration task</p>
     * <p>*   **SYNC**: data synchronization task</p>
     * <p>*   **SUBSCRIBE**: change tracking task</p>
     */
    @NameInMap("JobType")
    public String jobType;

    /**
     * <p>The content of the query condition, which corresponds to the value of the JobType parameter.</p>
     */
    @NameInMap("Params")
    public String params;

    /**
     * <p>One of the query conditions. The ID of the region. For more information, see [Supported regions](https://help.aliyun.com/document_detail/141033.html).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The ID of the region in which the DTS instance resides. For more information, see [Supported regions](https://help.aliyun.com/document_detail/141033.html).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The type of the source database.</p>
     */
    @NameInMap("SrcDbType")
    public String srcDbType;

    /**
     * <p>The status of the DTS task.</p>
     * <br>
     * <p>Valid values for a data migration task:</p>
     * <br>
     * <p>*   **NotStarted**: The task is not started.</p>
     * <p>*   **Prechecking**: The task is in precheck.</p>
     * <p>*   **PrecheckFailed**: The task failed to pass the precheck.</p>
     * <p>*   **PreCheckPass**: The task passed the precheck.</p>
     * <p>*   **NotConfigured**: The task is not configured.</p>
     * <p>*   **Migrating**: The task is in progress.</p>
     * <p>*   **Suspending**: The task is paused.</p>
     * <p>*   **MigrationFailed**: The task failed to migrate data.</p>
     * <p>*   **Finished**: The task is complete.</p>
     * <p>*   **Retrying**: The task is being retried.</p>
     * <p>*   **Upgrade**: The task is being upgraded.</p>
     * <p>*   **Locked**: The task is locked.</p>
     * <p>*   **Downgrade**: The task is being downgraded.</p>
     * <br>
     * <p>Valid values for a data synchronization task:</p>
     * <br>
     * <p>*   **NotStarted**: The task is not started.</p>
     * <p>*   **Prechecking**: The task is in precheck.</p>
     * <p>*   **PrecheckFailed**: The task failed to pass the precheck.</p>
     * <p>*   **PreCheckPass**: The task passed the precheck.</p>
     * <p>*   **NotConfigured**: The task is not configured.</p>
     * <p>*   **Initializing**: The task is performing initial synchronization.</p>
     * <p>*   **InitializeFailed**: Initial synchronization failed.</p>
     * <p>*   **Synchronizing**: The task is in progress.</p>
     * <p>*   **Failed**: The task failed to synchronize data.</p>
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
     * <p>*   **Prechecking**: The task is in precheck.</p>
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
     * <p>The content of the query condition. Valid values:</p>
     * <br>
     * <p>*   **name**: the name of the task</p>
     * <p>*   **rds**: the ID of the destination instance</p>
     * <p>*   **instance**: the ID of the Data Transmission Service (DTS) instance</p>
     * <p>*   **srcRds**: the ID of the source instance</p>
     * <br>
     * <p>> The value of this parameter corresponds to the value of the **JobType** parameter.</p>
     */
    @NameInMap("Type")
    public String type;

    public static CountJobByConditionRequest build(java.util.Map<String, ?> map) throws Exception {
        CountJobByConditionRequest self = new CountJobByConditionRequest();
        return TeaModel.build(map, self);
    }

    public CountJobByConditionRequest setDestDbType(String destDbType) {
        this.destDbType = destDbType;
        return this;
    }
    public String getDestDbType() {
        return this.destDbType;
    }

    public CountJobByConditionRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CountJobByConditionRequest setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public CountJobByConditionRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public CountJobByConditionRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CountJobByConditionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CountJobByConditionRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CountJobByConditionRequest setSrcDbType(String srcDbType) {
        this.srcDbType = srcDbType;
        return this;
    }
    public String getSrcDbType() {
        return this.srcDbType;
    }

    public CountJobByConditionRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CountJobByConditionRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
