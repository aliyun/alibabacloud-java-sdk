// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryFpDBDeleteJobListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("FpDBDeleteJobList")
    public QueryFpDBDeleteJobListResponseBodyFpDBDeleteJobList fpDBDeleteJobList;

    @NameInMap("NonExistIds")
    public QueryFpDBDeleteJobListResponseBodyNonExistIds nonExistIds;

    public static QueryFpDBDeleteJobListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryFpDBDeleteJobListResponseBody self = new QueryFpDBDeleteJobListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryFpDBDeleteJobListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

    public static class QueryFpDBDeleteJobListResponseBodyFpDBDeleteJobListFpDBDeleteJob extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("DelType")
        public String delType;

        @NameInMap("UserData")
        public String userData;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("PipelineId")
        public String pipelineId;

        @NameInMap("FpDBId")
        public String fpDBId;

        @NameInMap("Id")
        public String id;

        public static QueryFpDBDeleteJobListResponseBodyFpDBDeleteJobListFpDBDeleteJob build(java.util.Map<String, ?> map) throws Exception {
            QueryFpDBDeleteJobListResponseBodyFpDBDeleteJobListFpDBDeleteJob self = new QueryFpDBDeleteJobListResponseBodyFpDBDeleteJobListFpDBDeleteJob();
            return TeaModel.build(map, self);
        }

        public QueryFpDBDeleteJobListResponseBodyFpDBDeleteJobListFpDBDeleteJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public QueryFpDBDeleteJobListResponseBodyFpDBDeleteJobListFpDBDeleteJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryFpDBDeleteJobListResponseBodyFpDBDeleteJobListFpDBDeleteJob setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public QueryFpDBDeleteJobListResponseBodyFpDBDeleteJobListFpDBDeleteJob setDelType(String delType) {
            this.delType = delType;
            return this;
        }
        public String getDelType() {
            return this.delType;
        }

        public QueryFpDBDeleteJobListResponseBodyFpDBDeleteJobListFpDBDeleteJob setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public QueryFpDBDeleteJobListResponseBodyFpDBDeleteJobListFpDBDeleteJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
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
