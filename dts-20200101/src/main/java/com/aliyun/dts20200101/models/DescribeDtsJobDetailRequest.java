// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeDtsJobDetailRequest extends TeaModel {
    /**
     * <p>DescribeDtsJobDetail</p>
     */
    @NameInMap("DtsInstanceID")
    public String dtsInstanceID;

    /**
     * <p>The state of the data migration or data synchronization task.</p>
     * <br>
     * <p>Valid values for a data migration task:</p>
     * <br>
     * <p>*   **NotStarted**: The migration is not started.</p>
     * <p>*   **Migrating**: The migration is in progress.</p>
     * <p>*   **Failed**: The migration failed.</p>
     * <p>*   **Finished**: The migration is complete.</p>
     * <br>
     * <p>Valid values for a data synchronization task:</p>
     * <br>
     * <p>*   **NotStarted**: The task is not started.</p>
     * <p>*   **Prechecking**: The task is in precheck.</p>
     * <p>*   **PrecheckFailed**: The task failed to pass the precheck.</p>
     * <p>*   **Initializing**: The task is performing initial synchronization.</p>
     * <p>*   **InitializeFailed**: Initial synchronization failed.</p>
     * <p>*   **Synchronizing**: The task is in progress.</p>
     * <p>*   **Failed**: The task failed to synchronize data.</p>
     * <p>*   **Suspending**: The task is paused.</p>
     * <p>*   **Modifying**: The objects in the task are being modified.</p>
     * <p>*   **Finished**: The task is complete.</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

    /**
     * <p>The ID of the data migration, data synchronization, or change tracking task.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("SyncSubJobHistory")
    public Boolean syncSubJobHistory;

    /**
     * <p>Queries the details of a data migration, data synchronization, or change tracking task.</p>
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
