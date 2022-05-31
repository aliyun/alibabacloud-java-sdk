// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class ApplyCreateDistributionOrderRequest extends TeaModel {
    // 分销真实买家ID
    @NameInMap("BuyerId")
    public String buyerId;

    // 收货地址
    @NameInMap("DeliveryAddress")
    public String deliveryAddress;

    // 渠道供应商ID
    @NameInMap("DistributionSupplierId")
    public String distributionSupplierId;

    // 分销商ID
    @NameInMap("DistributorId")
    public String distributorId;

    // 扩展信息
    @NameInMap("ExtInfo")
    public String extInfo;

    // 商品信息
    @NameInMap("ItemInfoLists")
    public java.util.List<ApplyCreateDistributionOrderRequestItemInfoLists> itemInfoLists;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

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

    public ApplyCreateDistributionOrderRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ApplyCreateDistributionOrderRequestItemInfoLists extends TeaModel {
        @NameInMap("DistributionMallId")
        public String distributionMallId;

        @NameInMap("LmItemId")
        public String lmItemId;

        @NameInMap("Quantity")
        public Integer quantity;

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
