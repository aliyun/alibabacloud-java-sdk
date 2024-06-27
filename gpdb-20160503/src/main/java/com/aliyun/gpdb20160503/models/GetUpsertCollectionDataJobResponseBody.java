// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class GetUpsertCollectionDataJobResponseBody extends TeaModel {
    /**
     * <p>The information about the vector data upload job.</p>
     */
    @NameInMap("Job")
    public GetUpsertCollectionDataJobResponseBodyJob job;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the operation. Valid values:</p>
     * <ul>
     * <li><strong>success</strong></li>
     * <li><strong>fail</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Status")
    public String status;

    public static GetUpsertCollectionDataJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUpsertCollectionDataJobResponseBody self = new GetUpsertCollectionDataJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUpsertCollectionDataJobResponseBody setJob(GetUpsertCollectionDataJobResponseBodyJob job) {
        this.job = job;
        return this;
    }
    public GetUpsertCollectionDataJobResponseBodyJob getJob() {
        return this.job;
    }

    public GetUpsertCollectionDataJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetUpsertCollectionDataJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUpsertCollectionDataJobResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class GetUpsertCollectionDataJobResponseBodyJob extends TeaModel {
        /**
         * <p>Indicates whether the operation is complete.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Completed")
        public Boolean completed;

        /**
         * <p>The time when the job was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-08 16:52:04.864664</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The error message.</p>
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
         * <p>The progress of the vector data upload job. The value of this parameter indicates the number of data entries that have been uploaded.</p>
         * 
         * <strong>example:</strong>
         * <p>1600</p>
         */
        @NameInMap("Progress")
        public Integer progress;

        /**
         * <p>The status of the job.</p>
         * <blockquote>
         * <p> Valid values:</p>
         * </blockquote>
         * <ul>
         * <li><p>Success</p>
         * </li>
         * <li><p>Failed (See the Error parameter for failure reasons.)</p>
         * </li>
         * <li><p>Cancelling</p>
         * </li>
         * <li><p>Cancelled</p>
         * </li>
         * <li><p>Start</p>
         * </li>
         * <li><p>Running</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the job was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-08 16:53:04.864664</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static GetUpsertCollectionDataJobResponseBodyJob build(java.util.Map<String, ?> map) throws Exception {
            GetUpsertCollectionDataJobResponseBodyJob self = new GetUpsertCollectionDataJobResponseBodyJob();
            return TeaModel.build(map, self);
        }

        public GetUpsertCollectionDataJobResponseBodyJob setCompleted(Boolean completed) {
            this.completed = completed;
            return this;
        }
        public Boolean getCompleted() {
            return this.completed;
        }

        public GetUpsertCollectionDataJobResponseBodyJob setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetUpsertCollectionDataJobResponseBodyJob setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

        public GetUpsertCollectionDataJobResponseBodyJob setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetUpsertCollectionDataJobResponseBodyJob setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public GetUpsertCollectionDataJobResponseBodyJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetUpsertCollectionDataJobResponseBodyJob setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
