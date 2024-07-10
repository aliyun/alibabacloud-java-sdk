// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryTraceExtractJobRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>31fa3c9ca8134fb4b0b0f7878301****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    public static QueryTraceExtractJobRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTraceExtractJobRequest self = new QueryTraceExtractJobRequest();
        return TeaModel.build(map, self);
    }

    public QueryTraceExtractJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
