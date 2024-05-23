// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20180807.models;

import com.aliyun.tea.*;

public class MachineTranslateECommerceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public MachineTranslateECommerceResponseBodyResultCode resultCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TranslateText")
    public String translateText;

    public static MachineTranslateECommerceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MachineTranslateECommerceResponseBody self = new MachineTranslateECommerceResponseBody();
        return TeaModel.build(map, self);
    }

    public MachineTranslateECommerceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MachineTranslateECommerceResponseBody setResultCode(MachineTranslateECommerceResponseBodyResultCode resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public MachineTranslateECommerceResponseBodyResultCode getResultCode() {
        return this.resultCode;
    }

    public MachineTranslateECommerceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public MachineTranslateECommerceResponseBody setTranslateText(String translateText) {
        this.translateText = translateText;
        return this;
    }
    public String getTranslateText() {
        return this.translateText;
    }

    public static class MachineTranslateECommerceResponseBodyResultCode extends TeaModel {
        @NameInMap("Code")
        public Integer code;

        @NameInMap("Message")
        public String message;

        public static MachineTranslateECommerceResponseBodyResultCode build(java.util.Map<String, ?> map) throws Exception {
            MachineTranslateECommerceResponseBodyResultCode self = new MachineTranslateECommerceResponseBodyResultCode();
            return TeaModel.build(map, self);
        }

        public MachineTranslateECommerceResponseBodyResultCode setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public MachineTranslateECommerceResponseBodyResultCode setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
