// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class CountJobByConditionRequest extends TeaModel {
    /**
     * <p>The type of the destination database.</p>
     * 
     * <strong>example:</strong>
     * <p>MongoDB</p>
     */
    @NameInMap("DestDbType")
    public String destDbType;

    /**
     * <p>The ID of the DTS task.</p>
     * 
     * <strong>example:</strong>
     * <p>pk13r731m****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The type of the DTS task. Valid values:</p>
     * <ul>
     * <li><strong>MIGRATION</strong>: data migration task</li>
     * <li><strong>SYNC</strong>: data synchronization task</li>
     * <li><strong>SUBSCRIBE</strong>: change tracking task</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SYNC</p>
     */
    @NameInMap("JobType")
    public String jobType;

    /**
     * <p>The content of the query condition, which corresponds to the value of the JobType parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>dtspk3f13r731m****</p>
     */
    @NameInMap("Params")
    public String params;

    /**
     * <p>One of the query conditions. The ID of the region. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The ID of the region in which the DTS instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The type of the source database.</p>
     * 
     * <strong>example:</strong>
     * <p>MongoDB</p>
     */
    @NameInMap("SrcDbType")
    public String srcDbType;

    /**
     * <p>The status of the DTS task.</p>
     * <p>Valid values for a data migration task:</p>
     * <ul>
     * <li><strong>NotStarted</strong>: The task is not started.</li>
     * <li><strong>Prechecking</strong>: The task is in precheck.</li>
     * <li><strong>PrecheckFailed</strong>: The task failed to pass the precheck.</li>
     * <li><strong>PreCheckPass</strong>: The task passed the precheck.</li>
     * <li><strong>NotConfigured</strong>: The task is not configured.</li>
     * <li><strong>Migrating</strong>: The task is in progress.</li>
     * <li><strong>Suspending</strong>: The task is paused.</li>
     * <li><strong>MigrationFailed</strong>: The task failed to migrate data.</li>
     * <li><strong>Finished</strong>: The task is complete.</li>
     * <li><strong>Retrying</strong>: The task is being retried.</li>
     * <li><strong>Upgrade</strong>: The task is being upgraded.</li>
     * <li><strong>Locked</strong>: The task is locked.</li>
     * <li><strong>Downgrade</strong>: The task is being downgraded.</li>
     * </ul>
     * <p>Valid values for a data synchronization task:</p>
     * <ul>
     * <li><strong>NotStarted</strong>: The task is not started.</li>
     * <li><strong>Prechecking</strong>: The task is in precheck.</li>
     * <li><strong>PrecheckFailed</strong>: The task failed to pass the precheck.</li>
     * <li><strong>PreCheckPass</strong>: The task passed the precheck.</li>
     * <li><strong>NotConfigured</strong>: The task is not configured.</li>
     * <li><strong>Initializing</strong>: The task is performing initial synchronization.</li>
     * <li><strong>InitializeFailed</strong>: Initial synchronization failed.</li>
     * <li><strong>Synchronizing</strong>: The task is in progress.</li>
     * <li><strong>Failed</strong>: The task failed to synchronize data.</li>
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
     * <li><strong>Prechecking</strong>: The task is in precheck.</li>
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
     * <p>Finished</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The content of the query condition. Valid values:</p>
     * <ul>
     * <li><strong>name</strong>: the name of the task</li>
     * <li><strong>rds</strong>: the ID of the destination instance</li>
     * <li><strong>instance</strong>: the ID of the Data Transmission Service (DTS) instance</li>
     * <li><strong>srcRds</strong>: the ID of the source instance</li>
     * </ul>
     * <blockquote>
     * <p>The value of this parameter corresponds to the value of the <strong>JobType</strong> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>name/instance</p>
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
