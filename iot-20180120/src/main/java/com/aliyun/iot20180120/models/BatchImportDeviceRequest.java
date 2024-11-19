// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchImportDeviceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceList")
    public java.util.List<BatchImportDeviceRequestDeviceList> deviceList;

    /**
     * <p>The instance ID. You can view the <strong>ID</strong> of the instance on the <strong>Overview</strong> page in the IoT Platform console.</p>
     * <blockquote>
     * <p> If your instance has an ID, you must specify this parameter. Otherwise, the request fails. If no Overview page exists or no instance ID is displayed, you do not need to specify this parameter.</p>
     * </blockquote>
     * <p>For more information, see the <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a> topic of IoT instances.</p>
     * 
     * <strong>example:</strong>
     * <p>iot-1n8t****</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The <strong>ProductKey</strong> of the gateway product to which the devices belong.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a1BwAGV****</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    public static BatchImportDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchImportDeviceRequest self = new BatchImportDeviceRequest();
        return TeaModel.build(map, self);
    }

    public BatchImportDeviceRequest setDeviceList(java.util.List<BatchImportDeviceRequestDeviceList> deviceList) {
        this.deviceList = deviceList;
        return this;
    }
    public java.util.List<BatchImportDeviceRequestDeviceList> getDeviceList() {
        return this.deviceList;
    }

    public BatchImportDeviceRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public BatchImportDeviceRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public static class BatchImportDeviceRequestDeviceList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("DeviceName")
        public String deviceName;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("DeviceSecret")
        public String deviceSecret;

        @NameInMap("Sn")
        public String sn;

        public static BatchImportDeviceRequestDeviceList build(java.util.Map<String, ?> map) throws Exception {
            BatchImportDeviceRequestDeviceList self = new BatchImportDeviceRequestDeviceList();
            return TeaModel.build(map, self);
        }

        public BatchImportDeviceRequestDeviceList setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public BatchImportDeviceRequestDeviceList setDeviceSecret(String deviceSecret) {
            this.deviceSecret = deviceSecret;
            return this;
        }
        public String getDeviceSecret() {
            return this.deviceSecret;
        }

        public BatchImportDeviceRequestDeviceList setSn(String sn) {
            this.sn = sn;
            return this;
        }
        public String getSn() {
            return this.sn;
        }

    }

}
