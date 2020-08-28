// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeVirtualBorderRoutersResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("VirtualBorderRouterSet")
    @Validation(required = true)
    public DescribeVirtualBorderRoutersResponseVirtualBorderRouterSet virtualBorderRouterSet;

    public static DescribeVirtualBorderRoutersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVirtualBorderRoutersResponse self = new DescribeVirtualBorderRoutersResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeVirtualBorderRoutersResponseVirtualBorderRouterSetVirtualBorderRouterType extends TeaModel {
        @NameInMap("VbrId")
        @Validation(required = true)
        public String vbrId;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("ActivationTime")
        @Validation(required = true)
        public String activationTime;

        @NameInMap("TerminationTime")
        @Validation(required = true)
        public String terminationTime;

        @NameInMap("RecoveryTime")
        @Validation(required = true)
        public String recoveryTime;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("VlanId")
        @Validation(required = true)
        public Integer vlanId;

        @NameInMap("CircuitCode")
        @Validation(required = true)
        public String circuitCode;

        @NameInMap("RouteTableId")
        @Validation(required = true)
        public String routeTableId;

        @NameInMap("VlanInterfaceId")
        @Validation(required = true)
        public String vlanInterfaceId;

        @NameInMap("LocalGatewayIp")
        @Validation(required = true)
        public String localGatewayIp;

        @NameInMap("PeerGatewayIp")
        @Validation(required = true)
        public String peerGatewayIp;

        @NameInMap("PeeringSubnetMask")
        @Validation(required = true)
        public String peeringSubnetMask;

        @NameInMap("PhysicalConnectionId")
        @Validation(required = true)
        public String physicalConnectionId;

        @NameInMap("PhysicalConnectionStatus")
        @Validation(required = true)
        public String physicalConnectionStatus;

        @NameInMap("PhysicalConnectionBusinessStatus")
        @Validation(required = true)
        public String physicalConnectionBusinessStatus;

        @NameInMap("PhysicalConnectionOwnerUid")
        @Validation(required = true)
        public String physicalConnectionOwnerUid;

        @NameInMap("AccessPointId")
        @Validation(required = true)
        public String accessPointId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        public static DescribeVirtualBorderRoutersResponseVirtualBorderRouterSetVirtualBorderRouterType build(java.util.Map<String, ?> map) throws Exception {
            DescribeVirtualBorderRoutersResponseVirtualBorderRouterSetVirtualBorderRouterType self = new DescribeVirtualBorderRoutersResponseVirtualBorderRouterSetVirtualBorderRouterType();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVirtualBorderRoutersResponseVirtualBorderRouterSet extends TeaModel {
        @NameInMap("VirtualBorderRouterType")
        @Validation(required = true)
        public java.util.List<DescribeVirtualBorderRoutersResponseVirtualBorderRouterSetVirtualBorderRouterType> virtualBorderRouterType;

        public static DescribeVirtualBorderRoutersResponseVirtualBorderRouterSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeVirtualBorderRoutersResponseVirtualBorderRouterSet self = new DescribeVirtualBorderRoutersResponseVirtualBorderRouterSet();
            return TeaModel.build(map, self);
        }

    }

}
