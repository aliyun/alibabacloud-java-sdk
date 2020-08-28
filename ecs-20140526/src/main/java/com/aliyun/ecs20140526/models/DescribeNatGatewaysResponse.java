// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeNatGatewaysResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("NatGateways")
    @Validation(required = true)
    public DescribeNatGatewaysResponseNatGateways natGateways;

    public static DescribeNatGatewaysResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNatGatewaysResponse self = new DescribeNatGatewaysResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeNatGatewaysResponseNatGatewaysNatGatewayForwardTableIds extends TeaModel {
        // ForwardTableId
        @NameInMap("ForwardTableId")
        @Validation(required = true)
        public java.util.List<String> forwardTableId;

        public static DescribeNatGatewaysResponseNatGatewaysNatGatewayForwardTableIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewaysResponseNatGatewaysNatGatewayForwardTableIds self = new DescribeNatGatewaysResponseNatGatewaysNatGatewayForwardTableIds();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeNatGatewaysResponseNatGatewaysNatGatewayBandwidthPackageIds extends TeaModel {
        // BandwidthPackageId
        @NameInMap("BandwidthPackageId")
        @Validation(required = true)
        public java.util.List<String> bandwidthPackageId;

        public static DescribeNatGatewaysResponseNatGatewaysNatGatewayBandwidthPackageIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewaysResponseNatGatewaysNatGatewayBandwidthPackageIds self = new DescribeNatGatewaysResponseNatGatewaysNatGatewayBandwidthPackageIds();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeNatGatewaysResponseNatGatewaysNatGateway extends TeaModel {
        @NameInMap("NatGatewayId")
        @Validation(required = true)
        public String natGatewayId;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("VpcId")
        @Validation(required = true)
        public String vpcId;

        @NameInMap("Spec")
        @Validation(required = true)
        public String spec;

        @NameInMap("InstanceChargeType")
        @Validation(required = true)
        public String instanceChargeType;

        @NameInMap("BusinessStatus")
        @Validation(required = true)
        public String businessStatus;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("ForwardTableIds")
        @Validation(required = true)
        public DescribeNatGatewaysResponseNatGatewaysNatGatewayForwardTableIds forwardTableIds;

        @NameInMap("BandwidthPackageIds")
        @Validation(required = true)
        public DescribeNatGatewaysResponseNatGatewaysNatGatewayBandwidthPackageIds bandwidthPackageIds;

        public static DescribeNatGatewaysResponseNatGatewaysNatGateway build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewaysResponseNatGatewaysNatGateway self = new DescribeNatGatewaysResponseNatGatewaysNatGateway();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeNatGatewaysResponseNatGateways extends TeaModel {
        @NameInMap("NatGateway")
        @Validation(required = true)
        public java.util.List<DescribeNatGatewaysResponseNatGatewaysNatGateway> natGateway;

        public static DescribeNatGatewaysResponseNatGateways build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewaysResponseNatGateways self = new DescribeNatGatewaysResponseNatGateways();
            return TeaModel.build(map, self);
        }

    }

}
