// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchDeleteDeviceGroupRelationsRequest extends TeaModel {
    @NameInMap("Device")
    public java.util.List<BatchDeleteDeviceGroupRelationsRequestDevice> device;

    @NameInMap("GroupId")
    public String groupId;

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
        @NameInMap("DeviceName")
        public String deviceName;

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
