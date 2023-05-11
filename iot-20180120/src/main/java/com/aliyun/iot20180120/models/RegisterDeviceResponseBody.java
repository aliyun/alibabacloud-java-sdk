// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class RegisterDeviceResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see [Error codes](~~87387~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The device information returned if the call is successful.</p>
     */
    @NameInMap("Data")
    public RegisterDeviceResponseBodyData data;

    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * <br>
     * <p>*   **true**: The call was successful.</p>
     * <p>*   **false**: The call failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static RegisterDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RegisterDeviceResponseBody self = new RegisterDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public RegisterDeviceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RegisterDeviceResponseBody setData(RegisterDeviceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RegisterDeviceResponseBodyData getData() {
        return this.data;
    }

    public RegisterDeviceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public RegisterDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RegisterDeviceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RegisterDeviceResponseBodyData extends TeaModel {
        /**
         * <p>The DevEUI of the LoRaWAN device. This parameter is returned only when you create a LoRaWAN device.</p>
         */
        @NameInMap("DevEui")
        public String devEui;

        /**
         * <p>The DeviceName of the device.</p>
         * <br>
         * <p>> Keep the information confidential.</p>
         */
        @NameInMap("DeviceName")
        public String deviceName;

        /**
         * <p>The DeviceSecret of the device.</p>
         * <br>
         * <p>> Keep the information confidential.</p>
         */
        @NameInMap("DeviceSecret")
        public String deviceSecret;

        /**
         * <p>The ID of the device. The ID is the unique identifier that is issued by IoT Platform to the device.</p>
         * <br>
         * <p>> Keep the information confidential.</p>
         */
        @NameInMap("IotId")
        public String iotId;

        /**
         * <p>The JoinEUI of the LoRaWAN device. This parameter is returned only when you create a LoRaWAN device.</p>
         */
        @NameInMap("JoinEui")
        public String joinEui;

        /**
         * <p>The alias of the device.</p>
         * <br>
         * <p>If you do not specify an alias for the device, this parameter is empty.</p>
         */
        @NameInMap("Nickname")
        public String nickname;

        /**
         * <p>The ProductKey of the product to which the device belongs.</p>
         */
        @NameInMap("ProductKey")
        public String productKey;

        public static RegisterDeviceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RegisterDeviceResponseBodyData self = new RegisterDeviceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RegisterDeviceResponseBodyData setDevEui(String devEui) {
            this.devEui = devEui;
            return this;
        }
        public String getDevEui() {
            return this.devEui;
        }

        public RegisterDeviceResponseBodyData setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public RegisterDeviceResponseBodyData setDeviceSecret(String deviceSecret) {
            this.deviceSecret = deviceSecret;
            return this;
        }
        public String getDeviceSecret() {
            return this.deviceSecret;
        }

        public RegisterDeviceResponseBodyData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public RegisterDeviceResponseBodyData setJoinEui(String joinEui) {
            this.joinEui = joinEui;
            return this;
        }
        public String getJoinEui() {
            return this.joinEui;
        }

        public RegisterDeviceResponseBodyData setNickname(String nickname) {
            this.nickname = nickname;
            return this;
        }
        public String getNickname() {
            return this.nickname;
        }

        public RegisterDeviceResponseBodyData setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

    }

}
