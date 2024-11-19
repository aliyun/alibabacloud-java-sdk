// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GisQueryDeviceLocationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GisQueryDeviceLocationResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>request parameter error</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>4C717018-B6D4-5EB0-8495-2A4FF08D58CA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GisQueryDeviceLocationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GisQueryDeviceLocationResponseBody self = new GisQueryDeviceLocationResponseBody();
        return TeaModel.build(map, self);
    }

    public GisQueryDeviceLocationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GisQueryDeviceLocationResponseBody setData(java.util.List<GisQueryDeviceLocationResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GisQueryDeviceLocationResponseBodyData> getData() {
        return this.data;
    }

    public GisQueryDeviceLocationResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GisQueryDeviceLocationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GisQueryDeviceLocationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GisQueryDeviceLocationResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>90000</p>
         */
        @NameInMap("Adcode")
        public Long adcode;

        @NameInMap("City")
        public String city;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CoordinateSystem")
        public Integer coordinateSystem;

        @NameInMap("Country")
        public String country;

        /**
         * <strong>example:</strong>
         * <p>mock_device_name</p>
         */
        @NameInMap("DeviceName")
        public String deviceName;

        /**
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <strong>example:</strong>
         * <p>30.0</p>
         */
        @NameInMap("Latitude")
        public Float latitude;

        /**
         * <strong>example:</strong>
         * <p>120.0</p>
         */
        @NameInMap("Longitude")
        public Float longitude;

        /**
         * <strong>example:</strong>
         * <p>g3r****Vjta</p>
         */
        @NameInMap("ProductKey")
        public String productKey;

        @NameInMap("Province")
        public String province;

        public static GisQueryDeviceLocationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GisQueryDeviceLocationResponseBodyData self = new GisQueryDeviceLocationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GisQueryDeviceLocationResponseBodyData setAdcode(Long adcode) {
            this.adcode = adcode;
            return this;
        }
        public Long getAdcode() {
            return this.adcode;
        }

        public GisQueryDeviceLocationResponseBodyData setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public GisQueryDeviceLocationResponseBodyData setCoordinateSystem(Integer coordinateSystem) {
            this.coordinateSystem = coordinateSystem;
            return this;
        }
        public Integer getCoordinateSystem() {
            return this.coordinateSystem;
        }

        public GisQueryDeviceLocationResponseBodyData setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public GisQueryDeviceLocationResponseBodyData setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public GisQueryDeviceLocationResponseBodyData setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public GisQueryDeviceLocationResponseBodyData setLatitude(Float latitude) {
            this.latitude = latitude;
            return this;
        }
        public Float getLatitude() {
            return this.latitude;
        }

        public GisQueryDeviceLocationResponseBodyData setLongitude(Float longitude) {
            this.longitude = longitude;
            return this;
        }
        public Float getLongitude() {
            return this.longitude;
        }

        public GisQueryDeviceLocationResponseBodyData setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public GisQueryDeviceLocationResponseBodyData setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

    }

}
