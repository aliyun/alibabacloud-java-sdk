// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class QueryDNAJobListResponseBody extends TeaModel {
    @NameInMap("JobList")
    public java.util.List<QueryDNAJobListResponseBodyJobList> jobList;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryDNAJobListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDNAJobListResponseBody self = new QueryDNAJobListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDNAJobListResponseBody setJobList(java.util.List<QueryDNAJobListResponseBodyJobList> jobList) {
        this.jobList = jobList;
        return this;
    }
    public java.util.List<QueryDNAJobListResponseBodyJobList> getJobList() {
        return this.jobList;
    }

    public QueryDNAJobListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryDNAJobListResponseBodyJobListInput extends TeaModel {
        @NameInMap("Media")
        public String media;

        @NameInMap("Type")
        public String type;

        public static QueryDNAJobListResponseBodyJobListInput build(java.util.Map<String, ?> map) throws Exception {
            QueryDNAJobListResponseBodyJobListInput self = new QueryDNAJobListResponseBodyJobListInput();
            return TeaModel.build(map, self);
        }

        public QueryDNAJobListResponseBodyJobListInput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public QueryDNAJobListResponseBodyJobListInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryDNAJobListResponseBodyJobList extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Config")
        public String config;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("DBId")
        public String DBId;

        @NameInMap("DNAResult")
        public String DNAResult;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("Id")
        public String id;

        @NameInMap("Input")
        public QueryDNAJobListResponseBodyJobListInput input;

        @NameInMap("Message")
        public String message;

        @NameInMap("PrimaryKey")
        public String primaryKey;

        @NameInMap("Status")
        public String status;

        @NameInMap("UserData")
        public String userData;

        public static QueryDNAJobListResponseBodyJobList build(java.util.Map<String, ?> map) throws Exception {
            QueryDNAJobListResponseBodyJobList self = new QueryDNAJobListResponseBodyJobList();
            return TeaModel.build(map, self);
        }

        public QueryDNAJobListResponseBodyJobList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryDNAJobListResponseBodyJobList setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public QueryDNAJobListResponseBodyJobList setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public QueryDNAJobListResponseBodyJobList setDBId(String DBId) {
            this.DBId = DBId;
            return this;
        }
        public String getDBId() {
            return this.DBId;
        }

        public QueryDNAJobListResponseBodyJobList setDNAResult(String DNAResult) {
            this.DNAResult = DNAResult;
            return this;
        }
        public String getDNAResult() {
            return this.DNAResult;
        }

        public QueryDNAJobListResponseBodyJobList setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public QueryDNAJobListResponseBodyJobList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryDNAJobListResponseBodyJobList setInput(QueryDNAJobListResponseBodyJobListInput input) {
            this.input = input;
            return this;
        }
        public QueryDNAJobListResponseBodyJobListInput getInput() {
            return this.input;
        }

        public QueryDNAJobListResponseBodyJobList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryDNAJobListResponseBodyJobList setPrimaryKey(String primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        public String getPrimaryKey() {
            return this.primaryKey;
        }

        public QueryDNAJobListResponseBodyJobList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryDNAJobListResponseBodyJobList setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

}
