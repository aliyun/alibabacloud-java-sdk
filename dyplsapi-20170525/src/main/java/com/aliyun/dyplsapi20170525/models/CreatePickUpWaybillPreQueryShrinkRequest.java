// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class CreatePickUpWaybillPreQueryShrinkRequest extends TeaModel {
    /**
     * <p>The recipient information.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ConsigneeInfo")
    public String consigneeInfoShrink;

    /**
     * <p>The courier company code. If not specified, the system automatically assigns a courier company.</p>
     * 
     * <strong>example:</strong>
     * <p>YTO</p>
     */
    @NameInMap("CpCode")
    public String cpCode;

    /**
     * <p>The external channel source identifier. The value cannot contain underscores. The value is agreed upon with the system during integration.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Test</p>
     */
    @NameInMap("OrderChannels")
    public String orderChannels;

    /**
     * <p>The order number in the caller\&quot;s system.</p>
     * 
     * <strong>example:</strong>
     * <p>787DFHHDS989****</p>
     */
    @NameInMap("OuterOrderCode")
    public String outerOrderCode;

    /**
     * <p>The estimated weight, in grams.</p>
     * <blockquote>
     * <p>If you want to query the estimated price, this parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2000</p>
     */
    @NameInMap("PreWeight")
    public String preWeight;

    /**
     * <p>The sender information.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SenderInfo")
    public String senderInfoShrink;

    public static CreatePickUpWaybillPreQueryShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePickUpWaybillPreQueryShrinkRequest self = new CreatePickUpWaybillPreQueryShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreatePickUpWaybillPreQueryShrinkRequest setConsigneeInfoShrink(String consigneeInfoShrink) {
        this.consigneeInfoShrink = consigneeInfoShrink;
        return this;
    }
    public String getConsigneeInfoShrink() {
        return this.consigneeInfoShrink;
    }

    public CreatePickUpWaybillPreQueryShrinkRequest setCpCode(String cpCode) {
        this.cpCode = cpCode;
        return this;
    }
    public String getCpCode() {
        return this.cpCode;
    }

    public CreatePickUpWaybillPreQueryShrinkRequest setOrderChannels(String orderChannels) {
        this.orderChannels = orderChannels;
        return this;
    }
    public String getOrderChannels() {
        return this.orderChannels;
    }

    public CreatePickUpWaybillPreQueryShrinkRequest setOuterOrderCode(String outerOrderCode) {
        this.outerOrderCode = outerOrderCode;
        return this;
    }
    public String getOuterOrderCode() {
        return this.outerOrderCode;
    }

    public CreatePickUpWaybillPreQueryShrinkRequest setPreWeight(String preWeight) {
        this.preWeight = preWeight;
        return this;
    }
    public String getPreWeight() {
        return this.preWeight;
    }

    public CreatePickUpWaybillPreQueryShrinkRequest setSenderInfoShrink(String senderInfoShrink) {
        this.senderInfoShrink = senderInfoShrink;
        return this;
    }
    public String getSenderInfoShrink() {
        return this.senderInfoShrink;
    }

}
