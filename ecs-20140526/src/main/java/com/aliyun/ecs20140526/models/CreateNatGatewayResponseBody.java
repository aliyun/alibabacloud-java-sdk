// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateNatGatewayResponseBody extends TeaModel {
    @NameInMap("BandwidthPackageIds")
    public CreateNatGatewayResponseBodyBandwidthPackageIds bandwidthPackageIds;

    @NameInMap("ForwardTableIds")
    public CreateNatGatewayResponseBodyForwardTableIds forwardTableIds;

    @NameInMap("NatGatewayId")
    public String natGatewayId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateNatGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateNatGatewayResponseBody self = new CreateNatGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateNatGatewayResponseBody setBandwidthPackageIds(CreateNatGatewayResponseBodyBandwidthPackageIds bandwidthPackageIds) {
        this.bandwidthPackageIds = bandwidthPackageIds;
        return this;
    }
    public CreateNatGatewayResponseBodyBandwidthPackageIds getBandwidthPackageIds() {
        return this.bandwidthPackageIds;
    }

    public CreateNatGatewayResponseBody setForwardTableIds(CreateNatGatewayResponseBodyForwardTableIds forwardTableIds) {
        this.forwardTableIds = forwardTableIds;
        return this;
    }
    public CreateNatGatewayResponseBodyForwardTableIds getForwardTableIds() {
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

    public static class CreateNatGatewayResponseBodyBandwidthPackageIds extends TeaModel {
        @NameInMap("BandwidthPackageId")
        public java.util.List<String> bandwidthPackageId;

        public static CreateNatGatewayResponseBodyBandwidthPackageIds build(java.util.Map<String, ?> map) throws Exception {
            CreateNatGatewayResponseBodyBandwidthPackageIds self = new CreateNatGatewayResponseBodyBandwidthPackageIds();
            return TeaModel.build(map, self);
        }

        public CreateNatGatewayResponseBodyBandwidthPackageIds setBandwidthPackageId(java.util.List<String> bandwidthPackageId) {
            this.bandwidthPackageId = bandwidthPackageId;
            return this;
        }
        public java.util.List<String> getBandwidthPackageId() {
            return this.bandwidthPackageId;
        }

    }

    public static class CreateNatGatewayResponseBodyForwardTableIds extends TeaModel {
        @NameInMap("ForwardTableId")
        public java.util.List<String> forwardTableId;

        public static CreateNatGatewayResponseBodyForwardTableIds build(java.util.Map<String, ?> map) throws Exception {
            CreateNatGatewayResponseBodyForwardTableIds self = new CreateNatGatewayResponseBodyForwardTableIds();
            return TeaModel.build(map, self);
        }

        public CreateNatGatewayResponseBodyForwardTableIds setForwardTableId(java.util.List<String> forwardTableId) {
            this.forwardTableId = forwardTableId;
            return this;
        }
        public java.util.List<String> getForwardTableId() {
            return this.forwardTableId;
        }

    }

}
