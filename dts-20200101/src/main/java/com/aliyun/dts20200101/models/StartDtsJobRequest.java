// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class StartDtsJobRequest extends TeaModel {
    /**
     * <p>The ID of the data migration, data synchronization, or change tracking instance.</p>
     * <br>
     * <p>>  You can call the [DescribeMigrationJobs](~~208139~~), [DescribeSubscriptionInstances](~~49442~~), or [DescribeSynchronizationJobs](~~49454~~) operation to query the instance ID</p>
     */
    @NameInMap("DtsInstanceId")
    public String dtsInstanceId;

    /**
     * <p>The ID of the data migration, data synchronization, or change tracking task.</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

    /**
     * <p>The region ID of the Data Transmission Service (DTS) instance. For more information, see [List of supported regions](~~141033~~).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The synchronization direction. Default value: Forward. Valid values:</p>
     * <br>
     * <p>*   **Forward**: Data is synchronized from the source database to the destination database.</p>
     * <br>
     * <p>*   **Reverse**: Data is synchronized from the destination database to the source database.</p>
     * <br>
     * <p>>You can set this parameter to **Reverse** to start the reverse synchronization task only if the topology is two-way synchronization.</p>
     */
    @NameInMap("SynchronizationDirection")
    public String synchronizationDirection;

    @NameInMap("ZeroEtlJob")
    public Boolean zeroEtlJob;

    public static StartDtsJobRequest build(java.util.Map<String, ?> map) throws Exception {
        StartDtsJobRequest self = new StartDtsJobRequest();
        return TeaModel.build(map, self);
    }

    public StartDtsJobRequest setDtsInstanceId(String dtsInstanceId) {
        this.dtsInstanceId = dtsInstanceId;
        return this;
    }
    public String getDtsInstanceId() {
        return this.dtsInstanceId;
    }

    public StartDtsJobRequest setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public StartDtsJobRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public StartDtsJobRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public StartDtsJobRequest setSynchronizationDirection(String synchronizationDirection) {
        this.synchronizationDirection = synchronizationDirection;
        return this;
    }
    public String getSynchronizationDirection() {
        return this.synchronizationDirection;
    }

    public StartDtsJobRequest setZeroEtlJob(Boolean zeroEtlJob) {
        this.zeroEtlJob = zeroEtlJob;
        return this;
    }
    public Boolean getZeroEtlJob() {
        return this.zeroEtlJob;
    }

}
