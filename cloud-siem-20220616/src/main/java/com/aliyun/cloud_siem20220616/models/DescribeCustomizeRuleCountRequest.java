// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeCustomizeRuleCountRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeCustomizeRuleCountRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomizeRuleCountRequest self = new DescribeCustomizeRuleCountRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCustomizeRuleCountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
