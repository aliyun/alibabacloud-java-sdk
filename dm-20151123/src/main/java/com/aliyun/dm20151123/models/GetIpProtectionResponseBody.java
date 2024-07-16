// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class GetIpProtectionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IpProtection")
    public String ipProtection;

    /**
     * <strong>example:</strong>
     * <p>B30E5A62-2E64-577D-A70E-8C6781D6C975</p>
     */
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
