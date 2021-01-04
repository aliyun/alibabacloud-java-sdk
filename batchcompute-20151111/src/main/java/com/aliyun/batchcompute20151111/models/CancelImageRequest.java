// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.batchcompute20151111.models;

import com.aliyun.tea.*;

public class CancelImageRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static CancelImageRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelImageRequest self = new CancelImageRequest();
        return TeaModel.build(map, self);
    }

    public CancelImageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
