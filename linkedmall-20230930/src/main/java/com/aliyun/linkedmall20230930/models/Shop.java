// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class Shop extends TeaModel {
    /**
     * <p>The partner shops.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;shopId&quot;:&quot;22000019&quot;,&quot;cooperationCompanyId&quot;:&quot;11200003&quot;,&quot;cooperationShopId&quot;:&quot;21000026&quot;}]</p>
     */
    @NameInMap("cooperationShops")
    public java.util.List<CooperationShop> cooperationShops;

    /**
     * <p>The distributor ID.</p>
     * 
     * <strong>example:</strong>
     * <p>12****09</p>
     */
    @NameInMap("distributorId")
    public String distributorId;

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
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>48A34399-A72C-1E23-8388-7E63****E927</p>
     */
    @NameInMap("requestId")
    public String requestId;

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
     * <p>Children\&quot;s distribution shop</p>
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
