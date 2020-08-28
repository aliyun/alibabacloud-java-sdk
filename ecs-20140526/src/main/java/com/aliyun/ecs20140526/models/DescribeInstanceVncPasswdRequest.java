// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceVncPasswdRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    public static DescribeInstanceVncPasswdRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceVncPasswdRequest self = new DescribeInstanceVncPasswdRequest();
        return TeaModel.build(map, self);
    }

}
