// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DescribeDispatchRuleRequest extends TeaModel {
    /**
     * <p>The value of the tag.</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The operation that you want to perform. Set the value to DescribeDispatchRule.</p>
     */
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
