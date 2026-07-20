// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class KeywordSuggestInfo extends TeaModel {
    /**
     * <p>The address.</p>
     * 
     * <strong>example:</strong>
     * <p>杭州湖墅南路XX号</p>
     */
    @NameInMap("address")
    public String address;

    /**
     * <p>The business area.</p>
     */
    @NameInMap("business_area_with_city")
    public KeywordSuggestInfo businessAreaWithCity;

    /**
     * <p>The city code.</p>
     * 
     * <strong>example:</strong>
     * <p>300100</p>
     */
    @NameInMap("city_code")
    public Integer cityCode;

    /**
     * <p>The city name.</p>
     * 
     * <strong>example:</strong>
     * <p>杭州</p>
     */
    @NameInMap("city_name")
    public String cityName;

    /**
     * <p>The display name.</p>
     * 
     * <strong>example:</strong>
     * <p>杭州JW万豪酒店</p>
     */
    @NameInMap("display_name")
    public String displayName;

    /**
     * <p>The hotel ID.</p>
     * 
     * <strong>example:</strong>
     * <p>53853318</p>
     */
    @NameInMap("hotel_id")
    public String hotelId;

    /**
     * <p>The icon.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://gw.alicdn.com/imgextra/i3/O1CN01qKg25r1rKLOKxT3vB_!!6000000005612-2-tps-32-32.png">https://gw.alicdn.com/imgextra/i3/O1CN01qKg25r1rKLOKxT3vB_!!6000000005612-2-tps-32-32.png</a></p>
     */
    @NameInMap("icon")
    public String icon;

    /**
     * <p>The rating.</p>
     * 
     * <strong>example:</strong>
     * <p>4.8分</p>
     */
    @NameInMap("point")
    public String point;

    /**
     * <p>The hotel starting price, in CNY.</p>
     * 
     * <strong>example:</strong>
     * <p>524</p>
     */
    @NameInMap("price")
    public String price;

    /**
     * <p>The region.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("region")
    public Integer region;

    /**
     * <p>The type.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("type")
    public Integer type;

    /**
     * <p>The type description.</p>
     * 
     * <strong>example:</strong>
     * <p>酒店</p>
     */
    @NameInMap("type_desc")
    public String typeDesc;

    public static KeywordSuggestInfo build(java.util.Map<String, ?> map) throws Exception {
        KeywordSuggestInfo self = new KeywordSuggestInfo();
        return TeaModel.build(map, self);
    }

    public KeywordSuggestInfo setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public KeywordSuggestInfo setBusinessAreaWithCity(KeywordSuggestInfo businessAreaWithCity) {
        this.businessAreaWithCity = businessAreaWithCity;
        return this;
    }
    public KeywordSuggestInfo getBusinessAreaWithCity() {
        return this.businessAreaWithCity;
    }

    public KeywordSuggestInfo setCityCode(Integer cityCode) {
        this.cityCode = cityCode;
        return this;
    }
    public Integer getCityCode() {
        return this.cityCode;
    }

    public KeywordSuggestInfo setCityName(String cityName) {
        this.cityName = cityName;
        return this;
    }
    public String getCityName() {
        return this.cityName;
    }

    public KeywordSuggestInfo setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public KeywordSuggestInfo setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public KeywordSuggestInfo setIcon(String icon) {
        this.icon = icon;
        return this;
    }
    public String getIcon() {
        return this.icon;
    }

    public KeywordSuggestInfo setPoint(String point) {
        this.point = point;
        return this;
    }
    public String getPoint() {
        return this.point;
    }

    public KeywordSuggestInfo setPrice(String price) {
        this.price = price;
        return this;
    }
    public String getPrice() {
        return this.price;
    }

    public KeywordSuggestInfo setRegion(Integer region) {
        this.region = region;
        return this;
    }
    public Integer getRegion() {
        return this.region;
    }

    public KeywordSuggestInfo setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public KeywordSuggestInfo setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
        return this;
    }
    public String getTypeDesc() {
        return this.typeDesc;
    }

}
