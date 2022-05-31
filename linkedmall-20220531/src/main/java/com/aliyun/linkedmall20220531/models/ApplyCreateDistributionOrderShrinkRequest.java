// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class ApplyCreateDistributionOrderShrinkRequest extends TeaModel {
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
    public String itemInfoListsShrink;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

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

    public ApplyCreateDistributionOrderShrinkRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
