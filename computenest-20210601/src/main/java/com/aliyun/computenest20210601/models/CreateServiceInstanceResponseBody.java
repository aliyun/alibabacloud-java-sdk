// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class CreateServiceInstanceResponseBody extends TeaModel {
    @NameInMap("Status")
    public String status;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServiceInstanceId")
    public String serviceInstanceId;

    public static CreateServiceInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceInstanceResponseBody self = new CreateServiceInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateServiceInstanceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateServiceInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateServiceInstanceResponseBody setServiceInstanceId(String serviceInstanceId) {
        this.serviceInstanceId = serviceInstanceId;
        return this;
    }
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

}
