// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class RenderDistributionOrderShrinkRequest extends TeaModel {
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
    public String itemInfoListsShrink;

    @NameInMap("TenantId")
    public String tenantId;

    public static RenderDistributionOrderShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RenderDistributionOrderShrinkRequest self = new RenderDistributionOrderShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RenderDistributionOrderShrinkRequest setBuyerId(String buyerId) {
        this.buyerId = buyerId;
        return this;
    }
    public String getBuyerId() {
        return this.buyerId;
    }

    public RenderDistributionOrderShrinkRequest setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
        return this;
    }
    public String getDeliveryAddress() {
        return this.deliveryAddress;
    }

    public RenderDistributionOrderShrinkRequest setDistributionSupplierId(String distributionSupplierId) {
        this.distributionSupplierId = distributionSupplierId;
        return this;
    }
    public String getDistributionSupplierId() {
        return this.distributionSupplierId;
    }

    public RenderDistributionOrderShrinkRequest setDistributorId(String distributorId) {
        this.distributorId = distributorId;
        return this;
    }
    public String getDistributorId() {
        return this.distributorId;
    }

    public RenderDistributionOrderShrinkRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public RenderDistributionOrderShrinkRequest setItemInfoListsShrink(String itemInfoListsShrink) {
        this.itemInfoListsShrink = itemInfoListsShrink;
        return this;
    }
    public String getItemInfoListsShrink() {
        return this.itemInfoListsShrink;
    }

    public RenderDistributionOrderShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
