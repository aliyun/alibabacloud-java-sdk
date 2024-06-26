// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class QuerySmarttagJobResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("JobStatus")
    public String jobStatus;

    /**
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public QuerySmarttagJobResponseBodyResults results;

    /**
     * <strong>example:</strong>
     * <p>{&quot;userId&quot;:&quot;123432412831&quot;}</p>
     */
    @NameInMap("UserData")
    public String userData;

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

    public QuerySmarttagJobResponseBody setResults(QuerySmarttagJobResponseBodyResults results) {
        this.results = results;
        return this;
    }
    public QuerySmarttagJobResponseBodyResults getResults() {
        return this.results;
    }

    public QuerySmarttagJobResponseBody setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public static class QuerySmarttagJobResponseBodyResultsResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{&quot;title&quot;:&quot;example-title-****&quot;}</p>
         */
        @NameInMap("Data")
        public String data;

        /**
         * <strong>example:</strong>
         * <p>Meta</p>
         */
        @NameInMap("Type")
        public String type;

        public static QuerySmarttagJobResponseBodyResultsResult build(java.util.Map<String, ?> map) throws Exception {
            QuerySmarttagJobResponseBodyResultsResult self = new QuerySmarttagJobResponseBodyResultsResult();
            return TeaModel.build(map, self);
        }

        public QuerySmarttagJobResponseBodyResultsResult setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public QuerySmarttagJobResponseBodyResultsResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
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
