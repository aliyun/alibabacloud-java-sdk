// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class ShopPageDataResult extends TeaModel {
    @NameInMap("channelSupplierId")
    public String channelSupplierId;

    @NameInMap("endDate")
    public String endDate;

    @NameInMap("shopId")
    public String shopId;

    @NameInMap("shopName")
    public String shopName;

    @NameInMap("shopType")
    public String shopType;

    @NameInMap("startDate")
    public String startDate;

    @NameInMap("status")
    public String status;

    public static ShopPageDataResult build(java.util.Map<String, ?> map) throws Exception {
        ShopPageDataResult self = new ShopPageDataResult();
        return TeaModel.build(map, self);
    }

    public ShopPageDataResult setChannelSupplierId(String channelSupplierId) {
        this.channelSupplierId = channelSupplierId;
        return this;
    }
    public String getChannelSupplierId() {
        return this.channelSupplierId;
    }

    public ShopPageDataResult setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public ShopPageDataResult setShopId(String shopId) {
        this.shopId = shopId;
        return this;
    }
    public String getShopId() {
        return this.shopId;
    }

    public ShopPageDataResult setShopName(String shopName) {
        this.shopName = shopName;
        return this;
    }
    public String getShopName() {
        return this.shopName;
    }

    public ShopPageDataResult setShopType(String shopType) {
        this.shopType = shopType;
        return this;
    }
    public String getShopType() {
        return this.shopType;
    }

    public ShopPageDataResult setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public ShopPageDataResult setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
