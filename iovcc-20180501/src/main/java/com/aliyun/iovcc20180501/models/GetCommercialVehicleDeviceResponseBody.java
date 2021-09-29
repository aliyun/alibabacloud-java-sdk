// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class GetCommercialVehicleDeviceResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VehicleDevice")
    public GetCommercialVehicleDeviceResponseBodyVehicleDevice vehicleDevice;

    public static GetCommercialVehicleDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCommercialVehicleDeviceResponseBody self = new GetCommercialVehicleDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCommercialVehicleDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCommercialVehicleDeviceResponseBody setVehicleDevice(GetCommercialVehicleDeviceResponseBodyVehicleDevice vehicleDevice) {
        this.vehicleDevice = vehicleDevice;
        return this;
    }
    public GetCommercialVehicleDeviceResponseBodyVehicleDevice getVehicleDevice() {
        return this.vehicleDevice;
    }

    public static class GetCommercialVehicleDeviceResponseBodyVehicleDevice extends TeaModel {
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("ModifiedTime")
        public Long modifiedTime;

        @NameInMap("HardwareId")
        public String hardwareId;

        @NameInMap("ClientId")
        public String clientId;

        @NameInMap("ManufacturerId")
        public String manufacturerId;

        @NameInMap("DeviceModel")
        public String deviceModel;

        @NameInMap("OnlineStatus")
        public Long onlineStatus;

        @NameInMap("PlateColor")
        public Long plateColor;

        @NameInMap("PlateNumber")
        public String plateNumber;

        @NameInMap("Vin")
        public String vin;

        @NameInMap("Imei")
        public String imei;

        @NameInMap("SoftVersion")
        public String softVersion;

        @NameInMap("LastAuthTime")
        public Long lastAuthTime;

        public static GetCommercialVehicleDeviceResponseBodyVehicleDevice build(java.util.Map<String, ?> map) throws Exception {
            GetCommercialVehicleDeviceResponseBodyVehicleDevice self = new GetCommercialVehicleDeviceResponseBodyVehicleDevice();
            return TeaModel.build(map, self);
        }

        public GetCommercialVehicleDeviceResponseBodyVehicleDevice setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetCommercialVehicleDeviceResponseBodyVehicleDevice setModifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        public GetCommercialVehicleDeviceResponseBodyVehicleDevice setHardwareId(String hardwareId) {
            this.hardwareId = hardwareId;
            return this;
        }
        public String getHardwareId() {
            return this.hardwareId;
        }

        public GetCommercialVehicleDeviceResponseBodyVehicleDevice setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public GetCommercialVehicleDeviceResponseBodyVehicleDevice setManufacturerId(String manufacturerId) {
            this.manufacturerId = manufacturerId;
            return this;
        }
        public String getManufacturerId() {
            return this.manufacturerId;
        }

        public GetCommercialVehicleDeviceResponseBodyVehicleDevice setDeviceModel(String deviceModel) {
            this.deviceModel = deviceModel;
            return this;
        }
        public String getDeviceModel() {
            return this.deviceModel;
        }

        public GetCommercialVehicleDeviceResponseBodyVehicleDevice setOnlineStatus(Long onlineStatus) {
            this.onlineStatus = onlineStatus;
            return this;
        }
        public Long getOnlineStatus() {
            return this.onlineStatus;
        }

        public GetCommercialVehicleDeviceResponseBodyVehicleDevice setPlateColor(Long plateColor) {
            this.plateColor = plateColor;
            return this;
        }
        public Long getPlateColor() {
            return this.plateColor;
        }

        public GetCommercialVehicleDeviceResponseBodyVehicleDevice setPlateNumber(String plateNumber) {
            this.plateNumber = plateNumber;
            return this;
        }
        public String getPlateNumber() {
            return this.plateNumber;
        }

        public GetCommercialVehicleDeviceResponseBodyVehicleDevice setVin(String vin) {
            this.vin = vin;
            return this;
        }
        public String getVin() {
            return this.vin;
        }

        public GetCommercialVehicleDeviceResponseBodyVehicleDevice setImei(String imei) {
            this.imei = imei;
            return this;
        }
        public String getImei() {
            return this.imei;
        }

        public GetCommercialVehicleDeviceResponseBodyVehicleDevice setSoftVersion(String softVersion) {
            this.softVersion = softVersion;
            return this;
        }
        public String getSoftVersion() {
            return this.softVersion;
        }

        public GetCommercialVehicleDeviceResponseBodyVehicleDevice setLastAuthTime(Long lastAuthTime) {
            this.lastAuthTime = lastAuthTime;
            return this;
        }
        public Long getLastAuthTime() {
            return this.lastAuthTime;
        }

    }

}
