// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateNatGatewayResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ForwardTableIds")
    public java.util.List<String> forwardTableIds;

    @NameInMap("BandwidthPackageIds")
    public java.util.List<String> bandwidthPackageIds;

    @NameInMap("NatGatewayId")
    public String natGatewayId;

    public static CreateNatGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateNatGatewayResponseBody self = new CreateNatGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateNatGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateNatGatewayResponseBody setForwardTableIds(java.util.List<String> forwardTableIds) {
        this.forwardTableIds = forwardTableIds;
        return this;
    }
    public java.util.List<String> getForwardTableIds() {
        return this.forwardTableIds;
    }

    public CreateNatGatewayResponseBody setBandwidthPackageIds(java.util.List<String> bandwidthPackageIds) {
        this.bandwidthPackageIds = bandwidthPackageIds;
        return this;
    }
    public java.util.List<String> getBandwidthPackageIds() {
        return this.bandwidthPackageIds;
    }

    public CreateNatGatewayResponseBody setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

}
