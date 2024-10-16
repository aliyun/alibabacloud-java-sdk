// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class QueryResult extends TeaModel {
    @NameInMap("data")
    public java.util.List<QueryResultData> data;

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

    public static class QueryResultDataImages extends TeaModel {
        @NameInMap("title")
        public String title;

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
        @NameInMap("businessArea")
        public String businessArea;

        @NameInMap("dailyOpeningHours")
        public String dailyOpeningHours;

        @NameInMap("mainTag")
        public String mainTag;

        @NameInMap("phone")
        public String phone;

        @NameInMap("score")
        public String score;

        @NameInMap("weeklyOpeningDays")
        public String weeklyOpeningDays;

        public static QueryResultDataMetadata build(java.util.Map<String, ?> map) throws Exception {
            QueryResultDataMetadata self = new QueryResultDataMetadata();
            return TeaModel.build(map, self);
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
        @NameInMap("address")
        public String address;

        @NameInMap("cityCode")
        public String cityCode;

        @NameInMap("cityName")
        public String cityName;

        @NameInMap("districtCode")
        public String districtCode;

        @NameInMap("districtName")
        public String districtName;

        @NameInMap("id")
        public String id;

        @NameInMap("images")
        public java.util.List<QueryResultDataImages> images;

        @NameInMap("latitude")
        public String latitude;

        @NameInMap("longitude")
        public String longitude;

        @NameInMap("metadata")
        public QueryResultDataMetadata metadata;

        @NameInMap("name")
        public String name;

        @NameInMap("provinceCode")
        public String provinceCode;

        @NameInMap("provinceName")
        public String provinceName;

        @NameInMap("typeCode")
        public String typeCode;

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
