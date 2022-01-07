// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchUpdateDeviceNicknameRequest extends TeaModel {
    @NameInMap("DeviceNicknameInfo")
    public java.util.List<BatchUpdateDeviceNicknameRequestDeviceNicknameInfo> deviceNicknameInfo;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static BatchUpdateDeviceNicknameRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchUpdateDeviceNicknameRequest self = new BatchUpdateDeviceNicknameRequest();
        return TeaModel.build(map, self);
    }

    public BatchUpdateDeviceNicknameRequest setDeviceNicknameInfo(java.util.List<BatchUpdateDeviceNicknameRequestDeviceNicknameInfo> deviceNicknameInfo) {
        this.deviceNicknameInfo = deviceNicknameInfo;
        return this;
    }
    public java.util.List<BatchUpdateDeviceNicknameRequestDeviceNicknameInfo> getDeviceNicknameInfo() {
        return this.deviceNicknameInfo;
    }

    public BatchUpdateDeviceNicknameRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public static class BatchUpdateDeviceNicknameRequestDeviceNicknameInfo extends TeaModel {
        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("IotId")
        public String iotId;

        @NameInMap("Nickname")
        public String nickname;

        @NameInMap("ProductKey")
        public String productKey;

        public static BatchUpdateDeviceNicknameRequestDeviceNicknameInfo build(java.util.Map<String, ?> map) throws Exception {
            BatchUpdateDeviceNicknameRequestDeviceNicknameInfo self = new BatchUpdateDeviceNicknameRequestDeviceNicknameInfo();
            return TeaModel.build(map, self);
        }

        public BatchUpdateDeviceNicknameRequestDeviceNicknameInfo setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public BatchUpdateDeviceNicknameRequestDeviceNicknameInfo setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public BatchUpdateDeviceNicknameRequestDeviceNicknameInfo setNickname(String nickname) {
            this.nickname = nickname;
            return this;
        }
        public String getNickname() {
            return this.nickname;
        }

        public BatchUpdateDeviceNicknameRequestDeviceNicknameInfo setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

    }

}
