// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class DeleteShopRequest extends TeaModel {
    @NameInMap("Country")
    public String country;

    @NameInMap("ShopId")
    public String shopId;

    public static DeleteShopRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteShopRequest self = new DeleteShopRequest();
        return TeaModel.build(map, self);
    }

    public DeleteShopRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public DeleteShopRequest setShopId(String shopId) {
        this.shopId = shopId;
        return this;
    }
    public String getShopId() {
        return this.shopId;
    }

}
