// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ReleasePublicIpAddressRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PublicIpAddress")
    @Validation(required = true)
    public String publicIpAddress;

    public static ReleasePublicIpAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleasePublicIpAddressRequest self = new ReleasePublicIpAddressRequest();
        return TeaModel.build(map, self);
    }

    public ReleasePublicIpAddressRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ReleasePublicIpAddressRequest setPublicIpAddress(String publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
        return this;
    }
    public String getPublicIpAddress() {
        return this.publicIpAddress;
    }

}
