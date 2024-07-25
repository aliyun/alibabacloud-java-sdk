// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GatewayInfo extends TeaModel {
    @NameInMap("gatewayId")
    public String gatewayId;

    @NameInMap("name")
    public String name;

    public static GatewayInfo build(java.util.Map<String, ?> map) throws Exception {
        GatewayInfo self = new GatewayInfo();
        return TeaModel.build(map, self);
    }

    public GatewayInfo setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public GatewayInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
