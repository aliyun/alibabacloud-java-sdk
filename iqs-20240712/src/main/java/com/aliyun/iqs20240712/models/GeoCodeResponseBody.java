// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class GeoCodeResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<GeoCodeResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("errorCode")
    public Integer errorCode;

    /**
     * <strong>example:</strong>
     * <p>Pop sign mismatch, please check log.</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GeoCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GeoCodeResponseBody self = new GeoCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public GeoCodeResponseBody setData(java.util.List<GeoCodeResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GeoCodeResponseBodyData> getData() {
        return this.data;
    }

    public GeoCodeResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public GeoCodeResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GeoCodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GeoCodeResponseBodyDataBuilding extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>timeliness_ms</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>internal</p>
         */
        @NameInMap("type")
        public String type;

        public static GeoCodeResponseBodyDataBuilding build(java.util.Map<String, ?> map) throws Exception {
            GeoCodeResponseBodyDataBuilding self = new GeoCodeResponseBodyDataBuilding();
            return TeaModel.build(map, self);
        }

        public GeoCodeResponseBodyDataBuilding setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GeoCodeResponseBodyDataBuilding setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GeoCodeResponseBodyData extends TeaModel {
        @NameInMap("building")
        public GeoCodeResponseBodyDataBuilding building;

        @NameInMap("city")
        public String city;

        @NameInMap("cityCode")
        public String cityCode;

        @NameInMap("district")
        public String district;

        @NameInMap("districtCode")
        public String districtCode;

        @NameInMap("latitude")
        public String latitude;

        @NameInMap("level")
        public String level;

        @NameInMap("longitude")
        public String longitude;

        /**
         * <strong>example:</strong>
         * <p>12201281024024</p>
         */
        @NameInMap("number")
        public String number;

        @NameInMap("province")
        public String province;

        @NameInMap("street")
        public String street;

        public static GeoCodeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GeoCodeResponseBodyData self = new GeoCodeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GeoCodeResponseBodyData setBuilding(GeoCodeResponseBodyDataBuilding building) {
            this.building = building;
            return this;
        }
        public GeoCodeResponseBodyDataBuilding getBuilding() {
            return this.building;
        }

        public GeoCodeResponseBodyData setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public GeoCodeResponseBodyData setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public GeoCodeResponseBodyData setDistrict(String district) {
            this.district = district;
            return this;
        }
        public String getDistrict() {
            return this.district;
        }

        public GeoCodeResponseBodyData setDistrictCode(String districtCode) {
            this.districtCode = districtCode;
            return this;
        }
        public String getDistrictCode() {
            return this.districtCode;
        }

        public GeoCodeResponseBodyData setLatitude(String latitude) {
            this.latitude = latitude;
            return this;
        }
        public String getLatitude() {
            return this.latitude;
        }

        public GeoCodeResponseBodyData setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public GeoCodeResponseBodyData setLongitude(String longitude) {
            this.longitude = longitude;
            return this;
        }
        public String getLongitude() {
            return this.longitude;
        }

        public GeoCodeResponseBodyData setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public GeoCodeResponseBodyData setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

        public GeoCodeResponseBodyData setStreet(String street) {
            this.street = street;
            return this;
        }
        public String getStreet() {
            return this.street;
        }

    }

}
