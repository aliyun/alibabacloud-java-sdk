// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class QuerySmarttagJobResponseBody extends TeaModel {
    /**
     * <p>The status of the job. Valid values:</p>
     * <ul>
     * <li><strong>Success</strong>: The job was successful.</li>
     * <li><strong>Fail</strong>: The job failed.</li>
     * <li><strong>Processing</strong>: The job is in progress.</li>
     * <li><strong>Submitted</strong>: The job is submitted and waiting to be processed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("JobStatus")
    public String jobStatus;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The analysis results of the smart tagging job. The value is an array.</p>
     */
    @NameInMap("Results")
    public QuerySmarttagJobResponseBodyResults results;

    @NameInMap("Usages")
    public QuerySmarttagJobResponseBodyUsages usages;

    /**
     * <p>The content of callback messages that are sent to Simple Message Queue (SMQ) when the information of the smart tagging job changes. For more information about the parameters contained in the callback message, see the &quot;Callback parameters&quot; section of this topic.</p>
     * 
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

    public QuerySmarttagJobResponseBody setUsages(QuerySmarttagJobResponseBodyUsages usages) {
        this.usages = usages;
        return this;
    }
    public QuerySmarttagJobResponseBodyUsages getUsages() {
        return this.usages;
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
         * <p>The details of the analysis result. The value is a JSON string. For more information about the parameters of different result types, see the &quot;Parameters of different result types&quot; section of this topic.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;title&quot;:&quot;example-title-****&quot;}</p>
         */
        @NameInMap("Data")
        public String data;

        /**
         * <p>The type of the analysis result.</p>
         * <ul>
         * <li>The type of the analysis result based on Smart tagging V1.0. Valid values:</li>
         * </ul>
         * <ol>
         * <li>TextLabel: the text tag.</li>
         * <li>VideoLabel: the video tag.</li>
         * <li>ASR: the original result of automatic speech recognition (ASR). By default, this type of result is not returned.</li>
         * <li>OCR: the original result of optical character recognition (OCR). By default, this type of result is not returned.</li>
         * <li>NLP: the natural language processing (NLP)-based result. By default, this type of result is not returned.</li>
         * </ol>
         * <ul>
         * <li>The type of the analysis result based on Smart tagging V2.0. Valid values:</li>
         * </ul>
         * <ol>
         * <li>CPVLabel</li>
         * <li>Meta: the information about the video file, such as the title of the video. By default, this type of information is not returned.</li>
         * </ol>
         * <ul>
         * <li>The type of the analysis result based on Smart tagging V2.0-custom. Valid values:</li>
         * </ul>
         * <ol>
         * <li>CPVLabel</li>
         * <li>Meta: the information about the video file, such as the title of the video. By default, this type of information is not returned.</li>
         * </ol>
         * 
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

    public static class QuerySmarttagJobResponseBodyUsagesUsage extends TeaModel {
        @NameInMap("Quota")
        public Long quota;

        @NameInMap("Type")
        public String type;

        public static QuerySmarttagJobResponseBodyUsagesUsage build(java.util.Map<String, ?> map) throws Exception {
            QuerySmarttagJobResponseBodyUsagesUsage self = new QuerySmarttagJobResponseBodyUsagesUsage();
            return TeaModel.build(map, self);
        }

        public QuerySmarttagJobResponseBodyUsagesUsage setQuota(Long quota) {
            this.quota = quota;
            return this;
        }
        public Long getQuota() {
            return this.quota;
        }

        public QuerySmarttagJobResponseBodyUsagesUsage setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QuerySmarttagJobResponseBodyUsages extends TeaModel {
        @NameInMap("Usage")
        public java.util.List<QuerySmarttagJobResponseBodyUsagesUsage> usage;

        public static QuerySmarttagJobResponseBodyUsages build(java.util.Map<String, ?> map) throws Exception {
            QuerySmarttagJobResponseBodyUsages self = new QuerySmarttagJobResponseBodyUsages();
            return TeaModel.build(map, self);
        }

        public QuerySmarttagJobResponseBodyUsages setUsage(java.util.List<QuerySmarttagJobResponseBodyUsagesUsage> usage) {
            this.usage = usage;
            return this;
        }
        public java.util.List<QuerySmarttagJobResponseBodyUsagesUsage> getUsage() {
            return this.usage;
        }

    }

}
