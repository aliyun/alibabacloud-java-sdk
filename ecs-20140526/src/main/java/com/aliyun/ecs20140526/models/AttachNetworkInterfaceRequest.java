// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AttachNetworkInterfaceRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("NetworkInterfaceId")
    @Validation(required = true)
    public String networkInterfaceId;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("TrunkNetworkInstanceId")
    public String trunkNetworkInstanceId;

    public static AttachNetworkInterfaceRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachNetworkInterfaceRequest self = new AttachNetworkInterfaceRequest();
        return TeaModel.build(map, self);
    }

}
