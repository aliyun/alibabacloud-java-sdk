// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ModifyJobStepCheckpointRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>l5512es7w15****</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

    /**
     * <strong>example:</strong>
     * <p>wn3z4ukia9wi9xu_0004_0000</p>
     */
    @NameInMap("JobStepId")
    public String jobStepId;

    /**
     * <strong>example:</strong>
     * <p>1760406***</p>
     */
    @NameInMap("NewCheckPoint")
    public Long newCheckPoint;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
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
