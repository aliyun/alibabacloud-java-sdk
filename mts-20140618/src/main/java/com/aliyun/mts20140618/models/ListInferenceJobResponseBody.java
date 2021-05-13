// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ListInferenceJobResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Jobs")
    public java.util.List<ListInferenceJobResponseBodyJobs> jobs;

    @NameInMap("Code")
    public String code;

    public static ListInferenceJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInferenceJobResponseBody self = new ListInferenceJobResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInferenceJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListInferenceJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInferenceJobResponseBody setJobs(java.util.List<ListInferenceJobResponseBodyJobs> jobs) {
        this.jobs = jobs;
        return this;
    }
    public java.util.List<ListInferenceJobResponseBodyJobs> getJobs() {
        return this.jobs;
    }

    public ListInferenceJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class ListInferenceJobResponseBodyJobs extends TeaModel {
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

        public static ListInferenceJobResponseBodyJobs build(java.util.Map<String, ?> map) throws Exception {
            ListInferenceJobResponseBodyJobs self = new ListInferenceJobResponseBodyJobs();
            return TeaModel.build(map, self);
        }

        public ListInferenceJobResponseBodyJobs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListInferenceJobResponseBodyJobs setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public ListInferenceJobResponseBodyJobs setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListInferenceJobResponseBodyJobs setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public ListInferenceJobResponseBodyJobs setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListInferenceJobResponseBodyJobs setJobTime(Long jobTime) {
            this.jobTime = jobTime;
            return this;
        }
        public Long getJobTime() {
            return this.jobTime;
        }

    }

}
