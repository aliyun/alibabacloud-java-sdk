// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class LivenessFaceVerifyResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultObject")
    public LivenessFaceVerifyResponseBodyResultObject resultObject;

    public static LivenessFaceVerifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LivenessFaceVerifyResponseBody self = new LivenessFaceVerifyResponseBody();
        return TeaModel.build(map, self);
    }

    public LivenessFaceVerifyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
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

    public LivenessFaceVerifyResponseBody setResultObject(LivenessFaceVerifyResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public LivenessFaceVerifyResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class LivenessFaceVerifyResponseBodyResultObject extends TeaModel {
        @NameInMap("CertifyId")
        public String certifyId;

        @NameInMap("MaterialInfo")
        public String materialInfo;

        @NameInMap("Passed")
        public String passed;

        @NameInMap("SubCode")
        public String subCode;

        public static LivenessFaceVerifyResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            LivenessFaceVerifyResponseBodyResultObject self = new LivenessFaceVerifyResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public LivenessFaceVerifyResponseBodyResultObject setCertifyId(String certifyId) {
            this.certifyId = certifyId;
            return this;
        }
        public String getCertifyId() {
            return this.certifyId;
        }

        public LivenessFaceVerifyResponseBodyResultObject setMaterialInfo(String materialInfo) {
            this.materialInfo = materialInfo;
            return this;
        }
        public String getMaterialInfo() {
            return this.materialInfo;
        }

        public LivenessFaceVerifyResponseBodyResultObject setPassed(String passed) {
            this.passed = passed;
            return this;
        }
        public String getPassed() {
            return this.passed;
        }

        public LivenessFaceVerifyResponseBodyResultObject setSubCode(String subCode) {
            this.subCode = subCode;
            return this;
        }
        public String getSubCode() {
            return this.subCode;
        }

    }

}
