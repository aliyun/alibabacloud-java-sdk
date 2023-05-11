// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchUpdateDeviceNicknameRequest extends TeaModel {
    @NameInMap("DeviceNicknameInfo")
    public java.util.List<BatchUpdateDeviceNicknameRequestDeviceNicknameInfo> deviceNicknameInfo;

    /**
     * <p>The ID of the instance. You can view the instance **ID** on the **Overview** page in the IoT Platform console.</p>
     * <br>
     * <p>>*   If your instance has an ID, you must configure this parameter. If you do not set this parameter, the call fails.</p>
     * <p>>*   If your instance has no **Overview** page or ID, you do not need to set this parameter.</p>
     * <br>
     * <p>For more information, see [Overview](~~356505~~).</p>
     */
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
        /**
         * <p>The DeviceName of the device.</p>
         * <br>
         * <p>>  If you specify this parameter, you must also specify the **ProductKey** parameter.</p>
         */
        @NameInMap("DeviceName")
        public String deviceName;

        /**
         * <p>The ID of the device.</p>
         * <br>
         * <p>>  If you specify this parameter, you do not need to specify **ProductKey** or **DeviceName**. The **IotId** parameter specifies a globally unique identifier (GUID) of the device, which corresponds to a combination of **ProductKey** and **DeviceName**. If you specify both **IotId** and the combination of **ProductKey** and **DeviceName**, **IotId** takes precedence.</p>
         */
        @NameInMap("IotId")
        public String iotId;

        /**
         * <p>The new alias of the device. The alias must be 4 to 32 characters in length, and can contain letters, digits, and underscores (\_). Each Chinese character is counted as two characters.</p>
         * <br>
         * <p>>  If you do not specify this parameter, the original alias of the device will be deleted.</p>
         */
        @NameInMap("Nickname")
        public String nickname;

        /**
         * <p>The ProductKey of the product to which the device belongs.</p>
         * <br>
         * <p>>  If you specify this parameter, you must also specify the **DeviceName** parameter.</p>
         */
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
