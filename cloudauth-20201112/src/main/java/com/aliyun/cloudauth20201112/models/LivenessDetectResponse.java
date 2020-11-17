// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20201112.models;

import com.aliyun.tea.*;

public class LivenessDetectResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("ResultObject")
    @Validation(required = true)
    public LivenessDetectResponseResultObject resultObject;

    public static LivenessDetectResponse build(java.util.Map<String, ?> map) throws Exception {
        LivenessDetectResponse self = new LivenessDetectResponse();
        return TeaModel.build(map, self);
    }

    public LivenessDetectResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public LivenessDetectResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public LivenessDetectResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public LivenessDetectResponse setResultObject(LivenessDetectResponseResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public LivenessDetectResponseResultObject getResultObject() {
        return this.resultObject;
    }

    public static class LivenessDetectResponseResultObject extends TeaModel {
        @NameInMap("Passed")
        @Validation(required = true)
        public String passed;

        @NameInMap("Score")
        @Validation(required = true)
        public Float score;

        @NameInMap("FrameUrl")
        @Validation(required = true)
        public String frameUrl;

        public static LivenessDetectResponseResultObject build(java.util.Map<String, ?> map) throws Exception {
            LivenessDetectResponseResultObject self = new LivenessDetectResponseResultObject();
            return TeaModel.build(map, self);
        }

        public LivenessDetectResponseResultObject setPassed(String passed) {
            this.passed = passed;
            return this;
        }
        public String getPassed() {
            return this.passed;
        }

        public LivenessDetectResponseResultObject setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public LivenessDetectResponseResultObject setFrameUrl(String frameUrl) {
            this.frameUrl = frameUrl;
            return this;
        }
        public String getFrameUrl() {
            return this.frameUrl;
        }

    }

}
