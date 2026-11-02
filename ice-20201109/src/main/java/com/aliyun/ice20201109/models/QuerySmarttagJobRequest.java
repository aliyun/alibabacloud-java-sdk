// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class QuerySmarttagJobRequest extends TeaModel {
    /**
     * <p>The ID of the smart tag job to query. You can obtain the ID from the response parameters of the <a href="https://help.aliyun.com/document_detail/478786.html">SubmitSmarttagJob</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>88c6ca184c0e47098a5b665e2****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The additional request parameters, represented as a JSON string. Example: {&quot;labelResultType&quot;:&quot;auto&quot;}. The labelResultType parameter is of the String type. Valid values:</p>
     * <ul>
     * <li><p>auto: machine tagging results.</p>
     * </li>
     * <li><p>hmi: human-machine collaboration results.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;labelResultType&quot;:&quot;auto&quot;}</p>
     */
    @NameInMap("Params")
    public String params;

    public static QuerySmarttagJobRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySmarttagJobRequest self = new QuerySmarttagJobRequest();
        return TeaModel.build(map, self);
    }

    public QuerySmarttagJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public QuerySmarttagJobRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

}
