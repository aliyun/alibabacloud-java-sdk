// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ModifyDtsJobDuLimitRequest extends TeaModel {
    /**
     * <p>The ID of the data migration, data synchronization, or change tracking task.</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

    /**
     * <p>The upper limit of DUs for the DTS task.</p>
     * <br>
     * <p>>  Minimum value: **1**.</p>
     */
    @NameInMap("DuLimit")
    public Long duLimit;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The ID of the region in which the DTS instance resides.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static ModifyDtsJobDuLimitRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDtsJobDuLimitRequest self = new ModifyDtsJobDuLimitRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDtsJobDuLimitRequest setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public ModifyDtsJobDuLimitRequest setDuLimit(Long duLimit) {
        this.duLimit = duLimit;
        return this;
    }
    public Long getDuLimit() {
        return this.duLimit;
    }

    public ModifyDtsJobDuLimitRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public ModifyDtsJobDuLimitRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDtsJobDuLimitRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
