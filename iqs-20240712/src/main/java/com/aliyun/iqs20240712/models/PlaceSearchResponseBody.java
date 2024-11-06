// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class PlaceSearchResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<PlaceSearchResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("errorCode")
    public Integer errorCode;

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

    public static PlaceSearchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PlaceSearchResponseBody self = new PlaceSearchResponseBody();
        return TeaModel.build(map, self);
    }

    public PlaceSearchResponseBody setData(java.util.List<PlaceSearchResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<PlaceSearchResponseBodyData> getData() {
        return this.data;
    }

    public PlaceSearchResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public PlaceSearchResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public PlaceSearchResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PlaceSearchResponseBodyDataImages extends TeaModel {
        @NameInMap("title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p><a href="http://store.is.autonavi.com/showpic/d3dd18fa5fb617d02cf7f1aabae80b78">http://store.is.autonavi.com/showpic/d3dd18fa5fb617d02cf7f1aabae80b78</a></p>
         */
        @NameInMap("url")
        public String url;

        public static PlaceSearchResponseBodyDataImages build(java.util.Map<String, ?> map) throws Exception {
            PlaceSearchResponseBodyDataImages self = new PlaceSearchResponseBodyDataImages();
            return TeaModel.build(map, self);
        }

        public PlaceSearchResponseBodyDataImages setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public PlaceSearchResponseBodyDataImages setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class PlaceSearchResponseBodyDataMetadata extends TeaModel {
        @NameInMap("businessArea")
        public String businessArea;

        @NameInMap("dailyOpeningHours")
        public String dailyOpeningHours;

        @NameInMap("mainTag")
        public String mainTag;

        @NameInMap("tag")
        public String tag;

        @NameInMap("weeklyOpeningDays")
        public String weeklyOpeningDays;

        public static PlaceSearchResponseBodyDataMetadata build(java.util.Map<String, ?> map) throws Exception {
            PlaceSearchResponseBodyDataMetadata self = new PlaceSearchResponseBodyDataMetadata();
            return TeaModel.build(map, self);
        }

        public PlaceSearchResponseBodyDataMetadata setBusinessArea(String businessArea) {
            this.businessArea = businessArea;
            return this;
        }
        public String getBusinessArea() {
            return this.businessArea;
        }

        public PlaceSearchResponseBodyDataMetadata setDailyOpeningHours(String dailyOpeningHours) {
            this.dailyOpeningHours = dailyOpeningHours;
            return this;
        }
        public String getDailyOpeningHours() {
            return this.dailyOpeningHours;
        }

        public PlaceSearchResponseBodyDataMetadata setMainTag(String mainTag) {
            this.mainTag = mainTag;
            return this;
        }
        public String getMainTag() {
            return this.mainTag;
        }

        public PlaceSearchResponseBodyDataMetadata setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public PlaceSearchResponseBodyDataMetadata setWeeklyOpeningDays(String weeklyOpeningDays) {
            this.weeklyOpeningDays = weeklyOpeningDays;
            return this;
        }
        public String getWeeklyOpeningDays() {
            return this.weeklyOpeningDays;
        }

    }

    public static class PlaceSearchResponseBodyData extends TeaModel {
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

        /**
         * <strong>example:</strong>
         * <p>100936</p>
         */
        @NameInMap("id")
        public String id;

        @NameInMap("images")
        public java.util.List<PlaceSearchResponseBodyDataImages> images;

        @NameInMap("latitude")
        public String latitude;

        @NameInMap("longitude")
        public String longitude;

        @NameInMap("metadata")
        public PlaceSearchResponseBodyDataMetadata metadata;

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

        @NameInMap("types")
        public String types;

        public static PlaceSearchResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PlaceSearchResponseBodyData self = new PlaceSearchResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PlaceSearchResponseBodyData setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public PlaceSearchResponseBodyData setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public PlaceSearchResponseBodyData setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public PlaceSearchResponseBodyData setDistrictCode(String districtCode) {
            this.districtCode = districtCode;
            return this;
        }
        public String getDistrictCode() {
            return this.districtCode;
        }

        public PlaceSearchResponseBodyData setDistrictName(String districtName) {
            this.districtName = districtName;
            return this;
        }
        public String getDistrictName() {
            return this.districtName;
        }

        public PlaceSearchResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PlaceSearchResponseBodyData setImages(java.util.List<PlaceSearchResponseBodyDataImages> images) {
            this.images = images;
            return this;
        }
        public java.util.List<PlaceSearchResponseBodyDataImages> getImages() {
            return this.images;
        }

        public PlaceSearchResponseBodyData setLatitude(String latitude) {
            this.latitude = latitude;
            return this;
        }
        public String getLatitude() {
            return this.latitude;
        }

        public PlaceSearchResponseBodyData setLongitude(String longitude) {
            this.longitude = longitude;
            return this;
        }
        public String getLongitude() {
            return this.longitude;
        }

        public PlaceSearchResponseBodyData setMetadata(PlaceSearchResponseBodyDataMetadata metadata) {
            this.metadata = metadata;
            return this;
        }
        public PlaceSearchResponseBodyDataMetadata getMetadata() {
            return this.metadata;
        }

        public PlaceSearchResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PlaceSearchResponseBodyData setProvinceCode(String provinceCode) {
            this.provinceCode = provinceCode;
            return this;
        }
        public String getProvinceCode() {
            return this.provinceCode;
        }

        public PlaceSearchResponseBodyData setProvinceName(String provinceName) {
            this.provinceName = provinceName;
            return this;
        }
        public String getProvinceName() {
            return this.provinceName;
        }

        public PlaceSearchResponseBodyData setTypeCode(String typeCode) {
            this.typeCode = typeCode;
            return this;
        }
        public String getTypeCode() {
            return this.typeCode;
        }

        public PlaceSearchResponseBodyData setTypes(String types) {
            this.types = types;
            return this;
        }
        public String getTypes() {
            return this.types;
        }

    }

}
