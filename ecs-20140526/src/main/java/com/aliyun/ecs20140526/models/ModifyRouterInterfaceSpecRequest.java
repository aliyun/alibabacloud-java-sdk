// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyRouterInterfaceSpecRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("RouterInterfaceId")
    @Validation(required = true)
    public String routerInterfaceId;

    @NameInMap("Spec")
    @Validation(required = true)
    public String spec;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("UserCidr")
    public String userCidr;

    public static ModifyRouterInterfaceSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyRouterInterfaceSpecRequest self = new ModifyRouterInterfaceSpecRequest();
        return TeaModel.build(map, self);
    }

}
