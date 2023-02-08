// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryFpFileDeleteJobListResponseBody extends TeaModel {
    /**
     * <p>The jobs of deleting media files from a media fingerprint library. For more information, see the "FpFileDeleteJob" section of the [Data types](https://icms.alibaba-inc.com/content/mps/cc2a58?l=1\&m=16051\&n=23657) topic.</p>
     */
    @NameInMap("FpFileDeleteJobList")
    public QueryFpFileDeleteJobListResponseBodyFpFileDeleteJobList fpFileDeleteJobList;

    /**
     * <p>The IDs of the jobs that do not exist.</p>
     */
    @NameInMap("NonExistIds")
    public QueryFpFileDeleteJobListResponseBodyNonExistIds nonExistIds;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryFpFileDeleteJobListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryFpFileDeleteJobListResponseBody self = new QueryFpFileDeleteJobListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryFpFileDeleteJobListResponseBody setFpFileDeleteJobList(QueryFpFileDeleteJobListResponseBodyFpFileDeleteJobList fpFileDeleteJobList) {
        this.fpFileDeleteJobList = fpFileDeleteJobList;
        return this;
    }
    public QueryFpFileDeleteJobListResponseBodyFpFileDeleteJobList getFpFileDeleteJobList() {
        return this.fpFileDeleteJobList;
    }

    public QueryFpFileDeleteJobListResponseBody setNonExistIds(QueryFpFileDeleteJobListResponseBodyNonExistIds nonExistIds) {
        this.nonExistIds = nonExistIds;
        return this;
    }
    public QueryFpFileDeleteJobListResponseBodyNonExistIds getNonExistIds() {
        return this.nonExistIds;
    }

    public QueryFpFileDeleteJobListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryFpFileDeleteJobListResponseBodyFpFileDeleteJobListFpFileDeleteJob extends TeaModel {
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
         * <p>The IDs of the files.</p>
         */
        @NameInMap("FileIds")
        public String fileIds;

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

        public static QueryFpFileDeleteJobListResponseBodyFpFileDeleteJobListFpFileDeleteJob build(java.util.Map<String, ?> map) throws Exception {
            QueryFpFileDeleteJobListResponseBodyFpFileDeleteJobListFpFileDeleteJob self = new QueryFpFileDeleteJobListResponseBodyFpFileDeleteJobListFpFileDeleteJob();
            return TeaModel.build(map, self);
        }

        public QueryFpFileDeleteJobListResponseBodyFpFileDeleteJobListFpFileDeleteJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryFpFileDeleteJobListResponseBodyFpFileDeleteJobListFpFileDeleteJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public QueryFpFileDeleteJobListResponseBodyFpFileDeleteJobListFpFileDeleteJob setFileIds(String fileIds) {
            this.fileIds = fileIds;
            return this;
        }
        public String getFileIds() {
            return this.fileIds;
        }

        public QueryFpFileDeleteJobListResponseBodyFpFileDeleteJobListFpFileDeleteJob setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public QueryFpFileDeleteJobListResponseBodyFpFileDeleteJobListFpFileDeleteJob setFpDBId(String fpDBId) {
            this.fpDBId = fpDBId;
            return this;
        }
        public String getFpDBId() {
            return this.fpDBId;
        }

        public QueryFpFileDeleteJobListResponseBodyFpFileDeleteJobListFpFileDeleteJob setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryFpFileDeleteJobListResponseBodyFpFileDeleteJobListFpFileDeleteJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryFpFileDeleteJobListResponseBodyFpFileDeleteJobListFpFileDeleteJob setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public QueryFpFileDeleteJobListResponseBodyFpFileDeleteJobListFpFileDeleteJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryFpFileDeleteJobListResponseBodyFpFileDeleteJobListFpFileDeleteJob setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

    public static class QueryFpFileDeleteJobListResponseBodyFpFileDeleteJobList extends TeaModel {
        @NameInMap("FpFileDeleteJob")
        public java.util.List<QueryFpFileDeleteJobListResponseBodyFpFileDeleteJobListFpFileDeleteJob> fpFileDeleteJob;

        public static QueryFpFileDeleteJobListResponseBodyFpFileDeleteJobList build(java.util.Map<String, ?> map) throws Exception {
            QueryFpFileDeleteJobListResponseBodyFpFileDeleteJobList self = new QueryFpFileDeleteJobListResponseBodyFpFileDeleteJobList();
            return TeaModel.build(map, self);
        }

        public QueryFpFileDeleteJobListResponseBodyFpFileDeleteJobList setFpFileDeleteJob(java.util.List<QueryFpFileDeleteJobListResponseBodyFpFileDeleteJobListFpFileDeleteJob> fpFileDeleteJob) {
            this.fpFileDeleteJob = fpFileDeleteJob;
            return this;
        }
        public java.util.List<QueryFpFileDeleteJobListResponseBodyFpFileDeleteJobListFpFileDeleteJob> getFpFileDeleteJob() {
            return this.fpFileDeleteJob;
        }

    }

    public static class QueryFpFileDeleteJobListResponseBodyNonExistIds extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static QueryFpFileDeleteJobListResponseBodyNonExistIds build(java.util.Map<String, ?> map) throws Exception {
            QueryFpFileDeleteJobListResponseBodyNonExistIds self = new QueryFpFileDeleteJobListResponseBodyNonExistIds();
            return TeaModel.build(map, self);
        }

        public QueryFpFileDeleteJobListResponseBodyNonExistIds setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

}
