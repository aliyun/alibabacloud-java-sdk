// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateSecurityProxyResponseBody extends TeaModel {
    @NameInMap("ProxyId")
    public String proxyId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateSecurityProxyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSecurityProxyResponseBody self = new CreateSecurityProxyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSecurityProxyResponseBody setProxyId(String proxyId) {
        this.proxyId = proxyId;
        return this;
    }
    public String getProxyId() {
        return this.proxyId;
    }

    public CreateSecurityProxyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
