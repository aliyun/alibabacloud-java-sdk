// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class UpdateShopGroupRequest extends TeaModel {
    // 门店组编号（ID）
    @NameInMap("ShopGroupId")
    public String shopGroupId;

    // 门店组名称
    @NameInMap("ShopGroupName")
    public String shopGroupName;

    public static UpdateShopGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateShopGroupRequest self = new UpdateShopGroupRequest();
        return TeaModel.build(map, self);
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
