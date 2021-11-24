// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DeleteBasicEndpointGroupRequest extends TeaModel {
    // 客户端Token
    @NameInMap("ClientToken")
    public String clientToken;

    // 终端节点组Id
    @NameInMap("EndpointGroupId")
    public String endpointGroupId;

    public static DeleteBasicEndpointGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBasicEndpointGroupRequest self = new DeleteBasicEndpointGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBasicEndpointGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteBasicEndpointGroupRequest setEndpointGroupId(String endpointGroupId) {
        this.endpointGroupId = endpointGroupId;
        return this;
    }
    public String getEndpointGroupId() {
        return this.endpointGroupId;
    }

}
