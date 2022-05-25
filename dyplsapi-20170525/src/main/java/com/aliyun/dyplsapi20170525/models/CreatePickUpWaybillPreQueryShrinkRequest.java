// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class CreatePickUpWaybillPreQueryShrinkRequest extends TeaModel {
    @NameInMap("ConsigneeInfo")
    public String consigneeInfoShrink;

    @NameInMap("CpCode")
    public String cpCode;

    @NameInMap("OrderChannels")
    public String orderChannels;

    @NameInMap("OuterOrderCode")
    public String outerOrderCode;

    @NameInMap("PreWeight")
    public String preWeight;

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
