// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryVideoQualityJobResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Job")
    public QueryVideoQualityJobResponseBodyJob job;

    @NameInMap("Code")
    public String code;

    public static QueryVideoQualityJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryVideoQualityJobResponseBody self = new QueryVideoQualityJobResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryVideoQualityJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryVideoQualityJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryVideoQualityJobResponseBody setJob(QueryVideoQualityJobResponseBodyJob job) {
        this.job = job;
        return this;
    }
    public QueryVideoQualityJobResponseBodyJob getJob() {
        return this.job;
    }

    public QueryVideoQualityJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class QueryVideoQualityJobResponseBodyJob extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("UserId")
        public Long userId;

        @NameInMap("VideoQualityResults")
        public String videoQualityResults;

        @NameInMap("Message")
        public String message;

        @NameInMap("Output")
        public String output;

        public static QueryVideoQualityJobResponseBodyJob build(java.util.Map<String, ?> map) throws Exception {
            QueryVideoQualityJobResponseBodyJob self = new QueryVideoQualityJobResponseBodyJob();
            return TeaModel.build(map, self);
        }

        public QueryVideoQualityJobResponseBodyJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryVideoQualityJobResponseBodyJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public QueryVideoQualityJobResponseBodyJob setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public QueryVideoQualityJobResponseBodyJob setVideoQualityResults(String videoQualityResults) {
            this.videoQualityResults = videoQualityResults;
            return this;
        }
        public String getVideoQualityResults() {
            return this.videoQualityResults;
        }

        public QueryVideoQualityJobResponseBodyJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryVideoQualityJobResponseBodyJob setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

    }

}
