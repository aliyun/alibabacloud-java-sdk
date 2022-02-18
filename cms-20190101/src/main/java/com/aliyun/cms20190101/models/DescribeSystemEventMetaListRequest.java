// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSystemEventMetaListRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeSystemEventMetaListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSystemEventMetaListRequest self = new DescribeSystemEventMetaListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSystemEventMetaListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
