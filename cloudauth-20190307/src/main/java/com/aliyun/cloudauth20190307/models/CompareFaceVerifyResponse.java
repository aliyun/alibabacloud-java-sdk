// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CompareFaceVerifyResponse extends TeaModel {
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
    public CompareFaceVerifyResponseResultObject resultObject;

    public static CompareFaceVerifyResponse build(java.util.Map<String, ?> map) throws Exception {
        CompareFaceVerifyResponse self = new CompareFaceVerifyResponse();
        return TeaModel.build(map, self);
    }

    public CompareFaceVerifyResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CompareFaceVerifyResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CompareFaceVerifyResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CompareFaceVerifyResponse setResultObject(CompareFaceVerifyResponseResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public CompareFaceVerifyResponseResultObject getResultObject() {
        return this.resultObject;
    }

    public static class CompareFaceVerifyResponseResultObject extends TeaModel {
        @NameInMap("Passed")
        @Validation(required = true)
        public String passed;

        @NameInMap("VerifyScore")
        @Validation(required = true)
        public Float verifyScore;

        public static CompareFaceVerifyResponseResultObject build(java.util.Map<String, ?> map) throws Exception {
            CompareFaceVerifyResponseResultObject self = new CompareFaceVerifyResponseResultObject();
            return TeaModel.build(map, self);
        }

        public CompareFaceVerifyResponseResultObject setPassed(String passed) {
            this.passed = passed;
            return this;
        }
        public String getPassed() {
            return this.passed;
        }

        public CompareFaceVerifyResponseResultObject setVerifyScore(Float verifyScore) {
            this.verifyScore = verifyScore;
            return this;
        }
        public Float getVerifyScore() {
            return this.verifyScore;
        }

    }

}
