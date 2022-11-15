// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_engine20220609.models;

import com.aliyun.tea.*;

public class GetJobsRequest extends TeaModel {
    @NameInMap("JobIds")
    public java.util.List<Long> jobIds;

    public static GetJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetJobsRequest self = new GetJobsRequest();
        return TeaModel.build(map, self);
    }

    public GetJobsRequest setJobIds(java.util.List<Long> jobIds) {
        this.jobIds = jobIds;
        return this;
    }
    public java.util.List<Long> getJobIds() {
        return this.jobIds;
    }

}
