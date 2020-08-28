// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteRouterInterfaceRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("RouterInterfaceId")
    @Validation(required = true)
    public String routerInterfaceId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("UserCidr")
    public String userCidr;

    public static DeleteRouterInterfaceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRouterInterfaceRequest self = new DeleteRouterInterfaceRequest();
        return TeaModel.build(map, self);
    }

}
