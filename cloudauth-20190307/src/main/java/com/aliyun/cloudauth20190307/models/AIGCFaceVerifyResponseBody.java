// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class AIGCFaceVerifyResponseBody extends TeaModel {
    /**
     * <p>Return code: 200 for success, others for failure.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returned result</p>
     */
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
        /**
         * <p>Unique real-person authentication identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>91707dc296d469ad38e4c5efa6a0****</p>
         */
        @NameInMap("CertifyId")
        public String certifyId;

        /**
         * <p>Authentication result. Values:</p>
         * <p>● Y: AIGC-generated face.</p>
         * <p>● N: Not detected</p>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("Result")
        public String result;

        /**
         * <p>Detection score</p>
         * 
         * <strong>example:</strong>
         * <p>1.0000</p>
         */
        @NameInMap("Score")
        public String score;

        public static AIGCFaceVerifyResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            AIGCFaceVerifyResponseBodyResultObject self = new AIGCFaceVerifyResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public AIGCFaceVerifyResponseBodyResultObject setCertifyId(String certifyId) {
            this.certifyId = certifyId;
            return this;
        }
        public String getCertifyId() {
            return this.certifyId;
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
