// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class GetUpsertCollectionDataJobResponseBody extends TeaModel {
    @NameInMap("Job")
    public GetUpsertCollectionDataJobResponseBodyJob job;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Completed")
        public Boolean completed;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Error")
        public String error;

        /**
         * <p>Job ID。</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("Progress")
        public Integer progress;

        @NameInMap("Status")
        public String status;

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
