// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DetachClassicLinkVpcRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("VpcId")
    @Validation(required = true)
    public String vpcId;

    public static DetachClassicLinkVpcRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachClassicLinkVpcRequest self = new DetachClassicLinkVpcRequest();
        return TeaModel.build(map, self);
    }

}
