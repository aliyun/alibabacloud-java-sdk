// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetDeviceStatusInfoResponseBody extends TeaModel {
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
    public GetDeviceStatusInfoResponseBodyResult result;

    public static GetDeviceStatusInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceStatusInfoResponseBody self = new GetDeviceStatusInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeviceStatusInfoResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetDeviceStatusInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDeviceStatusInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDeviceStatusInfoResponseBody setResult(GetDeviceStatusInfoResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetDeviceStatusInfoResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetDeviceStatusInfoResponseBodyResult extends TeaModel {
        // 是否在线，0为不在线，1为在线
        @NameInMap("Online")
        public Integer online;

        public static GetDeviceStatusInfoResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetDeviceStatusInfoResponseBodyResult self = new GetDeviceStatusInfoResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetDeviceStatusInfoResponseBodyResult setOnline(Integer online) {
            this.online = online;
            return this;
        }
        public Integer getOnline() {
            return this.online;
        }

    }

}
