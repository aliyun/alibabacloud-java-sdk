// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class Shop extends TeaModel {
    @NameInMap("channelSupplierId")
    public String channelSupplierId;

    @NameInMap("distributorId")
    public String distributorId;

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

    public static Shop build(java.util.Map<String, ?> map) throws Exception {
        Shop self = new Shop();
        return TeaModel.build(map, self);
    }

    public Shop setChannelSupplierId(String channelSupplierId) {
        this.channelSupplierId = channelSupplierId;
        return this;
    }
    public String getChannelSupplierId() {
        return this.channelSupplierId;
    }

    public Shop setDistributorId(String distributorId) {
        this.distributorId = distributorId;
        return this;
    }
    public String getDistributorId() {
        return this.distributorId;
    }

    public Shop setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public Shop setShopId(String shopId) {
        this.shopId = shopId;
        return this;
    }
    public String getShopId() {
        return this.shopId;
    }

    public Shop setShopName(String shopName) {
        this.shopName = shopName;
        return this;
    }
    public String getShopName() {
        return this.shopName;
    }

    public Shop setShopType(String shopType) {
        this.shopType = shopType;
        return this;
    }
    public String getShopType() {
        return this.shopType;
    }

    public Shop setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public Shop setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
