// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ModifyDtsJobDuLimitRequest extends TeaModel {
    @NameInMap("DtsJobId")
    public String dtsJobId;

    @NameInMap("DuLimit")
    public Long duLimit;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("RegionId")
    public String regionId;

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

}
