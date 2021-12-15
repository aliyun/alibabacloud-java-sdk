// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20210728.models;

import com.aliyun.tea.*;

public class QueryCopyrightExtractRequest extends TeaModel {
    // 任务id
    @NameInMap("JobId")
    public String jobId;

    public static QueryCopyrightExtractRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCopyrightExtractRequest self = new QueryCopyrightExtractRequest();
        return TeaModel.build(map, self);
    }

    public QueryCopyrightExtractRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
