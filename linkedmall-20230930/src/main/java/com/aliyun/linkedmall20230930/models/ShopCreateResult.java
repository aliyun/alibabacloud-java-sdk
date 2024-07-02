// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class ShopCreateResult extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("shopId")
    public String shopId;

    /**
     * <strong>example:</strong>
     * <p>WORKING</p>
     */
    @NameInMap("shopStatus")
    public String shopStatus;

    public static ShopCreateResult build(java.util.Map<String, ?> map) throws Exception {
        ShopCreateResult self = new ShopCreateResult();
        return TeaModel.build(map, self);
    }

    public ShopCreateResult setShopId(String shopId) {
        this.shopId = shopId;
        return this;
    }
    public String getShopId() {
        return this.shopId;
    }

    public ShopCreateResult setShopStatus(String shopStatus) {
        this.shopStatus = shopStatus;
        return this;
    }
    public String getShopStatus() {
        return this.shopStatus;
    }

}
