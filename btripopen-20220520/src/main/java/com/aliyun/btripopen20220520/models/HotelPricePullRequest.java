// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelPricePullRequest extends TeaModel {
    @NameInMap("btrip_user_id")
    public String btripUserId;

    @NameInMap("check_in")
    public String checkIn;

    @NameInMap("check_out")
    public String checkOut;

    @NameInMap("city_code")
    public Integer cityCode;

    @NameInMap("hotel_ids")
    public java.util.List<String> hotelIds;

    @NameInMap("payment_type")
    public Integer paymentType;

    public static HotelPricePullRequest build(java.util.Map<String, ?> map) throws Exception {
        HotelPricePullRequest self = new HotelPricePullRequest();
        return TeaModel.build(map, self);
    }

    public HotelPricePullRequest setBtripUserId(String btripUserId) {
        this.btripUserId = btripUserId;
        return this;
    }
    public String getBtripUserId() {
        return this.btripUserId;
    }

    public HotelPricePullRequest setCheckIn(String checkIn) {
        this.checkIn = checkIn;
        return this;
    }
    public String getCheckIn() {
        return this.checkIn;
    }

    public HotelPricePullRequest setCheckOut(String checkOut) {
        this.checkOut = checkOut;
        return this;
    }
    public String getCheckOut() {
        return this.checkOut;
    }

    public HotelPricePullRequest setCityCode(Integer cityCode) {
        this.cityCode = cityCode;
        return this;
    }
    public Integer getCityCode() {
        return this.cityCode;
    }

    public HotelPricePullRequest setHotelIds(java.util.List<String> hotelIds) {
        this.hotelIds = hotelIds;
        return this;
    }
    public java.util.List<String> getHotelIds() {
        return this.hotelIds;
    }

    public HotelPricePullRequest setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public Integer getPaymentType() {
        return this.paymentType;
    }

}
