// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelGoodsQueryRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("adult_num")
    public String adultNum;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("agreement_price")
    public Boolean agreementPrice;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-02-27</p>
     */
    @NameInMap("begin_date")
    public String beginDate;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("breakfast_included")
    public Boolean breakfastIncluded;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("btrip_user_id")
    public String btripUserId;

    /**
     * <strong>example:</strong>
     * <p>330100</p>
     */
    @NameInMap("city_code")
    public String cityCode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-02-28</p>
     */
    @NameInMap("end_date")
    public String endDate;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>182873</p>
     */
    @NameInMap("hotel_id")
    public String hotelId;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("pay_over_type")
    public Integer payOverType;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("payment_type")
    public Integer paymentType;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("special_invoice")
    public Boolean specialInvoice;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("super_man")
    public Integer superMan;

    public static HotelGoodsQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        HotelGoodsQueryRequest self = new HotelGoodsQueryRequest();
        return TeaModel.build(map, self);
    }

    public HotelGoodsQueryRequest setAdultNum(String adultNum) {
        this.adultNum = adultNum;
        return this;
    }
    public String getAdultNum() {
        return this.adultNum;
    }

    public HotelGoodsQueryRequest setAgreementPrice(Boolean agreementPrice) {
        this.agreementPrice = agreementPrice;
        return this;
    }
    public Boolean getAgreementPrice() {
        return this.agreementPrice;
    }

    public HotelGoodsQueryRequest setBeginDate(String beginDate) {
        this.beginDate = beginDate;
        return this;
    }
    public String getBeginDate() {
        return this.beginDate;
    }

    public HotelGoodsQueryRequest setBreakfastIncluded(Boolean breakfastIncluded) {
        this.breakfastIncluded = breakfastIncluded;
        return this;
    }
    public Boolean getBreakfastIncluded() {
        return this.breakfastIncluded;
    }

    public HotelGoodsQueryRequest setBtripUserId(String btripUserId) {
        this.btripUserId = btripUserId;
        return this;
    }
    public String getBtripUserId() {
        return this.btripUserId;
    }

    public HotelGoodsQueryRequest setCityCode(String cityCode) {
        this.cityCode = cityCode;
        return this;
    }
    public String getCityCode() {
        return this.cityCode;
    }

    public HotelGoodsQueryRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public HotelGoodsQueryRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public HotelGoodsQueryRequest setPayOverType(Integer payOverType) {
        this.payOverType = payOverType;
        return this;
    }
    public Integer getPayOverType() {
        return this.payOverType;
    }

    public HotelGoodsQueryRequest setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public Integer getPaymentType() {
        return this.paymentType;
    }

    public HotelGoodsQueryRequest setSpecialInvoice(Boolean specialInvoice) {
        this.specialInvoice = specialInvoice;
        return this;
    }
    public Boolean getSpecialInvoice() {
        return this.specialInvoice;
    }

    public HotelGoodsQueryRequest setSuperMan(Integer superMan) {
        this.superMan = superMan;
        return this;
    }
    public Integer getSuperMan() {
        return this.superMan;
    }

}
