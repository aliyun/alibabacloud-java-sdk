// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DescribeTotalStatInfoRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeTotalStatInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTotalStatInfoRequest self = new DescribeTotalStatInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTotalStatInfoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
