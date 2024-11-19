// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchUpdateDeviceNicknameRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceNicknameInfo")
    public java.util.List<BatchUpdateDeviceNicknameRequestDeviceNicknameInfo> deviceNicknameInfo;

    /**
     * <p>The ID of the instance. You can view the instance <strong>ID</strong> on the <strong>Overview</strong> page in the IoT Platform console.</p>
     * <blockquote>
     * <ul>
     * <li>If your instance has an ID, you must configure this parameter. If you do not set this parameter, the call fails.</li>
     * <li>If your instance has no <strong>Overview</strong> page or ID, you do not need to set this parameter.</li>
     * </ul>
     * </blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot_instc_pu****_c*-v64********</p>
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
         * <blockquote>
         * <p> If you specify this parameter, you must also specify the <strong>ProductKey</strong> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>light</p>
         */
        @NameInMap("DeviceName")
        public String deviceName;

        /**
         * <p>The ID of the device.</p>
         * <blockquote>
         * <p> If you specify this parameter, you do not need to specify <strong>ProductKey</strong> or <strong>DeviceName</strong>. The <strong>IotId</strong> parameter specifies a globally unique identifier (GUID) of the device, which corresponds to a combination of <strong>ProductKey</strong> and <strong>DeviceName</strong>. If you specify both <strong>IotId</strong> and the combination of <strong>ProductKey</strong> and <strong>DeviceName</strong>, <strong>IotId</strong> takes precedence.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Q7uOhVRdZRRlDnTLv****00100</p>
         */
        @NameInMap("IotId")
        public String iotId;

        /**
         * <p>The new alias of the device. The alias must be 4 to 32 characters in length, and can contain letters, digits, and underscores (_). Each Chinese character is counted as two characters.</p>
         * <blockquote>
         * <p> If you do not specify this parameter, the original alias of the device will be deleted.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>AliyunDataCenter</p>
         */
        @NameInMap("Nickname")
        public String nickname;

        /**
         * <p>The ProductKey of the product to which the device belongs.</p>
         * <blockquote>
         * <p> If you specify this parameter, you must also specify the <strong>DeviceName</strong> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>a1BwAGV****</p>
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
