// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ModifyJobStepCheckpointRequest extends TeaModel {
    /**
     * <p>The ID of the migration, synchronization, or tracking task.</p>
     * 
     * <strong>example:</strong>
     * <p>l5512es7w15****</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

    /**
     * <p>The task step ID, which corresponds to the <strong>synchronization</strong> step ID returned by the ListJobStep API.</p>
     * 
     * <strong>example:</strong>
     * <p>wn3z4ukia9wi9xu_0004_0000</p>
     */
    @NameInMap("JobStepId")
    public String jobStepId;

    /**
     * <p>The new offset as a UNIX timestamp in seconds. The specified value must fall within the offset range of the incremental data collection step.</p>
     * 
     * <strong>example:</strong>
     * <p>1760406***</p>
     */
    @NameInMap("NewCheckPoint")
    public Long newCheckPoint;

    /**
     * <p>The region where the DTS instance resides.</p>
     * <blockquote>
     * <p>For regions that support dedicated clusters, see <a href="https://help.aliyun.com/document_detail/417481.html">DTS dedicated cluster</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aek2ilvoxlrd***</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static ModifyJobStepCheckpointRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyJobStepCheckpointRequest self = new ModifyJobStepCheckpointRequest();
        return TeaModel.build(map, self);
    }

    public ModifyJobStepCheckpointRequest setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public ModifyJobStepCheckpointRequest setJobStepId(String jobStepId) {
        this.jobStepId = jobStepId;
        return this;
    }
    public String getJobStepId() {
        return this.jobStepId;
    }

    public ModifyJobStepCheckpointRequest setNewCheckPoint(Long newCheckPoint) {
        this.newCheckPoint = newCheckPoint;
        return this;
    }
    public Long getNewCheckPoint() {
        return this.newCheckPoint;
    }

    public ModifyJobStepCheckpointRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyJobStepCheckpointRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
