// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class RgeoCodeResponseBody extends TeaModel {
    @NameInMap("data")
    public RgeoCodeResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("errorCode")
    public Integer errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static RgeoCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RgeoCodeResponseBody self = new RgeoCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public RgeoCodeResponseBody setData(RgeoCodeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RgeoCodeResponseBodyData getData() {
        return this.data;
    }

    public RgeoCodeResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public RgeoCodeResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public RgeoCodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RgeoCodeResponseBodyDataBuilding extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("type")
        public String type;

        public static RgeoCodeResponseBodyDataBuilding build(java.util.Map<String, ?> map) throws Exception {
            RgeoCodeResponseBodyDataBuilding self = new RgeoCodeResponseBodyDataBuilding();
            return TeaModel.build(map, self);
        }

        public RgeoCodeResponseBodyDataBuilding setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public RgeoCodeResponseBodyDataBuilding setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class RgeoCodeResponseBodyDataBusinessAreas extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>110108</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>39.996850</p>
         */
        @NameInMap("latitude")
        public String latitude;

        /**
         * <strong>example:</strong>
         * <p>116.294214</p>
         */
        @NameInMap("longitude")
        public String longitude;

        @NameInMap("name")
        public String name;

        public static RgeoCodeResponseBodyDataBusinessAreas build(java.util.Map<String, ?> map) throws Exception {
            RgeoCodeResponseBodyDataBusinessAreas self = new RgeoCodeResponseBodyDataBusinessAreas();
            return TeaModel.build(map, self);
        }

        public RgeoCodeResponseBodyDataBusinessAreas setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public RgeoCodeResponseBodyDataBusinessAreas setLatitude(String latitude) {
            this.latitude = latitude;
            return this;
        }
        public String getLatitude() {
            return this.latitude;
        }

        public RgeoCodeResponseBodyDataBusinessAreas setLongitude(String longitude) {
            this.longitude = longitude;
            return this;
        }
        public String getLongitude() {
            return this.longitude;
        }

        public RgeoCodeResponseBodyDataBusinessAreas setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class RgeoCodeResponseBodyDataNeighborhood extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("type")
        public String type;

        public static RgeoCodeResponseBodyDataNeighborhood build(java.util.Map<String, ?> map) throws Exception {
            RgeoCodeResponseBodyDataNeighborhood self = new RgeoCodeResponseBodyDataNeighborhood();
            return TeaModel.build(map, self);
        }

        public RgeoCodeResponseBodyDataNeighborhood setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public RgeoCodeResponseBodyDataNeighborhood setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class RgeoCodeResponseBodyDataStreetNumber extends TeaModel {
        @NameInMap("direction")
        public String direction;

        /**
         * <strong>example:</strong>
         * <p>289.832</p>
         */
        @NameInMap("distanceMeter")
        public String distanceMeter;

        /**
         * <strong>example:</strong>
         * <p>39.986542</p>
         */
        @NameInMap("latitude")
        public String latitude;

        /**
         * <strong>example:</strong>
         * <p>116.311943</p>
         */
        @NameInMap("longitude")
        public String longitude;

        @NameInMap("number")
        public String number;

        @NameInMap("street")
        public String street;

        public static RgeoCodeResponseBodyDataStreetNumber build(java.util.Map<String, ?> map) throws Exception {
            RgeoCodeResponseBodyDataStreetNumber self = new RgeoCodeResponseBodyDataStreetNumber();
            return TeaModel.build(map, self);
        }

        public RgeoCodeResponseBodyDataStreetNumber setDirection(String direction) {
            this.direction = direction;
            return this;
        }
        public String getDirection() {
            return this.direction;
        }

        public RgeoCodeResponseBodyDataStreetNumber setDistanceMeter(String distanceMeter) {
            this.distanceMeter = distanceMeter;
            return this;
        }
        public String getDistanceMeter() {
            return this.distanceMeter;
        }

        public RgeoCodeResponseBodyDataStreetNumber setLatitude(String latitude) {
            this.latitude = latitude;
            return this;
        }
        public String getLatitude() {
            return this.latitude;
        }

        public RgeoCodeResponseBodyDataStreetNumber setLongitude(String longitude) {
            this.longitude = longitude;
            return this;
        }
        public String getLongitude() {
            return this.longitude;
        }

        public RgeoCodeResponseBodyDataStreetNumber setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public RgeoCodeResponseBodyDataStreetNumber setStreet(String street) {
            this.street = street;
            return this;
        }
        public String getStreet() {
            return this.street;
        }

    }

    public static class RgeoCodeResponseBodyData extends TeaModel {
        @NameInMap("building")
        public RgeoCodeResponseBodyDataBuilding building;

        @NameInMap("businessAreas")
        public java.util.List<RgeoCodeResponseBodyDataBusinessAreas> businessAreas;

        @NameInMap("city")
        public String city;

        /**
         * <strong>example:</strong>
         * <p>010</p>
         */
        @NameInMap("cityCode")
        public String cityCode;

        @NameInMap("country")
        public String country;

        @NameInMap("district")
        public String district;

        /**
         * <strong>example:</strong>
         * <p>110108</p>
         */
        @NameInMap("districtCode")
        public String districtCode;

        @NameInMap("formattedAddress")
        public String formattedAddress;

        @NameInMap("neighborhood")
        public RgeoCodeResponseBodyDataNeighborhood neighborhood;

        @NameInMap("province")
        public String province;

        @NameInMap("streetNumber")
        public RgeoCodeResponseBodyDataStreetNumber streetNumber;

        /**
         * <strong>example:</strong>
         * <p>110108015000</p>
         */
        @NameInMap("townCode")
        public String townCode;

        @NameInMap("townShip")
        public String townShip;

        public static RgeoCodeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RgeoCodeResponseBodyData self = new RgeoCodeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RgeoCodeResponseBodyData setBuilding(RgeoCodeResponseBodyDataBuilding building) {
            this.building = building;
            return this;
        }
        public RgeoCodeResponseBodyDataBuilding getBuilding() {
            return this.building;
        }

        public RgeoCodeResponseBodyData setBusinessAreas(java.util.List<RgeoCodeResponseBodyDataBusinessAreas> businessAreas) {
            this.businessAreas = businessAreas;
            return this;
        }
        public java.util.List<RgeoCodeResponseBodyDataBusinessAreas> getBusinessAreas() {
            return this.businessAreas;
        }

        public RgeoCodeResponseBodyData setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public RgeoCodeResponseBodyData setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public RgeoCodeResponseBodyData setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public RgeoCodeResponseBodyData setDistrict(String district) {
            this.district = district;
            return this;
        }
        public String getDistrict() {
            return this.district;
        }

        public RgeoCodeResponseBodyData setDistrictCode(String districtCode) {
            this.districtCode = districtCode;
            return this;
        }
        public String getDistrictCode() {
            return this.districtCode;
        }

        public RgeoCodeResponseBodyData setFormattedAddress(String formattedAddress) {
            this.formattedAddress = formattedAddress;
            return this;
        }
        public String getFormattedAddress() {
            return this.formattedAddress;
        }

        public RgeoCodeResponseBodyData setNeighborhood(RgeoCodeResponseBodyDataNeighborhood neighborhood) {
            this.neighborhood = neighborhood;
            return this;
        }
        public RgeoCodeResponseBodyDataNeighborhood getNeighborhood() {
            return this.neighborhood;
        }

        public RgeoCodeResponseBodyData setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

        public RgeoCodeResponseBodyData setStreetNumber(RgeoCodeResponseBodyDataStreetNumber streetNumber) {
            this.streetNumber = streetNumber;
            return this;
        }
        public RgeoCodeResponseBodyDataStreetNumber getStreetNumber() {
            return this.streetNumber;
        }

        public RgeoCodeResponseBodyData setTownCode(String townCode) {
            this.townCode = townCode;
            return this;
        }
        public String getTownCode() {
            return this.townCode;
        }

        public RgeoCodeResponseBodyData setTownShip(String townShip) {
            this.townShip = townShip;
            return this;
        }
        public String getTownShip() {
            return this.townShip;
        }

    }

}
