// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchAddDeviceGroupRelationsRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("RealTenantId")
    public String realTenantId;

    @NameInMap("RealTripartiteKey")
    public String realTripartiteKey;

    @NameInMap("Device")
    public java.util.List<BatchAddDeviceGroupRelationsRequestDevice> device;

    public static BatchAddDeviceGroupRelationsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchAddDeviceGroupRelationsRequest self = new BatchAddDeviceGroupRelationsRequest();
        return TeaModel.build(map, self);
    }

    public BatchAddDeviceGroupRelationsRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public BatchAddDeviceGroupRelationsRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
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

    public BatchAddDeviceGroupRelationsRequest setRealTenantId(String realTenantId) {
        this.realTenantId = realTenantId;
        return this;
    }
    public String getRealTenantId() {
        return this.realTenantId;
    }

    public BatchAddDeviceGroupRelationsRequest setRealTripartiteKey(String realTripartiteKey) {
        this.realTripartiteKey = realTripartiteKey;
        return this;
    }
    public String getRealTripartiteKey() {
        return this.realTripartiteKey;
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
        public String productKey;

        @NameInMap("DeviceName")
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
