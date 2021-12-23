// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateSmartJobRequest extends TeaModel {
    @NameInMap("FEExtend")
    public String FEExtend;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("RegionId")
    public String regionId;

    public static UpdateSmartJobRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSmartJobRequest self = new UpdateSmartJobRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSmartJobRequest setFEExtend(String FEExtend) {
        this.FEExtend = FEExtend;
        return this;
    }
    public String getFEExtend() {
        return this.FEExtend;
    }

    public UpdateSmartJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public UpdateSmartJobRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
