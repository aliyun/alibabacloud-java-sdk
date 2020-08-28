// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class TerminatePhysicalConnectionRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("PhysicalConnectionId")
    @Validation(required = true)
    public String physicalConnectionId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("UserCidr")
    public String userCidr;

    public static TerminatePhysicalConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        TerminatePhysicalConnectionRequest self = new TerminatePhysicalConnectionRequest();
        return TeaModel.build(map, self);
    }

}
