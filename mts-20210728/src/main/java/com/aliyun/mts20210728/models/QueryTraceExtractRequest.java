// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20210728.models;

import com.aliyun.tea.*;

public class QueryTraceExtractRequest extends TeaModel {
    // 任务id
    @NameInMap("JobId")
    public String jobId;

    public static QueryTraceExtractRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTraceExtractRequest self = new QueryTraceExtractRequest();
        return TeaModel.build(map, self);
    }

    public QueryTraceExtractRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
