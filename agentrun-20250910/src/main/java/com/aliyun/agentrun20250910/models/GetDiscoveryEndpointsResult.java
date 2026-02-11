// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class GetDiscoveryEndpointsResult extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetDiscoveryEndpointsOutput data;

    @NameInMap("requestId")
    public String requestId;

    public static GetDiscoveryEndpointsResult build(java.util.Map<String, ?> map) throws Exception {
        GetDiscoveryEndpointsResult self = new GetDiscoveryEndpointsResult();
        return TeaModel.build(map, self);
    }

    public GetDiscoveryEndpointsResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDiscoveryEndpointsResult setData(GetDiscoveryEndpointsOutput data) {
        this.data = data;
        return this;
    }
    public GetDiscoveryEndpointsOutput getData() {
        return this.data;
    }

    public GetDiscoveryEndpointsResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
