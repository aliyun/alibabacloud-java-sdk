// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class GetClientSourceIpResponseBody extends TeaModel {
    @NameInMap("ClientIp")
    public String clientIp;

    @NameInMap("RequestId")
    public String requestId;

    public static GetClientSourceIpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClientSourceIpResponseBody self = new GetClientSourceIpResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClientSourceIpResponseBody setClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }
    public String getClientIp() {
        return this.clientIp;
    }

    public GetClientSourceIpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
