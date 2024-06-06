// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class CreateAsyncTranslateResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public CreateAsyncTranslateResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateAsyncTranslateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAsyncTranslateResponseBody self = new CreateAsyncTranslateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAsyncTranslateResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateAsyncTranslateResponseBody setData(CreateAsyncTranslateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateAsyncTranslateResponseBodyData getData() {
        return this.data;
    }

    public CreateAsyncTranslateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateAsyncTranslateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateAsyncTranslateResponseBodyData extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Status")
        public String status;

        public static CreateAsyncTranslateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateAsyncTranslateResponseBodyData self = new CreateAsyncTranslateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateAsyncTranslateResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public CreateAsyncTranslateResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
