// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ScanCodeBindResponseBody extends TeaModel {
    /**
     * <p>The returned error code. A value of 200 indicates that the invocation succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>Result message</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>686DF82F-45C4-7DF7-8B67-27B91CFD63A9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Detailed information returned.</p>
     */
    @NameInMap("Result")
    public ScanCodeBindResponseBodyResult result;

    public static ScanCodeBindResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ScanCodeBindResponseBody self = new ScanCodeBindResponseBody();
        return TeaModel.build(map, self);
    }

    public ScanCodeBindResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ScanCodeBindResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ScanCodeBindResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ScanCodeBindResponseBody setResult(ScanCodeBindResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ScanCodeBindResponseBodyResult getResult() {
        return this.result;
    }

    public static class ScanCodeBindResponseBodyResult extends TeaModel {
        /**
         * <p>Product group</p>
         * 
         * <strong>example:</strong>
         * <p>X1</p>
         */
        @NameInMap("BizGroup")
        public String bizGroup;

        /**
         * <p>Product categorization</p>
         * 
         * <strong>example:</strong>
         * <p>AILABS</p>
         */
        @NameInMap("BizType")
        public String bizType;

        /**
         * <p>A963*0158</p>
         * 
         * <strong>example:</strong>
         * <p>设备OpenId</p>
         */
        @NameInMap("DeviceOpenId")
        public String deviceOpenId;

        /**
         * <p>DAFE****ce3ej=</p>
         * 
         * <strong>example:</strong>
         * <p>用户OpenId</p>
         */
        @NameInMap("UserOpenId")
        public String userOpenId;

        public static ScanCodeBindResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ScanCodeBindResponseBodyResult self = new ScanCodeBindResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ScanCodeBindResponseBodyResult setBizGroup(String bizGroup) {
            this.bizGroup = bizGroup;
            return this;
        }
        public String getBizGroup() {
            return this.bizGroup;
        }

        public ScanCodeBindResponseBodyResult setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public ScanCodeBindResponseBodyResult setDeviceOpenId(String deviceOpenId) {
            this.deviceOpenId = deviceOpenId;
            return this;
        }
        public String getDeviceOpenId() {
            return this.deviceOpenId;
        }

        public ScanCodeBindResponseBodyResult setUserOpenId(String userOpenId) {
            this.userOpenId = userOpenId;
            return this;
        }
        public String getUserOpenId() {
            return this.userOpenId;
        }

    }

}
