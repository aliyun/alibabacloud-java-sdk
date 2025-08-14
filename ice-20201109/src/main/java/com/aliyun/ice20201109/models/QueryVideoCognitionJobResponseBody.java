// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class QueryVideoCognitionJobResponseBody extends TeaModel {
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
    public QueryVideoCognitionJobResponseBodyResults results;

    /**
     * <strong>example:</strong>
     * <p>{&quot;userId&quot;:&quot;123432412831&quot;}</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static QueryVideoCognitionJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryVideoCognitionJobResponseBody self = new QueryVideoCognitionJobResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryVideoCognitionJobResponseBody setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }
    public String getJobStatus() {
        return this.jobStatus;
    }

    public QueryVideoCognitionJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryVideoCognitionJobResponseBody setResults(QueryVideoCognitionJobResponseBodyResults results) {
        this.results = results;
        return this;
    }
    public QueryVideoCognitionJobResponseBodyResults getResults() {
        return this.results;
    }

    public QueryVideoCognitionJobResponseBody setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public static class QueryVideoCognitionJobResponseBodyResultsResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{&quot;title&quot;:&quot;example-title-****&quot;}</p>
         */
        @NameInMap("Data")
        public String data;

        /**
         * <strong>example:</strong>
         * <p>ASR</p>
         */
        @NameInMap("Type")
        public String type;

        public static QueryVideoCognitionJobResponseBodyResultsResult build(java.util.Map<String, ?> map) throws Exception {
            QueryVideoCognitionJobResponseBodyResultsResult self = new QueryVideoCognitionJobResponseBodyResultsResult();
            return TeaModel.build(map, self);
        }

        public QueryVideoCognitionJobResponseBodyResultsResult setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public QueryVideoCognitionJobResponseBodyResultsResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryVideoCognitionJobResponseBodyResults extends TeaModel {
        @NameInMap("result")
        public java.util.List<QueryVideoCognitionJobResponseBodyResultsResult> result;

        public static QueryVideoCognitionJobResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            QueryVideoCognitionJobResponseBodyResults self = new QueryVideoCognitionJobResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public QueryVideoCognitionJobResponseBodyResults setResult(java.util.List<QueryVideoCognitionJobResponseBodyResultsResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<QueryVideoCognitionJobResponseBodyResultsResult> getResult() {
            return this.result;
        }

    }

}
