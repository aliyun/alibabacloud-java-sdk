// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class LivenessFaceVerifyResponseBody extends TeaModel {
    @NameInMap("ResultObject")
    public LivenessFaceVerifyResponseBodyResultObject resultObject;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    public static LivenessFaceVerifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LivenessFaceVerifyResponseBody self = new LivenessFaceVerifyResponseBody();
        return TeaModel.build(map, self);
    }

    public LivenessFaceVerifyResponseBody setResultObject(LivenessFaceVerifyResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public LivenessFaceVerifyResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public LivenessFaceVerifyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public LivenessFaceVerifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public LivenessFaceVerifyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class LivenessFaceVerifyResponseBodyResultObject extends TeaModel {
        @NameInMap("MaterialInfo")
        public String materialInfo;

        @NameInMap("SubCode")
        public String subCode;

        @NameInMap("Passed")
        public String passed;

        public static LivenessFaceVerifyResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            LivenessFaceVerifyResponseBodyResultObject self = new LivenessFaceVerifyResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public LivenessFaceVerifyResponseBodyResultObject setMaterialInfo(String materialInfo) {
            this.materialInfo = materialInfo;
            return this;
        }
        public String getMaterialInfo() {
            return this.materialInfo;
        }

        public LivenessFaceVerifyResponseBodyResultObject setSubCode(String subCode) {
            this.subCode = subCode;
            return this;
        }
        public String getSubCode() {
            return this.subCode;
        }

        public LivenessFaceVerifyResponseBodyResultObject setPassed(String passed) {
            this.passed = passed;
            return this;
        }
        public String getPassed() {
            return this.passed;
        }

    }

}
