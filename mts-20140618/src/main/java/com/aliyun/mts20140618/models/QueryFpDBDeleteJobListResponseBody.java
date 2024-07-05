// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryFpDBDeleteJobListResponseBody extends TeaModel {
    /**
     * <p>The jobs of deleting a media fingerprint library. For more information, see the &quot;FpDBDeleteJob&quot; section of the <a href="https://www.alibabacloud.com/help/en/apsaravideo-for-media-processing/latest/datatypes">Data types</a> topic.</p>
     */
    @NameInMap("FpDBDeleteJobList")
    public QueryFpDBDeleteJobListResponseBodyFpDBDeleteJobList fpDBDeleteJobList;

    /**
     * <p>The IDs of the jobs that do not exist.</p>
     */
    @NameInMap("NonExistIds")
    public QueryFpDBDeleteJobListResponseBodyNonExistIds nonExistIds;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>4247B23C-26DE-529F-8D9F-FD6811AE979B</p>
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
         * <p>The type of the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>Purge</p>
         */
        @NameInMap("DelType")
        public String delType;

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
         * <p>The status of the job. Valid values:</p>
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
