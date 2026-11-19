// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class ShopPageDataResult extends TeaModel {
    /**
     * <p>The partner shops.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;shopId&quot;:&quot;22000019&quot;,&quot;cooperationCompanyId&quot;:&quot;11200003&quot;,&quot;cooperationShopId&quot;:&quot;21000026&quot;}]</p>
     */
    @NameInMap("cooperationShops")
    public java.util.List<CooperationShop> cooperationShops;

    /**
     * <p>The end time.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-09-11T12:22:24.000+08:00</p>
     */
    @NameInMap("endDate")
    public String endDate;

    /**
     * <p>The purchaser ID.</p>
     * 
     * <strong>example:</strong>
     * <p>PID56****2304</p>
     */
    @NameInMap("purchaserId")
    public String purchaserId;

    /**
     * <p>The shop ID.</p>
     * 
     * <strong>example:</strong>
     * <p>22****09</p>
     */
    @NameInMap("shopId")
    public String shopId;

    /**
     * <p>The shop name.</p>
     * 
     * <strong>example:</strong>
     * <p>Child seat distribution shop</p>
     */
    @NameInMap("shopName")
    public String shopName;

    /**
     * <p>The shop type.</p>
     * 
     * <strong>example:</strong>
     * <p>DistributorQYG</p>
     */
    @NameInMap("shopType")
    public String shopType;

    /**
     * <p>The start time.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-09-11T12:22:24.000+08:00</p>
     */
    @NameInMap("startDate")
    public String startDate;

    /**
     * <p>The shop status.</p>
     * 
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
