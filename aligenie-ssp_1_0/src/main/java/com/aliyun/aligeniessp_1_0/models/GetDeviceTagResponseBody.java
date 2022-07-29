// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetDeviceTagResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetDeviceTagResponseBodyResult result;

    public static GetDeviceTagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceTagResponseBody self = new GetDeviceTagResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeviceTagResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetDeviceTagResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDeviceTagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDeviceTagResponseBody setResult(GetDeviceTagResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetDeviceTagResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetDeviceTagResponseBodyResult extends TeaModel {
        @NameInMap("DeviceTags")
        public java.util.Map<String, ?> deviceTags;

        public static GetDeviceTagResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetDeviceTagResponseBodyResult self = new GetDeviceTagResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetDeviceTagResponseBodyResult setDeviceTags(java.util.Map<String, ?> deviceTags) {
            this.deviceTags = deviceTags;
            return this;
        }
        public java.util.Map<String, ?> getDeviceTags() {
            return this.deviceTags;
        }

    }

}
