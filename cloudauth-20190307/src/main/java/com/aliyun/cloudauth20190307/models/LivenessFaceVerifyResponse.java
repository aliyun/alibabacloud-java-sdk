// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class LivenessFaceVerifyResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ResultObject")
    @Validation(required = true)
    public LivenessFaceVerifyResponseResultObject resultObject;

    public static LivenessFaceVerifyResponse build(java.util.Map<String, ?> map) throws Exception {
        LivenessFaceVerifyResponse self = new LivenessFaceVerifyResponse();
        return TeaModel.build(map, self);
    }

    public LivenessFaceVerifyResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public LivenessFaceVerifyResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public LivenessFaceVerifyResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public LivenessFaceVerifyResponse setResultObject(LivenessFaceVerifyResponseResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public LivenessFaceVerifyResponseResultObject getResultObject() {
        return this.resultObject;
    }

    public static class LivenessFaceVerifyResponseResultObject extends TeaModel {
        @NameInMap("CertifyId")
        @Validation(required = true)
        public String certifyId;

        @NameInMap("MaterialInfo")
        @Validation(required = true)
        public String materialInfo;

        @NameInMap("Passed")
        @Validation(required = true)
        public String passed;

        @NameInMap("SubCode")
        @Validation(required = true)
        public String subCode;

        public static LivenessFaceVerifyResponseResultObject build(java.util.Map<String, ?> map) throws Exception {
            LivenessFaceVerifyResponseResultObject self = new LivenessFaceVerifyResponseResultObject();
            return TeaModel.build(map, self);
        }

        public LivenessFaceVerifyResponseResultObject setCertifyId(String certifyId) {
            this.certifyId = certifyId;
            return this;
        }
        public String getCertifyId() {
            return this.certifyId;
        }

        public LivenessFaceVerifyResponseResultObject setMaterialInfo(String materialInfo) {
            this.materialInfo = materialInfo;
            return this;
        }
        public String getMaterialInfo() {
            return this.materialInfo;
        }

        public LivenessFaceVerifyResponseResultObject setPassed(String passed) {
            this.passed = passed;
            return this;
        }
        public String getPassed() {
            return this.passed;
        }

        public LivenessFaceVerifyResponseResultObject setSubCode(String subCode) {
            this.subCode = subCode;
            return this;
        }
        public String getSubCode() {
            return this.subCode;
        }

    }

}
