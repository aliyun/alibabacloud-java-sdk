// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class NearbySearchResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<NearbySearchResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>Access was denied, message: No such namespace namespaces/general-perf-cn-shenzhen-e-default.</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static NearbySearchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        NearbySearchResponseBody self = new NearbySearchResponseBody();
        return TeaModel.build(map, self);
    }

    public NearbySearchResponseBody setData(java.util.List<NearbySearchResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<NearbySearchResponseBodyData> getData() {
        return this.data;
    }

    public NearbySearchResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public NearbySearchResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public NearbySearchResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class NearbySearchResponseBodyDataImages extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="https://meeting.dingtalk.com/j/mblzc4zTBWp">https://meeting.dingtalk.com/j/mblzc4zTBWp</a></p>
         */
        @NameInMap("url")
        public String url;

        public static NearbySearchResponseBodyDataImages build(java.util.Map<String, ?> map) throws Exception {
            NearbySearchResponseBodyDataImages self = new NearbySearchResponseBodyDataImages();
            return TeaModel.build(map, self);
        }

        public NearbySearchResponseBodyDataImages setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class NearbySearchResponseBodyDataMetadata extends TeaModel {
        @NameInMap("averageSpend")
        public String averageSpend;

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

        @NameInMap("tag")
        public String tag;

        @NameInMap("weeklyOpeningDays")
        public String weeklyOpeningDays;

        public static NearbySearchResponseBodyDataMetadata build(java.util.Map<String, ?> map) throws Exception {
            NearbySearchResponseBodyDataMetadata self = new NearbySearchResponseBodyDataMetadata();
            return TeaModel.build(map, self);
        }

        public NearbySearchResponseBodyDataMetadata setAverageSpend(String averageSpend) {
            this.averageSpend = averageSpend;
            return this;
        }
        public String getAverageSpend() {
            return this.averageSpend;
        }

        public NearbySearchResponseBodyDataMetadata setBusinessArea(String businessArea) {
            this.businessArea = businessArea;
            return this;
        }
        public String getBusinessArea() {
            return this.businessArea;
        }

        public NearbySearchResponseBodyDataMetadata setDailyOpeningHours(String dailyOpeningHours) {
            this.dailyOpeningHours = dailyOpeningHours;
            return this;
        }
        public String getDailyOpeningHours() {
            return this.dailyOpeningHours;
        }

        public NearbySearchResponseBodyDataMetadata setMainTag(String mainTag) {
            this.mainTag = mainTag;
            return this;
        }
        public String getMainTag() {
            return this.mainTag;
        }

        public NearbySearchResponseBodyDataMetadata setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public NearbySearchResponseBodyDataMetadata setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public NearbySearchResponseBodyDataMetadata setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public NearbySearchResponseBodyDataMetadata setWeeklyOpeningDays(String weeklyOpeningDays) {
            this.weeklyOpeningDays = weeklyOpeningDays;
            return this;
        }
        public String getWeeklyOpeningDays() {
            return this.weeklyOpeningDays;
        }

    }

    public static class NearbySearchResponseBodyData extends TeaModel {
        @NameInMap("address")
        public String address;

        @NameInMap("cityCode")
        public String cityCode;

        @NameInMap("cityName")
        public String cityName;

        @NameInMap("distanceMeter")
        public String distanceMeter;

        @NameInMap("districtCode")
        public String districtCode;

        @NameInMap("districtName")
        public String districtName;

        /**
         * <strong>example:</strong>
         * <p>38865</p>
         */
        @NameInMap("id")
        public String id;

        @NameInMap("images")
        public java.util.List<NearbySearchResponseBodyDataImages> images;

        @NameInMap("latitude")
        public String latitude;

        @NameInMap("longitude")
        public String longitude;

        @NameInMap("metadata")
        public NearbySearchResponseBodyDataMetadata metadata;

        /**
         * <strong>example:</strong>
         * <p>hydro-project/hydro-res-auth</p>
         */
        @NameInMap("name")
        public String name;

        @NameInMap("provinceCode")
        public String provinceCode;

        @NameInMap("provinceName")
        public String provinceName;

        @NameInMap("typeCode")
        public String typeCode;

        /**
         * <strong>example:</strong>
         * <p>[\&quot;synonym\&quot;,\&quot;stopword\&quot;,\&quot;correction\&quot;,\&quot;category_prediction\&quot;,\&quot;ner\&quot;,\&quot;term_weighting\&quot;]</p>
         */
        @NameInMap("types")
        public String types;

        public static NearbySearchResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            NearbySearchResponseBodyData self = new NearbySearchResponseBodyData();
            return TeaModel.build(map, self);
        }

        public NearbySearchResponseBodyData setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public NearbySearchResponseBodyData setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public NearbySearchResponseBodyData setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public NearbySearchResponseBodyData setDistanceMeter(String distanceMeter) {
            this.distanceMeter = distanceMeter;
            return this;
        }
        public String getDistanceMeter() {
            return this.distanceMeter;
        }

        public NearbySearchResponseBodyData setDistrictCode(String districtCode) {
            this.districtCode = districtCode;
            return this;
        }
        public String getDistrictCode() {
            return this.districtCode;
        }

        public NearbySearchResponseBodyData setDistrictName(String districtName) {
            this.districtName = districtName;
            return this;
        }
        public String getDistrictName() {
            return this.districtName;
        }

        public NearbySearchResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public NearbySearchResponseBodyData setImages(java.util.List<NearbySearchResponseBodyDataImages> images) {
            this.images = images;
            return this;
        }
        public java.util.List<NearbySearchResponseBodyDataImages> getImages() {
            return this.images;
        }

        public NearbySearchResponseBodyData setLatitude(String latitude) {
            this.latitude = latitude;
            return this;
        }
        public String getLatitude() {
            return this.latitude;
        }

        public NearbySearchResponseBodyData setLongitude(String longitude) {
            this.longitude = longitude;
            return this;
        }
        public String getLongitude() {
            return this.longitude;
        }

        public NearbySearchResponseBodyData setMetadata(NearbySearchResponseBodyDataMetadata metadata) {
            this.metadata = metadata;
            return this;
        }
        public NearbySearchResponseBodyDataMetadata getMetadata() {
            return this.metadata;
        }

        public NearbySearchResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public NearbySearchResponseBodyData setProvinceCode(String provinceCode) {
            this.provinceCode = provinceCode;
            return this;
        }
        public String getProvinceCode() {
            return this.provinceCode;
        }

        public NearbySearchResponseBodyData setProvinceName(String provinceName) {
            this.provinceName = provinceName;
            return this;
        }
        public String getProvinceName() {
            return this.provinceName;
        }

        public NearbySearchResponseBodyData setTypeCode(String typeCode) {
            this.typeCode = typeCode;
            return this;
        }
        public String getTypeCode() {
            return this.typeCode;
        }

        public NearbySearchResponseBodyData setTypes(String types) {
            this.types = types;
            return this;
        }
        public String getTypes() {
            return this.types;
        }

    }

}
