// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AllocatePublicIpAddressRequest extends TeaModel {
    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("IpAddress")
    public String ipAddress;

    @NameInMap("VlanId")
    public String vlanId;

    public static AllocatePublicIpAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        AllocatePublicIpAddressRequest self = new AllocatePublicIpAddressRequest();
        return TeaModel.build(map, self);
    }

}
