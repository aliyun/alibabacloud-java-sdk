// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class BatchJobCheckRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SubmitId")
    public String submitId;

    public static BatchJobCheckRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchJobCheckRequest self = new BatchJobCheckRequest();
        return TeaModel.build(map, self);
    }

    public BatchJobCheckRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public BatchJobCheckRequest setSubmitId(String submitId) {
        this.submitId = submitId;
        return this;
    }
    public String getSubmitId() {
        return this.submitId;
    }

}
