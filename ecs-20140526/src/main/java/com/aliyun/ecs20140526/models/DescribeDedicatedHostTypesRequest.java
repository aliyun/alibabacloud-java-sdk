// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostTypesRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("DedicatedHostType")
    public String dedicatedHostType;

    @NameInMap("SupportedInstanceTypeFamily")
    public String supportedInstanceTypeFamily;

    public static DescribeDedicatedHostTypesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedHostTypesRequest self = new DescribeDedicatedHostTypesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedHostTypesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDedicatedHostTypesRequest setDedicatedHostType(String dedicatedHostType) {
        this.dedicatedHostType = dedicatedHostType;
        return this;
    }
    public String getDedicatedHostType() {
        return this.dedicatedHostType;
    }

    public DescribeDedicatedHostTypesRequest setSupportedInstanceTypeFamily(String supportedInstanceTypeFamily) {
        this.supportedInstanceTypeFamily = supportedInstanceTypeFamily;
        return this;
    }
    public String getSupportedInstanceTypeFamily() {
        return this.supportedInstanceTypeFamily;
    }

}
