// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class DeployModelBatchRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("ModelId")
    public Long modelId;

    @NameInMap("DeviceList")
    public java.util.List<DeployModelBatchRequestDeviceList> deviceList;

    public static DeployModelBatchRequest build(java.util.Map<String, ?> map) throws Exception {
        DeployModelBatchRequest self = new DeployModelBatchRequest();
        return TeaModel.build(map, self);
    }

    public DeployModelBatchRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public DeployModelBatchRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public DeployModelBatchRequest setModelId(Long modelId) {
        this.modelId = modelId;
        return this;
    }
    public Long getModelId() {
        return this.modelId;
    }

    public DeployModelBatchRequest setDeviceList(java.util.List<DeployModelBatchRequestDeviceList> deviceList) {
        this.deviceList = deviceList;
        return this;
    }
    public java.util.List<DeployModelBatchRequestDeviceList> getDeviceList() {
        return this.deviceList;
    }

    public static class DeployModelBatchRequestDeviceList extends TeaModel {
        @NameInMap("ProductKey")
        public String productKey;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("IotId")
        public String iotId;

        public static DeployModelBatchRequestDeviceList build(java.util.Map<String, ?> map) throws Exception {
            DeployModelBatchRequestDeviceList self = new DeployModelBatchRequestDeviceList();
            return TeaModel.build(map, self);
        }

        public DeployModelBatchRequestDeviceList setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public DeployModelBatchRequestDeviceList setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public DeployModelBatchRequestDeviceList setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

    }

}
