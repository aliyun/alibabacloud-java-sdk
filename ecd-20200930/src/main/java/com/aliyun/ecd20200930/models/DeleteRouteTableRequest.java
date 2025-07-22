// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteRouteTableRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RouteTableId")
    public String routeTableId;

    public static DeleteRouteTableRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRouteTableRequest self = new DeleteRouteTableRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRouteTableRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteRouteTableRequest setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }
    public String getRouteTableId() {
        return this.routeTableId;
    }

}
