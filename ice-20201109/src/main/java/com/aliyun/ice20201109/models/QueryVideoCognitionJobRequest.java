// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class QueryVideoCognitionJobRequest extends TeaModel {
    /**
     * <p>Specifies whether to include the full algorithm results in the response.</p>
     */
    @NameInMap("IncludeResults")
    public QueryVideoCognitionJobRequestIncludeResults includeResults;

    /**
     * <p>The ID of the task to query. It is returned when you call the <a href="https://help.aliyun.com/document_detail/478786.html">SubmitSmarttagJob</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>Additional request parameters, provided as a JSON string.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Params")
    public String params;

    public static QueryVideoCognitionJobRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryVideoCognitionJobRequest self = new QueryVideoCognitionJobRequest();
        return TeaModel.build(map, self);
    }

    public QueryVideoCognitionJobRequest setIncludeResults(QueryVideoCognitionJobRequestIncludeResults includeResults) {
        this.includeResults = includeResults;
        return this;
    }
    public QueryVideoCognitionJobRequestIncludeResults getIncludeResults() {
        return this.includeResults;
    }

    public QueryVideoCognitionJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public QueryVideoCognitionJobRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public static class QueryVideoCognitionJobRequestIncludeResults extends TeaModel {
        /**
         * <p>Specifies whether to include Automatic Speech Recognition (ASR) results.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("NeedAsr")
        public Boolean needAsr;

        /**
         * <p>Specifies whether to include Optical Character Recognition (OCR) results.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("NeedOcr")
        public Boolean needOcr;

        /**
         * <p>Specifies whether to include the URL to the raw output of the algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("NeedProcess")
        public Boolean needProcess;

        public static QueryVideoCognitionJobRequestIncludeResults build(java.util.Map<String, ?> map) throws Exception {
            QueryVideoCognitionJobRequestIncludeResults self = new QueryVideoCognitionJobRequestIncludeResults();
            return TeaModel.build(map, self);
        }

        public QueryVideoCognitionJobRequestIncludeResults setNeedAsr(Boolean needAsr) {
            this.needAsr = needAsr;
            return this;
        }
        public Boolean getNeedAsr() {
            return this.needAsr;
        }

        public QueryVideoCognitionJobRequestIncludeResults setNeedOcr(Boolean needOcr) {
            this.needOcr = needOcr;
            return this;
        }
        public Boolean getNeedOcr() {
            return this.needOcr;
        }

        public QueryVideoCognitionJobRequestIncludeResults setNeedProcess(Boolean needProcess) {
            this.needProcess = needProcess;
            return this;
        }
        public Boolean getNeedProcess() {
            return this.needProcess;
        }

    }

}
