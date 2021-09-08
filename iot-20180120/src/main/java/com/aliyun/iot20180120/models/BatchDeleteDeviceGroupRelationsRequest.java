// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchDeleteDeviceGroupRelationsRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("GroupId")
    @Validation(required = true)
    public String groupId;

    @NameInMap("Device")
    public java.util.List<BatchDeleteDeviceGroupRelationsRequestDevice> device;

    public static BatchDeleteDeviceGroupRelationsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteDeviceGroupRelationsRequest self = new BatchDeleteDeviceGroupRelationsRequest();
        return TeaModel.build(map, self);
    }

    public BatchDeleteDeviceGroupRelationsRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public BatchDeleteDeviceGroupRelationsRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public BatchDeleteDeviceGroupRelationsRequest setDevice(java.util.List<BatchDeleteDeviceGroupRelationsRequestDevice> device) {
        this.device = device;
        return this;
    }
    public java.util.List<BatchDeleteDeviceGroupRelationsRequestDevice> getDevice() {
        return this.device;
    }

    public static class BatchDeleteDeviceGroupRelationsRequestDevice extends TeaModel {
        @NameInMap("ProductKey")
        @Validation(required = true)
        public String productKey;

        @NameInMap("DeviceName")
        @Validation(required = true)
        public String deviceName;

        public static BatchDeleteDeviceGroupRelationsRequestDevice build(java.util.Map<String, ?> map) throws Exception {
            BatchDeleteDeviceGroupRelationsRequestDevice self = new BatchDeleteDeviceGroupRelationsRequestDevice();
            return TeaModel.build(map, self);
        }

        public BatchDeleteDeviceGroupRelationsRequestDevice setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public BatchDeleteDeviceGroupRelationsRequestDevice setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

    }

}
