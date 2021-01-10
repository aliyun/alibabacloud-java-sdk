// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class RegisterDeviceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Data")
    public RegisterDeviceResponseBodyData data;

    public static RegisterDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RegisterDeviceResponseBody self = new RegisterDeviceResponseBody();
        return TeaModel.build(map, self);
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

    public RegisterDeviceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RegisterDeviceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public RegisterDeviceResponseBody setData(RegisterDeviceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RegisterDeviceResponseBodyData getData() {
        return this.data;
    }

    public static class BatchRegisterDeviceResponseBodyData extends TeaModel {
        @NameInMap("ApplyId")
        public Long applyId;

        public static BatchRegisterDeviceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchRegisterDeviceResponseBodyData self = new BatchRegisterDeviceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchRegisterDeviceResponseBodyData setApplyId(Long applyId) {
            this.applyId = applyId;
            return this;
        }
        public Long getApplyId() {
            return this.applyId;
        }

    }

    public static class RegisterDeviceResponseBodyData extends TeaModel {
        @NameInMap("IotId")
        public String iotId;

        @NameInMap("ProductKey")
        public String productKey;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("DeviceSecret")
        public String deviceSecret;

        @NameInMap("DevEui")
        public String devEui;

        @NameInMap("JoinEui")
        public String joinEui;

        @NameInMap("Nickname")
        public String nickname;

        public static RegisterDeviceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RegisterDeviceResponseBodyData self = new RegisterDeviceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RegisterDeviceResponseBodyData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public RegisterDeviceResponseBodyData setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
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

        public RegisterDeviceResponseBodyData setDevEui(String devEui) {
            this.devEui = devEui;
            return this;
        }
        public String getDevEui() {
            return this.devEui;
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

    }

}
