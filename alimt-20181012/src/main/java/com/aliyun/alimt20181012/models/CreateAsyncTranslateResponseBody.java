// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class CreateAsyncTranslateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public CreateAsyncTranslateResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>DC2DCCC9-C3DF-4F59-8D8E-78185729F16D</p>
     */
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
         * 
         * <strong>example:</strong>
         * <p>98bbb007-71bb-448b-bab0-2695ce8f8599</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ready</p>
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
