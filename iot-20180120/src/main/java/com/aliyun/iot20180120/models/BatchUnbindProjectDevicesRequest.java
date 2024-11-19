// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchUnbindProjectDevicesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Devices")
    public java.util.List<BatchUnbindProjectDevicesRequestDevices> devices;

    /**
     * <strong>example:</strong>
     * <p>iot_instc_pu****_c*-v64********</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a12******</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    public static BatchUnbindProjectDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchUnbindProjectDevicesRequest self = new BatchUnbindProjectDevicesRequest();
        return TeaModel.build(map, self);
    }

    public BatchUnbindProjectDevicesRequest setDevices(java.util.List<BatchUnbindProjectDevicesRequestDevices> devices) {
        this.devices = devices;
        return this;
    }
    public java.util.List<BatchUnbindProjectDevicesRequestDevices> getDevices() {
        return this.devices;
    }

    public BatchUnbindProjectDevicesRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public BatchUnbindProjectDevicesRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public static class BatchUnbindProjectDevicesRequestDevices extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Ee2******</p>
         */
        @NameInMap("DeviceName")
        public String deviceName;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a1BwAGV****</p>
         */
        @NameInMap("ProductKey")
        public String productKey;

        public static BatchUnbindProjectDevicesRequestDevices build(java.util.Map<String, ?> map) throws Exception {
            BatchUnbindProjectDevicesRequestDevices self = new BatchUnbindProjectDevicesRequestDevices();
            return TeaModel.build(map, self);
        }

        public BatchUnbindProjectDevicesRequestDevices setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public BatchUnbindProjectDevicesRequestDevices setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

    }

}
