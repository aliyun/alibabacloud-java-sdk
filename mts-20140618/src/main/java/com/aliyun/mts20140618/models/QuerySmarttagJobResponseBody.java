// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QuerySmarttagJobResponseBody extends TeaModel {
    @NameInMap("JobStatus")
    public String jobStatus;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UserData")
    public String userData;

    @NameInMap("Results")
    public QuerySmarttagJobResponseBodyResults results;

    public static QuerySmarttagJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySmarttagJobResponseBody self = new QuerySmarttagJobResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySmarttagJobResponseBody setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }
    public String getJobStatus() {
        return this.jobStatus;
    }

    public QuerySmarttagJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySmarttagJobResponseBody setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public QuerySmarttagJobResponseBody setResults(QuerySmarttagJobResponseBodyResults results) {
        this.results = results;
        return this;
    }
    public QuerySmarttagJobResponseBodyResults getResults() {
        return this.results;
    }

    public static class QuerySmarttagJobResponseBodyResultsResult extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Data")
        public String data;

        public static QuerySmarttagJobResponseBodyResultsResult build(java.util.Map<String, ?> map) throws Exception {
            QuerySmarttagJobResponseBodyResultsResult self = new QuerySmarttagJobResponseBodyResultsResult();
            return TeaModel.build(map, self);
        }

        public QuerySmarttagJobResponseBodyResultsResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QuerySmarttagJobResponseBodyResultsResult setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

    }

    public static class QuerySmarttagJobResponseBodyResults extends TeaModel {
        @NameInMap("Result")
        public java.util.List<QuerySmarttagJobResponseBodyResultsResult> result;

        public static QuerySmarttagJobResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            QuerySmarttagJobResponseBodyResults self = new QuerySmarttagJobResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public QuerySmarttagJobResponseBodyResults setResult(java.util.List<QuerySmarttagJobResponseBodyResultsResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<QuerySmarttagJobResponseBodyResultsResult> getResult() {
            return this.result;
        }

    }

}
