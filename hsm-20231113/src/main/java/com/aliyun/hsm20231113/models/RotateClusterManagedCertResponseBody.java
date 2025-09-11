// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113.models;

import com.aliyun.tea.*;

public class RotateClusterManagedCertResponseBody extends TeaModel {
    @NameInMap("Job")
    public RotateClusterManagedCertResponseBodyJob job;

    /**
     * <strong>example:</strong>
     * <p>4C467B38-3910-447D-87BC-AC049166F216</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RotateClusterManagedCertResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RotateClusterManagedCertResponseBody self = new RotateClusterManagedCertResponseBody();
        return TeaModel.build(map, self);
    }

    public RotateClusterManagedCertResponseBody setJob(RotateClusterManagedCertResponseBodyJob job) {
        this.job = job;
        return this;
    }
    public RotateClusterManagedCertResponseBodyJob getJob() {
        return this.job;
    }

    public RotateClusterManagedCertResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RotateClusterManagedCertResponseBodyJob extends TeaModel {
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
         * <p>100</p>
         */
        @NameInMap("Process")
        public Integer process;

        /**
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Response")
        public String response;

        /**
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>create</p>
         */
        @NameInMap("Type")
        public String type;

        public static RotateClusterManagedCertResponseBodyJob build(java.util.Map<String, ?> map) throws Exception {
            RotateClusterManagedCertResponseBodyJob self = new RotateClusterManagedCertResponseBodyJob();
            return TeaModel.build(map, self);
        }

        public RotateClusterManagedCertResponseBodyJob setCompleted(Boolean completed) {
            this.completed = completed;
            return this;
        }
        public Boolean getCompleted() {
            return this.completed;
        }

        public RotateClusterManagedCertResponseBodyJob setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public RotateClusterManagedCertResponseBodyJob setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

        public RotateClusterManagedCertResponseBodyJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public RotateClusterManagedCertResponseBodyJob setProcess(Integer process) {
            this.process = process;
            return this;
        }
        public Integer getProcess() {
            return this.process;
        }

        public RotateClusterManagedCertResponseBodyJob setResponse(String response) {
            this.response = response;
            return this;
        }
        public String getResponse() {
            return this.response;
        }

        public RotateClusterManagedCertResponseBodyJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public RotateClusterManagedCertResponseBodyJob setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
