// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchUpdateDeviceNicknameRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("RealTenantId")
    public String realTenantId;

    @NameInMap("RealTripartiteKey")
    public String realTripartiteKey;

    @NameInMap("DeviceNicknameInfo")
    public java.util.List<BatchUpdateDeviceNicknameRequestDeviceNicknameInfo> deviceNicknameInfo;

    public static BatchUpdateDeviceNicknameRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchUpdateDeviceNicknameRequest self = new BatchUpdateDeviceNicknameRequest();
        return TeaModel.build(map, self);
    }

    public BatchUpdateDeviceNicknameRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public BatchUpdateDeviceNicknameRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public BatchUpdateDeviceNicknameRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public BatchUpdateDeviceNicknameRequest setRealTenantId(String realTenantId) {
        this.realTenantId = realTenantId;
        return this;
    }
    public String getRealTenantId() {
        return this.realTenantId;
    }

    public BatchUpdateDeviceNicknameRequest setRealTripartiteKey(String realTripartiteKey) {
        this.realTripartiteKey = realTripartiteKey;
        return this;
    }
    public String getRealTripartiteKey() {
        return this.realTripartiteKey;
    }

    public BatchUpdateDeviceNicknameRequest setDeviceNicknameInfo(java.util.List<BatchUpdateDeviceNicknameRequestDeviceNicknameInfo> deviceNicknameInfo) {
        this.deviceNicknameInfo = deviceNicknameInfo;
        return this;
    }
    public java.util.List<BatchUpdateDeviceNicknameRequestDeviceNicknameInfo> getDeviceNicknameInfo() {
        return this.deviceNicknameInfo;
    }

    public static class BatchUpdateDeviceNicknameRequestDeviceNicknameInfo extends TeaModel {
        @NameInMap("ProductKey")
        public String productKey;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("Nickname")
        public String nickname;

        @NameInMap("IotId")
        public String iotId;

        public static BatchUpdateDeviceNicknameRequestDeviceNicknameInfo build(java.util.Map<String, ?> map) throws Exception {
            BatchUpdateDeviceNicknameRequestDeviceNicknameInfo self = new BatchUpdateDeviceNicknameRequestDeviceNicknameInfo();
            return TeaModel.build(map, self);
        }

        public BatchUpdateDeviceNicknameRequestDeviceNicknameInfo setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public BatchUpdateDeviceNicknameRequestDeviceNicknameInfo setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public BatchUpdateDeviceNicknameRequestDeviceNicknameInfo setNickname(String nickname) {
            this.nickname = nickname;
            return this;
        }
        public String getNickname() {
            return this.nickname;
        }

        public BatchUpdateDeviceNicknameRequestDeviceNicknameInfo setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

    }

}
