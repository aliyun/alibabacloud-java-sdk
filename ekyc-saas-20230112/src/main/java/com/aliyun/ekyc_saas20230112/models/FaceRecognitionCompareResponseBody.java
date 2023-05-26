// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ekyc_saas20230112.models;

import com.aliyun.tea.*;

public class FaceRecognitionCompareResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public FaceRecognitionCompareResponseBodyData data;

    @NameInMap("HttpCode")
    public Long httpCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("Ok")
    public Boolean ok;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    public static FaceRecognitionCompareResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FaceRecognitionCompareResponseBody self = new FaceRecognitionCompareResponseBody();
        return TeaModel.build(map, self);
    }

    public FaceRecognitionCompareResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FaceRecognitionCompareResponseBody setData(FaceRecognitionCompareResponseBodyData data) {
        this.data = data;
        return this;
    }
    public FaceRecognitionCompareResponseBodyData getData() {
        return this.data;
    }

    public FaceRecognitionCompareResponseBody setHttpCode(Long httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Long getHttpCode() {
        return this.httpCode;
    }

    public FaceRecognitionCompareResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FaceRecognitionCompareResponseBody setOk(Boolean ok) {
        this.ok = ok;
        return this;
    }
    public Boolean getOk() {
        return this.ok;
    }

    public FaceRecognitionCompareResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FaceRecognitionCompareResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class FaceRecognitionCompareResponseBodyData extends TeaModel {
        @NameInMap("Match")
        public String match;

        @NameInMap("Score")
        public Double score;

        public static FaceRecognitionCompareResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            FaceRecognitionCompareResponseBodyData self = new FaceRecognitionCompareResponseBodyData();
            return TeaModel.build(map, self);
        }

        public FaceRecognitionCompareResponseBodyData setMatch(String match) {
            this.match = match;
            return this;
        }
        public String getMatch() {
            return this.match;
        }

        public FaceRecognitionCompareResponseBodyData setScore(Double score) {
            this.score = score;
            return this;
        }
        public Double getScore() {
            return this.score;
        }

    }

}
