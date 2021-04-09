// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class InitFaceVerifyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ResultObject")
    @Validation(required = true)
    public InitFaceVerifyResponseResultObject resultObject;

    public static InitFaceVerifyResponse build(java.util.Map<String, ?> map) throws Exception {
        InitFaceVerifyResponse self = new InitFaceVerifyResponse();
        return TeaModel.build(map, self);
    }

    public InitFaceVerifyResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InitFaceVerifyResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InitFaceVerifyResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InitFaceVerifyResponse setResultObject(InitFaceVerifyResponseResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public InitFaceVerifyResponseResultObject getResultObject() {
        return this.resultObject;
    }

    public static class InitFaceVerifyResponseResultObject extends TeaModel {
        @NameInMap("CertifyId")
        @Validation(required = true)
        public String certifyId;

        @NameInMap("CertifyUrl")
        @Validation(required = true)
        public String certifyUrl;

        public static InitFaceVerifyResponseResultObject build(java.util.Map<String, ?> map) throws Exception {
            InitFaceVerifyResponseResultObject self = new InitFaceVerifyResponseResultObject();
            return TeaModel.build(map, self);
        }

        public InitFaceVerifyResponseResultObject setCertifyId(String certifyId) {
            this.certifyId = certifyId;
            return this;
        }
        public String getCertifyId() {
            return this.certifyId;
        }

        public InitFaceVerifyResponseResultObject setCertifyUrl(String certifyUrl) {
            this.certifyUrl = certifyUrl;
            return this;
        }
        public String getCertifyUrl() {
            return this.certifyUrl;
        }

    }

}
