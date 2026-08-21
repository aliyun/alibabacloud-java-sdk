// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class TicketCreateOrderShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("AccountNo")
    public Long accountNo;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Contact")
    public String contactShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("DistributorOrderId")
    public String distributorOrderId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrderProduct")
    public String orderProductShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Quantity")
    public Integer quantity;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TotalDistributionPrice")
    public String totalDistributionPriceShrink;

    @NameInMap("Travelers")
    public String travelersShrink;

    public static TicketCreateOrderShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        TicketCreateOrderShrinkRequest self = new TicketCreateOrderShrinkRequest();
        return TeaModel.build(map, self);
    }

    public TicketCreateOrderShrinkRequest setAccountNo(Long accountNo) {
        this.accountNo = accountNo;
        return this;
    }
    public Long getAccountNo() {
        return this.accountNo;
    }

    public TicketCreateOrderShrinkRequest setContactShrink(String contactShrink) {
        this.contactShrink = contactShrink;
        return this;
    }
    public String getContactShrink() {
        return this.contactShrink;
    }

    public TicketCreateOrderShrinkRequest setDistributorOrderId(String distributorOrderId) {
        this.distributorOrderId = distributorOrderId;
        return this;
    }
    public String getDistributorOrderId() {
        return this.distributorOrderId;
    }

    public TicketCreateOrderShrinkRequest setOrderProductShrink(String orderProductShrink) {
        this.orderProductShrink = orderProductShrink;
        return this;
    }
    public String getOrderProductShrink() {
        return this.orderProductShrink;
    }

    public TicketCreateOrderShrinkRequest setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }
    public Integer getQuantity() {
        return this.quantity;
    }

    public TicketCreateOrderShrinkRequest setTotalDistributionPriceShrink(String totalDistributionPriceShrink) {
        this.totalDistributionPriceShrink = totalDistributionPriceShrink;
        return this;
    }
    public String getTotalDistributionPriceShrink() {
        return this.totalDistributionPriceShrink;
    }

    public TicketCreateOrderShrinkRequest setTravelersShrink(String travelersShrink) {
        this.travelersShrink = travelersShrink;
        return this;
    }
    public String getTravelersShrink() {
        return this.travelersShrink;
    }

}
