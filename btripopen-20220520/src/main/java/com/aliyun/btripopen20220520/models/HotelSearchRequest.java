// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelSearchRequest extends TeaModel {
    @NameInMap("adult_num")
    public String adultNum;

    @NameInMap("brand_code")
    public java.util.List<String> brandCode;

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
    public java.util.List<Long> shids;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("sort_code")
    public Integer sortCode;

    @NameInMap("super_man")
    public Integer superMan;

    public static HotelSearchRequest build(java.util.Map<String, ?> map) throws Exception {
        HotelSearchRequest self = new HotelSearchRequest();
        return TeaModel.build(map, self);
    }

    public HotelSearchRequest setAdultNum(String adultNum) {
        this.adultNum = adultNum;
        return this;
    }
    public String getAdultNum() {
        return this.adultNum;
    }

    public HotelSearchRequest setBrandCode(java.util.List<String> brandCode) {
        this.brandCode = brandCode;
        return this;
    }
    public java.util.List<String> getBrandCode() {
        return this.brandCode;
    }

    public HotelSearchRequest setBtripUserId(String btripUserId) {
        this.btripUserId = btripUserId;
        return this;
    }
    public String getBtripUserId() {
        return this.btripUserId;
    }

    public HotelSearchRequest setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
        return this;
    }
    public String getCheckInDate() {
        return this.checkInDate;
    }

    public HotelSearchRequest setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
        return this;
    }
    public String getCheckOutDate() {
        return this.checkOutDate;
    }

    public HotelSearchRequest setCityCode(String cityCode) {
        this.cityCode = cityCode;
        return this;
    }
    public String getCityCode() {
        return this.cityCode;
    }

    public HotelSearchRequest setDir(Integer dir) {
        this.dir = dir;
        return this;
    }
    public Integer getDir() {
        return this.dir;
    }

    public HotelSearchRequest setDistance(Integer distance) {
        this.distance = distance;
        return this;
    }
    public Integer getDistance() {
        return this.distance;
    }

    public HotelSearchRequest setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
        return this;
    }
    public String getDistrictCode() {
        return this.districtCode;
    }

    public HotelSearchRequest setHotelStar(String hotelStar) {
        this.hotelStar = hotelStar;
        return this;
    }
    public String getHotelStar() {
        return this.hotelStar;
    }

    public HotelSearchRequest setIsProtocol(Boolean isProtocol) {
        this.isProtocol = isProtocol;
        return this;
    }
    public Boolean getIsProtocol() {
        return this.isProtocol;
    }

    public HotelSearchRequest setKeyWords(String keyWords) {
        this.keyWords = keyWords;
        return this;
    }
    public String getKeyWords() {
        return this.keyWords;
    }

    public HotelSearchRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public HotelSearchRequest setMaxPrice(Double maxPrice) {
        this.maxPrice = maxPrice;
        return this;
    }
    public Double getMaxPrice() {
        return this.maxPrice;
    }

    public HotelSearchRequest setMinPrice(Double minPrice) {
        this.minPrice = minPrice;
        return this;
    }
    public Double getMinPrice() {
        return this.minPrice;
    }

    public HotelSearchRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public HotelSearchRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public HotelSearchRequest setPayOverType(Integer payOverType) {
        this.payOverType = payOverType;
        return this;
    }
    public Integer getPayOverType() {
        return this.payOverType;
    }

    public HotelSearchRequest setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public Integer getPaymentType() {
        return this.paymentType;
    }

    public HotelSearchRequest setShids(java.util.List<Long> shids) {
        this.shids = shids;
        return this;
    }
    public java.util.List<Long> getShids() {
        return this.shids;
    }

    public HotelSearchRequest setSortCode(Integer sortCode) {
        this.sortCode = sortCode;
        return this;
    }
    public Integer getSortCode() {
        return this.sortCode;
    }

    public HotelSearchRequest setSuperMan(Integer superMan) {
        this.superMan = superMan;
        return this;
    }
    public Integer getSuperMan() {
        return this.superMan;
    }

}
