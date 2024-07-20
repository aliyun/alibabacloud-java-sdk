// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListAccelerateAreasRequest extends TeaModel {
    /**
     * <p>The region ID of the Global Accelerator (GA) instance. Set the value to <strong>cn-hangzhou</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListAccelerateAreasRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAccelerateAreasRequest self = new ListAccelerateAreasRequest();
        return TeaModel.build(map, self);
    }

    public ListAccelerateAreasRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
