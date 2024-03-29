// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DeleteDtsJobsRequest extends TeaModel {
    /**
     * <p>The ID of the data migration, data synchronization, or change tracking task.</p>
     * <br>
     * <p>> *   Separate multiple task IDs with commas (,).</p>
     * <p>> *   You can call the [DescribeDtsJobs](~~209702~~) operation to query task IDs.</p>
     */
    @NameInMap("DtsJobIds")
    public String dtsJobIds;

    /**
     * <p>The ID of the region in which the DTS instance resides. For more information, see [List of supported regions](~~141033~~).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ZeroEtlJob")
    public Boolean zeroEtlJob;

    public static DeleteDtsJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDtsJobsRequest self = new DeleteDtsJobsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDtsJobsRequest setDtsJobIds(String dtsJobIds) {
        this.dtsJobIds = dtsJobIds;
        return this;
    }
    public String getDtsJobIds() {
        return this.dtsJobIds;
    }

    public DeleteDtsJobsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteDtsJobsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DeleteDtsJobsRequest setZeroEtlJob(Boolean zeroEtlJob) {
        this.zeroEtlJob = zeroEtlJob;
        return this;
    }
    public Boolean getZeroEtlJob() {
        return this.zeroEtlJob;
    }

}
