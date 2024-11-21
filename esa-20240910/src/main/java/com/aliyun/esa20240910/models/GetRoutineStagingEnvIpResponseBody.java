// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetRoutineStagingEnvIpResponseBody extends TeaModel {
    /**
     * <p>The IPv4 addresses.</p>
     */
    @NameInMap("IPV4")
    public java.util.List<String> IPV4;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EDBD3EB3-97DA-5465-AEF5-8DCA5DC5E395</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetRoutineStagingEnvIpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRoutineStagingEnvIpResponseBody self = new GetRoutineStagingEnvIpResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRoutineStagingEnvIpResponseBody setIPV4(java.util.List<String> IPV4) {
        this.IPV4 = IPV4;
        return this;
    }
    public java.util.List<String> getIPV4() {
        return this.IPV4;
    }

    public GetRoutineStagingEnvIpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
