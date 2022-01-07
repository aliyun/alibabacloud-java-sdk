// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetSparkJobDetailRequest extends TeaModel {
    @NameInMap("JobId")
    public Long jobId;

    @NameInMap("Tid")
    public Long tid;

    public static GetSparkJobDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSparkJobDetailRequest self = new GetSparkJobDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetSparkJobDetailRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public GetSparkJobDetailRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
