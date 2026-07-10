// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelPricePullShrinkRequest extends TeaModel {
    @NameInMap("btrip_user_id")
    public String btripUserId;

    @NameInMap("check_in")
    public String checkIn;

    @NameInMap("check_out")
    public String checkOut;

    @NameInMap("city_code")
    public Integer cityCode;

    @NameInMap("hotel_ids")
    public String hotelIdsShrink;

    @NameInMap("payment_type")
    public Integer paymentType;

    public static HotelPricePullShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        HotelPricePullShrinkRequest self = new HotelPricePullShrinkRequest();
        return TeaModel.build(map, self);
    }

    public HotelPricePullShrinkRequest setBtripUserId(String btripUserId) {
        this.btripUserId = btripUserId;
        return this;
    }
    public String getBtripUserId() {
        return this.btripUserId;
    }

    public HotelPricePullShrinkRequest setCheckIn(String checkIn) {
        this.checkIn = checkIn;
        return this;
    }
    public String getCheckIn() {
        return this.checkIn;
    }

    public HotelPricePullShrinkRequest setCheckOut(String checkOut) {
        this.checkOut = checkOut;
        return this;
    }
    public String getCheckOut() {
        return this.checkOut;
    }

    public HotelPricePullShrinkRequest setCityCode(Integer cityCode) {
        this.cityCode = cityCode;
        return this;
    }
    public Integer getCityCode() {
        return this.cityCode;
    }

    public HotelPricePullShrinkRequest setHotelIdsShrink(String hotelIdsShrink) {
        this.hotelIdsShrink = hotelIdsShrink;
        return this;
    }
    public String getHotelIdsShrink() {
        return this.hotelIdsShrink;
    }

    public HotelPricePullShrinkRequest setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public Integer getPaymentType() {
        return this.paymentType;
    }

}
