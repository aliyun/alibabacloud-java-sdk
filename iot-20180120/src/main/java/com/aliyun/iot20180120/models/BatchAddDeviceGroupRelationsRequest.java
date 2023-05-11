// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchAddDeviceGroupRelationsRequest extends TeaModel {
    @NameInMap("Device")
    public java.util.List<BatchAddDeviceGroupRelationsRequestDevice> device;

    /**
     * <p>The ProductKeys of the products to which the devices belong. You can specify a maximum of 200 ProductKeys.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The ID of the group. The ID is the globally unique identifier (GUID) for the group.</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static BatchAddDeviceGroupRelationsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchAddDeviceGroupRelationsRequest self = new BatchAddDeviceGroupRelationsRequest();
        return TeaModel.build(map, self);
    }

    public BatchAddDeviceGroupRelationsRequest setDevice(java.util.List<BatchAddDeviceGroupRelationsRequestDevice> device) {
        this.device = device;
        return this;
    }
    public java.util.List<BatchAddDeviceGroupRelationsRequestDevice> getDevice() {
        return this.device;
    }

    public BatchAddDeviceGroupRelationsRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public BatchAddDeviceGroupRelationsRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public static class BatchAddDeviceGroupRelationsRequestDevice extends TeaModel {
        /**
         * <p>The error message returned if the call fails.</p>
         */
        @NameInMap("DeviceName")
        public String deviceName;

        /**
         * <p>The names of the devices to be added. You can specify a maximum of 200 devices.</p>
         */
        @NameInMap("ProductKey")
        public String productKey;

        public static BatchAddDeviceGroupRelationsRequestDevice build(java.util.Map<String, ?> map) throws Exception {
            BatchAddDeviceGroupRelationsRequestDevice self = new BatchAddDeviceGroupRelationsRequestDevice();
            return TeaModel.build(map, self);
        }

        public BatchAddDeviceGroupRelationsRequestDevice setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public BatchAddDeviceGroupRelationsRequestDevice setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

    }

}
