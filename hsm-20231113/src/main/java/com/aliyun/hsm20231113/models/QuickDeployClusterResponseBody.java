// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113.models;

import com.aliyun.tea.*;

public class QuickDeployClusterResponseBody extends TeaModel {
    @NameInMap("Job")
    public QuickDeployClusterResponseBodyJob job;

    /**
     * <strong>example:</strong>
     * <p>4C467B38-3910-447D-87BC-AC049166F216</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QuickDeployClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuickDeployClusterResponseBody self = new QuickDeployClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public QuickDeployClusterResponseBody setJob(QuickDeployClusterResponseBodyJob job) {
        this.job = job;
        return this;
    }
    public QuickDeployClusterResponseBodyJob getJob() {
        return this.job;
    }

    public QuickDeployClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QuickDeployClusterResponseBodyJob extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Completed")
        public Boolean completed;

        /**
         * <strong>example:</strong>
         * <p>1653274407000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>OperationTimeout</p>
         */
        @NameInMap("Error")
        public String error;

        /**
         * <strong>example:</strong>
         * <p>job-202401250936hze747fd7e0007005</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <strong>example:</strong>
         * <p>86</p>
         */
        @NameInMap("Progress")
        public Integer progress;

        /**
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Response")
        public String response;

        /**
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>create</p>
         */
        @NameInMap("Type")
        public String type;

        public static QuickDeployClusterResponseBodyJob build(java.util.Map<String, ?> map) throws Exception {
            QuickDeployClusterResponseBodyJob self = new QuickDeployClusterResponseBodyJob();
            return TeaModel.build(map, self);
        }

        public QuickDeployClusterResponseBodyJob setCompleted(Boolean completed) {
            this.completed = completed;
            return this;
        }
        public Boolean getCompleted() {
            return this.completed;
        }

        public QuickDeployClusterResponseBodyJob setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QuickDeployClusterResponseBodyJob setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

        public QuickDeployClusterResponseBodyJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public QuickDeployClusterResponseBodyJob setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public QuickDeployClusterResponseBodyJob setResponse(String response) {
            this.response = response;
            return this;
        }
        public String getResponse() {
            return this.response;
        }

        public QuickDeployClusterResponseBodyJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QuickDeployClusterResponseBodyJob setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
