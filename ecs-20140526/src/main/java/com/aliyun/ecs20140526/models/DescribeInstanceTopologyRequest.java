// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceTopologyRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("InstanceIds")
    public String instanceIds;

    public static DescribeInstanceTopologyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceTopologyRequest self = new DescribeInstanceTopologyRequest();
        return TeaModel.build(map, self);
    }

}
