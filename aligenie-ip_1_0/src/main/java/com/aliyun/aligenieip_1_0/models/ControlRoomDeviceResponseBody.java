// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ControlRoomDeviceResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public ControlRoomDeviceResponseBodyResult result;

    public static ControlRoomDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ControlRoomDeviceResponseBody self = new ControlRoomDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public ControlRoomDeviceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ControlRoomDeviceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ControlRoomDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ControlRoomDeviceResponseBody setResult(ControlRoomDeviceResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ControlRoomDeviceResponseBodyResult getResult() {
        return this.result;
    }

    public static class ControlRoomDeviceResponseBodyResult extends TeaModel {
        @NameInMap("Message")
        public String message;

        @NameInMap("Status")
        public Integer status;

        public static ControlRoomDeviceResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ControlRoomDeviceResponseBodyResult self = new ControlRoomDeviceResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ControlRoomDeviceResponseBodyResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ControlRoomDeviceResponseBodyResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
