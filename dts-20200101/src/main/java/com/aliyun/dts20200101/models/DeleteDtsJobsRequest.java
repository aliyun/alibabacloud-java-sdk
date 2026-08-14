// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DeleteDtsJobsRequest extends TeaModel {
    /**
     * <p>The IDs of the data migration, data synchronization, or change tracking tasks.</p>
     * <blockquote>
     * <ul>
     * <li>You can specify up to 10 task IDs, separated by commas (,).</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>You can call <a href="https://help.aliyun.com/document_detail/209702.html">DescribeDtsJobs</a> to query the DTS task IDs.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>l5o11f9029c****</p>
     */
    @NameInMap("DtsJobIds")
    public String dtsJobIds;

    /**
     * <p>The region in which the DTS instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">List of supported regions</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>A special parameter for specific business scenarios. You do not need to configure this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>rg3m1213ye7l****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>A special parameter for specific business scenarios. You do not need to configure this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
