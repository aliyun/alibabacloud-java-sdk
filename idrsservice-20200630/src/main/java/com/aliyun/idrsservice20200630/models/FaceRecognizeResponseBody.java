// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class FaceRecognizeResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public FaceRecognizeResponseBodyData data;

    @NameInMap("HttpCode")
    public Integer httpCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static FaceRecognizeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FaceRecognizeResponseBody self = new FaceRecognizeResponseBody();
        return TeaModel.build(map, self);
    }

    public FaceRecognizeResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public FaceRecognizeResponseBody setData(FaceRecognizeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public FaceRecognizeResponseBodyData getData() {
        return this.data;
    }

    public FaceRecognizeResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public FaceRecognizeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FaceRecognizeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FaceRecognizeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class FaceRecognizeResponseBodyData extends TeaModel {
        @NameInMap("ComparePassed")
        public String comparePassed;

        @NameInMap("CompareScore")
        public Float compareScore;

        @NameInMap("LivenessPassed")
        public String livenessPassed;

        @NameInMap("LivenessScore")
        public Float livenessScore;

        public static FaceRecognizeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            FaceRecognizeResponseBodyData self = new FaceRecognizeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public FaceRecognizeResponseBodyData setComparePassed(String comparePassed) {
            this.comparePassed = comparePassed;
            return this;
        }
        public String getComparePassed() {
            return this.comparePassed;
        }

        public FaceRecognizeResponseBodyData setCompareScore(Float compareScore) {
            this.compareScore = compareScore;
            return this;
        }
        public Float getCompareScore() {
            return this.compareScore;
        }

        public FaceRecognizeResponseBodyData setLivenessPassed(String livenessPassed) {
            this.livenessPassed = livenessPassed;
            return this;
        }
        public String getLivenessPassed() {
            return this.livenessPassed;
        }

        public FaceRecognizeResponseBodyData setLivenessScore(Float livenessScore) {
            this.livenessScore = livenessScore;
            return this;
        }
        public Float getLivenessScore() {
            return this.livenessScore;
        }

    }

}
