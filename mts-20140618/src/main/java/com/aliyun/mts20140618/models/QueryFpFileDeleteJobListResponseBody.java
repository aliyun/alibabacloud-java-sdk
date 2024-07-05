// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryFpFileDeleteJobListResponseBody extends TeaModel {
    /**
     * <p>The jobs of deleting media files from a media fingerprint library. For more information, see the &quot;FpFileDeleteJob&quot; section of the <a href="https://help.aliyun.com/document_detail/93555.html">Data types</a> topic.</p>
     */
    @NameInMap("FpFileDeleteJobList")
    public QueryFpFileDeleteJobListResponseBodyFpFileDeleteJobList fpFileDeleteJobList;

    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("NonExistIds")
    public QueryFpFileDeleteJobListResponseBodyNonExistIds nonExistIds;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D127C68E-F1A1-4CE5-A874-8FF724881A12</p>
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
         * <p>The error code returned if the job fails. This parameter is not returned if the job is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>ServiceUnavailable</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The time when the job was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-06-30T00:33:18Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The ID of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>41e6536e4f2250e2e9bf26cdea19****</p>
         */
        @NameInMap("FileIds")
        public String fileIds;

        /**
         * <p>The time when the job was complete.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-06-30T00:34:02Z</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The ID of the media fingerprint library.</p>
         * 
         * <strong>example:</strong>
         * <p>88c6ca184c0e47098a5b665e2a12****</p>
         */
        @NameInMap("FpDBId")
        public String fpDBId;

        /**
         * <p>The ID of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>25bacf2824614bcf9273dc0744db****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The error message returned if the job fails. This parameter is not returned if the job is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>The request has failed due to a temporary failure of the server.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The ID of the ApsaraVideo Media Processing (MPS) queue to which the job was submitted.</p>
         * 
         * <strong>example:</strong>
         * <p>fb712a6890464059b1b2ea7c8647****</p>
         */
        @NameInMap("PipelineId")
        public String pipelineId;

        /**
         * <p>The status of the job. Valid values: Valid values:</p>
         * <ul>
         * <li><strong>Queuing</strong>: The job is waiting in the queue.</li>
         * <li><strong>Analysing</strong>: The job is in progress.</li>
         * <li><strong>Success</strong>: The job is successful.</li>
         * <li><strong>Fail</strong>: The job fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The user-defined data.</p>
         * 
         * <strong>example:</strong>
         * <p>example data</p>
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
