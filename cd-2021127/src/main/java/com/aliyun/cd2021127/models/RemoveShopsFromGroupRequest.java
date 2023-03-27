// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class RemoveShopsFromGroupRequest extends TeaModel {
    @NameInMap("Country")
    public String country;

    @NameInMap("ShopGroupId")
    public String shopGroupId;

    @NameInMap("ShopIdList")
    public java.util.List<String> shopIdList;

    public static RemoveShopsFromGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveShopsFromGroupRequest self = new RemoveShopsFromGroupRequest();
        return TeaModel.build(map, self);
    }

    public RemoveShopsFromGroupRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public RemoveShopsFromGroupRequest setShopGroupId(String shopGroupId) {
        this.shopGroupId = shopGroupId;
        return this;
    }
    public String getShopGroupId() {
        return this.shopGroupId;
    }

    public RemoveShopsFromGroupRequest setShopIdList(java.util.List<String> shopIdList) {
        this.shopIdList = shopIdList;
        return this;
    }
    public java.util.List<String> getShopIdList() {
        return this.shopIdList;
    }

}
