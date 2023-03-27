// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class DeleteShopGroupRequest extends TeaModel {
    @NameInMap("Country")
    public String country;

    @NameInMap("ShopGroupId")
    public String shopGroupId;

    public static DeleteShopGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteShopGroupRequest self = new DeleteShopGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteShopGroupRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public DeleteShopGroupRequest setShopGroupId(String shopGroupId) {
        this.shopGroupId = shopGroupId;
        return this;
    }
    public String getShopGroupId() {
        return this.shopGroupId;
    }

}
