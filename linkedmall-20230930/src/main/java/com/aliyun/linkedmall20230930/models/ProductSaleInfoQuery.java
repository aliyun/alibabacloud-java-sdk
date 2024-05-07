// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class ProductSaleInfoQuery extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("distributorShopId")
    public String distributorShopId;

    @NameInMap("divisionCode")
    public String divisionCode;

    public static ProductSaleInfoQuery build(java.util.Map<String, ?> map) throws Exception {
        ProductSaleInfoQuery self = new ProductSaleInfoQuery();
        return TeaModel.build(map, self);
    }

    public ProductSaleInfoQuery setDistributorShopId(String distributorShopId) {
        this.distributorShopId = distributorShopId;
        return this;
    }
    public String getDistributorShopId() {
        return this.distributorShopId;
    }

    public ProductSaleInfoQuery setDivisionCode(String divisionCode) {
        this.divisionCode = divisionCode;
        return this;
    }
    public String getDivisionCode() {
        return this.divisionCode;
    }

}
