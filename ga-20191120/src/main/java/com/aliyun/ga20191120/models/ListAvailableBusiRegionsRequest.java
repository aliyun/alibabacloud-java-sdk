// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListAvailableBusiRegionsRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("AcceleratorId")
    public String acceleratorId;

    public static ListAvailableBusiRegionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAvailableBusiRegionsRequest self = new ListAvailableBusiRegionsRequest();
        return TeaModel.build(map, self);
    }

    public ListAvailableBusiRegionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListAvailableBusiRegionsRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

}
