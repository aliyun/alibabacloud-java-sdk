// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListGatewayDomainRequest extends TeaModel {
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    public static ListGatewayDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayDomainRequest self = new ListGatewayDomainRequest();
        return TeaModel.build(map, self);
    }

    public ListGatewayDomainRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

}
