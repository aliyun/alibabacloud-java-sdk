// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelSearchShrinkRequest extends TeaModel {
    @NameInMap("adult_num")
    public String adultNum;

    @NameInMap("brand_code")
    public String brandCodeShrink;

    @NameInMap("btrip_user_id")
    public String btripUserId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("check_in_date")
    public String checkInDate;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("check_out_date")
    public String checkOutDate;

    @NameInMap("city_code")
    public String cityCode;

    @NameInMap("dir")
    public Integer dir;

    @NameInMap("distance")
    public Integer distance;

    @NameInMap("district_code")
    public String districtCode;

    @NameInMap("hotel_star")
    public String hotelStar;

    @NameInMap("is_protocol")
    public Boolean isProtocol;

    @NameInMap("key_words")
    public String keyWords;

    @NameInMap("location")
    public String location;

    @NameInMap("max_price")
    public Double maxPrice;

    @NameInMap("min_price")
    public Double minPrice;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("page_no")
    public Integer pageNo;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("page_size")
    public Integer pageSize;

    @NameInMap("pay_over_type")
    public Integer payOverType;

    @NameInMap("payment_type")
    public Integer paymentType;

    @NameInMap("shids")
    public String shidsShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("sort_code")
    public Integer sortCode;

    @NameInMap("super_man")
    public Integer superMan;

    public static HotelSearchShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        HotelSearchShrinkRequest self = new HotelSearchShrinkRequest();
        return TeaModel.build(map, self);
    }

    public HotelSearchShrinkRequest setAdultNum(String adultNum) {
        this.adultNum = adultNum;
        return this;
    }
    public String getAdultNum() {
        return this.adultNum;
    }

    public HotelSearchShrinkRequest setBrandCodeShrink(String brandCodeShrink) {
        this.brandCodeShrink = brandCodeShrink;
        return this;
    }
    public String getBrandCodeShrink() {
        return this.brandCodeShrink;
    }

    public HotelSearchShrinkRequest setBtripUserId(String btripUserId) {
        this.btripUserId = btripUserId;
        return this;
    }
    public String getBtripUserId() {
        return this.btripUserId;
    }

    public HotelSearchShrinkRequest setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
        return this;
    }
    public String getCheckInDate() {
        return this.checkInDate;
    }

    public HotelSearchShrinkRequest setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
        return this;
    }
    public String getCheckOutDate() {
        return this.checkOutDate;
    }

    public HotelSearchShrinkRequest setCityCode(String cityCode) {
        this.cityCode = cityCode;
        return this;
    }
    public String getCityCode() {
        return this.cityCode;
    }

    public HotelSearchShrinkRequest setDir(Integer dir) {
        this.dir = dir;
        return this;
    }
    public Integer getDir() {
        return this.dir;
    }

    public HotelSearchShrinkRequest setDistance(Integer distance) {
        this.distance = distance;
        return this;
    }
    public Integer getDistance() {
        return this.distance;
    }

    public HotelSearchShrinkRequest setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
        return this;
    }
    public String getDistrictCode() {
        return this.districtCode;
    }

    public HotelSearchShrinkRequest setHotelStar(String hotelStar) {
        this.hotelStar = hotelStar;
        return this;
    }
    public String getHotelStar() {
        return this.hotelStar;
    }

    public HotelSearchShrinkRequest setIsProtocol(Boolean isProtocol) {
        this.isProtocol = isProtocol;
        return this;
    }
    public Boolean getIsProtocol() {
        return this.isProtocol;
    }

    public HotelSearchShrinkRequest setKeyWords(String keyWords) {
        this.keyWords = keyWords;
        return this;
    }
    public String getKeyWords() {
        return this.keyWords;
    }

    public HotelSearchShrinkRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public HotelSearchShrinkRequest setMaxPrice(Double maxPrice) {
        this.maxPrice = maxPrice;
        return this;
    }
    public Double getMaxPrice() {
        return this.maxPrice;
    }

    public HotelSearchShrinkRequest setMinPrice(Double minPrice) {
        this.minPrice = minPrice;
        return this;
    }
    public Double getMinPrice() {
        return this.minPrice;
    }

    public HotelSearchShrinkRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public HotelSearchShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public HotelSearchShrinkRequest setPayOverType(Integer payOverType) {
        this.payOverType = payOverType;
        return this;
    }
    public Integer getPayOverType() {
        return this.payOverType;
    }

    public HotelSearchShrinkRequest setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public Integer getPaymentType() {
        return this.paymentType;
    }

    public HotelSearchShrinkRequest setShidsShrink(String shidsShrink) {
        this.shidsShrink = shidsShrink;
        return this;
    }
    public String getShidsShrink() {
        return this.shidsShrink;
    }

    public HotelSearchShrinkRequest setSortCode(Integer sortCode) {
        this.sortCode = sortCode;
        return this;
    }
    public Integer getSortCode() {
        return this.sortCode;
    }

    public HotelSearchShrinkRequest setSuperMan(Integer superMan) {
        this.superMan = superMan;
        return this;
    }
    public Integer getSuperMan() {
        return this.superMan;
    }

}
