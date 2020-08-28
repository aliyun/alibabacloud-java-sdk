// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ReleaseDedicatedHostRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("DedicatedHostId")
    @Validation(required = true)
    public String dedicatedHostId;

    public static ReleaseDedicatedHostRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseDedicatedHostRequest self = new ReleaseDedicatedHostRequest();
        return TeaModel.build(map, self);
    }

}
