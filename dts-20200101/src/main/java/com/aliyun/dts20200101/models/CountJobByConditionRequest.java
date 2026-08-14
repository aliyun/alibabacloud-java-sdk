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
     * <p>The parent task ID of a distributed synchronization task.</p>
     * 
     * <strong>example:</strong>
     * <p>pk13r731m****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The task type. Valid values:</p>
     * <ul>
     * <li><strong>MIGRATION</strong>: data migration.</li>
     * <li><strong>SYNC</strong>: data synchronization.</li>
     * <li><strong>SUBSCRIBE</strong>: change tracking.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SYNC</p>
     */
    @NameInMap("JobType")
    public String jobType;

    /**
     * <p>The query value that corresponds to JobType.</p>
     * 
     * <strong>example:</strong>
     * <p>dtspk3f13r731m****</p>
     */
    @NameInMap("Params")
    public String params;

    /**
     * <p>The region ID used as a filter condition. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The ID of the region where the DTS instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID. This is a global parameter and does not need to be passed for this API operation.</p>
     * 
     * <strong>example:</strong>
     * <p>资源组ID，全局参数，当前API无需传入。</p>
     */
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
     * <p>The instance status of the DTS instance. Valid values:</p>
     * <p>Data migration node statuses:</p>
     * <ul>
     * <li><strong>NotStarted</strong>: not started.</li>
     * <li><strong>Prechecking</strong>: running a dry run.</li>
     * <li><strong>PrecheckFailed</strong>: dry run failed.</li>
     * <li><strong>PreCheckPass</strong>: dry run passed.</li>
     * <li><strong>NotConfigured</strong>: not configured.</li>
     * <li><strong>Migrating</strong>: migrating.</li>
     * <li><strong>Suspending</strong>: paused.</li>
     * <li><strong>MigrationFailed</strong>: migration failed.</li>
     * <li><strong>Finished</strong>: finished.</li>
     * <li><strong>Retrying</strong>: retrying.</li>
     * <li><strong>Upgrade</strong>: upgrading.</li>
     * <li><strong>Locked</strong>: locked.</li>
     * <li><strong>Downgrade</strong>: downgrading.</li>
     * </ul>
     * <p>Data synchronization node statuses:</p>
     * <ul>
     * <li><strong>NotStarted</strong>: not started.</li>
     * <li><strong>Prechecking</strong>: running a dry run.</li>
     * <li><strong>PrecheckFailed</strong>: dry run failed.</li>
     * <li><strong>PreCheckPass</strong>: dry run passed.</li>
     * <li><strong>NotConfigured</strong>: not configured.</li>
     * <li><strong>Initializing</strong>: performing initial synchronization.</li>
     * <li><strong>InitializeFailed</strong>: initial synchronization failed.</li>
     * <li><strong>Synchronizing</strong>: synchronizing.</li>
     * <li><strong>Failed</strong>: synchronization failed.</li>
     * <li><strong>Suspending</strong>: paused.</li>
     * <li><strong>Modifying</strong>: modifying sub-objects.</li>
     * <li><strong>Finished</strong>: finished.</li>
     * <li><strong>Retrying</strong>: retrying.</li>
     * <li><strong>Upgrade</strong>: upgrading.</li>
     * <li><strong>Locked</strong>: locked.</li>
     * <li><strong>Downgrade</strong>: downgrading.</li>
     * </ul>
     * <p>Subscribe node statuses:</p>
     * <ul>
     * <li><strong>NotConfigured</strong>: not configured.</li>
     * <li><strong>NotStarted</strong>: not started.</li>
     * <li><strong>Prechecking</strong>: running a dry run.</li>
     * <li><strong>PrecheckFailed</strong>: dry run failed.</li>
     * <li><strong>PreCheckPass</strong>: dry run passed.</li>
     * <li><strong>Starting</strong>: starting.</li>
     * <li><strong>Normal</strong>: Normal.</li>
     * <li><strong>Retrying</strong>: retrying.</li>
     * <li><strong>Abnormal</strong>: abnormal.</li>
     * <li><strong>Upgrade</strong>: upgrading.</li>
     * <li><strong>Locked</strong>: locked.</li>
     * <li><strong>Downgrade</strong>: downgrading.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Finished</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The query type. Valid values:  </p>
     * <ul>
     * <li><strong>name</strong>: queries by job name.  </li>
     * <li><strong>rds</strong>: queries by destination instance ID.  </li>
     * <li><strong>instance</strong>: queries by DTS instance ID.</li>
     * <li><strong>srcRds</strong>: queries by source instance ID.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter corresponds to the <strong>JobType</strong> parameter.</p>
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
