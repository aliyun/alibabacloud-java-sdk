// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class OpenArmsDefaultSLRRequest extends TeaModel {
    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static OpenArmsDefaultSLRRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenArmsDefaultSLRRequest self = new OpenArmsDefaultSLRRequest();
        return TeaModel.build(map, self);
    }

    public OpenArmsDefaultSLRRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
