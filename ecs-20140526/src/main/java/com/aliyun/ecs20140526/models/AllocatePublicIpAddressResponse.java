// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AllocatePublicIpAddressResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("IpAddress")
    @Validation(required = true)
    public String ipAddress;

    public static AllocatePublicIpAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        AllocatePublicIpAddressResponse self = new AllocatePublicIpAddressResponse();
        return TeaModel.build(map, self);
    }

    public AllocatePublicIpAddressResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AllocatePublicIpAddressResponse setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }
    public String getIpAddress() {
        return this.ipAddress;
    }

}
