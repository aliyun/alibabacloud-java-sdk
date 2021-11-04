// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryIProductionJobListResponseBody extends TeaModel {
    @NameInMap("Jobs")
    public QueryIProductionJobListResponseBodyJobs jobs;

    @NameInMap("NextPageToken")
    public String nextPageToken;

    @NameInMap("NonExistIds")
    public QueryIProductionJobListResponseBodyNonExistIds nonExistIds;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryIProductionJobListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryIProductionJobListResponseBody self = new QueryIProductionJobListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryIProductionJobListResponseBody setJobs(QueryIProductionJobListResponseBodyJobs jobs) {
        this.jobs = jobs;
        return this;
    }
    public QueryIProductionJobListResponseBodyJobs getJobs() {
        return this.jobs;
    }

    public QueryIProductionJobListResponseBody setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public QueryIProductionJobListResponseBody setNonExistIds(QueryIProductionJobListResponseBodyNonExistIds nonExistIds) {
        this.nonExistIds = nonExistIds;
        return this;
    }
    public QueryIProductionJobListResponseBodyNonExistIds getNonExistIds() {
        return this.nonExistIds;
    }

    public QueryIProductionJobListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryIProductionJobListResponseBodyJobs extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static QueryIProductionJobListResponseBodyJobs build(java.util.Map<String, ?> map) throws Exception {
            QueryIProductionJobListResponseBodyJobs self = new QueryIProductionJobListResponseBodyJobs();
            return TeaModel.build(map, self);
        }

        public QueryIProductionJobListResponseBodyJobs setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

    public static class QueryIProductionJobListResponseBodyNonExistIds extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static QueryIProductionJobListResponseBodyNonExistIds build(java.util.Map<String, ?> map) throws Exception {
            QueryIProductionJobListResponseBodyNonExistIds self = new QueryIProductionJobListResponseBodyNonExistIds();
            return TeaModel.build(map, self);
        }

        public QueryIProductionJobListResponseBodyNonExistIds setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

}
