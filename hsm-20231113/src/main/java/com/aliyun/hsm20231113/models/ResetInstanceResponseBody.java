// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113.models;

import com.aliyun.tea.*;

public class ResetInstanceResponseBody extends TeaModel {
    /**
     * <p>The details of the task.</p>
     */
    @NameInMap("Job")
    public ResetInstanceResponseBodyJob job;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4C467B38-3910-447D-87BC-AC049166F216</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ResetInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetInstanceResponseBody self = new ResetInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetInstanceResponseBody setJob(ResetInstanceResponseBodyJob job) {
        this.job = job;
        return this;
    }
    public ResetInstanceResponseBodyJob getJob() {
        return this.job;
    }

    public ResetInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ResetInstanceResponseBodyJob extends TeaModel {
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
         * <p>1653274407000</p>
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
         * <p>job-0007bl8oev0u3jqyfu6a</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The progress of the task. Unit: percent (%).</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
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

        public static ResetInstanceResponseBodyJob build(java.util.Map<String, ?> map) throws Exception {
            ResetInstanceResponseBodyJob self = new ResetInstanceResponseBodyJob();
            return TeaModel.build(map, self);
        }

        public ResetInstanceResponseBodyJob setCompleted(Boolean completed) {
            this.completed = completed;
            return this;
        }
        public Boolean getCompleted() {
            return this.completed;
        }

        public ResetInstanceResponseBodyJob setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ResetInstanceResponseBodyJob setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

        public ResetInstanceResponseBodyJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ResetInstanceResponseBodyJob setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public ResetInstanceResponseBodyJob setResponse(String response) {
            this.response = response;
            return this;
        }
        public String getResponse() {
            return this.response;
        }

        public ResetInstanceResponseBodyJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ResetInstanceResponseBodyJob setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
