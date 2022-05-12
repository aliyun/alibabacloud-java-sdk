// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class CreatePickUpWaybillShrinkRequest extends TeaModel {
    @NameInMap("AppointGotEndTime")
    public String appointGotEndTime;

    @NameInMap("AppointGotStartTime")
    public String appointGotStartTime;

    @NameInMap("BizType")
    public Integer bizType;

    @NameInMap("ConsigneeAddress")
    public String consigneeAddressShrink;

    @NameInMap("ConsigneeMobile")
    public String consigneeMobile;

    @NameInMap("ConsigneeName")
    public String consigneeName;

    @NameInMap("ConsigneePhone")
    public String consigneePhone;

    @NameInMap("CpCode")
    public String cpCode;

    @NameInMap("GoodsInfos")
    public String goodsInfosShrink;

    @NameInMap("OrderChannels")
    public String orderChannels;

    @NameInMap("OuterOrderCode")
    public String outerOrderCode;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("SendAddress")
    public String sendAddressShrink;

    @NameInMap("SendMobile")
    public String sendMobile;

    @NameInMap("SendName")
    public String sendName;

    @NameInMap("SendPhone")
    public String sendPhone;

    public static CreatePickUpWaybillShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePickUpWaybillShrinkRequest self = new CreatePickUpWaybillShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreatePickUpWaybillShrinkRequest setAppointGotEndTime(String appointGotEndTime) {
        this.appointGotEndTime = appointGotEndTime;
        return this;
    }
    public String getAppointGotEndTime() {
        return this.appointGotEndTime;
    }

    public CreatePickUpWaybillShrinkRequest setAppointGotStartTime(String appointGotStartTime) {
        this.appointGotStartTime = appointGotStartTime;
        return this;
    }
    public String getAppointGotStartTime() {
        return this.appointGotStartTime;
    }

    public CreatePickUpWaybillShrinkRequest setBizType(Integer bizType) {
        this.bizType = bizType;
        return this;
    }
    public Integer getBizType() {
        return this.bizType;
    }

    public CreatePickUpWaybillShrinkRequest setConsigneeAddressShrink(String consigneeAddressShrink) {
        this.consigneeAddressShrink = consigneeAddressShrink;
        return this;
    }
    public String getConsigneeAddressShrink() {
        return this.consigneeAddressShrink;
    }

    public CreatePickUpWaybillShrinkRequest setConsigneeMobile(String consigneeMobile) {
        this.consigneeMobile = consigneeMobile;
        return this;
    }
    public String getConsigneeMobile() {
        return this.consigneeMobile;
    }

    public CreatePickUpWaybillShrinkRequest setConsigneeName(String consigneeName) {
        this.consigneeName = consigneeName;
        return this;
    }
    public String getConsigneeName() {
        return this.consigneeName;
    }

    public CreatePickUpWaybillShrinkRequest setConsigneePhone(String consigneePhone) {
        this.consigneePhone = consigneePhone;
        return this;
    }
    public String getConsigneePhone() {
        return this.consigneePhone;
    }

    public CreatePickUpWaybillShrinkRequest setCpCode(String cpCode) {
        this.cpCode = cpCode;
        return this;
    }
    public String getCpCode() {
        return this.cpCode;
    }

    public CreatePickUpWaybillShrinkRequest setGoodsInfosShrink(String goodsInfosShrink) {
        this.goodsInfosShrink = goodsInfosShrink;
        return this;
    }
    public String getGoodsInfosShrink() {
        return this.goodsInfosShrink;
    }

    public CreatePickUpWaybillShrinkRequest setOrderChannels(String orderChannels) {
        this.orderChannels = orderChannels;
        return this;
    }
    public String getOrderChannels() {
        return this.orderChannels;
    }

    public CreatePickUpWaybillShrinkRequest setOuterOrderCode(String outerOrderCode) {
        this.outerOrderCode = outerOrderCode;
        return this;
    }
    public String getOuterOrderCode() {
        return this.outerOrderCode;
    }

    public CreatePickUpWaybillShrinkRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreatePickUpWaybillShrinkRequest setSendAddressShrink(String sendAddressShrink) {
        this.sendAddressShrink = sendAddressShrink;
        return this;
    }
    public String getSendAddressShrink() {
        return this.sendAddressShrink;
    }

    public CreatePickUpWaybillShrinkRequest setSendMobile(String sendMobile) {
        this.sendMobile = sendMobile;
        return this;
    }
    public String getSendMobile() {
        return this.sendMobile;
    }

    public CreatePickUpWaybillShrinkRequest setSendName(String sendName) {
        this.sendName = sendName;
        return this;
    }
    public String getSendName() {
        return this.sendName;
    }

    public CreatePickUpWaybillShrinkRequest setSendPhone(String sendPhone) {
        this.sendPhone = sendPhone;
        return this;
    }
    public String getSendPhone() {
        return this.sendPhone;
    }

}
