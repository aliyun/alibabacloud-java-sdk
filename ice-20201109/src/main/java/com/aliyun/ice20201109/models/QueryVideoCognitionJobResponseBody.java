// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class QueryVideoCognitionJobResponseBody extends TeaModel {
    @NameInMap("Input")
    public QueryVideoCognitionJobResponseBodyInput input;

    /**
     * <p>The status of the task. Valid values:</p>
     * <ul>
     * <li><strong>Success</strong></li>
     * <li><strong>Fail</strong></li>
     * <li><strong>Processing</strong></li>
     * <li><strong>Submitted</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("JobStatus")
    public String jobStatus;

    @NameInMap("Params")
    public String params;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public QueryVideoCognitionJobResponseBodyResults results;

    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The user-defined data.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;userId&quot;:&quot;123432412831&quot;}</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static QueryVideoCognitionJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryVideoCognitionJobResponseBody self = new QueryVideoCognitionJobResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryVideoCognitionJobResponseBody setInput(QueryVideoCognitionJobResponseBodyInput input) {
        this.input = input;
        return this;
    }
    public QueryVideoCognitionJobResponseBodyInput getInput() {
        return this.input;
    }

    public QueryVideoCognitionJobResponseBody setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }
    public String getJobStatus() {
        return this.jobStatus;
    }

    public QueryVideoCognitionJobResponseBody setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
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

    public QueryVideoCognitionJobResponseBody setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public QueryVideoCognitionJobResponseBody setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public static class QueryVideoCognitionJobResponseBodyInput extends TeaModel {
        @NameInMap("Media")
        public String media;

        @NameInMap("Type")
        public String type;

        public static QueryVideoCognitionJobResponseBodyInput build(java.util.Map<String, ?> map) throws Exception {
            QueryVideoCognitionJobResponseBodyInput self = new QueryVideoCognitionJobResponseBodyInput();
            return TeaModel.build(map, self);
        }

        public QueryVideoCognitionJobResponseBodyInput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public QueryVideoCognitionJobResponseBodyInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryVideoCognitionJobResponseBodyResultsResult extends TeaModel {
        @NameInMap("Data")
        public String data;

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
