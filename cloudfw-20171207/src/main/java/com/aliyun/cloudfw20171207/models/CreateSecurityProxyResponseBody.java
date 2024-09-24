// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateSecurityProxyResponseBody extends TeaModel {
    /**
     * <p>The ID of the NAT firewall.</p>
     * 
     * <strong>example:</strong>
     * <p>proxy-nat97ac4d7cc3834a5daf40</p>
     */
    @NameInMap("ProxyId")
    public String proxyId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>15FCCC52-1E23-57AE-B5EF-3E00A3DC3CAB</p>
     */
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
