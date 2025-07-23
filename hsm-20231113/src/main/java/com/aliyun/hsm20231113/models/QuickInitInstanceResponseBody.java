// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113.models;

import com.aliyun.tea.*;

public class QuickInitInstanceResponseBody extends TeaModel {
    /**
     * <p>The details of the task.</p>
     */
    @NameInMap("Job")
    public QuickInitInstanceResponseBodyJob job;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4C467B38-3910-447D-87BC-AC049366F216</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QuickInitInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuickInitInstanceResponseBody self = new QuickInitInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public QuickInitInstanceResponseBody setJob(QuickInitInstanceResponseBodyJob job) {
        this.job = job;
        return this;
    }
    public QuickInitInstanceResponseBodyJob getJob() {
        return this.job;
    }

    public QuickInitInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QuickInitInstanceResponseBodyJob extends TeaModel {
        /**
         * <p>Indicates whether the task is complete.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Completed")
        public Boolean completed;

        /**
         * <p>The time when the task is created. The value is accurate to the millisecond. The value is a UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1699515963000</p>
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
         * <p>job-000fi9k1v2hclo321sal</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The progress of the task. Unit: percent (%).</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
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
         * <p>The task status. Valid values:</p>
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

        public static QuickInitInstanceResponseBodyJob build(java.util.Map<String, ?> map) throws Exception {
            QuickInitInstanceResponseBodyJob self = new QuickInitInstanceResponseBodyJob();
            return TeaModel.build(map, self);
        }

        public QuickInitInstanceResponseBodyJob setCompleted(Boolean completed) {
            this.completed = completed;
            return this;
        }
        public Boolean getCompleted() {
            return this.completed;
        }

        public QuickInitInstanceResponseBodyJob setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QuickInitInstanceResponseBodyJob setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

        public QuickInitInstanceResponseBodyJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public QuickInitInstanceResponseBodyJob setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public QuickInitInstanceResponseBodyJob setResponse(String response) {
            this.response = response;
            return this;
        }
        public String getResponse() {
            return this.response;
        }

        public QuickInitInstanceResponseBodyJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QuickInitInstanceResponseBodyJob setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
