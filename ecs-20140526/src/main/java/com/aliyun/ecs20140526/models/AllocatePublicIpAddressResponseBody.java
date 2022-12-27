// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AllocatePublicIpAddressResponseBody extends TeaModel {
    // The public IP address of the instance.
    @NameInMap("IpAddress")
    public String ipAddress;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static AllocatePublicIpAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AllocatePublicIpAddressResponseBody self = new AllocatePublicIpAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public AllocatePublicIpAddressResponseBody setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }
    public String getIpAddress() {
        return this.ipAddress;
    }

    public AllocatePublicIpAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
