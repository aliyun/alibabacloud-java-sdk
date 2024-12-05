// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class StopDtsJobsRequest extends TeaModel {
    /**
     * <p>The ID of the data migration or data synchronization task.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>Separate multiple task IDs by <strong>,</strong> (commas).</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/209702.html">DescribeDtsJobs</a> operation to query task IDs.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>l5o11f9029c****</p>
     */
    @NameInMap("DtsJobIds")
    public String dtsJobIds;

    /**
     * <p>The region ID of the DTS instance. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">List of supported regions</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzsf6yoxhfpva</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Whether it is a seamless integration (Zero-ETL) task, the value can be:</p>
     * <ul>
     * <li><strong>false</strong>: No. - <strong>true</strong>: Yes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ZeroEtlJob")
    public Boolean zeroEtlJob;

    public static StopDtsJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        StopDtsJobsRequest self = new StopDtsJobsRequest();
        return TeaModel.build(map, self);
    }

    public StopDtsJobsRequest setDtsJobIds(String dtsJobIds) {
        this.dtsJobIds = dtsJobIds;
        return this;
    }
    public String getDtsJobIds() {
        return this.dtsJobIds;
    }

    public StopDtsJobsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public StopDtsJobsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public StopDtsJobsRequest setZeroEtlJob(Boolean zeroEtlJob) {
        this.zeroEtlJob = zeroEtlJob;
        return this;
    }
    public Boolean getZeroEtlJob() {
        return this.zeroEtlJob;
    }

}
