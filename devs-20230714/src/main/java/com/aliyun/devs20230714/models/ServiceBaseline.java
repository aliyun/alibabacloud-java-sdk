// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ServiceBaseline extends TeaModel {
    @NameInMap("serviceInstance")
    public ServiceInstance serviceInstance;

    public static ServiceBaseline build(java.util.Map<String, ?> map) throws Exception {
        ServiceBaseline self = new ServiceBaseline();
        return TeaModel.build(map, self);
    }

    public ServiceBaseline setServiceInstance(ServiceInstance serviceInstance) {
        this.serviceInstance = serviceInstance;
        return this;
    }
    public ServiceInstance getServiceInstance() {
        return this.serviceInstance;
    }

}
