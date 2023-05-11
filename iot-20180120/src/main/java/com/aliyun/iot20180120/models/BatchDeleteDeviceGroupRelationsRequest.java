// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchDeleteDeviceGroupRelationsRequest extends TeaModel {
    @NameInMap("Device")
    public java.util.List<BatchDeleteDeviceGroupRelationsRequestDevice> device;

    /**
     * <p>The ID of the group. The ID is the globally unique identifier (GUID) for the group.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The ID of the instance. You can view the instance **ID** on the **Overview** page in the IoT Platform console.</p>
     * <br>
     * <p>>*   If your instance has an ID, you must configure this parameter. If you do not set this parameter, the call fails.</p>
     * <p>>*   If your instance has no **Overview** page or ID, you do not need to set this parameter.</p>
     * <br>
     * <p>For more information, see [Overview](~~356505~~).</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static BatchDeleteDeviceGroupRelationsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteDeviceGroupRelationsRequest self = new BatchDeleteDeviceGroupRelationsRequest();
        return TeaModel.build(map, self);
    }

    public BatchDeleteDeviceGroupRelationsRequest setDevice(java.util.List<BatchDeleteDeviceGroupRelationsRequestDevice> device) {
        this.device = device;
        return this;
    }
    public java.util.List<BatchDeleteDeviceGroupRelationsRequestDevice> getDevice() {
        return this.device;
    }

    public BatchDeleteDeviceGroupRelationsRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public BatchDeleteDeviceGroupRelationsRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public static class BatchDeleteDeviceGroupRelationsRequestDevice extends TeaModel {
        /**
         * <p>The names of the devices to be removed. You can specify a maximum of 200 devices.</p>
         */
        @NameInMap("DeviceName")
        public String deviceName;

        /**
         * <p>The ProductKeys of the products to which the devices belong. You can specify a maximum of 200 ProductKeys.</p>
         */
        @NameInMap("ProductKey")
        public String productKey;

        public static BatchDeleteDeviceGroupRelationsRequestDevice build(java.util.Map<String, ?> map) throws Exception {
            BatchDeleteDeviceGroupRelationsRequestDevice self = new BatchDeleteDeviceGroupRelationsRequestDevice();
            return TeaModel.build(map, self);
        }

        public BatchDeleteDeviceGroupRelationsRequestDevice setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public BatchDeleteDeviceGroupRelationsRequestDevice setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

    }

}
