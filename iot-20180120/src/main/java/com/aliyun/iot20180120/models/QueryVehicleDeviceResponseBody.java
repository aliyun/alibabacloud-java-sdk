// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryVehicleDeviceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryVehicleDeviceResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

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

    public static class QueryVehicleDeviceResponseBodyData extends TeaModel {
        @NameInMap("AuthCode")
        public String authCode;

        @NameInMap("City")
        public String city;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("DeviceModel")
        public String deviceModel;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("IotId")
        public String iotId;

        @NameInMap("Manufacturer")
        public String manufacturer;

        @NameInMap("ModifiedTime")
        public Long modifiedTime;

        @NameInMap("ProductKey")
        public String productKey;

        @NameInMap("Province")
        public String province;

        @NameInMap("RegisterTime")
        public Long registerTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("VehicleColour")
        public String vehicleColour;

        @NameInMap("VehicleNumber")
        public String vehicleNumber;

        public static QueryVehicleDeviceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryVehicleDeviceResponseBodyData self = new QueryVehicleDeviceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryVehicleDeviceResponseBodyData setAuthCode(String authCode) {
            this.authCode = authCode;
            return this;
        }
        public String getAuthCode() {
            return this.authCode;
        }

        public QueryVehicleDeviceResponseBodyData setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public QueryVehicleDeviceResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public QueryVehicleDeviceResponseBodyData setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public QueryVehicleDeviceResponseBodyData setDeviceModel(String deviceModel) {
            this.deviceModel = deviceModel;
            return this;
        }
        public String getDeviceModel() {
            return this.deviceModel;
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

        public QueryVehicleDeviceResponseBodyData setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }
        public String getManufacturer() {
            return this.manufacturer;
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

        public QueryVehicleDeviceResponseBodyData setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

        public QueryVehicleDeviceResponseBodyData setRegisterTime(Long registerTime) {
            this.registerTime = registerTime;
            return this;
        }
        public Long getRegisterTime() {
            return this.registerTime;
        }

        public QueryVehicleDeviceResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryVehicleDeviceResponseBodyData setVehicleColour(String vehicleColour) {
            this.vehicleColour = vehicleColour;
            return this;
        }
        public String getVehicleColour() {
            return this.vehicleColour;
        }

        public QueryVehicleDeviceResponseBodyData setVehicleNumber(String vehicleNumber) {
            this.vehicleNumber = vehicleNumber;
            return this;
        }
        public String getVehicleNumber() {
            return this.vehicleNumber;
        }

    }

}
