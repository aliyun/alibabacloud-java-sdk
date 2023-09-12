// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class GetProductSaleInfoRequest extends TeaModel {
    @NameInMap("distributorShopId")
    public String distributorShopId;

    @NameInMap("divisionCode")
    public String divisionCode;

    public static GetProductSaleInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProductSaleInfoRequest self = new GetProductSaleInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetProductSaleInfoRequest setDistributorShopId(String distributorShopId) {
        this.distributorShopId = distributorShopId;
        return this;
    }
    public String getDistributorShopId() {
        return this.distributorShopId;
    }

    public GetProductSaleInfoRequest setDivisionCode(String divisionCode) {
        this.divisionCode = divisionCode;
        return this;
    }
    public String getDivisionCode() {
        return this.divisionCode;
    }

}
