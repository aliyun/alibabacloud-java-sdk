// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetPackageJobRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("JobId")
    public String jobId;

    public static GetPackageJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPackageJobRequest self = new GetPackageJobRequest();
        return TeaModel.build(map, self);
    }

    public GetPackageJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
