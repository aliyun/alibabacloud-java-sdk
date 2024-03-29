// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class StartDtsJobsRequest extends TeaModel {
    /**
     * <p>The ID of the data migration or data synchronization task.</p>
     * <br>
     * <p>> </p>
     * <p>*   For multiple tasks, separate them with commas (**,**).</p>
     * <p>*   You can call the [DescribeDtsJobs](~~209702~~) operation to query the task ID.</p>
     */
    @NameInMap("DtsJobIds")
    public String dtsJobIds;

    /**
     * <p>The region ID of the DTS instance. For more information, see [List of supported regions](~~141033~~).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ZeroEtlJob")
    public Boolean zeroEtlJob;

    public static StartDtsJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        StartDtsJobsRequest self = new StartDtsJobsRequest();
        return TeaModel.build(map, self);
    }

    public StartDtsJobsRequest setDtsJobIds(String dtsJobIds) {
        this.dtsJobIds = dtsJobIds;
        return this;
    }
    public String getDtsJobIds() {
        return this.dtsJobIds;
    }

    public StartDtsJobsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public StartDtsJobsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public StartDtsJobsRequest setZeroEtlJob(Boolean zeroEtlJob) {
        this.zeroEtlJob = zeroEtlJob;
        return this;
    }
    public Boolean getZeroEtlJob() {
        return this.zeroEtlJob;
    }

}
