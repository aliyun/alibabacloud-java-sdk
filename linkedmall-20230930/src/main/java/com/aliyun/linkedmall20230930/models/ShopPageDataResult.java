// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class ShopPageDataResult extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>12****01</p>
     */
    @NameInMap("cooperationShops")
    public java.util.List<CooperationShop> cooperationShops;

    /**
     * <strong>example:</strong>
     * <p>2023-09-01 00:00:00</p>
     */
    @NameInMap("endDate")
    public String endDate;

    /**
     * <strong>example:</strong>
     * <p>PID56****2304</p>
     */
    @NameInMap("purchaserId")
    public String purchaserId;

    /**
     * <strong>example:</strong>
     * <p>22****09</p>
     */
    @NameInMap("shopId")
    public String shopId;

    /**
     * <strong>example:</strong>
     * <p>儿童座椅分销店铺</p>
     */
    @NameInMap("shopName")
    public String shopName;

    /**
     * <strong>example:</strong>
     * <p>DistributorQYG</p>
     */
    @NameInMap("shopType")
    public String shopType;

    /**
     * <strong>example:</strong>
     * <p>2023-09-01 00:00:00</p>
     */
    @NameInMap("startDate")
    public String startDate;

    /**
     * <strong>example:</strong>
     * <p>Working</p>
     */
    @NameInMap("status")
    public String status;

    public static ShopPageDataResult build(java.util.Map<String, ?> map) throws Exception {
        ShopPageDataResult self = new ShopPageDataResult();
        return TeaModel.build(map, self);
    }

    public ShopPageDataResult setCooperationShops(java.util.List<CooperationShop> cooperationShops) {
        this.cooperationShops = cooperationShops;
        return this;
    }
    public java.util.List<CooperationShop> getCooperationShops() {
        return this.cooperationShops;
    }

    public ShopPageDataResult setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public ShopPageDataResult setPurchaserId(String purchaserId) {
        this.purchaserId = purchaserId;
        return this;
    }
    public String getPurchaserId() {
        return this.purchaserId;
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
