// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class GrantVirtualBorderRouterRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("VirtualBorderRouterId")
    public String virtualBorderRouterId;

    public static GrantVirtualBorderRouterRequest build(java.util.Map<String, ?> map) throws Exception {
        GrantVirtualBorderRouterRequest self = new GrantVirtualBorderRouterRequest();
        return TeaModel.build(map, self);
    }

    public GrantVirtualBorderRouterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GrantVirtualBorderRouterRequest setVirtualBorderRouterId(String virtualBorderRouterId) {
        this.virtualBorderRouterId = virtualBorderRouterId;
        return this;
    }
    public String getVirtualBorderRouterId() {
        return this.virtualBorderRouterId;
    }

}
