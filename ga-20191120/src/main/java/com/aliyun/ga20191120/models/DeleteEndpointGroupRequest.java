// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DeleteEndpointGroupRequest extends TeaModel {
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("EndpointGroupId")
    public String endpointGroupId;

    public static DeleteEndpointGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEndpointGroupRequest self = new DeleteEndpointGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEndpointGroupRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public DeleteEndpointGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteEndpointGroupRequest setEndpointGroupId(String endpointGroupId) {
        this.endpointGroupId = endpointGroupId;
        return this;
    }
    public String getEndpointGroupId() {
        return this.endpointGroupId;
    }

}
