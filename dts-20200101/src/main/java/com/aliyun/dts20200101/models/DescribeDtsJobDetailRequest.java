// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeDtsJobDetailRequest extends TeaModel {
    /**
     * <p>DescribeDtsJobDetail</p>
     * 
     * <strong>example:</strong>
     * <p>dtsta7w132u12h****</p>
     */
    @NameInMap("DtsInstanceID")
    public String dtsInstanceID;

    /**
     * <p>The state of the data migration or data synchronization task.</p>
     * <p>Valid values for a data migration task:</p>
     * <ul>
     * <li><strong>NotStarted</strong>: The migration is not started.</li>
     * <li><strong>Migrating</strong>: The migration is in progress.</li>
     * <li><strong>Failed</strong>: The migration failed.</li>
     * <li><strong>Finished</strong>: The migration is complete.</li>
     * </ul>
     * <p>Valid values for a data synchronization task:</p>
     * <ul>
     * <li><strong>NotStarted</strong>: The task is not started.</li>
     * <li><strong>Prechecking</strong>: The task is in precheck.</li>
     * <li><strong>PrecheckFailed</strong>: The task failed to pass the precheck.</li>
     * <li><strong>Initializing</strong>: The task is performing initial synchronization.</li>
     * <li><strong>InitializeFailed</strong>: Initial synchronization failed.</li>
     * <li><strong>Synchronizing</strong>: The task is in progress.</li>
     * <li><strong>Failed</strong>: The task failed to synchronize data.</li>
     * <li><strong>Suspending</strong>: The task is paused.</li>
     * <li><strong>Modifying</strong>: The objects in the task are being modified.</li>
     * <li><strong>Finished</strong>: The task is complete.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ta7w132u12h****</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

    /**
     * <p>The ID of the data migration, data synchronization, or change tracking task.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <strong>example:</strong>
     * <p>默认为false，返回最近的一个同步子任务</p>
     */
    @NameInMap("SyncSubJobHistory")
    public Boolean syncSubJobHistory;

    /**
     * <p>Queries the details of a data migration, data synchronization, or change tracking task.</p>
     * 
     * <strong>example:</strong>
     * <p>Forward</p>
     */
    @NameInMap("SynchronizationDirection")
    public String synchronizationDirection;

    @NameInMap("ZeroEtlJob")
    public Boolean zeroEtlJob;

    public static DescribeDtsJobDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDtsJobDetailRequest self = new DescribeDtsJobDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDtsJobDetailRequest setDtsInstanceID(String dtsInstanceID) {
        this.dtsInstanceID = dtsInstanceID;
        return this;
    }
    public String getDtsInstanceID() {
        return this.dtsInstanceID;
    }

    public DescribeDtsJobDetailRequest setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public DescribeDtsJobDetailRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDtsJobDetailRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeDtsJobDetailRequest setSyncSubJobHistory(Boolean syncSubJobHistory) {
        this.syncSubJobHistory = syncSubJobHistory;
        return this;
    }
    public Boolean getSyncSubJobHistory() {
        return this.syncSubJobHistory;
    }

    public DescribeDtsJobDetailRequest setSynchronizationDirection(String synchronizationDirection) {
        this.synchronizationDirection = synchronizationDirection;
        return this;
    }
    public String getSynchronizationDirection() {
        return this.synchronizationDirection;
    }

    public DescribeDtsJobDetailRequest setZeroEtlJob(Boolean zeroEtlJob) {
        this.zeroEtlJob = zeroEtlJob;
        return this;
    }
    public Boolean getZeroEtlJob() {
        return this.zeroEtlJob;
    }

}
