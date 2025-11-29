// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeCreateIndexJobResponseBody extends TeaModel {
    /**
     * <p>The details of the index creation job.</p>
     */
    @NameInMap("Job")
    public DescribeCreateIndexJobResponseBodyJob job;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the operation. Valid values:</p>
     * <ul>
     * <li><strong>success</strong>.</li>
     * <li><strong>fail</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeCreateIndexJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCreateIndexJobResponseBody self = new DescribeCreateIndexJobResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCreateIndexJobResponseBody setJob(DescribeCreateIndexJobResponseBodyJob job) {
        this.job = job;
        return this;
    }
    public DescribeCreateIndexJobResponseBodyJob getJob() {
        return this.job;
    }

    public DescribeCreateIndexJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeCreateIndexJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCreateIndexJobResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class DescribeCreateIndexJobResponseBodyJob extends TeaModel {
        /**
         * <p>Indicates whether the operation is complete.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Completed")
        public Boolean completed;

        /**
         * <p>The job creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-08 16:52:04.864664</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The error message that is returned when the current operation is abnormal or fails.</p>
         * 
         * <strong>example:</strong>
         * <p>Failed to connect database.</p>
         */
        @NameInMap("Error")
        public String error;

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>231460f8-75dc-405e-a669-0c5204887e91</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The progress of the index creation job. Unit: %. A value of 100 indicates that the job is complete.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li>Only AnalyticDB for PostgreSQL V7.0 supports the Progress parameter.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Progress")
        public Integer progress;

        /**
         * <p>The status of the job. Valid values:</p>
         * <ul>
         * <li><strong>Success.</strong></li>
         * <li><strong>Failed</strong> (See the Error parameter for failure reasons).</li>
         * <li><strong>Cancelled.</strong></li>
         * <li>**Running.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The job last updated time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-08 16:53:04.864664</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static DescribeCreateIndexJobResponseBodyJob build(java.util.Map<String, ?> map) throws Exception {
            DescribeCreateIndexJobResponseBodyJob self = new DescribeCreateIndexJobResponseBodyJob();
            return TeaModel.build(map, self);
        }

        public DescribeCreateIndexJobResponseBodyJob setCompleted(Boolean completed) {
            this.completed = completed;
            return this;
        }
        public Boolean getCompleted() {
            return this.completed;
        }

        public DescribeCreateIndexJobResponseBodyJob setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeCreateIndexJobResponseBodyJob setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

        public DescribeCreateIndexJobResponseBodyJob setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeCreateIndexJobResponseBodyJob setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public DescribeCreateIndexJobResponseBodyJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeCreateIndexJobResponseBodyJob setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
