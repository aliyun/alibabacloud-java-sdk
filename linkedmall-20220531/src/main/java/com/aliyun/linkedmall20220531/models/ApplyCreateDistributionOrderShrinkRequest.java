// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class ApplyCreateDistributionOrderShrinkRequest extends TeaModel {
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
    public String itemInfoListsShrink;

    @NameInMap("TenantId")
    public String tenantId;

    public static ApplyCreateDistributionOrderShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyCreateDistributionOrderShrinkRequest self = new ApplyCreateDistributionOrderShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ApplyCreateDistributionOrderShrinkRequest setBuyerId(String buyerId) {
        this.buyerId = buyerId;
        return this;
    }
    public String getBuyerId() {
        return this.buyerId;
    }

    public ApplyCreateDistributionOrderShrinkRequest setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
        return this;
    }
    public String getDeliveryAddress() {
        return this.deliveryAddress;
    }

    public ApplyCreateDistributionOrderShrinkRequest setDistributionOutTradeId(String distributionOutTradeId) {
        this.distributionOutTradeId = distributionOutTradeId;
        return this;
    }
    public String getDistributionOutTradeId() {
        return this.distributionOutTradeId;
    }

    public ApplyCreateDistributionOrderShrinkRequest setDistributionSupplierId(String distributionSupplierId) {
        this.distributionSupplierId = distributionSupplierId;
        return this;
    }
    public String getDistributionSupplierId() {
        return this.distributionSupplierId;
    }

    public ApplyCreateDistributionOrderShrinkRequest setDistributorId(String distributorId) {
        this.distributorId = distributorId;
        return this;
    }
    public String getDistributorId() {
        return this.distributorId;
    }

    public ApplyCreateDistributionOrderShrinkRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public ApplyCreateDistributionOrderShrinkRequest setItemInfoListsShrink(String itemInfoListsShrink) {
        this.itemInfoListsShrink = itemInfoListsShrink;
        return this;
    }
    public String getItemInfoListsShrink() {
        return this.itemInfoListsShrink;
    }

    public ApplyCreateDistributionOrderShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
