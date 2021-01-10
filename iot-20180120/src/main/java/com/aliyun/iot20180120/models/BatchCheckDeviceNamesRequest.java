// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchCheckDeviceNamesRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("DeviceName")
    public java.util.List<String> deviceName;

    @NameInMap("DeviceNameList")
    public java.util.List<BatchCheckDeviceNamesRequestDeviceNameList> deviceNameList;

    public static BatchCheckDeviceNamesRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchCheckDeviceNamesRequest self = new BatchCheckDeviceNamesRequest();
        return TeaModel.build(map, self);
    }

    public BatchCheckDeviceNamesRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public BatchCheckDeviceNamesRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public BatchCheckDeviceNamesRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public BatchCheckDeviceNamesRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public BatchCheckDeviceNamesRequest setDeviceName(java.util.List<String> deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public java.util.List<String> getDeviceName() {
        return this.deviceName;
    }

    public BatchCheckDeviceNamesRequest setDeviceNameList(java.util.List<BatchCheckDeviceNamesRequestDeviceNameList> deviceNameList) {
        this.deviceNameList = deviceNameList;
        return this;
    }
    public java.util.List<BatchCheckDeviceNamesRequestDeviceNameList> getDeviceNameList() {
        return this.deviceNameList;
    }

    public static class BatchCheckDeviceNamesRequestDeviceNameList extends TeaModel {
        @NameInMap("DeviceNickname")
        public String deviceNickname;

        @NameInMap("DeviceName")
        public String deviceName;

        public static BatchCheckDeviceNamesRequestDeviceNameList build(java.util.Map<String, ?> map) throws Exception {
            BatchCheckDeviceNamesRequestDeviceNameList self = new BatchCheckDeviceNamesRequestDeviceNameList();
            return TeaModel.build(map, self);
        }

        public BatchCheckDeviceNamesRequestDeviceNameList setDeviceNickname(String deviceNickname) {
            this.deviceNickname = deviceNickname;
            return this;
        }
        public String getDeviceNickname() {
            return this.deviceNickname;
        }

        public BatchCheckDeviceNamesRequestDeviceNameList setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

    }

}
