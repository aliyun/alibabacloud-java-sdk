// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelAskingPriceRequest extends TeaModel {
    @NameInMap("adult_num")
    public String adultNum;

    @NameInMap("btrip_user_id")
    public String btripUserId;

    @NameInMap("check_in_date")
    public String checkInDate;

    @NameInMap("check_out_date")
    public String checkOutDate;

    @NameInMap("city_code")
    public String cityCode;

    @NameInMap("city_name")
    public String cityName;

    @NameInMap("dir")
    public Integer dir;

    @NameInMap("hotel_star")
    public String hotelStar;

    @NameInMap("is_protocol")
    public Boolean isProtocol;

    @NameInMap("payment_type")
    public Integer paymentType;

    @NameInMap("shids")
    public java.util.List<Long> shids;

    @NameInMap("sort_code")
    public Integer sortCode;

    public static HotelAskingPriceRequest build(java.util.Map<String, ?> map) throws Exception {
        HotelAskingPriceRequest self = new HotelAskingPriceRequest();
        return TeaModel.build(map, self);
    }

    public HotelAskingPriceRequest setAdultNum(String adultNum) {
        this.adultNum = adultNum;
        return this;
    }
    public String getAdultNum() {
        return this.adultNum;
    }

    public HotelAskingPriceRequest setBtripUserId(String btripUserId) {
        this.btripUserId = btripUserId;
        return this;
    }
    public String getBtripUserId() {
        return this.btripUserId;
    }

    public HotelAskingPriceRequest setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
        return this;
    }
    public String getCheckInDate() {
        return this.checkInDate;
    }

    public HotelAskingPriceRequest setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
        return this;
    }
    public String getCheckOutDate() {
        return this.checkOutDate;
    }

    public HotelAskingPriceRequest setCityCode(String cityCode) {
        this.cityCode = cityCode;
        return this;
    }
    public String getCityCode() {
        return this.cityCode;
    }

    public HotelAskingPriceRequest setCityName(String cityName) {
        this.cityName = cityName;
        return this;
    }
    public String getCityName() {
        return this.cityName;
    }

    public HotelAskingPriceRequest setDir(Integer dir) {
        this.dir = dir;
        return this;
    }
    public Integer getDir() {
        return this.dir;
    }

    public HotelAskingPriceRequest setHotelStar(String hotelStar) {
        this.hotelStar = hotelStar;
        return this;
    }
    public String getHotelStar() {
        return this.hotelStar;
    }

    public HotelAskingPriceRequest setIsProtocol(Boolean isProtocol) {
        this.isProtocol = isProtocol;
        return this;
    }
    public Boolean getIsProtocol() {
        return this.isProtocol;
    }

    public HotelAskingPriceRequest setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public Integer getPaymentType() {
        return this.paymentType;
    }

    public HotelAskingPriceRequest setShids(java.util.List<Long> shids) {
        this.shids = shids;
        return this;
    }
    public java.util.List<Long> getShids() {
        return this.shids;
    }

    public HotelAskingPriceRequest setSortCode(Integer sortCode) {
        this.sortCode = sortCode;
        return this;
    }
    public Integer getSortCode() {
        return this.sortCode;
    }

}
