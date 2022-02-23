// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csp20201020.models;

import com.aliyun.tea.*;

public class ListZonesRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static ListZonesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListZonesRequest self = new ListZonesRequest();
        return TeaModel.build(map, self);
    }

    public ListZonesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
