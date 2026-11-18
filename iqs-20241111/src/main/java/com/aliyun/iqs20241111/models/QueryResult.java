// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class QueryResult extends TeaModel {
    /**
     * <p>The list of returned locations.</p>
     */
    @NameInMap("data")
    public java.util.List<QueryResultData> data;

    /**
     * <p>The unique request ID for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>15A85F99-408F-5BFA-B617-0C7D3E732ABD</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static QueryResult build(java.util.Map<String, ?> map) throws Exception {
        QueryResult self = new QueryResult();
        return TeaModel.build(map, self);
    }

    public QueryResult setData(java.util.List<QueryResultData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryResultData> getData() {
        return this.data;
    }

    public QueryResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryResultDataImages extends TeaModel {
        /**
         * <p>The image name.</p>
         * 
         * <strong>example:</strong>
         * <p>Lobby</p>
         */
        @NameInMap("title")
        public String title;

        /**
         * <p>The image URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://store.example.com/showpic/e76beb3bedca3fe0375cef12742ea23e">http://store.example.com/showpic/e76beb3bedca3fe0375cef12742ea23e</a></p>
         */
        @NameInMap("url")
        public String url;

        public static QueryResultDataImages build(java.util.Map<String, ?> map) throws Exception {
            QueryResultDataImages self = new QueryResultDataImages();
            return TeaModel.build(map, self);
        }

        public QueryResultDataImages setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public QueryResultDataImages setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class QueryResultDataMetadata extends TeaModel {
        /**
         * <p>The average spend in CNY.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("averageSpend")
        public String averageSpend;

        /**
         * <p>The business area.</p>
         * 
         * <strong>example:</strong>
         * <p>Central Area of West Lake Tourist Zone</p>
         */
        @NameInMap("businessArea")
        public String businessArea;

        /**
         * <p>The business hours for today.</p>
         * 
         * <strong>example:</strong>
         * <p>09:00-18:00</p>
         */
        @NameInMap("dailyOpeningHours")
        public String dailyOpeningHours;

        /**
         * <p>The main tag.</p>
         * 
         * <strong>example:</strong>
         * <p>Luxury</p>
         */
        @NameInMap("mainTag")
        public String mainTag;

        /**
         * <p>The contact phone numbers. Multiple numbers are separated by vertical bars.</p>
         * 
         * <strong>example:</strong>
         * <p>0571-8732****</p>
         */
        @NameInMap("phone")
        public String phone;

        /**
         * <p>The rating.</p>
         * 
         * <strong>example:</strong>
         * <p>4.7</p>
         */
        @NameInMap("score")
        public String score;

        /**
         * <p>The weekly opening days.</p>
         * 
         * <strong>example:</strong>
         * <p>Monday to Sunday</p>
         */
        @NameInMap("weeklyOpeningDays")
        public String weeklyOpeningDays;

        public static QueryResultDataMetadata build(java.util.Map<String, ?> map) throws Exception {
            QueryResultDataMetadata self = new QueryResultDataMetadata();
            return TeaModel.build(map, self);
        }

        public QueryResultDataMetadata setAverageSpend(String averageSpend) {
            this.averageSpend = averageSpend;
            return this;
        }
        public String getAverageSpend() {
            return this.averageSpend;
        }

        public QueryResultDataMetadata setBusinessArea(String businessArea) {
            this.businessArea = businessArea;
            return this;
        }
        public String getBusinessArea() {
            return this.businessArea;
        }

        public QueryResultDataMetadata setDailyOpeningHours(String dailyOpeningHours) {
            this.dailyOpeningHours = dailyOpeningHours;
            return this;
        }
        public String getDailyOpeningHours() {
            return this.dailyOpeningHours;
        }

        public QueryResultDataMetadata setMainTag(String mainTag) {
            this.mainTag = mainTag;
            return this;
        }
        public String getMainTag() {
            return this.mainTag;
        }

        public QueryResultDataMetadata setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public QueryResultDataMetadata setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public QueryResultDataMetadata setWeeklyOpeningDays(String weeklyOpeningDays) {
            this.weeklyOpeningDays = weeklyOpeningDays;
            return this;
        }
        public String getWeeklyOpeningDays() {
            return this.weeklyOpeningDays;
        }

    }

    public static class QueryResultData extends TeaModel {
        /**
         * <p>The detailed address.</p>
         * 
         * <strong>example:</strong>
         * <p>No. 22 Fayun Lane, West Lake Scenic Area</p>
         */
        @NameInMap("address")
        public String address;

        /**
         * <p>The city code.</p>
         * 
         * <strong>example:</strong>
         * <p>0571</p>
         */
        @NameInMap("cityCode")
        public String cityCode;

        /**
         * <p>The city name.</p>
         * 
         * <strong>example:</strong>
         * <p>Hangzhou</p>
         */
        @NameInMap("cityName")
        public String cityName;

        /**
         * <p>The distance from the center point in meters.</p>
         * 
         * <strong>example:</strong>
         * <p>815</p>
         */
        @NameInMap("distanceMeter")
        public String distanceMeter;

        /**
         * <p>The district code.</p>
         * 
         * <strong>example:</strong>
         * <p>330106</p>
         */
        @NameInMap("districtCode")
        public String districtCode;

        /**
         * <p>The district name.</p>
         * 
         * <strong>example:</strong>
         * <p>Xihu District</p>
         */
        @NameInMap("districtName")
        public String districtName;

        /**
         * <p>The internal identifier of the location.</p>
         * 
         * <strong>example:</strong>
         * <p>B023B0BI3J</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The list of images.</p>
         */
        @NameInMap("images")
        public java.util.List<QueryResultDataImages> images;

        /**
         * <p>The latitude of the location.</p>
         * 
         * <strong>example:</strong>
         * <p>30.234403</p>
         */
        @NameInMap("latitude")
        public String latitude;

        /**
         * <p>The longitude of the location.</p>
         * 
         * <strong>example:</strong>
         * <p>120.097327</p>
         */
        @NameInMap("longitude")
        public String longitude;

        /**
         * <p>The related business information.</p>
         */
        @NameInMap("metadata")
        public QueryResultDataMetadata metadata;

        /**
         * <p>The location name.</p>
         * 
         * <strong>example:</strong>
         * <p>Amanfayun Hangzhou</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The province code.</p>
         * 
         * <strong>example:</strong>
         * <p>330000</p>
         */
        @NameInMap("provinceCode")
        public String provinceCode;

        /**
         * <p>The province name.</p>
         * 
         * <strong>example:</strong>
         * <p>Zhejiang Province</p>
         */
        @NameInMap("provinceName")
        public String provinceName;

        /**
         * <p>The location type code.</p>
         * 
         * <strong>example:</strong>
         * <p>100102</p>
         */
        @NameInMap("typeCode")
        public String typeCode;

        /**
         * <p>The location types. Multiple types are separated by vertical bars.</p>
         * 
         * <strong>example:</strong>
         * <p>Accommodation|Hotel|Five-star hotel</p>
         */
        @NameInMap("types")
        public String types;

        public static QueryResultData build(java.util.Map<String, ?> map) throws Exception {
            QueryResultData self = new QueryResultData();
            return TeaModel.build(map, self);
        }

        public QueryResultData setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public QueryResultData setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public QueryResultData setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public QueryResultData setDistanceMeter(String distanceMeter) {
            this.distanceMeter = distanceMeter;
            return this;
        }
        public String getDistanceMeter() {
            return this.distanceMeter;
        }

        public QueryResultData setDistrictCode(String districtCode) {
            this.districtCode = districtCode;
            return this;
        }
        public String getDistrictCode() {
            return this.districtCode;
        }

        public QueryResultData setDistrictName(String districtName) {
            this.districtName = districtName;
            return this;
        }
        public String getDistrictName() {
            return this.districtName;
        }

        public QueryResultData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryResultData setImages(java.util.List<QueryResultDataImages> images) {
            this.images = images;
            return this;
        }
        public java.util.List<QueryResultDataImages> getImages() {
            return this.images;
        }

        public QueryResultData setLatitude(String latitude) {
            this.latitude = latitude;
            return this;
        }
        public String getLatitude() {
            return this.latitude;
        }

        public QueryResultData setLongitude(String longitude) {
            this.longitude = longitude;
            return this;
        }
        public String getLongitude() {
            return this.longitude;
        }

        public QueryResultData setMetadata(QueryResultDataMetadata metadata) {
            this.metadata = metadata;
            return this;
        }
        public QueryResultDataMetadata getMetadata() {
            return this.metadata;
        }

        public QueryResultData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryResultData setProvinceCode(String provinceCode) {
            this.provinceCode = provinceCode;
            return this;
        }
        public String getProvinceCode() {
            return this.provinceCode;
        }

        public QueryResultData setProvinceName(String provinceName) {
            this.provinceName = provinceName;
            return this;
        }
        public String getProvinceName() {
            return this.provinceName;
        }

        public QueryResultData setTypeCode(String typeCode) {
            this.typeCode = typeCode;
            return this;
        }
        public String getTypeCode() {
            return this.typeCode;
        }

        public QueryResultData setTypes(String types) {
            this.types = types;
            return this;
        }
        public String getTypes() {
            return this.types;
        }

    }

}
