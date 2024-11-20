// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class QuerySmarttagJobRequest extends TeaModel {
    /**
     * <p>The ID of the smart tagging job that you want to query. You can obtain the job ID from the response parameters of the SubmitSmarttagJob operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>88c6ca184c0e47098a5b665e2****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The extra parameters that you want to query in the request. The value is a JSON string. Example: {&quot;labelResultType&quot;:&quot;auto&quot;}. The value of labelResultType is of the STRING type. Valid values:</p>
     * <ul>
     * <li>auto: machine tagging</li>
     * <li>hmi: tagging by human and machine</li>
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
