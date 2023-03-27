// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class AddShopToGroupRequest extends TeaModel {
    @NameInMap("Country")
    public String country;

    @NameInMap("ShopGroupId")
    public String shopGroupId;

    @NameInMap("ShopIdList")
    public java.util.List<String> shopIdList;

    public static AddShopToGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AddShopToGroupRequest self = new AddShopToGroupRequest();
        return TeaModel.build(map, self);
    }

    public AddShopToGroupRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public AddShopToGroupRequest setShopGroupId(String shopGroupId) {
        this.shopGroupId = shopGroupId;
        return this;
    }
    public String getShopGroupId() {
        return this.shopGroupId;
    }

    public AddShopToGroupRequest setShopIdList(java.util.List<String> shopIdList) {
        this.shopIdList = shopIdList;
        return this;
    }
    public java.util.List<String> getShopIdList() {
        return this.shopIdList;
    }

}
