// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class PlaceSearchNovaResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<PlaceSearchNovaResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("errorCode")
    public Integer errorCode;

    /**
     * <strong>example:</strong>
     * <p>Access was denied, message: Unauthorized.</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static PlaceSearchNovaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PlaceSearchNovaResponseBody self = new PlaceSearchNovaResponseBody();
        return TeaModel.build(map, self);
    }

    public PlaceSearchNovaResponseBody setData(java.util.List<PlaceSearchNovaResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<PlaceSearchNovaResponseBodyData> getData() {
        return this.data;
    }

    public PlaceSearchNovaResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public PlaceSearchNovaResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public PlaceSearchNovaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PlaceSearchNovaResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PlaceSearchNovaResponseBodyDataImages extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p><a href="https://aos-comment.amap.com/B000A8UNZV/comment/f0a5ca9b58a31f63f8af51f459f75e4b_2048_2048_80.jpg">https://aos-comment.amap.com/B000A8UNZV/comment/f0a5ca9b58a31f63f8af51f459f75e4b_2048_2048_80.jpg</a></p>
         */
        @NameInMap("url")
        public String url;

        public static PlaceSearchNovaResponseBodyDataImages build(java.util.Map<String, ?> map) throws Exception {
            PlaceSearchNovaResponseBodyDataImages self = new PlaceSearchNovaResponseBodyDataImages();
            return TeaModel.build(map, self);
        }

        public PlaceSearchNovaResponseBodyDataImages setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public PlaceSearchNovaResponseBodyDataImages setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class PlaceSearchNovaResponseBodyDataMetadata extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>78</p>
         */
        @NameInMap("averageSpend")
        public String averageSpend;

        @NameInMap("businessArea")
        public String businessArea;

        @NameInMap("dailyOpeningHours")
        public String dailyOpeningHours;

        @NameInMap("mainTag")
        public String mainTag;

        /**
         * <strong>example:</strong>
         * <p>010-83847583</p>
         */
        @NameInMap("phone")
        public String phone;

        @NameInMap("score")
        public String score;

        /**
         * <strong>example:</strong>
         * <p>[{\&quot;value\&quot;:\&quot;nttd\&quot;,\&quot;key\&quot;:\&quot;owner\&quot;}]</p>
         */
        @NameInMap("tag")
        public String tag;

        @NameInMap("weeklyOpeningDays")
        public String weeklyOpeningDays;

        public static PlaceSearchNovaResponseBodyDataMetadata build(java.util.Map<String, ?> map) throws Exception {
            PlaceSearchNovaResponseBodyDataMetadata self = new PlaceSearchNovaResponseBodyDataMetadata();
            return TeaModel.build(map, self);
        }

        public PlaceSearchNovaResponseBodyDataMetadata setAverageSpend(String averageSpend) {
            this.averageSpend = averageSpend;
            return this;
        }
        public String getAverageSpend() {
            return this.averageSpend;
        }

        public PlaceSearchNovaResponseBodyDataMetadata setBusinessArea(String businessArea) {
            this.businessArea = businessArea;
            return this;
        }
        public String getBusinessArea() {
            return this.businessArea;
        }

        public PlaceSearchNovaResponseBodyDataMetadata setDailyOpeningHours(String dailyOpeningHours) {
            this.dailyOpeningHours = dailyOpeningHours;
            return this;
        }
        public String getDailyOpeningHours() {
            return this.dailyOpeningHours;
        }

        public PlaceSearchNovaResponseBodyDataMetadata setMainTag(String mainTag) {
            this.mainTag = mainTag;
            return this;
        }
        public String getMainTag() {
            return this.mainTag;
        }

        public PlaceSearchNovaResponseBodyDataMetadata setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public PlaceSearchNovaResponseBodyDataMetadata setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public PlaceSearchNovaResponseBodyDataMetadata setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public PlaceSearchNovaResponseBodyDataMetadata setWeeklyOpeningDays(String weeklyOpeningDays) {
            this.weeklyOpeningDays = weeklyOpeningDays;
            return this;
        }
        public String getWeeklyOpeningDays() {
            return this.weeklyOpeningDays;
        }

    }

    public static class PlaceSearchNovaResponseBodyData extends TeaModel {
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

        /**
         * <strong>example:</strong>
         * <p>110105</p>
         */
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
        public java.util.List<PlaceSearchNovaResponseBodyDataImages> images;

        /**
         * <strong>example:</strong>
         * <p>39.990039</p>
         */
        @NameInMap("latitude")
        public String latitude;

        /**
         * <strong>example:</strong>
         * <p>116.482145</p>
         */
        @NameInMap("longitude")
        public String longitude;

        @NameInMap("metadata")
        public PlaceSearchNovaResponseBodyDataMetadata metadata;

        /**
         * <strong>example:</strong>
         * <p>hydro-project/hydro-res-auth</p>
         */
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

        public static PlaceSearchNovaResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PlaceSearchNovaResponseBodyData self = new PlaceSearchNovaResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PlaceSearchNovaResponseBodyData setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public PlaceSearchNovaResponseBodyData setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public PlaceSearchNovaResponseBodyData setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public PlaceSearchNovaResponseBodyData setDistanceMeter(String distanceMeter) {
            this.distanceMeter = distanceMeter;
            return this;
        }
        public String getDistanceMeter() {
            return this.distanceMeter;
        }

        public PlaceSearchNovaResponseBodyData setDistrictCode(String districtCode) {
            this.districtCode = districtCode;
            return this;
        }
        public String getDistrictCode() {
            return this.districtCode;
        }

        public PlaceSearchNovaResponseBodyData setDistrictName(String districtName) {
            this.districtName = districtName;
            return this;
        }
        public String getDistrictName() {
            return this.districtName;
        }

        public PlaceSearchNovaResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PlaceSearchNovaResponseBodyData setImages(java.util.List<PlaceSearchNovaResponseBodyDataImages> images) {
            this.images = images;
            return this;
        }
        public java.util.List<PlaceSearchNovaResponseBodyDataImages> getImages() {
            return this.images;
        }

        public PlaceSearchNovaResponseBodyData setLatitude(String latitude) {
            this.latitude = latitude;
            return this;
        }
        public String getLatitude() {
            return this.latitude;
        }

        public PlaceSearchNovaResponseBodyData setLongitude(String longitude) {
            this.longitude = longitude;
            return this;
        }
        public String getLongitude() {
            return this.longitude;
        }

        public PlaceSearchNovaResponseBodyData setMetadata(PlaceSearchNovaResponseBodyDataMetadata metadata) {
            this.metadata = metadata;
            return this;
        }
        public PlaceSearchNovaResponseBodyDataMetadata getMetadata() {
            return this.metadata;
        }

        public PlaceSearchNovaResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PlaceSearchNovaResponseBodyData setProvinceCode(String provinceCode) {
            this.provinceCode = provinceCode;
            return this;
        }
        public String getProvinceCode() {
            return this.provinceCode;
        }

        public PlaceSearchNovaResponseBodyData setProvinceName(String provinceName) {
            this.provinceName = provinceName;
            return this;
        }
        public String getProvinceName() {
            return this.provinceName;
        }

        public PlaceSearchNovaResponseBodyData setTypeCode(String typeCode) {
            this.typeCode = typeCode;
            return this;
        }
        public String getTypeCode() {
            return this.typeCode;
        }

        public PlaceSearchNovaResponseBodyData setTypes(String types) {
            this.types = types;
            return this;
        }
        public String getTypes() {
            return this.types;
        }

    }

}
