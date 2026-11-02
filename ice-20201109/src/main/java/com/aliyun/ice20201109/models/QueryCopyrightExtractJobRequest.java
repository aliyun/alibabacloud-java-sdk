// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class QueryCopyrightExtractJobRequest extends TeaModel {
    /**
     * <p>The job ID. You can obtain it from the response parameters returned when you submit a copyright watermark extraction job.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2288c6ca184c0e47098a5b665e2a12****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    public static QueryCopyrightExtractJobRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCopyrightExtractJobRequest self = new QueryCopyrightExtractJobRequest();
        return TeaModel.build(map, self);
    }

    public QueryCopyrightExtractJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
