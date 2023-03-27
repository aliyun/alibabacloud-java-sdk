// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class UpdateShopGroupRequest extends TeaModel {
    @NameInMap("Country")
    public String country;

    @NameInMap("ShopGroupId")
    public String shopGroupId;

    @NameInMap("ShopGroupName")
    public String shopGroupName;

    public static UpdateShopGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateShopGroupRequest self = new UpdateShopGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateShopGroupRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public UpdateShopGroupRequest setShopGroupId(String shopGroupId) {
        this.shopGroupId = shopGroupId;
        return this;
    }
    public String getShopGroupId() {
        return this.shopGroupId;
    }

    public UpdateShopGroupRequest setShopGroupName(String shopGroupName) {
        this.shopGroupName = shopGroupName;
        return this;
    }
    public String getShopGroupName() {
        return this.shopGroupName;
    }

}
