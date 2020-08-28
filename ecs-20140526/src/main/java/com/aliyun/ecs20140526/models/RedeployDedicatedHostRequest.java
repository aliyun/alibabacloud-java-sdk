// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RedeployDedicatedHostRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("DedicatedHostId")
    @Validation(required = true)
    public String dedicatedHostId;

    public static RedeployDedicatedHostRequest build(java.util.Map<String, ?> map) throws Exception {
        RedeployDedicatedHostRequest self = new RedeployDedicatedHostRequest();
        return TeaModel.build(map, self);
    }

}
