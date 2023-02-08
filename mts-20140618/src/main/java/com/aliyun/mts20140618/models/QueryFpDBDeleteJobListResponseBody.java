// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryFpDBDeleteJobListResponseBody extends TeaModel {
    /**
     * <p>The jobs of deleting a media fingerprint library. For more information, see the "FpDBDeleteJob" section of the [Data types](https://icms.alibaba-inc.com/content/mps/cc2a58?l=1\&m=16051\&n=23657) topic.</p>
     */
    @NameInMap("FpDBDeleteJobList")
    public QueryFpDBDeleteJobListResponseBodyFpDBDeleteJobList fpDBDeleteJobList;

    /**
     * <p>The IDs of the jobs that do not exist. This parameter is not returned if all specified jobs are found.</p>
     */
    @NameInMap("NonExistIds")
    public QueryFpDBDeleteJobListResponseBodyNonExistIds nonExistIds;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryFpDBDeleteJobListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryFpDBDeleteJobListResponseBody self = new QueryFpDBDeleteJobListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryFpDBDeleteJobListResponseBody setFpDBDeleteJobList(QueryFpDBDeleteJobListResponseBodyFpDBDeleteJobList fpDBDeleteJobList) {
        this.fpDBDeleteJobList = fpDBDeleteJobList;
        return this;
    }
    public QueryFpDBDeleteJobListResponseBodyFpDBDeleteJobList getFpDBDeleteJobList() {
        return this.fpDBDeleteJobList;
    }

    public QueryFpDBDeleteJobListResponseBody setNonExistIds(QueryFpDBDeleteJobListResponseBodyNonExistIds nonExistIds) {
        this.nonExistIds = nonExistIds;
        return this;
    }
    public QueryFpDBDeleteJobListResponseBodyNonExistIds getNonExistIds() {
        return this.nonExistIds;
    }

    public QueryFpDBDeleteJobListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryFpDBDeleteJobListResponseBodyFpDBDeleteJobListFpDBDeleteJob extends TeaModel {
        /**
         * <p>The error code returned when the job fails. This parameter is not returned if the job is successful.</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The point in time when the job was created.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The operation type.</p>
         */
        @NameInMap("DelType")
        public String delType;

        /**
         * <p>The point in time when the job was complete.</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The ID of the media fingerprint library.</p>
         */
        @NameInMap("FpDBId")
        public String fpDBId;

        /**
         * <p>The ID of the job.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The error message returned when the job fails. This parameter is not returned if the job is successful.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The ID of the ApsaraVideo Media Processing (MPS) queue.</p>
         */
        @NameInMap("PipelineId")
        public String pipelineId;

        /**
         * <p>The status of the job. Valid values:</p>
         * <br>
         * <p>*   **Queuing**: The job is waiting in the queue.</p>
         * <p>*   **Analysing**: The job is in progress.</p>
         * <p>*   **Success**: The job is successful.</p>
         * <p>*   **Fail**: The job fails.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The custom data.</p>
         */
        @NameInMap("UserData")
        public String userData;

        public static QueryFpDBDeleteJobListResponseBodyFpDBDeleteJobListFpDBDeleteJob build(java.util.Map<String, ?> map) throws Exception {
            QueryFpDBDeleteJobListResponseBodyFpDBDeleteJobListFpDBDeleteJob self = new QueryFpDBDeleteJobListResponseBodyFpDBDeleteJobListFpDBDeleteJob();
            return TeaModel.build(map, self);
        }

        public QueryFpDBDeleteJobListResponseBodyFpDBDeleteJobListFpDBDeleteJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryFpDBDeleteJobListResponseBodyFpDBDeleteJobListFpDBDeleteJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public QueryFpDBDeleteJobListResponseBodyFpDBDeleteJobListFpDBDeleteJob setDelType(String delType) {
            this.delType = delType;
            return this;
        }
        public String getDelType() {
            return this.delType;
        }

        public QueryFpDBDeleteJobListResponseBodyFpDBDeleteJobListFpDBDeleteJob setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public QueryFpDBDeleteJobListResponseBodyFpDBDeleteJobListFpDBDeleteJob setFpDBId(String fpDBId) {
            this.fpDBId = fpDBId;
            return this;
        }
        public String getFpDBId() {
            return this.fpDBId;
        }

        public QueryFpDBDeleteJobListResponseBodyFpDBDeleteJobListFpDBDeleteJob setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryFpDBDeleteJobListResponseBodyFpDBDeleteJobListFpDBDeleteJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryFpDBDeleteJobListResponseBodyFpDBDeleteJobListFpDBDeleteJob setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public QueryFpDBDeleteJobListResponseBodyFpDBDeleteJobListFpDBDeleteJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryFpDBDeleteJobListResponseBodyFpDBDeleteJobListFpDBDeleteJob setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

    public static class QueryFpDBDeleteJobListResponseBodyFpDBDeleteJobList extends TeaModel {
        @NameInMap("FpDBDeleteJob")
        public java.util.List<QueryFpDBDeleteJobListResponseBodyFpDBDeleteJobListFpDBDeleteJob> fpDBDeleteJob;

        public static QueryFpDBDeleteJobListResponseBodyFpDBDeleteJobList build(java.util.Map<String, ?> map) throws Exception {
            QueryFpDBDeleteJobListResponseBodyFpDBDeleteJobList self = new QueryFpDBDeleteJobListResponseBodyFpDBDeleteJobList();
            return TeaModel.build(map, self);
        }

        public QueryFpDBDeleteJobListResponseBodyFpDBDeleteJobList setFpDBDeleteJob(java.util.List<QueryFpDBDeleteJobListResponseBodyFpDBDeleteJobListFpDBDeleteJob> fpDBDeleteJob) {
            this.fpDBDeleteJob = fpDBDeleteJob;
            return this;
        }
        public java.util.List<QueryFpDBDeleteJobListResponseBodyFpDBDeleteJobListFpDBDeleteJob> getFpDBDeleteJob() {
            return this.fpDBDeleteJob;
        }

    }

    public static class QueryFpDBDeleteJobListResponseBodyNonExistIds extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static QueryFpDBDeleteJobListResponseBodyNonExistIds build(java.util.Map<String, ?> map) throws Exception {
            QueryFpDBDeleteJobListResponseBodyNonExistIds self = new QueryFpDBDeleteJobListResponseBodyNonExistIds();
            return TeaModel.build(map, self);
        }

        public QueryFpDBDeleteJobListResponseBodyNonExistIds setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

}
