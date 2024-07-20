// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListAvailableAccelerateAreasRequest extends TeaModel {
    /**
     * <p>The ID of the GA instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ga-bp1yeeq8yfoyszmqy****</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The ID of the region where the Global Accelerator (GA) instance is deployed. Set the value to <strong>cn-hangzhou</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListAvailableAccelerateAreasRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAvailableAccelerateAreasRequest self = new ListAvailableAccelerateAreasRequest();
        return TeaModel.build(map, self);
    }

    public ListAvailableAccelerateAreasRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public ListAvailableAccelerateAreasRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
