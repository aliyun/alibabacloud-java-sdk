// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyNetworkInterfaceAttributeRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("SecurityGroupId")
    public java.util.List<String> securityGroupId;

    @NameInMap("NetworkInterfaceName")
    public String networkInterfaceName;

    @NameInMap("NetworkInterfaceId")
    @Validation(required = true)
    public String networkInterfaceId;

    @NameInMap("QueueNumber")
    public Integer queueNumber;

    @NameInMap("Description")
    public String description;

    public static ModifyNetworkInterfaceAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyNetworkInterfaceAttributeRequest self = new ModifyNetworkInterfaceAttributeRequest();
        return TeaModel.build(map, self);
    }

}
