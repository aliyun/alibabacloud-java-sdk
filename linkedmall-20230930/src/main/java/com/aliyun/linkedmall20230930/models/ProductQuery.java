// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class ProductQuery extends TeaModel {
    @NameInMap("distributorShopId")
    public String distributorShopId;

    @NameInMap("divisionCode")
    public String divisionCode;

    public static ProductQuery build(java.util.Map<String, ?> map) throws Exception {
        ProductQuery self = new ProductQuery();
        return TeaModel.build(map, self);
    }

    public ProductQuery setDistributorShopId(String distributorShopId) {
        this.distributorShopId = distributorShopId;
        return this;
    }
    public String getDistributorShopId() {
        return this.distributorShopId;
    }

    public ProductQuery setDivisionCode(String divisionCode) {
        this.divisionCode = divisionCode;
        return this;
    }
    public String getDivisionCode() {
        return this.divisionCode;
    }

}
