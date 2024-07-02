// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class Shop extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>12***01</p>
     */
    @NameInMap("cooperationShops")
    public java.util.List<CooperationShop> cooperationShops;

    /**
     * <strong>example:</strong>
     * <p>12****09</p>
     */
    @NameInMap("distributorId")
    public String distributorId;

    /**
     * <strong>example:</strong>
     * <p>2024-09-09 00:00:00</p>
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
     * <p>48A34399-A72C-1E23-8388-7E63****E927</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>22****09</p>
     */
    @NameInMap("shopId")
    public String shopId;

    /**
     * <strong>example:</strong>
     * <p>儿童分销店铺</p>
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
     * <p>2023-09-09 00:00:00</p>
     */
    @NameInMap("startDate")
    public String startDate;

    /**
     * <strong>example:</strong>
     * <p>Working</p>
     */
    @NameInMap("status")
    public String status;

    public static Shop build(java.util.Map<String, ?> map) throws Exception {
        Shop self = new Shop();
        return TeaModel.build(map, self);
    }

    public Shop setCooperationShops(java.util.List<CooperationShop> cooperationShops) {
        this.cooperationShops = cooperationShops;
        return this;
    }
    public java.util.List<CooperationShop> getCooperationShops() {
        return this.cooperationShops;
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

    public Shop setPurchaserId(String purchaserId) {
        this.purchaserId = purchaserId;
        return this;
    }
    public String getPurchaserId() {
        return this.purchaserId;
    }

    public Shop setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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
