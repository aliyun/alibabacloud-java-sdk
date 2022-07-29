// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetDeviceBasicInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetDeviceBasicInfoResponseBodyResult result;

    public static GetDeviceBasicInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceBasicInfoResponseBody self = new GetDeviceBasicInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeviceBasicInfoResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetDeviceBasicInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDeviceBasicInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDeviceBasicInfoResponseBody setResult(GetDeviceBasicInfoResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetDeviceBasicInfoResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetDeviceBasicInfoResponseBodyResult extends TeaModel {
        @NameInMap("FirmwareVersion")
        public String firmwareVersion;

        @NameInMap("Mac")
        public String mac;

        @NameInMap("Name")
        public String name;

        @NameInMap("Sn")
        public String sn;

        public static GetDeviceBasicInfoResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetDeviceBasicInfoResponseBodyResult self = new GetDeviceBasicInfoResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetDeviceBasicInfoResponseBodyResult setFirmwareVersion(String firmwareVersion) {
            this.firmwareVersion = firmwareVersion;
            return this;
        }
        public String getFirmwareVersion() {
            return this.firmwareVersion;
        }

        public GetDeviceBasicInfoResponseBodyResult setMac(String mac) {
            this.mac = mac;
            return this;
        }
        public String getMac() {
            return this.mac;
        }

        public GetDeviceBasicInfoResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDeviceBasicInfoResponseBodyResult setSn(String sn) {
            this.sn = sn;
            return this;
        }
        public String getSn() {
            return this.sn;
        }

    }

}
