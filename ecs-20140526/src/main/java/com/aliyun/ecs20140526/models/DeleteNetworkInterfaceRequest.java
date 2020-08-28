// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteNetworkInterfaceRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("NetworkInterfaceId")
    @Validation(required = true)
    public String networkInterfaceId;

    public static DeleteNetworkInterfaceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkInterfaceRequest self = new DeleteNetworkInterfaceRequest();
        return TeaModel.build(map, self);
    }

}
