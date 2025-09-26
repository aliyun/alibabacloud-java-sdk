// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class MCPServiceConfig extends TeaModel {
    @NameInMap("serviceId")
    public String serviceId;

    public static MCPServiceConfig build(java.util.Map<String, ?> map) throws Exception {
        MCPServiceConfig self = new MCPServiceConfig();
        return TeaModel.build(map, self);
    }

    public MCPServiceConfig setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

}
