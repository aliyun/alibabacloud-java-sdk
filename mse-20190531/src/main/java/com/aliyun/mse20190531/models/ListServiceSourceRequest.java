// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListServiceSourceRequest extends TeaModel {
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    public static ListServiceSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServiceSourceRequest self = new ListServiceSourceRequest();
        return TeaModel.build(map, self);
    }

    public ListServiceSourceRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

}
