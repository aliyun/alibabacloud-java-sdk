// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QuerySmarttagJobListResponseBody extends TeaModel {
    @NameInMap("NextPageToken")
    public String nextPageToken;

    @NameInMap("NonExistJobIds")
    public QuerySmarttagJobListResponseBodyNonExistJobIds nonExistJobIds;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SmarttagJobs")
    public QuerySmarttagJobListResponseBodySmarttagJobs smarttagJobs;

    public static QuerySmarttagJobListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySmarttagJobListResponseBody self = new QuerySmarttagJobListResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySmarttagJobListResponseBody setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public QuerySmarttagJobListResponseBody setNonExistJobIds(QuerySmarttagJobListResponseBodyNonExistJobIds nonExistJobIds) {
        this.nonExistJobIds = nonExistJobIds;
        return this;
    }
    public QuerySmarttagJobListResponseBodyNonExistJobIds getNonExistJobIds() {
        return this.nonExistJobIds;
    }

    public QuerySmarttagJobListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySmarttagJobListResponseBody setSmarttagJobs(QuerySmarttagJobListResponseBodySmarttagJobs smarttagJobs) {
        this.smarttagJobs = smarttagJobs;
        return this;
    }
    public QuerySmarttagJobListResponseBodySmarttagJobs getSmarttagJobs() {
        return this.smarttagJobs;
    }

    public static class QuerySmarttagJobListResponseBodyNonExistJobIds extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static QuerySmarttagJobListResponseBodyNonExistJobIds build(java.util.Map<String, ?> map) throws Exception {
            QuerySmarttagJobListResponseBodyNonExistJobIds self = new QuerySmarttagJobListResponseBodyNonExistJobIds();
            return TeaModel.build(map, self);
        }

        public QuerySmarttagJobListResponseBodyNonExistJobIds setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

    public static class QuerySmarttagJobListResponseBodySmarttagJobsSmarttagJob extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("Input")
        public String input;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("PipelineId")
        public String pipelineId;

        @NameInMap("Status")
        public String status;

        @NameInMap("TemplateId")
        public String templateId;

        public static QuerySmarttagJobListResponseBodySmarttagJobsSmarttagJob build(java.util.Map<String, ?> map) throws Exception {
            QuerySmarttagJobListResponseBodySmarttagJobsSmarttagJob self = new QuerySmarttagJobListResponseBodySmarttagJobsSmarttagJob();
            return TeaModel.build(map, self);
        }

        public QuerySmarttagJobListResponseBodySmarttagJobsSmarttagJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public QuerySmarttagJobListResponseBodySmarttagJobsSmarttagJob setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public QuerySmarttagJobListResponseBodySmarttagJobsSmarttagJob setInput(String input) {
            this.input = input;
            return this;
        }
        public String getInput() {
            return this.input;
        }

        public QuerySmarttagJobListResponseBodySmarttagJobsSmarttagJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public QuerySmarttagJobListResponseBodySmarttagJobsSmarttagJob setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public QuerySmarttagJobListResponseBodySmarttagJobsSmarttagJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QuerySmarttagJobListResponseBodySmarttagJobsSmarttagJob setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

    public static class QuerySmarttagJobListResponseBodySmarttagJobs extends TeaModel {
        @NameInMap("SmarttagJob")
        public java.util.List<QuerySmarttagJobListResponseBodySmarttagJobsSmarttagJob> smarttagJob;

        public static QuerySmarttagJobListResponseBodySmarttagJobs build(java.util.Map<String, ?> map) throws Exception {
            QuerySmarttagJobListResponseBodySmarttagJobs self = new QuerySmarttagJobListResponseBodySmarttagJobs();
            return TeaModel.build(map, self);
        }

        public QuerySmarttagJobListResponseBodySmarttagJobs setSmarttagJob(java.util.List<QuerySmarttagJobListResponseBodySmarttagJobsSmarttagJob> smarttagJob) {
            this.smarttagJob = smarttagJob;
            return this;
        }
        public java.util.List<QuerySmarttagJobListResponseBodySmarttagJobsSmarttagJob> getSmarttagJob() {
            return this.smarttagJob;
        }

    }

}
