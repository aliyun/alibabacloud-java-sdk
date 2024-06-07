// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class CreatePickUpWaybillPreQueryShrinkRequest extends TeaModel {
    /**
     * <p>The consignee information.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ConsigneeInfo")
    public String consigneeInfoShrink;

    /**
     * <p>The code of the courier company. If no courier company is specified, the system allocates a courier company.</p>
     */
    @NameInMap("CpCode")
    public String cpCode;

    /**
     * <p>The identifier of the external channel source. It cannot contain underscores.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrderChannels")
    public String orderChannels;

    /**
     * <p>The order number of the access system.</p>
     */
    @NameInMap("OuterOrderCode")
    public String outerOrderCode;

    /**
     * <p>The estimated weight. Unit: gram.</p>
     * <br>
     * <p>>  If you need to query the estimated price, this parameter is required.</p>
     */
    @NameInMap("PreWeight")
    public String preWeight;

    /**
     * <p>The sender information.</p>
     * <br>
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
