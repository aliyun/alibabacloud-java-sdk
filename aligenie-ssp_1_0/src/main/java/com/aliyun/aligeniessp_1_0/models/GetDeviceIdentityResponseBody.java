// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetDeviceIdentityResponseBody extends TeaModel {
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
    public GetDeviceIdentityResponseBodyResult result;

    public static GetDeviceIdentityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceIdentityResponseBody self = new GetDeviceIdentityResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeviceIdentityResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetDeviceIdentityResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDeviceIdentityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDeviceIdentityResponseBody setResult(GetDeviceIdentityResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetDeviceIdentityResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetDeviceIdentityResponseBodyResult extends TeaModel {
        // 固件版本
        @NameInMap("FirmwareVersion")
        public String firmwareVersion;

        // 设备名称
        @NameInMap("Name")
        public String name;

        public static GetDeviceIdentityResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetDeviceIdentityResponseBodyResult self = new GetDeviceIdentityResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetDeviceIdentityResponseBodyResult setFirmwareVersion(String firmwareVersion) {
            this.firmwareVersion = firmwareVersion;
            return this;
        }
        public String getFirmwareVersion() {
            return this.firmwareVersion;
        }

        public GetDeviceIdentityResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
