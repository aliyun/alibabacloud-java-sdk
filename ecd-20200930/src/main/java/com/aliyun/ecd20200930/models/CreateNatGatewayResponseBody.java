// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateNatGatewayResponseBody extends TeaModel {
    @NameInMap("ForwardTableIds")
    public java.util.List<String> forwardTableIds;

    @NameInMap("NatGatewayId")
    public String natGatewayId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SnatTableIds")
    public java.util.List<String> snatTableIds;

    public static CreateNatGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateNatGatewayResponseBody self = new CreateNatGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateNatGatewayResponseBody setForwardTableIds(java.util.List<String> forwardTableIds) {
        this.forwardTableIds = forwardTableIds;
        return this;
    }
    public java.util.List<String> getForwardTableIds() {
        return this.forwardTableIds;
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

    public CreateNatGatewayResponseBody setSnatTableIds(java.util.List<String> snatTableIds) {
        this.snatTableIds = snatTableIds;
        return this;
    }
    public java.util.List<String> getSnatTableIds() {
        return this.snatTableIds;
    }

}
