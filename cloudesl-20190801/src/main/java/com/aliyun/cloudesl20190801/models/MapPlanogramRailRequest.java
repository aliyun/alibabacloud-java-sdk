// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20190801.models;

import com.aliyun.tea.*;

public class MapPlanogramRailRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Layer")
    public String layer;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RailCode")
    public String railCode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Shelf")
    public String shelf;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StoreId")
    public String storeId;

    public static MapPlanogramRailRequest build(java.util.Map<String, ?> map) throws Exception {
        MapPlanogramRailRequest self = new MapPlanogramRailRequest();
        return TeaModel.build(map, self);
    }

    public MapPlanogramRailRequest setLayer(String layer) {
        this.layer = layer;
        return this;
    }
    public String getLayer() {
        return this.layer;
    }

    public MapPlanogramRailRequest setRailCode(String railCode) {
        this.railCode = railCode;
        return this;
    }
    public String getRailCode() {
        return this.railCode;
    }

    public MapPlanogramRailRequest setShelf(String shelf) {
        this.shelf = shelf;
        return this;
    }
    public String getShelf() {
        return this.shelf;
    }

    public MapPlanogramRailRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

}
