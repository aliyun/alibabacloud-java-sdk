// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchUpdateDeviceNicknameRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("DeviceNicknameInfo")
    @Validation(required = true)
    public java.util.List<BatchUpdateDeviceNicknameRequestDeviceNicknameInfo> deviceNicknameInfo;

    public static BatchUpdateDeviceNicknameRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchUpdateDeviceNicknameRequest self = new BatchUpdateDeviceNicknameRequest();
        return TeaModel.build(map, self);
    }

    public BatchUpdateDeviceNicknameRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
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
