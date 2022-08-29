// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetMpcSqlJobRequest extends TeaModel {
    @NameInMap("JobId")
    public Long jobId;

    public static GetMpcSqlJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMpcSqlJobRequest self = new GetMpcSqlJobRequest();
        return TeaModel.build(map, self);
    }

    public GetMpcSqlJobRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

}
