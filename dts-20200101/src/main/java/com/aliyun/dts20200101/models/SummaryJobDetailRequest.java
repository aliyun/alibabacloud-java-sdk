// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class SummaryJobDetailRequest extends TeaModel {
    /**
     * <p>The ID of the data migration or data synchronization instance.</p>
     * <br>
     * <p>>  You must specify at least one of the DtsJobId and DtsInstanceId parameters.</p>
     */
    @NameInMap("DtsInstanceId")
    public String dtsInstanceId;

    /**
     * <p>The ID of the data migration or data synchronization task.</p>
     * <br>
     * <p>>  You must specify at least one of the DtsJobId and DtsInstanceId parameters.</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

    /**
     * <p>The phase of the data migration task. Valid values:</p>
     * <br>
     * <p>*   **02**: The task is in the schema migration phase.</p>
     * <p>*   **03**: The task is in the incremental migration phase.</p>
     */
    @NameInMap("JobCode")
    public String jobCode;

    /**
     * <p>The region ID of the DTS instance. For more information, see [List of supported regions](~~141033~~).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The type of schema definition. Valid values:</p>
     * <br>
     * <p>*   **before**: schema migration or initial schema synchronization</p>
     * <p>*   **after**: DDL operations performed during incremental data migration or synchronization</p>
     */
    @NameInMap("StructType")
    public String structType;

    /**
     * <p>The synchronization direction of the data synchronization task. Valid values:</p>
     * <br>
     * <p>*   **Forward**: Data is synchronized from the source database to the destination database.</p>
     * <p>*   **Reverse**: Data is synchronized from the destination database to the source database.</p>
     * <br>
     * <p>> </p>
     * <p>*   Default value: **Forward**.</p>
     * <p>*   You can set this parameter to **Reverse** to delete the reverse synchronization task only if the topology is two-way synchronization.</p>
     */
    @NameInMap("SynchronizationDirection")
    public String synchronizationDirection;

    @NameInMap("ZeroEtlJob")
    public Boolean zeroEtlJob;

    public static SummaryJobDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        SummaryJobDetailRequest self = new SummaryJobDetailRequest();
        return TeaModel.build(map, self);
    }

    public SummaryJobDetailRequest setDtsInstanceId(String dtsInstanceId) {
        this.dtsInstanceId = dtsInstanceId;
        return this;
    }
    public String getDtsInstanceId() {
        return this.dtsInstanceId;
    }

    public SummaryJobDetailRequest setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public SummaryJobDetailRequest setJobCode(String jobCode) {
        this.jobCode = jobCode;
        return this;
    }
    public String getJobCode() {
        return this.jobCode;
    }

    public SummaryJobDetailRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SummaryJobDetailRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public SummaryJobDetailRequest setStructType(String structType) {
        this.structType = structType;
        return this;
    }
    public String getStructType() {
        return this.structType;
    }

    public SummaryJobDetailRequest setSynchronizationDirection(String synchronizationDirection) {
        this.synchronizationDirection = synchronizationDirection;
        return this;
    }
    public String getSynchronizationDirection() {
        return this.synchronizationDirection;
    }

    public SummaryJobDetailRequest setZeroEtlJob(Boolean zeroEtlJob) {
        this.zeroEtlJob = zeroEtlJob;
        return this;
    }
    public Boolean getZeroEtlJob() {
        return this.zeroEtlJob;
    }

}
