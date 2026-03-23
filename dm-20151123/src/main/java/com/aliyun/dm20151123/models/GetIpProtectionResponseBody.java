// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class GetIpProtectionResponseBody extends TeaModel {
    @NameInMap("IpProtection")
    public String ipProtection;

    @NameInMap("RequestId")
    public String requestId;

    public static GetIpProtectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIpProtectionResponseBody self = new GetIpProtectionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIpProtectionResponseBody setIpProtection(String ipProtection) {
        this.ipProtection = ipProtection;
        return this;
    }
    public String getIpProtection() {
        return this.ipProtection;
    }

    public GetIpProtectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
