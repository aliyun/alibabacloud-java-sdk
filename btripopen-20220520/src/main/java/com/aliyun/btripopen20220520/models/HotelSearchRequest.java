// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelSearchRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("adult_num")
    public String adultNum;

    @NameInMap("brand_code")
    public java.util.List<String> brandCode;

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
     * <p>2023-02-22</p>
     */
    @NameInMap("check_in_date")
    public String checkInDate;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-02-22</p>
     */
    @NameInMap("check_out_date")
    public String checkOutDate;

    /**
     * <strong>example:</strong>
     * <p>330100</p>
     */
    @NameInMap("city_code")
    public String cityCode;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("dir")
    public Integer dir;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("distance")
    public Integer distance;

    /**
     * <strong>example:</strong>
     * <p>330000</p>
     */
    @NameInMap("district_code")
    public String districtCode;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("hotel_star")
    public String hotelStar;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("is_protocol")
    public Boolean isProtocol;

    @NameInMap("key_words")
    public String keyWords;

    /**
     * <strong>example:</strong>
     * <p>120.010059, 30.284666</p>
     */
    @NameInMap("location")
    public String location;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("max_price")
    public Double maxPrice;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("min_price")
    public Double minPrice;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page_no")
    public Integer pageNo;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("page_size")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pay_over_type")
    public Integer payOverType;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("payment_type")
    public Integer paymentType;

    @NameInMap("shids")
    public java.util.List<Long> shids;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("sort_code")
    public Integer sortCode;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
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
