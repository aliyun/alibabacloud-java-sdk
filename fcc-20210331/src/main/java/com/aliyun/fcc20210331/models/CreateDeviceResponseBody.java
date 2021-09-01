// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class CreateDeviceResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public CreateDeviceResponseBodyData data;

    public static CreateDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDeviceResponseBody self = new CreateDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDeviceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateDeviceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDeviceResponseBody setData(CreateDeviceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateDeviceResponseBodyData getData() {
        return this.data;
    }

    public static class CreateDeviceResponseBodyData extends TeaModel {
        @NameInMap("ChannelGbId")
        public String channelGbId;

        @NameInMap("SipReaml")
        public String sipReaml;

        @NameInMap("SipIp")
        public String sipIp;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("SipDeviceGbId")
        public String sipDeviceGbId;

        @NameInMap("SipPassword")
        public String sipPassword;

        @NameInMap("DeviceCode")
        public String deviceCode;

        @NameInMap("SipPort")
        public String sipPort;

        @NameInMap("SipGbId")
        public String sipGbId;

        public static CreateDeviceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateDeviceResponseBodyData self = new CreateDeviceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateDeviceResponseBodyData setChannelGbId(String channelGbId) {
            this.channelGbId = channelGbId;
            return this;
        }
        public String getChannelGbId() {
            return this.channelGbId;
        }

        public CreateDeviceResponseBodyData setSipReaml(String sipReaml) {
            this.sipReaml = sipReaml;
            return this;
        }
        public String getSipReaml() {
            return this.sipReaml;
        }

        public CreateDeviceResponseBodyData setSipIp(String sipIp) {
            this.sipIp = sipIp;
            return this;
        }
        public String getSipIp() {
            return this.sipIp;
        }

        public CreateDeviceResponseBodyData setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public CreateDeviceResponseBodyData setSipDeviceGbId(String sipDeviceGbId) {
            this.sipDeviceGbId = sipDeviceGbId;
            return this;
        }
        public String getSipDeviceGbId() {
            return this.sipDeviceGbId;
        }

        public CreateDeviceResponseBodyData setSipPassword(String sipPassword) {
            this.sipPassword = sipPassword;
            return this;
        }
        public String getSipPassword() {
            return this.sipPassword;
        }

        public CreateDeviceResponseBodyData setDeviceCode(String deviceCode) {
            this.deviceCode = deviceCode;
            return this;
        }
        public String getDeviceCode() {
            return this.deviceCode;
        }

        public CreateDeviceResponseBodyData setSipPort(String sipPort) {
            this.sipPort = sipPort;
            return this;
        }
        public String getSipPort() {
            return this.sipPort;
        }

        public CreateDeviceResponseBodyData setSipGbId(String sipGbId) {
            this.sipGbId = sipGbId;
            return this;
        }
        public String getSipGbId() {
            return this.sipGbId;
        }

    }

}
