// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchBindDevicesIntoProjectRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Devices")
    public java.util.List<BatchBindDevicesIntoProjectRequestDevices> devices;

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

    public static BatchBindDevicesIntoProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchBindDevicesIntoProjectRequest self = new BatchBindDevicesIntoProjectRequest();
        return TeaModel.build(map, self);
    }

    public BatchBindDevicesIntoProjectRequest setDevices(java.util.List<BatchBindDevicesIntoProjectRequestDevices> devices) {
        this.devices = devices;
        return this;
    }
    public java.util.List<BatchBindDevicesIntoProjectRequestDevices> getDevices() {
        return this.devices;
    }

    public BatchBindDevicesIntoProjectRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public BatchBindDevicesIntoProjectRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public static class BatchBindDevicesIntoProjectRequestDevices extends TeaModel {
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

        public static BatchBindDevicesIntoProjectRequestDevices build(java.util.Map<String, ?> map) throws Exception {
            BatchBindDevicesIntoProjectRequestDevices self = new BatchBindDevicesIntoProjectRequestDevices();
            return TeaModel.build(map, self);
        }

        public BatchBindDevicesIntoProjectRequestDevices setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public BatchBindDevicesIntoProjectRequestDevices setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

    }

}
