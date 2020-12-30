// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class ContrastFaceVerifyResponseBody extends TeaModel {
    @NameInMap("ResultObject")
    public ContrastFaceVerifyResponseBodyResultObject resultObject;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    public static ContrastFaceVerifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ContrastFaceVerifyResponseBody self = new ContrastFaceVerifyResponseBody();
        return TeaModel.build(map, self);
    }

    public ContrastFaceVerifyResponseBody setResultObject(ContrastFaceVerifyResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public ContrastFaceVerifyResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public ContrastFaceVerifyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ContrastFaceVerifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ContrastFaceVerifyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class ContrastFaceVerifyResponseBodyResultObject extends TeaModel {
        @NameInMap("MaterialInfo")
        public String materialInfo;

        @NameInMap("SubCode")
        public String subCode;

        @NameInMap("IdentityInfo")
        public String identityInfo;

        @NameInMap("Passed")
        public String passed;

        public static ContrastFaceVerifyResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            ContrastFaceVerifyResponseBodyResultObject self = new ContrastFaceVerifyResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public ContrastFaceVerifyResponseBodyResultObject setMaterialInfo(String materialInfo) {
            this.materialInfo = materialInfo;
            return this;
        }
        public String getMaterialInfo() {
            return this.materialInfo;
        }

        public ContrastFaceVerifyResponseBodyResultObject setSubCode(String subCode) {
            this.subCode = subCode;
            return this;
        }
        public String getSubCode() {
            return this.subCode;
        }

        public ContrastFaceVerifyResponseBodyResultObject setIdentityInfo(String identityInfo) {
            this.identityInfo = identityInfo;
            return this;
        }
        public String getIdentityInfo() {
            return this.identityInfo;
        }

        public ContrastFaceVerifyResponseBodyResultObject setPassed(String passed) {
            this.passed = passed;
            return this;
        }
        public String getPassed() {
            return this.passed;
        }

    }

}
