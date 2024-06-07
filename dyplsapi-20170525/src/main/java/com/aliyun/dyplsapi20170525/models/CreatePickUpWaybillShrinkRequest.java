// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class CreatePickUpWaybillShrinkRequest extends TeaModel {
    /**
     * <p>The end time of the door-to-door pickup in the appointment. The value of **AppointGotEndTime** is the value of **EndTime** of **AppointTimes** in **CpTimeSelectList** returned by the [CreatePickUpWaybillPreQuery](~~CreatePickUpWaybillPreQuery~~#resultMapping) operation.</p>
     * <br>
     * <p>>  This parameter is required when **BizType** is set to **1**.</p>
     */
    @NameInMap("AppointGotEndTime")
    public String appointGotEndTime;

    /**
     * <p>The start time of the door-to-door pickup in the appointment. The value of **AppointGotStartTime** is the value of **StartTime** of **AppointTimes** in **CpTimeSelectList** returned by the [CreatePickUpWaybillPreQuery](~~CreatePickUpWaybillPreQuery~~#resultMapping) operation.</p>
     * <br>
     * <p>>  This parameter is required when **BizType** is set to **1**.</p>
     */
    @NameInMap("AppointGotStartTime")
    public String appointGotStartTime;

    /**
     * <p>The pickup mode. Valid values:</p>
     * <br>
     * <p>*   **0** (default): real-time order.</p>
     * <p>*   **1**: appointment order.</p>
     */
    @NameInMap("BizType")
    public Integer bizType;

    /**
     * <p>The address of the consignee.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ConsigneeAddress")
    public String consigneeAddressShrink;

    /**
     * <p>The mobile phone number of the consignee.</p>
     * <br>
     * <p>>  Either ConsigneeMobile or ConsigneePhone must be set.</p>
     */
    @NameInMap("ConsigneeMobile")
    public String consigneeMobile;

    /**
     * <p>The name of the consignee.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ConsigneeName")
    public String consigneeName;

    /**
     * <p>The landline phone number of the consignee.</p>
     * <br>
     * <p>>  Either ConsigneeMobile or ConsigneePhone must be set.</p>
     */
    @NameInMap("ConsigneePhone")
    public String consigneePhone;

    /**
     * <p>The code of the courier company.</p>
     */
    @NameInMap("CpCode")
    public String cpCode;

    /**
     * <p>The items.</p>
     */
    @NameInMap("GoodsInfos")
    public String goodsInfosShrink;

    /**
     * <p>The external channel sources.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrderChannels")
    public String orderChannels;

    /**
     * <p>The ID of the external order.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OuterOrderCode")
    public String outerOrderCode;

    /**
     * <p>The additional information about the order. The additional information will be printed on the order.</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The address of the sender.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SendAddress")
    public String sendAddressShrink;

    /**
     * <p>The mobile phone number of the sender.</p>
     * <br>
     * <p>>  Either SendMobile or SendPhone must be set.</p>
     */
    @NameInMap("SendMobile")
    public String sendMobile;

    /**
     * <p>The name of the sender.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SendName")
    public String sendName;

    /**
     * <p>The landline phone number of the sender.</p>
     * <br>
     * <p>>  Either SendMobile or SendPhone must be set.</p>
     */
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
