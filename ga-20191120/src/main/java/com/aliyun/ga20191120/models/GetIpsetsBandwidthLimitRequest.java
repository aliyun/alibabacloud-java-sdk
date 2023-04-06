// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class GetIpsetsBandwidthLimitRequest extends TeaModel {
    /**
     * <p>The ID of the GA instance to be queried.</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The ID of the region where the Global Accelerator (GA) instance is deployed. Set the value to **cn-hangzhou**.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetIpsetsBandwidthLimitRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIpsetsBandwidthLimitRequest self = new GetIpsetsBandwidthLimitRequest();
        return TeaModel.build(map, self);
    }

    public GetIpsetsBandwidthLimitRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public GetIpsetsBandwidthLimitRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
