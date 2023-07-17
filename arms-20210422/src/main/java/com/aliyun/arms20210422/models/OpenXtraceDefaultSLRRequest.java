// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class OpenXtraceDefaultSLRRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static OpenXtraceDefaultSLRRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenXtraceDefaultSLRRequest self = new OpenXtraceDefaultSLRRequest();
        return TeaModel.build(map, self);
    }

    public OpenXtraceDefaultSLRRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
