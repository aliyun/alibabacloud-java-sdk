// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ModifyEnsRouteEntryRequest extends TeaModel {
    /**
     * <p>The description of the route entry. The description must be 1 to 256 characters in length and cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the custom route.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rte-5****</p>
     */
    @NameInMap("RouteEntryId")
    public String routeEntryId;

    /**
     * <p>The name of the route.</p>
     * <p>The name must be 1 to 128 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("RouteEntryName")
    public String routeEntryName;

    public static ModifyEnsRouteEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyEnsRouteEntryRequest self = new ModifyEnsRouteEntryRequest();
        return TeaModel.build(map, self);
    }

    public ModifyEnsRouteEntryRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyEnsRouteEntryRequest setRouteEntryId(String routeEntryId) {
        this.routeEntryId = routeEntryId;
        return this;
    }
    public String getRouteEntryId() {
        return this.routeEntryId;
    }

    public ModifyEnsRouteEntryRequest setRouteEntryName(String routeEntryName) {
        this.routeEntryName = routeEntryName;
        return this;
    }
    public String getRouteEntryName() {
        return this.routeEntryName;
    }

}
