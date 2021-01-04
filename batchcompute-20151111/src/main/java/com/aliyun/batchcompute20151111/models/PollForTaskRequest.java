// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.batchcompute20151111.models;

import com.aliyun.tea.*;

public class PollForTaskRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static PollForTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        PollForTaskRequest self = new PollForTaskRequest();
        return TeaModel.build(map, self);
    }

    public PollForTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
