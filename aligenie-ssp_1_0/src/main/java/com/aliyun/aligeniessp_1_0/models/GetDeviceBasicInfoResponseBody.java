// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetDeviceBasicInfoResponseBody extends TeaModel {
    // 返回的错误码
    @NameInMap("Code")
    public Integer code;

    // 返回的错误信息
    @NameInMap("Message")
    public String message;

    // 请求id
    @NameInMap("RequestId")
    public String requestId;

    // 返回result
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
        // 固件版本
        @NameInMap("FirmwareVersion")
        public String firmwareVersion;

        // 设备MAC地址
        @NameInMap("Mac")
        public String mac;

        // 设备名称
        @NameInMap("Name")
        public String name;

        // 设备SN
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
