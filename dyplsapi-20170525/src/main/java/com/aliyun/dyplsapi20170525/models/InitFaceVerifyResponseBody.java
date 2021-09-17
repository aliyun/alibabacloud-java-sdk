// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class InitFaceVerifyResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public InitFaceVerifyResponseBodyData data;

    public static InitFaceVerifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InitFaceVerifyResponseBody self = new InitFaceVerifyResponseBody();
        return TeaModel.build(map, self);
    }

    public InitFaceVerifyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
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

    public InitFaceVerifyResponseBody setData(InitFaceVerifyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public InitFaceVerifyResponseBodyData getData() {
        return this.data;
    }

    public static class InitFaceVerifyResponseBodyData extends TeaModel {
        @NameInMap("CertifyId")
        public String certifyId;

        public static InitFaceVerifyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            InitFaceVerifyResponseBodyData self = new InitFaceVerifyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public InitFaceVerifyResponseBodyData setCertifyId(String certifyId) {
            this.certifyId = certifyId;
            return this;
        }
        public String getCertifyId() {
            return this.certifyId;
        }

    }

}
