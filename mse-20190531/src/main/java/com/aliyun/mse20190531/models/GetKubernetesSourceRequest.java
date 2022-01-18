// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetKubernetesSourceRequest extends TeaModel {
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    public static GetKubernetesSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetKubernetesSourceRequest self = new GetKubernetesSourceRequest();
        return TeaModel.build(map, self);
    }

    public GetKubernetesSourceRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

}
