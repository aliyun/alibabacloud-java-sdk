// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AllocatePublicIpAddressResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("IpAddress")
    public String ipAddress;

    public static AllocatePublicIpAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AllocatePublicIpAddressResponseBody self = new AllocatePublicIpAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public AllocatePublicIpAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AllocatePublicIpAddressResponseBody setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }
    public String getIpAddress() {
        return this.ipAddress;
    }

}
