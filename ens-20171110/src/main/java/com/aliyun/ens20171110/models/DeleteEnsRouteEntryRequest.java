// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteEnsRouteEntryRequest extends TeaModel {
    @NameInMap("RouteEntryId")
    public String routeEntryId;

    public static DeleteEnsRouteEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEnsRouteEntryRequest self = new DeleteEnsRouteEntryRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEnsRouteEntryRequest setRouteEntryId(String routeEntryId) {
        this.routeEntryId = routeEntryId;
        return this;
    }
    public String getRouteEntryId() {
        return this.routeEntryId;
    }

}
