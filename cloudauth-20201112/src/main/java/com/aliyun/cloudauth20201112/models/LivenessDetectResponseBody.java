// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20201112.models;

import com.aliyun.tea.*;

public class LivenessDetectResponseBody extends TeaModel {
    @NameInMap("ResultObject")
    public LivenessDetectResponseBodyResultObject resultObject;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    public static LivenessDetectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LivenessDetectResponseBody self = new LivenessDetectResponseBody();
        return TeaModel.build(map, self);
    }

    public LivenessDetectResponseBody setResultObject(LivenessDetectResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public LivenessDetectResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public LivenessDetectResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public LivenessDetectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public LivenessDetectResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class LivenessDetectResponseBodyResultObject extends TeaModel {
        @NameInMap("Score")
        public Float score;

        @NameInMap("FrameUrl")
        public String frameUrl;

        @NameInMap("Passed")
        public String passed;

        public static LivenessDetectResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            LivenessDetectResponseBodyResultObject self = new LivenessDetectResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public LivenessDetectResponseBodyResultObject setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public LivenessDetectResponseBodyResultObject setFrameUrl(String frameUrl) {
            this.frameUrl = frameUrl;
            return this;
        }
        public String getFrameUrl() {
            return this.frameUrl;
        }

        public LivenessDetectResponseBodyResultObject setPassed(String passed) {
            this.passed = passed;
            return this;
        }
        public String getPassed() {
            return this.passed;
        }

    }

}
