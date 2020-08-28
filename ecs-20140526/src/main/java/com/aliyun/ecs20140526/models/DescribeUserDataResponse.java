// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeUserDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("UserData")
    @Validation(required = true)
    public String userData;

    public static DescribeUserDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserDataResponse self = new DescribeUserDataResponse();
        return TeaModel.build(map, self);
    }

}
