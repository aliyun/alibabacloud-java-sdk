// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryInferenceJobResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Job")
    public QueryInferenceJobResponseBodyJob job;

    @NameInMap("Code")
    public String code;

    public static QueryInferenceJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryInferenceJobResponseBody self = new QueryInferenceJobResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryInferenceJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryInferenceJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryInferenceJobResponseBody setJob(QueryInferenceJobResponseBodyJob job) {
        this.job = job;
        return this;
    }
    public QueryInferenceJobResponseBodyJob getJob() {
        return this.job;
    }

    public QueryInferenceJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class QueryInferenceJobResponseBodyJob extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Result")
        public String result;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("UserId")
        public Long userId;

        @NameInMap("Message")
        public String message;

        @NameInMap("JobTime")
        public Long jobTime;

        @NameInMap("JobParams")
        public String jobParams;

        public static QueryInferenceJobResponseBodyJob build(java.util.Map<String, ?> map) throws Exception {
            QueryInferenceJobResponseBodyJob self = new QueryInferenceJobResponseBodyJob();
            return TeaModel.build(map, self);
        }

        public QueryInferenceJobResponseBodyJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryInferenceJobResponseBodyJob setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public QueryInferenceJobResponseBodyJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public QueryInferenceJobResponseBodyJob setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public QueryInferenceJobResponseBodyJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryInferenceJobResponseBodyJob setJobTime(Long jobTime) {
            this.jobTime = jobTime;
            return this;
        }
        public Long getJobTime() {
            return this.jobTime;
        }

        public QueryInferenceJobResponseBodyJob setJobParams(String jobParams) {
            this.jobParams = jobParams;
            return this;
        }
        public String getJobParams() {
            return this.jobParams;
        }

    }

}
