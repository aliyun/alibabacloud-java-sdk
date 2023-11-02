// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeEventCountByThreatLevelRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeEventCountByThreatLevelRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventCountByThreatLevelRequest self = new DescribeEventCountByThreatLevelRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEventCountByThreatLevelRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
