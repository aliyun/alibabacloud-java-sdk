// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20180807.models;

import com.aliyun.tea.*;

public class MachineTranslateGeneralResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public MachineTranslateGeneralResponseBodyResultCode resultCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TranslateText")
    public String translateText;

    public static MachineTranslateGeneralResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MachineTranslateGeneralResponseBody self = new MachineTranslateGeneralResponseBody();
        return TeaModel.build(map, self);
    }

    public MachineTranslateGeneralResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MachineTranslateGeneralResponseBody setResultCode(MachineTranslateGeneralResponseBodyResultCode resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public MachineTranslateGeneralResponseBodyResultCode getResultCode() {
        return this.resultCode;
    }

    public MachineTranslateGeneralResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public MachineTranslateGeneralResponseBody setTranslateText(String translateText) {
        this.translateText = translateText;
        return this;
    }
    public String getTranslateText() {
        return this.translateText;
    }

    public static class MachineTranslateGeneralResponseBodyResultCode extends TeaModel {
        @NameInMap("Code")
        public Integer code;

        @NameInMap("Message")
        public String message;

        public static MachineTranslateGeneralResponseBodyResultCode build(java.util.Map<String, ?> map) throws Exception {
            MachineTranslateGeneralResponseBodyResultCode self = new MachineTranslateGeneralResponseBodyResultCode();
            return TeaModel.build(map, self);
        }

        public MachineTranslateGeneralResponseBodyResultCode setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public MachineTranslateGeneralResponseBodyResultCode setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
