// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeactivateRouterInterfaceRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("RouterInterfaceId")
    @Validation(required = true)
    public String routerInterfaceId;

    public static DeactivateRouterInterfaceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeactivateRouterInterfaceRequest self = new DeactivateRouterInterfaceRequest();
        return TeaModel.build(map, self);
    }

}
