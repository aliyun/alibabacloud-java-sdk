// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchDeleteDeviceGroupRelationsRequest extends TeaModel {
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
    public java.util.List<BatchDeleteDeviceGroupRelationsRequestDevice> device;

    public static BatchDeleteDeviceGroupRelationsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteDeviceGroupRelationsRequest self = new BatchDeleteDeviceGroupRelationsRequest();
        return TeaModel.build(map, self);
    }

    public BatchDeleteDeviceGroupRelationsRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public BatchDeleteDeviceGroupRelationsRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
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

    public BatchDeleteDeviceGroupRelationsRequest setRealTenantId(String realTenantId) {
        this.realTenantId = realTenantId;
        return this;
    }
    public String getRealTenantId() {
        return this.realTenantId;
    }

    public BatchDeleteDeviceGroupRelationsRequest setRealTripartiteKey(String realTripartiteKey) {
        this.realTripartiteKey = realTripartiteKey;
        return this;
    }
    public String getRealTripartiteKey() {
        return this.realTripartiteKey;
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
        public String productKey;

        @NameInMap("DeviceName")
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
