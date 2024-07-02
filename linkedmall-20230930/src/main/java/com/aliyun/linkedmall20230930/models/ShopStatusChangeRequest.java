// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class ShopStatusChangeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("shopId")
    public String shopId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>WORKING</p>
     */
    @NameInMap("shopStatus")
    public String shopStatus;

    public static ShopStatusChangeRequest build(java.util.Map<String, ?> map) throws Exception {
        ShopStatusChangeRequest self = new ShopStatusChangeRequest();
        return TeaModel.build(map, self);
    }

    public ShopStatusChangeRequest setShopId(String shopId) {
        this.shopId = shopId;
        return this;
    }
    public String getShopId() {
        return this.shopId;
    }

    public ShopStatusChangeRequest setShopStatus(String shopStatus) {
        this.shopStatus = shopStatus;
        return this;
    }
    public String getShopStatus() {
        return this.shopStatus;
    }

}
