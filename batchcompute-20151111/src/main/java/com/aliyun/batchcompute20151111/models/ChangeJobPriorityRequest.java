// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.batchcompute20151111.models;

import com.aliyun.tea.*;

public class ChangeJobPriorityRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static ChangeJobPriorityRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeJobPriorityRequest self = new ChangeJobPriorityRequest();
        return TeaModel.build(map, self);
    }

    public ChangeJobPriorityRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
