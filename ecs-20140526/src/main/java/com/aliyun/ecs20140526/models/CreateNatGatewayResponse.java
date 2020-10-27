// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateNatGatewayResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("NatGatewayId")
    @Validation(required = true)
    public String natGatewayId;

    @NameInMap("ForwardTableIds")
    @Validation(required = true)
    public CreateNatGatewayResponseForwardTableIds forwardTableIds;

    @NameInMap("BandwidthPackageIds")
    @Validation(required = true)
    public CreateNatGatewayResponseBandwidthPackageIds bandwidthPackageIds;

    public static CreateNatGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateNatGatewayResponse self = new CreateNatGatewayResponse();
        return TeaModel.build(map, self);
    }

    public CreateNatGatewayResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateNatGatewayResponse setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public CreateNatGatewayResponse setForwardTableIds(CreateNatGatewayResponseForwardTableIds forwardTableIds) {
        this.forwardTableIds = forwardTableIds;
        return this;
    }
    public CreateNatGatewayResponseForwardTableIds getForwardTableIds() {
        return this.forwardTableIds;
    }

    public CreateNatGatewayResponse setBandwidthPackageIds(CreateNatGatewayResponseBandwidthPackageIds bandwidthPackageIds) {
        this.bandwidthPackageIds = bandwidthPackageIds;
        return this;
    }
    public CreateNatGatewayResponseBandwidthPackageIds getBandwidthPackageIds() {
        return this.bandwidthPackageIds;
    }

    public static class CreateNatGatewayResponseForwardTableIds extends TeaModel {
        @NameInMap("ForwardTableId")
        @Validation(required = true)
        public java.util.List<String> forwardTableId;

        public static CreateNatGatewayResponseForwardTableIds build(java.util.Map<String, ?> map) throws Exception {
            CreateNatGatewayResponseForwardTableIds self = new CreateNatGatewayResponseForwardTableIds();
            return TeaModel.build(map, self);
        }

        public CreateNatGatewayResponseForwardTableIds setForwardTableId(java.util.List<String> forwardTableId) {
            this.forwardTableId = forwardTableId;
            return this;
        }
        public java.util.List<String> getForwardTableId() {
            return this.forwardTableId;
        }

    }

    public static class CreateNatGatewayResponseBandwidthPackageIds extends TeaModel {
        @NameInMap("BandwidthPackageId")
        @Validation(required = true)
        public java.util.List<String> bandwidthPackageId;

        public static CreateNatGatewayResponseBandwidthPackageIds build(java.util.Map<String, ?> map) throws Exception {
            CreateNatGatewayResponseBandwidthPackageIds self = new CreateNatGatewayResponseBandwidthPackageIds();
            return TeaModel.build(map, self);
        }

        public CreateNatGatewayResponseBandwidthPackageIds setBandwidthPackageId(java.util.List<String> bandwidthPackageId) {
            this.bandwidthPackageId = bandwidthPackageId;
            return this;
        }
        public java.util.List<String> getBandwidthPackageId() {
            return this.bandwidthPackageId;
        }

    }

}
