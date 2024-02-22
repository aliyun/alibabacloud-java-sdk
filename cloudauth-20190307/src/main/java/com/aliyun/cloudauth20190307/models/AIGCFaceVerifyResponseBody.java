// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class AIGCFaceVerifyResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultObject")
    public AIGCFaceVerifyResponseBodyResultObject resultObject;

    public static AIGCFaceVerifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AIGCFaceVerifyResponseBody self = new AIGCFaceVerifyResponseBody();
        return TeaModel.build(map, self);
    }

    public AIGCFaceVerifyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AIGCFaceVerifyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AIGCFaceVerifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AIGCFaceVerifyResponseBody setResultObject(AIGCFaceVerifyResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public AIGCFaceVerifyResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class AIGCFaceVerifyResponseBodyResultObject extends TeaModel {
        @NameInMap("Result")
        public String result;

        @NameInMap("Score")
        public String score;

        public static AIGCFaceVerifyResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            AIGCFaceVerifyResponseBodyResultObject self = new AIGCFaceVerifyResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public AIGCFaceVerifyResponseBodyResultObject setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public AIGCFaceVerifyResponseBodyResultObject setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

    }

}
