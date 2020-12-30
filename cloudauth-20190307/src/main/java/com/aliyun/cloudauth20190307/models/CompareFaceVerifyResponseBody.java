// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CompareFaceVerifyResponseBody extends TeaModel {
    @NameInMap("ResultObject")
    public CompareFaceVerifyResponseBodyResultObject resultObject;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    public static CompareFaceVerifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CompareFaceVerifyResponseBody self = new CompareFaceVerifyResponseBody();
        return TeaModel.build(map, self);
    }

    public CompareFaceVerifyResponseBody setResultObject(CompareFaceVerifyResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public CompareFaceVerifyResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public CompareFaceVerifyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CompareFaceVerifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CompareFaceVerifyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class CompareFaceVerifyResponseBodyResultObject extends TeaModel {
        @NameInMap("VerifyScore")
        public Float verifyScore;

        @NameInMap("Passed")
        public String passed;

        public static CompareFaceVerifyResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            CompareFaceVerifyResponseBodyResultObject self = new CompareFaceVerifyResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public CompareFaceVerifyResponseBodyResultObject setVerifyScore(Float verifyScore) {
            this.verifyScore = verifyScore;
            return this;
        }
        public Float getVerifyScore() {
            return this.verifyScore;
        }

        public CompareFaceVerifyResponseBodyResultObject setPassed(String passed) {
            this.passed = passed;
            return this;
        }
        public String getPassed() {
            return this.passed;
        }

    }

}
