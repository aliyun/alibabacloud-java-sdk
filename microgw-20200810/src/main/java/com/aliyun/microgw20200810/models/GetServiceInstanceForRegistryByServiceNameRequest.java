// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class GetServiceInstanceForRegistryByServiceNameRequest extends TeaModel {
    // serviceName
    @NameInMap("serviceName")
    public String serviceName;

    public static GetServiceInstanceForRegistryByServiceNameRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServiceInstanceForRegistryByServiceNameRequest self = new GetServiceInstanceForRegistryByServiceNameRequest();
        return TeaModel.build(map, self);
    }

    public GetServiceInstanceForRegistryByServiceNameRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

}
