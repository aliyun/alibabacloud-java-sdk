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

    public AllocatePublicIpAddressRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AllocatePublicIpAddressRequest setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }
    public String getIpAddress() {
        return this.ipAddress;
    }

    public AllocatePublicIpAddressRequest setVlanId(String vlanId) {
        this.vlanId = vlanId;
        return this;
    }
    public String getVlanId() {
        return this.vlanId;
    }

}
