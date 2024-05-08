// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class FaceCompareResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public FaceCompareResponseBodyData data;

    @NameInMap("HttpCode")
    public Integer httpCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static FaceCompareResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FaceCompareResponseBody self = new FaceCompareResponseBody();
        return TeaModel.build(map, self);
    }

    public FaceCompareResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public FaceCompareResponseBody setData(FaceCompareResponseBodyData data) {
        this.data = data;
        return this;
    }
    public FaceCompareResponseBodyData getData() {
        return this.data;
    }

    public FaceCompareResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public FaceCompareResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FaceCompareResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FaceCompareResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class FaceCompareResponseBodyData extends TeaModel {
        @NameInMap("Code")
        public String code;

        /**
         * <p>ID</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("Message")
        public String message;

        @NameInMap("Passed")
        public String passed;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("Status")
        public String status;

        @NameInMap("VerifyScore")
        public Float verifyScore;

        public static FaceCompareResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            FaceCompareResponseBodyData self = new FaceCompareResponseBodyData();
            return TeaModel.build(map, self);
        }

        public FaceCompareResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public FaceCompareResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public FaceCompareResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public FaceCompareResponseBodyData setPassed(String passed) {
            this.passed = passed;
            return this;
        }
        public String getPassed() {
            return this.passed;
        }

        public FaceCompareResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public FaceCompareResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public FaceCompareResponseBodyData setVerifyScore(Float verifyScore) {
            this.verifyScore = verifyScore;
            return this;
        }
        public Float getVerifyScore() {
            return this.verifyScore;
        }

    }

}
