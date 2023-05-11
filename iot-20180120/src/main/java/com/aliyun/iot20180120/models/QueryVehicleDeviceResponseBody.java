// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryVehicleDeviceResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see the "**Error codes**" section of this topic.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The device information returned.</p>
     */
    @NameInMap("Data")
    public QueryVehicleDeviceResponseBodyData data;

    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The call was successful.</p>
     * <p>*   **false**: The call failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryVehicleDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryVehicleDeviceResponseBody self = new QueryVehicleDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryVehicleDeviceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryVehicleDeviceResponseBody setData(QueryVehicleDeviceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryVehicleDeviceResponseBodyData getData() {
        return this.data;
    }

    public QueryVehicleDeviceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryVehicleDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryVehicleDeviceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryVehicleDeviceResponseBodyDataJtProtocolDeviceData extends TeaModel {
        @NameInMap("AuthCode")
        public String authCode;

        @NameInMap("City")
        public String city;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("DeviceModel")
        public String deviceModel;

        @NameInMap("Manufacturer")
        public String manufacturer;

        @NameInMap("Province")
        public String province;

        @NameInMap("RegisterTime")
        public String registerTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("VehicleColour")
        public String vehicleColour;

        @NameInMap("VehicleNumber")
        public String vehicleNumber;

        public static QueryVehicleDeviceResponseBodyDataJtProtocolDeviceData build(java.util.Map<String, ?> map) throws Exception {
            QueryVehicleDeviceResponseBodyDataJtProtocolDeviceData self = new QueryVehicleDeviceResponseBodyDataJtProtocolDeviceData();
            return TeaModel.build(map, self);
        }

        public QueryVehicleDeviceResponseBodyDataJtProtocolDeviceData setAuthCode(String authCode) {
            this.authCode = authCode;
            return this;
        }
        public String getAuthCode() {
            return this.authCode;
        }

        public QueryVehicleDeviceResponseBodyDataJtProtocolDeviceData setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public QueryVehicleDeviceResponseBodyDataJtProtocolDeviceData setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public QueryVehicleDeviceResponseBodyDataJtProtocolDeviceData setDeviceModel(String deviceModel) {
            this.deviceModel = deviceModel;
            return this;
        }
        public String getDeviceModel() {
            return this.deviceModel;
        }

        public QueryVehicleDeviceResponseBodyDataJtProtocolDeviceData setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }
        public String getManufacturer() {
            return this.manufacturer;
        }

        public QueryVehicleDeviceResponseBodyDataJtProtocolDeviceData setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

        public QueryVehicleDeviceResponseBodyDataJtProtocolDeviceData setRegisterTime(String registerTime) {
            this.registerTime = registerTime;
            return this;
        }
        public String getRegisterTime() {
            return this.registerTime;
        }

        public QueryVehicleDeviceResponseBodyDataJtProtocolDeviceData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryVehicleDeviceResponseBodyDataJtProtocolDeviceData setVehicleColour(String vehicleColour) {
            this.vehicleColour = vehicleColour;
            return this;
        }
        public String getVehicleColour() {
            return this.vehicleColour;
        }

        public QueryVehicleDeviceResponseBodyDataJtProtocolDeviceData setVehicleNumber(String vehicleNumber) {
            this.vehicleNumber = vehicleNumber;
            return this;
        }
        public String getVehicleNumber() {
            return this.vehicleNumber;
        }

    }

    public static class QueryVehicleDeviceResponseBodyData extends TeaModel {
        /**
         * <p>The timestamp when the device was created. Unit: milliseconds.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The DeviceName of the device.</p>
         */
        @NameInMap("DeviceName")
        public String deviceName;

        /**
         * <p>The ID is a unique identifier that is issued by IoT Platform to the device.</p>
         */
        @NameInMap("IotId")
        public String iotId;

        @NameInMap("JtProtocolDeviceData")
        public QueryVehicleDeviceResponseBodyDataJtProtocolDeviceData jtProtocolDeviceData;

        /**
         * <p>The timestamp when the device was last updated. Unit: milliseconds.</p>
         */
        @NameInMap("ModifiedTime")
        public Long modifiedTime;

        /**
         * <p>The **ProductKey** of the gateway product to which the device belongs.</p>
         */
        @NameInMap("ProductKey")
        public String productKey;

        @NameInMap("Protocol")
        public String protocol;

        public static QueryVehicleDeviceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryVehicleDeviceResponseBodyData self = new QueryVehicleDeviceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryVehicleDeviceResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public QueryVehicleDeviceResponseBodyData setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QueryVehicleDeviceResponseBodyData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public QueryVehicleDeviceResponseBodyData setJtProtocolDeviceData(QueryVehicleDeviceResponseBodyDataJtProtocolDeviceData jtProtocolDeviceData) {
            this.jtProtocolDeviceData = jtProtocolDeviceData;
            return this;
        }
        public QueryVehicleDeviceResponseBodyDataJtProtocolDeviceData getJtProtocolDeviceData() {
            return this.jtProtocolDeviceData;
        }

        public QueryVehicleDeviceResponseBodyData setModifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        public QueryVehicleDeviceResponseBodyData setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QueryVehicleDeviceResponseBodyData setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

}
