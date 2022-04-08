// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateNatGatewayResponseBody extends TeaModel {
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static CreateNatGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateNatGatewayResponseBody self = new CreateNatGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateNatGatewayResponseBody setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public CreateNatGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
