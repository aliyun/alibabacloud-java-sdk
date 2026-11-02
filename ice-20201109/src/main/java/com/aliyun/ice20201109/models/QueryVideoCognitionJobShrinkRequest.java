// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class QueryVideoCognitionJobShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether to include the complete algorithm results in the query results.</p>
     */
    @NameInMap("IncludeResults")
    public String includeResultsShrink;

    /**
     * <p>The ID of the intelligent tagging job to query. You can obtain the ID from the response parameters of the <a href="https://help.aliyun.com/document_detail/478786.html">Submit a smart tagging job</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The additional request parameters, represented as a JSON string.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Params")
    public String params;

    public static QueryVideoCognitionJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryVideoCognitionJobShrinkRequest self = new QueryVideoCognitionJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryVideoCognitionJobShrinkRequest setIncludeResultsShrink(String includeResultsShrink) {
        this.includeResultsShrink = includeResultsShrink;
        return this;
    }
    public String getIncludeResultsShrink() {
        return this.includeResultsShrink;
    }

    public QueryVideoCognitionJobShrinkRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public QueryVideoCognitionJobShrinkRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

}
