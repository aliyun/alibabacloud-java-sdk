// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class NearbySearchNovaResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<NearbySearchNovaResponseBodyData> data;

    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static NearbySearchNovaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        NearbySearchNovaResponseBody self = new NearbySearchNovaResponseBody();
        return TeaModel.build(map, self);
    }

    public NearbySearchNovaResponseBody setData(java.util.List<NearbySearchNovaResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<NearbySearchNovaResponseBodyData> getData() {
        return this.data;
    }

    public NearbySearchNovaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public NearbySearchNovaResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class NearbySearchNovaResponseBodyDataImages extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p><a href="https://alidocs.dingtalk.com/i/team/nb9XJVAdyvMrOXyA/docs/b9XJlRRKq1BQaGyA">https://alidocs.dingtalk.com/i/team/nb9XJVAdyvMrOXyA/docs/b9XJlRRKq1BQaGyA</a></p>
         */
        @NameInMap("url")
        public String url;

        public static NearbySearchNovaResponseBodyDataImages build(java.util.Map<String, ?> map) throws Exception {
            NearbySearchNovaResponseBodyDataImages self = new NearbySearchNovaResponseBodyDataImages();
            return TeaModel.build(map, self);
        }

        public NearbySearchNovaResponseBodyDataImages setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public NearbySearchNovaResponseBodyDataImages setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class NearbySearchNovaResponseBodyDataMetadata extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>22.00</p>
         */
        @NameInMap("averageSpend")
        public String averageSpend;

        @NameInMap("businessArea")
        public String businessArea;

        /**
         * <strong>example:</strong>
         * <p>11:00-14:00 17:00-21:00</p>
         */
        @NameInMap("dailyOpeningHours")
        public String dailyOpeningHours;

        @NameInMap("mainTag")
        public String mainTag;

        /**
         * <strong>example:</strong>
         * <p>029-87983745</p>
         */
        @NameInMap("phone")
        public String phone;

        /**
         * <strong>example:</strong>
         * <p>4.5</p>
         */
        @NameInMap("score")
        public String score;

        @NameInMap("tag")
        public String tag;

        @NameInMap("weeklyOpeningDays")
        public String weeklyOpeningDays;

        public static NearbySearchNovaResponseBodyDataMetadata build(java.util.Map<String, ?> map) throws Exception {
            NearbySearchNovaResponseBodyDataMetadata self = new NearbySearchNovaResponseBodyDataMetadata();
            return TeaModel.build(map, self);
        }

        public NearbySearchNovaResponseBodyDataMetadata setAverageSpend(String averageSpend) {
            this.averageSpend = averageSpend;
            return this;
        }
        public String getAverageSpend() {
            return this.averageSpend;
        }

        public NearbySearchNovaResponseBodyDataMetadata setBusinessArea(String businessArea) {
            this.businessArea = businessArea;
            return this;
        }
        public String getBusinessArea() {
            return this.businessArea;
        }

        public NearbySearchNovaResponseBodyDataMetadata setDailyOpeningHours(String dailyOpeningHours) {
            this.dailyOpeningHours = dailyOpeningHours;
            return this;
        }
        public String getDailyOpeningHours() {
            return this.dailyOpeningHours;
        }

        public NearbySearchNovaResponseBodyDataMetadata setMainTag(String mainTag) {
            this.mainTag = mainTag;
            return this;
        }
        public String getMainTag() {
            return this.mainTag;
        }

        public NearbySearchNovaResponseBodyDataMetadata setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public NearbySearchNovaResponseBodyDataMetadata setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public NearbySearchNovaResponseBodyDataMetadata setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public NearbySearchNovaResponseBodyDataMetadata setWeeklyOpeningDays(String weeklyOpeningDays) {
            this.weeklyOpeningDays = weeklyOpeningDays;
            return this;
        }
        public String getWeeklyOpeningDays() {
            return this.weeklyOpeningDays;
        }

    }

    public static class NearbySearchNovaResponseBodyData extends TeaModel {
        @NameInMap("address")
        public String address;

        /**
         * <strong>example:</strong>
         * <p>010</p>
         */
        @NameInMap("cityCode")
        public String cityCode;

        @NameInMap("cityName")
        public String cityName;

        /**
         * <strong>example:</strong>
         * <p>445</p>
         */
        @NameInMap("distanceMeter")
        public String distanceMeter;

        @NameInMap("districtCode")
        public String districtCode;

        @NameInMap("districtName")
        public String districtName;

        /**
         * <strong>example:</strong>
         * <p>34360</p>
         */
        @NameInMap("id")
        public String id;

        @NameInMap("images")
        public java.util.List<NearbySearchNovaResponseBodyDataImages> images;

        /**
         * <strong>example:</strong>
         * <p>39.994135</p>
         */
        @NameInMap("latitude")
        public String latitude;

        /**
         * <strong>example:</strong>
         * <p>108.970162</p>
         */
        @NameInMap("longitude")
        public String longitude;

        @NameInMap("metadata")
        public NearbySearchNovaResponseBodyDataMetadata metadata;

        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>110000</p>
         */
        @NameInMap("provinceCode")
        public String provinceCode;

        @NameInMap("provinceName")
        public String provinceName;

        /**
         * <strong>example:</strong>
         * <p>110200</p>
         */
        @NameInMap("typeCode")
        public String typeCode;

        @NameInMap("types")
        public String types;

        public static NearbySearchNovaResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            NearbySearchNovaResponseBodyData self = new NearbySearchNovaResponseBodyData();
            return TeaModel.build(map, self);
        }

        public NearbySearchNovaResponseBodyData setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public NearbySearchNovaResponseBodyData setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public NearbySearchNovaResponseBodyData setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public NearbySearchNovaResponseBodyData setDistanceMeter(String distanceMeter) {
            this.distanceMeter = distanceMeter;
            return this;
        }
        public String getDistanceMeter() {
            return this.distanceMeter;
        }

        public NearbySearchNovaResponseBodyData setDistrictCode(String districtCode) {
            this.districtCode = districtCode;
            return this;
        }
        public String getDistrictCode() {
            return this.districtCode;
        }

        public NearbySearchNovaResponseBodyData setDistrictName(String districtName) {
            this.districtName = districtName;
            return this;
        }
        public String getDistrictName() {
            return this.districtName;
        }

        public NearbySearchNovaResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public NearbySearchNovaResponseBodyData setImages(java.util.List<NearbySearchNovaResponseBodyDataImages> images) {
            this.images = images;
            return this;
        }
        public java.util.List<NearbySearchNovaResponseBodyDataImages> getImages() {
            return this.images;
        }

        public NearbySearchNovaResponseBodyData setLatitude(String latitude) {
            this.latitude = latitude;
            return this;
        }
        public String getLatitude() {
            return this.latitude;
        }

        public NearbySearchNovaResponseBodyData setLongitude(String longitude) {
            this.longitude = longitude;
            return this;
        }
        public String getLongitude() {
            return this.longitude;
        }

        public NearbySearchNovaResponseBodyData setMetadata(NearbySearchNovaResponseBodyDataMetadata metadata) {
            this.metadata = metadata;
            return this;
        }
        public NearbySearchNovaResponseBodyDataMetadata getMetadata() {
            return this.metadata;
        }

        public NearbySearchNovaResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public NearbySearchNovaResponseBodyData setProvinceCode(String provinceCode) {
            this.provinceCode = provinceCode;
            return this;
        }
        public String getProvinceCode() {
            return this.provinceCode;
        }

        public NearbySearchNovaResponseBodyData setProvinceName(String provinceName) {
            this.provinceName = provinceName;
            return this;
        }
        public String getProvinceName() {
            return this.provinceName;
        }

        public NearbySearchNovaResponseBodyData setTypeCode(String typeCode) {
            this.typeCode = typeCode;
            return this;
        }
        public String getTypeCode() {
            return this.typeCode;
        }

        public NearbySearchNovaResponseBodyData setTypes(String types) {
            this.types = types;
            return this;
        }
        public String getTypes() {
            return this.types;
        }

    }

}
