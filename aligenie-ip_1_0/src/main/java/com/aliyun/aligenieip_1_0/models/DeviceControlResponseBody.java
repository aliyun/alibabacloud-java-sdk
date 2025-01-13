// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class DeviceControlResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>43<em><strong>28C-A810-5</strong></em>-8747-EC226A086881</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DeviceControlResponseBodyResult result;

    public static DeviceControlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeviceControlResponseBody self = new DeviceControlResponseBody();
        return TeaModel.build(map, self);
    }

    public DeviceControlResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DeviceControlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeviceControlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeviceControlResponseBody setResult(DeviceControlResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DeviceControlResponseBodyResult getResult() {
        return this.result;
    }

    public static class DeviceControlResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Status")
        public String status;

        public static DeviceControlResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DeviceControlResponseBodyResult self = new DeviceControlResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DeviceControlResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
