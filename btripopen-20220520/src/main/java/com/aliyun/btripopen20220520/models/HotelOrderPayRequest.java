// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelOrderPayRequest extends TeaModel {
    /**
     * <p>供应商订单号（取自创单返回的订单号）</p>
     */
    @NameInMap("btrip_order_id")
    public Long btripOrderId;

    @NameInMap("btrip_user_id")
    public String btripUserId;

    @NameInMap("company_pay_fee")
    public Long companyPayFee;

    @NameInMap("person_pay_fee")
    public Long personPayFee;

    @NameInMap("third_pay_account")
    public String thirdPayAccount;

    @NameInMap("third_trade_no")
    public String thirdTradeNo;

    @NameInMap("total_price")
    public Long totalPrice;

    public static HotelOrderPayRequest build(java.util.Map<String, ?> map) throws Exception {
        HotelOrderPayRequest self = new HotelOrderPayRequest();
        return TeaModel.build(map, self);
    }

    public HotelOrderPayRequest setBtripOrderId(Long btripOrderId) {
        this.btripOrderId = btripOrderId;
        return this;
    }
    public Long getBtripOrderId() {
        return this.btripOrderId;
    }

    public HotelOrderPayRequest setBtripUserId(String btripUserId) {
        this.btripUserId = btripUserId;
        return this;
    }
    public String getBtripUserId() {
        return this.btripUserId;
    }

    public HotelOrderPayRequest setCompanyPayFee(Long companyPayFee) {
        this.companyPayFee = companyPayFee;
        return this;
    }
    public Long getCompanyPayFee() {
        return this.companyPayFee;
    }

    public HotelOrderPayRequest setPersonPayFee(Long personPayFee) {
        this.personPayFee = personPayFee;
        return this;
    }
    public Long getPersonPayFee() {
        return this.personPayFee;
    }

    public HotelOrderPayRequest setThirdPayAccount(String thirdPayAccount) {
        this.thirdPayAccount = thirdPayAccount;
        return this;
    }
    public String getThirdPayAccount() {
        return this.thirdPayAccount;
    }

    public HotelOrderPayRequest setThirdTradeNo(String thirdTradeNo) {
        this.thirdTradeNo = thirdTradeNo;
        return this;
    }
    public String getThirdTradeNo() {
        return this.thirdTradeNo;
    }

    public HotelOrderPayRequest setTotalPrice(Long totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }
    public Long getTotalPrice() {
        return this.totalPrice;
    }

}
