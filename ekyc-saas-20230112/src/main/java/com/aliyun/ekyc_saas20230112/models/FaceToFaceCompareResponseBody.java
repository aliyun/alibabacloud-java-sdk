// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ekyc_saas20230112.models;

import com.aliyun.tea.*;

public class FaceToFaceCompareResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public FaceToFaceCompareResponseBodyData data;

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

    public static FaceToFaceCompareResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FaceToFaceCompareResponseBody self = new FaceToFaceCompareResponseBody();
        return TeaModel.build(map, self);
    }

    public FaceToFaceCompareResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FaceToFaceCompareResponseBody setData(FaceToFaceCompareResponseBodyData data) {
        this.data = data;
        return this;
    }
    public FaceToFaceCompareResponseBodyData getData() {
        return this.data;
    }

    public FaceToFaceCompareResponseBody setHttpCode(Long httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Long getHttpCode() {
        return this.httpCode;
    }

    public FaceToFaceCompareResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FaceToFaceCompareResponseBody setOk(Boolean ok) {
        this.ok = ok;
        return this;
    }
    public Boolean getOk() {
        return this.ok;
    }

    public FaceToFaceCompareResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FaceToFaceCompareResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class FaceToFaceCompareResponseBodyData extends TeaModel {
        @NameInMap("Match")
        public String match;

        @NameInMap("Score")
        public Double score;

        public static FaceToFaceCompareResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            FaceToFaceCompareResponseBodyData self = new FaceToFaceCompareResponseBodyData();
            return TeaModel.build(map, self);
        }

        public FaceToFaceCompareResponseBodyData setMatch(String match) {
            this.match = match;
            return this;
        }
        public String getMatch() {
            return this.match;
        }

        public FaceToFaceCompareResponseBodyData setScore(Double score) {
            this.score = score;
            return this;
        }
        public Double getScore() {
            return this.score;
        }

    }

}
