// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class UpdateSecurityProxyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ips_server</p>
     */
    @NameInMap("Module")
    public String module;

    /**
     * <strong>example:</strong>
     * <p>9E2CCAB4-E789-5BC9-88DC-5CE0358E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateSecurityProxyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSecurityProxyResponseBody self = new UpdateSecurityProxyResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSecurityProxyResponseBody setModule(String module) {
        this.module = module;
        return this;
    }
    public String getModule() {
        return this.module;
    }

    public UpdateSecurityProxyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
