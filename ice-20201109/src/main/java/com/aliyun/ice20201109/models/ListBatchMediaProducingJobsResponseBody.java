// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListBatchMediaProducingJobsResponseBody extends TeaModel {
    @NameInMap("EditingBatchJobList")
    public java.util.List<ListBatchMediaProducingJobsResponseBodyEditingBatchJobList> editingBatchJobList;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListBatchMediaProducingJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBatchMediaProducingJobsResponseBody self = new ListBatchMediaProducingJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBatchMediaProducingJobsResponseBody setEditingBatchJobList(java.util.List<ListBatchMediaProducingJobsResponseBodyEditingBatchJobList> editingBatchJobList) {
        this.editingBatchJobList = editingBatchJobList;
        return this;
    }
    public java.util.List<ListBatchMediaProducingJobsResponseBodyEditingBatchJobList> getEditingBatchJobList() {
        return this.editingBatchJobList;
    }

    public ListBatchMediaProducingJobsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListBatchMediaProducingJobsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListBatchMediaProducingJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListBatchMediaProducingJobsResponseBodyEditingBatchJobList extends TeaModel {
        @NameInMap("CompleteTime")
        public String completeTime;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("EditingConfig")
        public String editingConfig;

        @NameInMap("Extend")
        public String extend;

        @NameInMap("InputConfig")
        public String inputConfig;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("JobType")
        public String jobType;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("OutputConfig")
        public String outputConfig;

        @NameInMap("Status")
        public String status;

        @NameInMap("UserData")
        public String userData;

        public static ListBatchMediaProducingJobsResponseBodyEditingBatchJobList build(java.util.Map<String, ?> map) throws Exception {
            ListBatchMediaProducingJobsResponseBodyEditingBatchJobList self = new ListBatchMediaProducingJobsResponseBodyEditingBatchJobList();
            return TeaModel.build(map, self);
        }

        public ListBatchMediaProducingJobsResponseBodyEditingBatchJobList setCompleteTime(String completeTime) {
            this.completeTime = completeTime;
            return this;
        }
        public String getCompleteTime() {
            return this.completeTime;
        }

        public ListBatchMediaProducingJobsResponseBodyEditingBatchJobList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListBatchMediaProducingJobsResponseBodyEditingBatchJobList setEditingConfig(String editingConfig) {
            this.editingConfig = editingConfig;
            return this;
        }
        public String getEditingConfig() {
            return this.editingConfig;
        }

        public ListBatchMediaProducingJobsResponseBodyEditingBatchJobList setExtend(String extend) {
            this.extend = extend;
            return this;
        }
        public String getExtend() {
            return this.extend;
        }

        public ListBatchMediaProducingJobsResponseBodyEditingBatchJobList setInputConfig(String inputConfig) {
            this.inputConfig = inputConfig;
            return this;
        }
        public String getInputConfig() {
            return this.inputConfig;
        }

        public ListBatchMediaProducingJobsResponseBodyEditingBatchJobList setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListBatchMediaProducingJobsResponseBodyEditingBatchJobList setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public ListBatchMediaProducingJobsResponseBodyEditingBatchJobList setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListBatchMediaProducingJobsResponseBodyEditingBatchJobList setOutputConfig(String outputConfig) {
            this.outputConfig = outputConfig;
            return this;
        }
        public String getOutputConfig() {
            return this.outputConfig;
        }

        public ListBatchMediaProducingJobsResponseBodyEditingBatchJobList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListBatchMediaProducingJobsResponseBodyEditingBatchJobList setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

}
