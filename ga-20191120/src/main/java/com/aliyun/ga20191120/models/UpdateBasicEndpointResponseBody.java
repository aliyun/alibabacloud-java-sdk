// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateBasicEndpointResponseBody extends TeaModel {
    @NameInMap("EndpointGroupId")
    public String endpointGroupId;

    @NameInMap("EndpointId")
    public String endpointId;

    @NameInMap("Name")
    public String name;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateBasicEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateBasicEndpointResponseBody self = new UpdateBasicEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateBasicEndpointResponseBody setEndpointGroupId(String endpointGroupId) {
        this.endpointGroupId = endpointGroupId;
        return this;
    }
    public String getEndpointGroupId() {
        return this.endpointGroupId;
    }

    public UpdateBasicEndpointResponseBody setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public UpdateBasicEndpointResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateBasicEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
