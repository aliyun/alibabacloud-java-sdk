// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class EnablePhysicalConnectionRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("PhysicalConnectionId")
    @Validation(required = true)
    public String physicalConnectionId;

    @NameInMap("ClientToken")
    @Validation(required = true)
    public String clientToken;

    @NameInMap("UserCidr")
    public String userCidr;

    public static EnablePhysicalConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        EnablePhysicalConnectionRequest self = new EnablePhysicalConnectionRequest();
        return TeaModel.build(map, self);
    }

}
