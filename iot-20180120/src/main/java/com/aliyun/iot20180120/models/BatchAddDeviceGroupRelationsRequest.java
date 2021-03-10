// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchAddDeviceGroupRelationsRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("GroupId")
    @Validation(required = true)
    public String groupId;

    @NameInMap("Device")
    public java.util.List<BatchAddDeviceGroupRelationsRequestDevice> device;

    public static BatchAddDeviceGroupRelationsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchAddDeviceGroupRelationsRequest self = new BatchAddDeviceGroupRelationsRequest();
        return TeaModel.build(map, self);
    }

    public BatchAddDeviceGroupRelationsRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public BatchAddDeviceGroupRelationsRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public BatchAddDeviceGroupRelationsRequest setDevice(java.util.List<BatchAddDeviceGroupRelationsRequestDevice> device) {
        this.device = device;
        return this;
    }
    public java.util.List<BatchAddDeviceGroupRelationsRequestDevice> getDevice() {
        return this.device;
    }

    public static class BatchAddDeviceGroupRelationsRequestDevice extends TeaModel {
        @NameInMap("ProductKey")
        @Validation(required = true)
        public String productKey;

        @NameInMap("DeviceName")
        @Validation(required = true)
        public String deviceName;

        public static BatchAddDeviceGroupRelationsRequestDevice build(java.util.Map<String, ?> map) throws Exception {
            BatchAddDeviceGroupRelationsRequestDevice self = new BatchAddDeviceGroupRelationsRequestDevice();
            return TeaModel.build(map, self);
        }

        public BatchAddDeviceGroupRelationsRequestDevice setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public BatchAddDeviceGroupRelationsRequestDevice setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

    }

}
