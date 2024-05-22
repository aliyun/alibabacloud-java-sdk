// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20190801.models;

import com.aliyun.tea.*;

public class DescribePlanogramRailsRequest extends TeaModel {
    @NameInMap("Layer")
    public String layer;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RailCode")
    public String railCode;

    @NameInMap("Shelf")
    public String shelf;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StoreId")
    public String storeId;

    public static DescribePlanogramRailsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePlanogramRailsRequest self = new DescribePlanogramRailsRequest();
        return TeaModel.build(map, self);
    }

    public DescribePlanogramRailsRequest setLayer(String layer) {
        this.layer = layer;
        return this;
    }
    public String getLayer() {
        return this.layer;
    }

    public DescribePlanogramRailsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribePlanogramRailsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePlanogramRailsRequest setRailCode(String railCode) {
        this.railCode = railCode;
        return this;
    }
    public String getRailCode() {
        return this.railCode;
    }

    public DescribePlanogramRailsRequest setShelf(String shelf) {
        this.shelf = shelf;
        return this;
    }
    public String getShelf() {
        return this.shelf;
    }

    public DescribePlanogramRailsRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

}
