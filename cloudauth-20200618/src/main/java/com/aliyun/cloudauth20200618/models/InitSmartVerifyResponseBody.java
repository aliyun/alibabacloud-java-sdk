// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20200618.models;

import com.aliyun.tea.*;

public class InitSmartVerifyResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultObject")
    public InitSmartVerifyResponseBodyResultObject resultObject;

    public static InitSmartVerifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InitSmartVerifyResponseBody self = new InitSmartVerifyResponseBody();
        return TeaModel.build(map, self);
    }

    public InitSmartVerifyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InitSmartVerifyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InitSmartVerifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InitSmartVerifyResponseBody setResultObject(InitSmartVerifyResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public InitSmartVerifyResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class InitSmartVerifyResponseBodyResultObject extends TeaModel {
        @NameInMap("CertifyId")
        public String certifyId;

        public static InitSmartVerifyResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            InitSmartVerifyResponseBodyResultObject self = new InitSmartVerifyResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public InitSmartVerifyResponseBodyResultObject setCertifyId(String certifyId) {
            this.certifyId = certifyId;
            return this;
        }
        public String getCertifyId() {
            return this.certifyId;
        }

    }

}
