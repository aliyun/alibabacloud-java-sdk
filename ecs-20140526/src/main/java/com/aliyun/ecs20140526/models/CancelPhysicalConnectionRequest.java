// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CancelPhysicalConnectionRequest extends TeaModel {
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

    public static CancelPhysicalConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelPhysicalConnectionRequest self = new CancelPhysicalConnectionRequest();
        return TeaModel.build(map, self);
    }

}
