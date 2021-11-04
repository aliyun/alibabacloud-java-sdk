// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryMediaFpDeleteJobListResponseBody extends TeaModel {
    @NameInMap("MediaFpDeleteJobList")
    public QueryMediaFpDeleteJobListResponseBodyMediaFpDeleteJobList mediaFpDeleteJobList;

    @NameInMap("NonExistIds")
    public QueryMediaFpDeleteJobListResponseBodyNonExistIds nonExistIds;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryMediaFpDeleteJobListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMediaFpDeleteJobListResponseBody self = new QueryMediaFpDeleteJobListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMediaFpDeleteJobListResponseBody setMediaFpDeleteJobList(QueryMediaFpDeleteJobListResponseBodyMediaFpDeleteJobList mediaFpDeleteJobList) {
        this.mediaFpDeleteJobList = mediaFpDeleteJobList;
        return this;
    }
    public QueryMediaFpDeleteJobListResponseBodyMediaFpDeleteJobList getMediaFpDeleteJobList() {
        return this.mediaFpDeleteJobList;
    }

    public QueryMediaFpDeleteJobListResponseBody setNonExistIds(QueryMediaFpDeleteJobListResponseBodyNonExistIds nonExistIds) {
        this.nonExistIds = nonExistIds;
        return this;
    }
    public QueryMediaFpDeleteJobListResponseBodyNonExistIds getNonExistIds() {
        return this.nonExistIds;
    }

    public QueryMediaFpDeleteJobListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryMediaFpDeleteJobListResponseBodyMediaFpDeleteJobListMediaFpDeleteJob extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("FpDBId")
        public String fpDBId;

        @NameInMap("Id")
        public String id;

        @NameInMap("Message")
        public String message;

        @NameInMap("PipelineId")
        public String pipelineId;

        @NameInMap("PrimaryKey")
        public String primaryKey;

        @NameInMap("State")
        public String state;

        @NameInMap("UserData")
        public String userData;

        public static QueryMediaFpDeleteJobListResponseBodyMediaFpDeleteJobListMediaFpDeleteJob build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaFpDeleteJobListResponseBodyMediaFpDeleteJobListMediaFpDeleteJob self = new QueryMediaFpDeleteJobListResponseBodyMediaFpDeleteJobListMediaFpDeleteJob();
            return TeaModel.build(map, self);
        }

        public QueryMediaFpDeleteJobListResponseBodyMediaFpDeleteJobListMediaFpDeleteJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryMediaFpDeleteJobListResponseBodyMediaFpDeleteJobListMediaFpDeleteJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public QueryMediaFpDeleteJobListResponseBodyMediaFpDeleteJobListMediaFpDeleteJob setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public QueryMediaFpDeleteJobListResponseBodyMediaFpDeleteJobListMediaFpDeleteJob setFpDBId(String fpDBId) {
            this.fpDBId = fpDBId;
            return this;
        }
        public String getFpDBId() {
            return this.fpDBId;
        }

        public QueryMediaFpDeleteJobListResponseBodyMediaFpDeleteJobListMediaFpDeleteJob setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryMediaFpDeleteJobListResponseBodyMediaFpDeleteJobListMediaFpDeleteJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryMediaFpDeleteJobListResponseBodyMediaFpDeleteJobListMediaFpDeleteJob setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public QueryMediaFpDeleteJobListResponseBodyMediaFpDeleteJobListMediaFpDeleteJob setPrimaryKey(String primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        public String getPrimaryKey() {
            return this.primaryKey;
        }

        public QueryMediaFpDeleteJobListResponseBodyMediaFpDeleteJobListMediaFpDeleteJob setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryMediaFpDeleteJobListResponseBodyMediaFpDeleteJobListMediaFpDeleteJob setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

    public static class QueryMediaFpDeleteJobListResponseBodyMediaFpDeleteJobList extends TeaModel {
        @NameInMap("MediaFpDeleteJob")
        public java.util.List<QueryMediaFpDeleteJobListResponseBodyMediaFpDeleteJobListMediaFpDeleteJob> mediaFpDeleteJob;

        public static QueryMediaFpDeleteJobListResponseBodyMediaFpDeleteJobList build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaFpDeleteJobListResponseBodyMediaFpDeleteJobList self = new QueryMediaFpDeleteJobListResponseBodyMediaFpDeleteJobList();
            return TeaModel.build(map, self);
        }

        public QueryMediaFpDeleteJobListResponseBodyMediaFpDeleteJobList setMediaFpDeleteJob(java.util.List<QueryMediaFpDeleteJobListResponseBodyMediaFpDeleteJobListMediaFpDeleteJob> mediaFpDeleteJob) {
            this.mediaFpDeleteJob = mediaFpDeleteJob;
            return this;
        }
        public java.util.List<QueryMediaFpDeleteJobListResponseBodyMediaFpDeleteJobListMediaFpDeleteJob> getMediaFpDeleteJob() {
            return this.mediaFpDeleteJob;
        }

    }

    public static class QueryMediaFpDeleteJobListResponseBodyNonExistIds extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static QueryMediaFpDeleteJobListResponseBodyNonExistIds build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaFpDeleteJobListResponseBodyNonExistIds self = new QueryMediaFpDeleteJobListResponseBodyNonExistIds();
            return TeaModel.build(map, self);
        }

        public QueryMediaFpDeleteJobListResponseBodyNonExistIds setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

}
