// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class RegisterDeviceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Data")
    @Validation(required = true)
    public RegisterDeviceResponseData data;

    public static RegisterDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterDeviceResponse self = new RegisterDeviceResponse();
        return TeaModel.build(map, self);
    }

    public RegisterDeviceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RegisterDeviceResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public RegisterDeviceResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RegisterDeviceResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public RegisterDeviceResponse setData(RegisterDeviceResponseData data) {
        this.data = data;
        return this;
    }
    public RegisterDeviceResponseData getData() {
        return this.data;
    }

    public static class BatchRegisterDeviceResponseData extends TeaModel {
        @NameInMap("ApplyId")
        @Validation(required = true)
        public Long applyId;

        public static BatchRegisterDeviceResponseData build(java.util.Map<String, ?> map) throws Exception {
            BatchRegisterDeviceResponseData self = new BatchRegisterDeviceResponseData();
            return TeaModel.build(map, self);
        }

        public BatchRegisterDeviceResponseData setApplyId(Long applyId) {
            this.applyId = applyId;
            return this;
        }
        public Long getApplyId() {
            return this.applyId;
        }

    }

    public static class RegisterDeviceResponseData extends TeaModel {
        @NameInMap("IotId")
        @Validation(required = true)
        public String iotId;

        @NameInMap("ProductKey")
        @Validation(required = true)
        public String productKey;

        @NameInMap("DeviceName")
        @Validation(required = true)
        public String deviceName;

        @NameInMap("DeviceSecret")
        @Validation(required = true)
        public String deviceSecret;

        @NameInMap("DevEui")
        @Validation(required = true)
        public String devEui;

        @NameInMap("JoinEui")
        @Validation(required = true)
        public String joinEui;

        @NameInMap("Nickname")
        @Validation(required = true)
        public String nickname;

        public static RegisterDeviceResponseData build(java.util.Map<String, ?> map) throws Exception {
            RegisterDeviceResponseData self = new RegisterDeviceResponseData();
            return TeaModel.build(map, self);
        }

        public RegisterDeviceResponseData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public RegisterDeviceResponseData setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public RegisterDeviceResponseData setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public RegisterDeviceResponseData setDeviceSecret(String deviceSecret) {
            this.deviceSecret = deviceSecret;
            return this;
        }
        public String getDeviceSecret() {
            return this.deviceSecret;
        }

        public RegisterDeviceResponseData setDevEui(String devEui) {
            this.devEui = devEui;
            return this;
        }
        public String getDevEui() {
            return this.devEui;
        }

        public RegisterDeviceResponseData setJoinEui(String joinEui) {
            this.joinEui = joinEui;
            return this;
        }
        public String getJoinEui() {
            return this.joinEui;
        }

        public RegisterDeviceResponseData setNickname(String nickname) {
            this.nickname = nickname;
            return this;
        }
        public String getNickname() {
            return this.nickname;
        }

    }

}
