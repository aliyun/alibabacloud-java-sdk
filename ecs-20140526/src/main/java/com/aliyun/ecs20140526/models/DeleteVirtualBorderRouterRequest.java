// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteVirtualBorderRouterRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("VbrId")
    @Validation(required = true)
    public String vbrId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("UserCidr")
    public String userCidr;

    public static DeleteVirtualBorderRouterRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVirtualBorderRouterRequest self = new DeleteVirtualBorderRouterRequest();
        return TeaModel.build(map, self);
    }

}
