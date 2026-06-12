// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkastreaming20260202.models;

import com.aliyun.tea.*;

public class CreateComputeInstanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PaidType")
    public Long paidType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CreateComputeInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateComputeInstanceRequest self = new CreateComputeInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateComputeInstanceRequest setPaidType(Long paidType) {
        this.paidType = paidType;
        return this;
    }
    public Long getPaidType() {
        return this.paidType;
    }

    public CreateComputeInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
