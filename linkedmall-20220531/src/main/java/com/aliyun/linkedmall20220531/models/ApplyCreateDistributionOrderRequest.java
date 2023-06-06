// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class ApplyCreateDistributionOrderRequest extends TeaModel {
    @NameInMap("BuyerId")
    public String buyerId;

    @NameInMap("DeliveryAddress")
    public String deliveryAddress;

    @NameInMap("DistributionOutTradeId")
    public String distributionOutTradeId;

    @NameInMap("DistributionSupplierId")
    public String distributionSupplierId;

    @NameInMap("DistributorId")
    public String distributorId;

    @NameInMap("ExtInfo")
    public String extInfo;

    @NameInMap("ItemInfoLists")
    public java.util.List<ApplyCreateDistributionOrderRequestItemInfoLists> itemInfoLists;

    @NameInMap("TenantId")
    public String tenantId;

    public static ApplyCreateDistributionOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyCreateDistributionOrderRequest self = new ApplyCreateDistributionOrderRequest();
        return TeaModel.build(map, self);
    }

    public ApplyCreateDistributionOrderRequest setBuyerId(String buyerId) {
        this.buyerId = buyerId;
        return this;
    }
    public String getBuyerId() {
        return this.buyerId;
    }

    public ApplyCreateDistributionOrderRequest setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
        return this;
    }
    public String getDeliveryAddress() {
        return this.deliveryAddress;
    }

    public ApplyCreateDistributionOrderRequest setDistributionOutTradeId(String distributionOutTradeId) {
        this.distributionOutTradeId = distributionOutTradeId;
        return this;
    }
    public String getDistributionOutTradeId() {
        return this.distributionOutTradeId;
    }

    public ApplyCreateDistributionOrderRequest setDistributionSupplierId(String distributionSupplierId) {
        this.distributionSupplierId = distributionSupplierId;
        return this;
    }
    public String getDistributionSupplierId() {
        return this.distributionSupplierId;
    }

    public ApplyCreateDistributionOrderRequest setDistributorId(String distributorId) {
        this.distributorId = distributorId;
        return this;
    }
    public String getDistributorId() {
        return this.distributorId;
    }

    public ApplyCreateDistributionOrderRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public ApplyCreateDistributionOrderRequest setItemInfoLists(java.util.List<ApplyCreateDistributionOrderRequestItemInfoLists> itemInfoLists) {
        this.itemInfoLists = itemInfoLists;
        return this;
    }
    public java.util.List<ApplyCreateDistributionOrderRequestItemInfoLists> getItemInfoLists() {
        return this.itemInfoLists;
    }

    public ApplyCreateDistributionOrderRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public static class ApplyCreateDistributionOrderRequestItemInfoLists extends TeaModel {
        @NameInMap("DistributionMallId")
        public String distributionMallId;

        @NameInMap("LmItemId")
        public String lmItemId;

        @NameInMap("Price")
        public Long price;

        @NameInMap("Quantity")
        public Integer quantity;

        /**
         * <p>SKU</p>
         */
        @NameInMap("SkuId")
        public String skuId;

        public static ApplyCreateDistributionOrderRequestItemInfoLists build(java.util.Map<String, ?> map) throws Exception {
            ApplyCreateDistributionOrderRequestItemInfoLists self = new ApplyCreateDistributionOrderRequestItemInfoLists();
            return TeaModel.build(map, self);
        }

        public ApplyCreateDistributionOrderRequestItemInfoLists setDistributionMallId(String distributionMallId) {
            this.distributionMallId = distributionMallId;
            return this;
        }
        public String getDistributionMallId() {
            return this.distributionMallId;
        }

        public ApplyCreateDistributionOrderRequestItemInfoLists setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public ApplyCreateDistributionOrderRequestItemInfoLists setPrice(Long price) {
            this.price = price;
            return this;
        }
        public Long getPrice() {
            return this.price;
        }

        public ApplyCreateDistributionOrderRequestItemInfoLists setQuantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }
        public Integer getQuantity() {
            return this.quantity;
        }

        public ApplyCreateDistributionOrderRequestItemInfoLists setSkuId(String skuId) {
            this.skuId = skuId;
            return this;
        }
        public String getSkuId() {
            return this.skuId;
        }

    }

}
