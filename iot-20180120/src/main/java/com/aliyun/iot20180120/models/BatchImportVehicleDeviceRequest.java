// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchImportVehicleDeviceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceList")
    public java.util.List<BatchImportVehicleDeviceRequestDeviceList> deviceList;

    /**
     * <p>BatchImportVehicleDevice</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>iot-1n8t****</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a1Bw****</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    public static BatchImportVehicleDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchImportVehicleDeviceRequest self = new BatchImportVehicleDeviceRequest();
        return TeaModel.build(map, self);
    }

    public BatchImportVehicleDeviceRequest setDeviceList(java.util.List<BatchImportVehicleDeviceRequestDeviceList> deviceList) {
        this.deviceList = deviceList;
        return this;
    }
    public java.util.List<BatchImportVehicleDeviceRequestDeviceList> getDeviceList() {
        return this.deviceList;
    }

    public BatchImportVehicleDeviceRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public BatchImportVehicleDeviceRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public static class BatchImportVehicleDeviceRequestDeviceList extends TeaModel {
        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("DeviceModel")
        public String deviceModel;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("DeviceSecret")
        public String deviceSecret;

        @NameInMap("Manufacturer")
        public String manufacturer;

        public static BatchImportVehicleDeviceRequestDeviceList build(java.util.Map<String, ?> map) throws Exception {
            BatchImportVehicleDeviceRequestDeviceList self = new BatchImportVehicleDeviceRequestDeviceList();
            return TeaModel.build(map, self);
        }

        public BatchImportVehicleDeviceRequestDeviceList setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public BatchImportVehicleDeviceRequestDeviceList setDeviceModel(String deviceModel) {
            this.deviceModel = deviceModel;
            return this;
        }
        public String getDeviceModel() {
            return this.deviceModel;
        }

        public BatchImportVehicleDeviceRequestDeviceList setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public BatchImportVehicleDeviceRequestDeviceList setDeviceSecret(String deviceSecret) {
            this.deviceSecret = deviceSecret;
            return this;
        }
        public String getDeviceSecret() {
            return this.deviceSecret;
        }

        public BatchImportVehicleDeviceRequestDeviceList setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }
        public String getManufacturer() {
            return this.manufacturer;
        }

    }

}
