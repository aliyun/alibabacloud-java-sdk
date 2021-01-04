// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.batchcompute20151111.models;

import com.aliyun.tea.*;

public class GetJobDescriptionRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static GetJobDescriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetJobDescriptionRequest self = new GetJobDescriptionRequest();
        return TeaModel.build(map, self);
    }

    public GetJobDescriptionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
