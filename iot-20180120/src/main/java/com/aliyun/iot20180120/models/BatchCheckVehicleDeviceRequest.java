// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchCheckVehicleDeviceRequest extends TeaModel {
    @NameInMap("DeviceList")
    public java.util.List<BatchCheckVehicleDeviceRequestDeviceList> deviceList;

    /**
     * <p>BatchCheckVehicleDevice</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ProductKey")
    public String productKey;

    public static BatchCheckVehicleDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchCheckVehicleDeviceRequest self = new BatchCheckVehicleDeviceRequest();
        return TeaModel.build(map, self);
    }

    public BatchCheckVehicleDeviceRequest setDeviceList(java.util.List<BatchCheckVehicleDeviceRequestDeviceList> deviceList) {
        this.deviceList = deviceList;
        return this;
    }
    public java.util.List<BatchCheckVehicleDeviceRequestDeviceList> getDeviceList() {
        return this.deviceList;
    }

    public BatchCheckVehicleDeviceRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public BatchCheckVehicleDeviceRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public static class BatchCheckVehicleDeviceRequestDeviceList extends TeaModel {
        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("DeviceModel")
        public String deviceModel;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("Manufacturer")
        public String manufacturer;

        public static BatchCheckVehicleDeviceRequestDeviceList build(java.util.Map<String, ?> map) throws Exception {
            BatchCheckVehicleDeviceRequestDeviceList self = new BatchCheckVehicleDeviceRequestDeviceList();
            return TeaModel.build(map, self);
        }

        public BatchCheckVehicleDeviceRequestDeviceList setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public BatchCheckVehicleDeviceRequestDeviceList setDeviceModel(String deviceModel) {
            this.deviceModel = deviceModel;
            return this;
        }
        public String getDeviceModel() {
            return this.deviceModel;
        }

        public BatchCheckVehicleDeviceRequestDeviceList setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public BatchCheckVehicleDeviceRequestDeviceList setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }
        public String getManufacturer() {
            return this.manufacturer;
        }

    }

}
