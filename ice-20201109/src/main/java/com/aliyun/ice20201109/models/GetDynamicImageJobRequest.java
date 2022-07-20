// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetDynamicImageJobRequest extends TeaModel {
    @NameInMap("JobId")
    public String jobId;

    public static GetDynamicImageJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDynamicImageJobRequest self = new GetDynamicImageJobRequest();
        return TeaModel.build(map, self);
    }

    public GetDynamicImageJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
