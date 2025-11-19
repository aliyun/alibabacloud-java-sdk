// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class DeregisterServiceInput extends TeaModel {
    /**
     * <p>要注销的服务名称（UUID格式）</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678-1234-1234-1234-123456789abc</p>
     */
    @NameInMap("serviceName")
    public String serviceName;

    public static DeregisterServiceInput build(java.util.Map<String, ?> map) throws Exception {
        DeregisterServiceInput self = new DeregisterServiceInput();
        return TeaModel.build(map, self);
    }

    public DeregisterServiceInput setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

}
