// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class RenderDistributionOrderRequest extends TeaModel {
    @NameInMap("BuyerId")
    public String buyerId;

    @NameInMap("DeliveryAddress")
    public String deliveryAddress;

    @NameInMap("DistributionSupplierId")
    public String distributionSupplierId;

    @NameInMap("DistributorId")
    public String distributorId;

    @NameInMap("ExtInfo")
    public String extInfo;

    @NameInMap("ItemInfoLists")
    public java.util.List<RenderDistributionOrderRequestItemInfoLists> itemInfoLists;

    @NameInMap("TenantId")
    public String tenantId;

    public static RenderDistributionOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        RenderDistributionOrderRequest self = new RenderDistributionOrderRequest();
        return TeaModel.build(map, self);
    }

    public RenderDistributionOrderRequest setBuyerId(String buyerId) {
        this.buyerId = buyerId;
        return this;
    }
    public String getBuyerId() {
        return this.buyerId;
    }

    public RenderDistributionOrderRequest setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
        return this;
    }
    public String getDeliveryAddress() {
        return this.deliveryAddress;
    }

    public RenderDistributionOrderRequest setDistributionSupplierId(String distributionSupplierId) {
        this.distributionSupplierId = distributionSupplierId;
        return this;
    }
    public String getDistributionSupplierId() {
        return this.distributionSupplierId;
    }

    public RenderDistributionOrderRequest setDistributorId(String distributorId) {
        this.distributorId = distributorId;
        return this;
    }
    public String getDistributorId() {
        return this.distributorId;
    }

    public RenderDistributionOrderRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public RenderDistributionOrderRequest setItemInfoLists(java.util.List<RenderDistributionOrderRequestItemInfoLists> itemInfoLists) {
        this.itemInfoLists = itemInfoLists;
        return this;
    }
    public java.util.List<RenderDistributionOrderRequestItemInfoLists> getItemInfoLists() {
        return this.itemInfoLists;
    }

    public RenderDistributionOrderRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public static class RenderDistributionOrderRequestItemInfoLists extends TeaModel {
        @NameInMap("DistributionMallId")
        public String distributionMallId;

        @NameInMap("LmItemId")
        public String lmItemId;

        @NameInMap("Quantity")
        public Integer quantity;

        @NameInMap("SkuId")
        public String skuId;

        public static RenderDistributionOrderRequestItemInfoLists build(java.util.Map<String, ?> map) throws Exception {
            RenderDistributionOrderRequestItemInfoLists self = new RenderDistributionOrderRequestItemInfoLists();
            return TeaModel.build(map, self);
        }

        public RenderDistributionOrderRequestItemInfoLists setDistributionMallId(String distributionMallId) {
            this.distributionMallId = distributionMallId;
            return this;
        }
        public String getDistributionMallId() {
            return this.distributionMallId;
        }

        public RenderDistributionOrderRequestItemInfoLists setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public RenderDistributionOrderRequestItemInfoLists setQuantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }
        public Integer getQuantity() {
            return this.quantity;
        }

        public RenderDistributionOrderRequestItemInfoLists setSkuId(String skuId) {
            this.skuId = skuId;
            return this;
        }
        public String getSkuId() {
            return this.skuId;
        }

    }

}
