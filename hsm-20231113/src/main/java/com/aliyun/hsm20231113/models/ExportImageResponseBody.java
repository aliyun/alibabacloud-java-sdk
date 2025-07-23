// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113.models;

import com.aliyun.tea.*;

public class ExportImageResponseBody extends TeaModel {
    /**
     * <p>The information about the asynchronous task returned.</p>
     */
    @NameInMap("Job")
    public ExportImageResponseBodyJob job;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4C467B38-3910-447D-87BC-AC049166F216</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ExportImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportImageResponseBody self = new ExportImageResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportImageResponseBody setJob(ExportImageResponseBodyJob job) {
        this.job = job;
        return this;
    }
    public ExportImageResponseBodyJob getJob() {
        return this.job;
    }

    public ExportImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ExportImageResponseBodyJob extends TeaModel {
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
         * <p>The error message returned if the operation is abnormal or fails.</p>
         * 
         * <strong>example:</strong>
         * <p>Job.Canceled</p>
         */
        @NameInMap("Error")
        public String error;

        /**
         * <p>The ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>b1748ca6-6b55-49f4-a6d4-2d694a9f3693</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The progress of the task. Unit: percent (%).</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Process")
        public Integer process;

        /**
         * <p>The response returned after the operation succeeds.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Response")
        public String response;

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li>running</li>
         * <li>cancel</li>
         * <li>fail</li>
         * <li>success</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type of the task operation. Valid values:</p>
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

        public static ExportImageResponseBodyJob build(java.util.Map<String, ?> map) throws Exception {
            ExportImageResponseBodyJob self = new ExportImageResponseBodyJob();
            return TeaModel.build(map, self);
        }

        public ExportImageResponseBodyJob setCompleted(Boolean completed) {
            this.completed = completed;
            return this;
        }
        public Boolean getCompleted() {
            return this.completed;
        }

        public ExportImageResponseBodyJob setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

        public ExportImageResponseBodyJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ExportImageResponseBodyJob setProcess(Integer process) {
            this.process = process;
            return this;
        }
        public Integer getProcess() {
            return this.process;
        }

        public ExportImageResponseBodyJob setResponse(String response) {
            this.response = response;
            return this;
        }
        public String getResponse() {
            return this.response;
        }

        public ExportImageResponseBodyJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ExportImageResponseBodyJob setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
