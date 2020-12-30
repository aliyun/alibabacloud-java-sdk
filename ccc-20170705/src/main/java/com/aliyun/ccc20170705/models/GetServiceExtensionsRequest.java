// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetServiceExtensionsRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ServiceType")
    public String serviceType;

    public static GetServiceExtensionsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServiceExtensionsRequest self = new GetServiceExtensionsRequest();
        return TeaModel.build(map, self);
    }

    public GetServiceExtensionsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetServiceExtensionsRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

}
