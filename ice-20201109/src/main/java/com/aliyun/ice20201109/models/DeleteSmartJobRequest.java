// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteSmartJobRequest extends TeaModel {
    @NameInMap("JobId")
    public String jobId;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteSmartJobRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSmartJobRequest self = new DeleteSmartJobRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSmartJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public DeleteSmartJobRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
