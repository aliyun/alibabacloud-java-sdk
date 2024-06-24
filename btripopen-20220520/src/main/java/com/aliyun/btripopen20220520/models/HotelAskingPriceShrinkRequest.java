// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelAskingPriceShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("adult_num")
    public String adultNum;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("btrip_user_id")
    public String btripUserId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-02-22 00:00:00</p>
     */
    @NameInMap("check_in_date")
    public String checkInDate;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-02-22 00:00:00</p>
     */
    @NameInMap("check_out_date")
    public String checkOutDate;

    /**
     * <strong>example:</strong>
     * <p>330100</p>
     */
    @NameInMap("city_code")
    public String cityCode;

    @NameInMap("city_name")
    public String cityName;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("dir")
    public Integer dir;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("hotel_star")
    public String hotelStar;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("is_protocol")
    public Boolean isProtocol;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("payment_type")
    public Integer paymentType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("shids")
    public String shidsShrink;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("sort_code")
    public Integer sortCode;

    public static HotelAskingPriceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        HotelAskingPriceShrinkRequest self = new HotelAskingPriceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public HotelAskingPriceShrinkRequest setAdultNum(String adultNum) {
        this.adultNum = adultNum;
        return this;
    }
    public String getAdultNum() {
        return this.adultNum;
    }

    public HotelAskingPriceShrinkRequest setBtripUserId(String btripUserId) {
        this.btripUserId = btripUserId;
        return this;
    }
    public String getBtripUserId() {
        return this.btripUserId;
    }

    public HotelAskingPriceShrinkRequest setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
        return this;
    }
    public String getCheckInDate() {
        return this.checkInDate;
    }

    public HotelAskingPriceShrinkRequest setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
        return this;
    }
    public String getCheckOutDate() {
        return this.checkOutDate;
    }

    public HotelAskingPriceShrinkRequest setCityCode(String cityCode) {
        this.cityCode = cityCode;
        return this;
    }
    public String getCityCode() {
        return this.cityCode;
    }

    public HotelAskingPriceShrinkRequest setCityName(String cityName) {
        this.cityName = cityName;
        return this;
    }
    public String getCityName() {
        return this.cityName;
    }

    public HotelAskingPriceShrinkRequest setDir(Integer dir) {
        this.dir = dir;
        return this;
    }
    public Integer getDir() {
        return this.dir;
    }

    public HotelAskingPriceShrinkRequest setHotelStar(String hotelStar) {
        this.hotelStar = hotelStar;
        return this;
    }
    public String getHotelStar() {
        return this.hotelStar;
    }

    public HotelAskingPriceShrinkRequest setIsProtocol(Boolean isProtocol) {
        this.isProtocol = isProtocol;
        return this;
    }
    public Boolean getIsProtocol() {
        return this.isProtocol;
    }

    public HotelAskingPriceShrinkRequest setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public Integer getPaymentType() {
        return this.paymentType;
    }

    public HotelAskingPriceShrinkRequest setShidsShrink(String shidsShrink) {
        this.shidsShrink = shidsShrink;
        return this;
    }
    public String getShidsShrink() {
        return this.shidsShrink;
    }

    public HotelAskingPriceShrinkRequest setSortCode(Integer sortCode) {
        this.sortCode = sortCode;
        return this;
    }
    public Integer getSortCode() {
        return this.sortCode;
    }

}
