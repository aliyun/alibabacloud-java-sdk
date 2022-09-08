// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ScanCodeBindResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("bizGroup")
        public String bizGroup;

        @NameInMap("bizType")
        public String bizType;

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

    }

}
