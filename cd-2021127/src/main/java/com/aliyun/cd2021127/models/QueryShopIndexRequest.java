// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class QueryShopIndexRequest extends TeaModel {
    @NameInMap("Country")
    public String country;

    @NameInMap("ShopIdList")
    public java.util.List<String> shopIdList;

    public static QueryShopIndexRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryShopIndexRequest self = new QueryShopIndexRequest();
        return TeaModel.build(map, self);
    }

    public QueryShopIndexRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public QueryShopIndexRequest setShopIdList(java.util.List<String> shopIdList) {
        this.shopIdList = shopIdList;
        return this;
    }
    public java.util.List<String> getShopIdList() {
        return this.shopIdList;
    }

}
