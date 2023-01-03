// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DescribeDispatchRuleRequest extends TeaModel {
    // The ID of the dispatch policy.
    @NameInMap("Id")
    public String id;

    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeDispatchRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDispatchRuleRequest self = new DescribeDispatchRuleRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDispatchRuleRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribeDispatchRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
