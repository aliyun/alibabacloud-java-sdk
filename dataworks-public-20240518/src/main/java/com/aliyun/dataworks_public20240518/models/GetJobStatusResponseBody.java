// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetJobStatusResponseBody extends TeaModel {
    /**
     * <p>The real-time result of the task status.</p>
     */
    @NameInMap("JobStatus")
    public GetJobStatusResponseBodyJobStatus jobStatus;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5E2BFE96-C0E0-5A98-85C8-633EC803198D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetJobStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJobStatusResponseBody self = new GetJobStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJobStatusResponseBody setJobStatus(GetJobStatusResponseBodyJobStatus jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }
    public GetJobStatusResponseBodyJobStatus getJobStatus() {
        return this.jobStatus;
    }

    public GetJobStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetJobStatusResponseBodyJobStatus extends TeaModel {
        /**
         * <p>Indicates whether the operation is complete. Valid values:</p>
         * <ul>
         * <li>True: The current job has been completed.</li>
         * <li>False: The current job is still running.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("Completed")
        public String completed;

        /**
         * <p>The creation time.</p>
         * <p>The value is a 13-digit number, such as <code>1729063449802</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1729063449802</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The task failure information.</p>
         * 
         * <strong>example:</strong>
         * <p>Not Found</p>
         */
        @NameInMap("Error")
        public String error;

        /**
         * <p>The asynchronous task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C664CDE3-9C0B-5792-B17F-6C543783BBBC</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The task type.</p>
         * <ul>
         * <li><p><strong>Create</strong>: A creation task.</p>
         * </li>
         * <li><p><strong>Update</strong>: An update task.</p>
         * </li>
         * <li><p><strong>Cancel</strong>: A cancellation task.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Create</p>
         */
        @NameInMap("JobType")
        public String jobType;

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li><strong>Success</strong>: succeeded.</li>
         * <li><strong>Fail</strong>: failed.</li>
         * <li><strong>Cancel</strong>: canceled.</li>
         * <li><strong>Running</strong>: running.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetJobStatusResponseBodyJobStatus build(java.util.Map<String, ?> map) throws Exception {
            GetJobStatusResponseBodyJobStatus self = new GetJobStatusResponseBodyJobStatus();
            return TeaModel.build(map, self);
        }

        public GetJobStatusResponseBodyJobStatus setCompleted(String completed) {
            this.completed = completed;
            return this;
        }
        public String getCompleted() {
            return this.completed;
        }

        public GetJobStatusResponseBodyJobStatus setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetJobStatusResponseBodyJobStatus setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

        public GetJobStatusResponseBodyJobStatus setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetJobStatusResponseBodyJobStatus setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public GetJobStatusResponseBodyJobStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
