// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class InitFaceVerifyResponseBody extends TeaModel {
    @NameInMap("ResultObject")
    public InitFaceVerifyResponseBodyResultObject resultObject;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    public static InitFaceVerifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InitFaceVerifyResponseBody self = new InitFaceVerifyResponseBody();
        return TeaModel.build(map, self);
    }

    public InitFaceVerifyResponseBody setResultObject(InitFaceVerifyResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public InitFaceVerifyResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public InitFaceVerifyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InitFaceVerifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InitFaceVerifyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class InitFaceVerifyResponseBodyResultObject extends TeaModel {
        @NameInMap("CertifyId")
        public String certifyId;

        @NameInMap("CertifyUrl")
        public String certifyUrl;

        public static InitFaceVerifyResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            InitFaceVerifyResponseBodyResultObject self = new InitFaceVerifyResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public InitFaceVerifyResponseBodyResultObject setCertifyId(String certifyId) {
            this.certifyId = certifyId;
            return this;
        }
        public String getCertifyId() {
            return this.certifyId;
        }

        public InitFaceVerifyResponseBodyResultObject setCertifyUrl(String certifyUrl) {
            this.certifyUrl = certifyUrl;
            return this;
        }
        public String getCertifyUrl() {
            return this.certifyUrl;
        }

    }

}
