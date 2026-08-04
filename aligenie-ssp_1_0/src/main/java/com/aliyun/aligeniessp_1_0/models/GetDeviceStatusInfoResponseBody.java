// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetDeviceStatusInfoResponseBody extends TeaModel {
    /**
     * <p>The error code returned. A value of 200 indicates that the call succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The return result of invoking this API.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0EC7*726E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Detailed information returned.</p>
     */
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
        /**
         * <p>Indicates whether the device is online. A value of 0 means offline, and 1 means online.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
