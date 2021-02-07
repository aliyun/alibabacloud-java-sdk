// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class InitFaceVerifyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Data")
    @Validation(required = true)
    public InitFaceVerifyResponseData data;

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

    public InitFaceVerifyResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InitFaceVerifyResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InitFaceVerifyResponse setData(InitFaceVerifyResponseData data) {
        this.data = data;
        return this;
    }
    public InitFaceVerifyResponseData getData() {
        return this.data;
    }

    public static class InitFaceVerifyResponseData extends TeaModel {
        @NameInMap("CertifyId")
        @Validation(required = true)
        public String certifyId;

        public static InitFaceVerifyResponseData build(java.util.Map<String, ?> map) throws Exception {
            InitFaceVerifyResponseData self = new InitFaceVerifyResponseData();
            return TeaModel.build(map, self);
        }

        public InitFaceVerifyResponseData setCertifyId(String certifyId) {
            this.certifyId = certifyId;
            return this;
        }
        public String getCertifyId() {
            return this.certifyId;
        }

    }

}
