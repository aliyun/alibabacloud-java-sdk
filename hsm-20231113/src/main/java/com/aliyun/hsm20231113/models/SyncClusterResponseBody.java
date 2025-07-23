// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113.models;

import com.aliyun.tea.*;

public class SyncClusterResponseBody extends TeaModel {
    /**
     * <p>The details of the task.</p>
     */
    @NameInMap("Job")
    public SyncClusterResponseBodyJob job;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4C467B38-3910-447D-87BC-AC049166F216</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SyncClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SyncClusterResponseBody self = new SyncClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public SyncClusterResponseBody setJob(SyncClusterResponseBodyJob job) {
        this.job = job;
        return this;
    }
    public SyncClusterResponseBodyJob getJob() {
        return this.job;
    }

    public SyncClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SyncClusterResponseBodyJob extends TeaModel {
        /**
         * <p>Indicates whether the task is complete. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Completed")
        public Boolean completed;

        /**
         * <p>The time when the task was created. Unit: milliseconds. The value is a UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1711764127000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The error message returned if the task fails.</p>
         * 
         * <strong>example:</strong>
         * <p>OperationTimeout</p>
         */
        @NameInMap("Error")
        public String error;

        /**
         * <p>The ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>job-000bu7m5vjmyz9s7qz85</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The progress of the task. Unit: percent (%).</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("Progress")
        public Integer progress;

        /**
         * <p>The response returned after the task succeeds.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Response")
        public String response;

        /**
         * <p>The status of the task. Valid values:</p>
         * <ul>
         * <li>success</li>
         * <li>running</li>
         * <li>cancel</li>
         * <li>fail</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The operation type. Valid values:</p>
         * <ul>
         * <li>create</li>
         * <li>cancel</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>create</p>
         */
        @NameInMap("Type")
        public String type;

        public static SyncClusterResponseBodyJob build(java.util.Map<String, ?> map) throws Exception {
            SyncClusterResponseBodyJob self = new SyncClusterResponseBodyJob();
            return TeaModel.build(map, self);
        }

        public SyncClusterResponseBodyJob setCompleted(Boolean completed) {
            this.completed = completed;
            return this;
        }
        public Boolean getCompleted() {
            return this.completed;
        }

        public SyncClusterResponseBodyJob setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public SyncClusterResponseBodyJob setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

        public SyncClusterResponseBodyJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public SyncClusterResponseBodyJob setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public SyncClusterResponseBodyJob setResponse(String response) {
            this.response = response;
            return this;
        }
        public String getResponse() {
            return this.response;
        }

        public SyncClusterResponseBodyJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public SyncClusterResponseBodyJob setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
