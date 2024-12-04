// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetJobStatusResponseBody extends TeaModel {
    /**
     * <p>The real-time status information of the asynchronous task.</p>
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
         * <p>Indicates whether the asynchronous task is complete. Valid values: True False</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("Completed")
        public String completed;

        /**
         * <p>The time when the asynchronous task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1729063449802</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The error message returned if the asynchronous task fails.</p>
         * 
         * <strong>example:</strong>
         * <p>Not Found</p>
         */
        @NameInMap("Error")
        public String error;

        /**
         * <p>The ID of the asynchronous task.</p>
         * 
         * <strong>example:</strong>
         * <p>C664CDE3-9C0B-5792-B17F-6C543783BBBC</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The type of the asynchronous task. Valid values:</p>
         * <ul>
         * <li><strong>Create</strong>: The asynchronous task is used to create an object.</li>
         * <li><strong>Update</strong>: The asynchronous task is used to update an object.</li>
         * <li><strong>Cancel</strong>: The asynchronous task is used to cancel an operation.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Create</p>
         */
        @NameInMap("JobType")
        public String jobType;

        /**
         * <p>The status of the asynchronous task. Valid values:</p>
         * <ul>
         * <li><strong>Success</strong></li>
         * <li><strong>Fail</strong></li>
         * <li><strong>Cancel</strong></li>
         * <li><strong>Running</strong></li>
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
