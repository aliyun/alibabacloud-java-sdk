// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.batchcompute20151111.models;

import com.aliyun.tea.*;

public class StopJobRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static StopJobRequest build(java.util.Map<String, ?> map) throws Exception {
        StopJobRequest self = new StopJobRequest();
        return TeaModel.build(map, self);
    }

    public StopJobRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
