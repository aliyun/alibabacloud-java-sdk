// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class FaceLivenessResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public FaceLivenessResponseBodyData data;

    @NameInMap("HttpCode")
    public Integer httpCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static FaceLivenessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FaceLivenessResponseBody self = new FaceLivenessResponseBody();
        return TeaModel.build(map, self);
    }

    public FaceLivenessResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public FaceLivenessResponseBody setData(FaceLivenessResponseBodyData data) {
        this.data = data;
        return this;
    }
    public FaceLivenessResponseBodyData getData() {
        return this.data;
    }

    public FaceLivenessResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public FaceLivenessResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FaceLivenessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FaceLivenessResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class FaceLivenessResponseBodyData extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Passed")
        public String passed;

        @NameInMap("PublicId")
        public String publicId;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Status")
        public String status;

        public static FaceLivenessResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            FaceLivenessResponseBodyData self = new FaceLivenessResponseBodyData();
            return TeaModel.build(map, self);
        }

        public FaceLivenessResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public FaceLivenessResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public FaceLivenessResponseBodyData setPassed(String passed) {
            this.passed = passed;
            return this;
        }
        public String getPassed() {
            return this.passed;
        }

        public FaceLivenessResponseBodyData setPublicId(String publicId) {
            this.publicId = publicId;
            return this;
        }
        public String getPublicId() {
            return this.publicId;
        }

        public FaceLivenessResponseBodyData setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public FaceLivenessResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
