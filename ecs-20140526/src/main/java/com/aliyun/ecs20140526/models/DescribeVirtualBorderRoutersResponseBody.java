// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeVirtualBorderRoutersResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("VirtualBorderRouterSet")
    public java.util.List<DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSet> virtualBorderRouterSet;

    public static DescribeVirtualBorderRoutersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVirtualBorderRoutersResponseBody self = new DescribeVirtualBorderRoutersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVirtualBorderRoutersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeVirtualBorderRoutersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVirtualBorderRoutersResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVirtualBorderRoutersResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeVirtualBorderRoutersResponseBody setVirtualBorderRouterSet(java.util.List<DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSet> virtualBorderRouterSet) {
        this.virtualBorderRouterSet = virtualBorderRouterSet;
        return this;
    }
    public java.util.List<DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSet> getVirtualBorderRouterSet() {
        return this.virtualBorderRouterSet;
    }

    public static class DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSet extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("VlanInterfaceId")
        public String vlanInterfaceId;

        @NameInMap("CircuitCode")
        public String circuitCode;

        @NameInMap("PhysicalConnectionOwnerUid")
        public String physicalConnectionOwnerUid;

        @NameInMap("LocalGatewayIp")
        public String localGatewayIp;

        @NameInMap("ActivationTime")
        public String activationTime;

        @NameInMap("PhysicalConnectionBusinessStatus")
        public String physicalConnectionBusinessStatus;

        @NameInMap("PeeringSubnetMask")
        public String peeringSubnetMask;

        @NameInMap("RouteTableId")
        public String routeTableId;

        @NameInMap("Description")
        public String description;

        @NameInMap("PhysicalConnectionStatus")
        public String physicalConnectionStatus;

        @NameInMap("RecoveryTime")
        public String recoveryTime;

        @NameInMap("TerminationTime")
        public String terminationTime;

        @NameInMap("PeerGatewayIp")
        public String peerGatewayIp;

        @NameInMap("Name")
        public String name;

        @NameInMap("AccessPointId")
        public String accessPointId;

        @NameInMap("VbrId")
        public String vbrId;

        @NameInMap("PhysicalConnectionId")
        public String physicalConnectionId;

        @NameInMap("VlanId")
        public Integer vlanId;

        public static DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSet self = new DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSet();
            return TeaModel.build(map, self);
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSet setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSet setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSet setVlanInterfaceId(String vlanInterfaceId) {
            this.vlanInterfaceId = vlanInterfaceId;
            return this;
        }
        public String getVlanInterfaceId() {
            return this.vlanInterfaceId;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSet setCircuitCode(String circuitCode) {
            this.circuitCode = circuitCode;
            return this;
        }
        public String getCircuitCode() {
            return this.circuitCode;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSet setPhysicalConnectionOwnerUid(String physicalConnectionOwnerUid) {
            this.physicalConnectionOwnerUid = physicalConnectionOwnerUid;
            return this;
        }
        public String getPhysicalConnectionOwnerUid() {
            return this.physicalConnectionOwnerUid;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSet setLocalGatewayIp(String localGatewayIp) {
            this.localGatewayIp = localGatewayIp;
            return this;
        }
        public String getLocalGatewayIp() {
            return this.localGatewayIp;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSet setActivationTime(String activationTime) {
            this.activationTime = activationTime;
            return this;
        }
        public String getActivationTime() {
            return this.activationTime;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSet setPhysicalConnectionBusinessStatus(String physicalConnectionBusinessStatus) {
            this.physicalConnectionBusinessStatus = physicalConnectionBusinessStatus;
            return this;
        }
        public String getPhysicalConnectionBusinessStatus() {
            return this.physicalConnectionBusinessStatus;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSet setPeeringSubnetMask(String peeringSubnetMask) {
            this.peeringSubnetMask = peeringSubnetMask;
            return this;
        }
        public String getPeeringSubnetMask() {
            return this.peeringSubnetMask;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSet setRouteTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }
        public String getRouteTableId() {
            return this.routeTableId;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSet setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSet setPhysicalConnectionStatus(String physicalConnectionStatus) {
            this.physicalConnectionStatus = physicalConnectionStatus;
            return this;
        }
        public String getPhysicalConnectionStatus() {
            return this.physicalConnectionStatus;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSet setRecoveryTime(String recoveryTime) {
            this.recoveryTime = recoveryTime;
            return this;
        }
        public String getRecoveryTime() {
            return this.recoveryTime;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSet setTerminationTime(String terminationTime) {
            this.terminationTime = terminationTime;
            return this;
        }
        public String getTerminationTime() {
            return this.terminationTime;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSet setPeerGatewayIp(String peerGatewayIp) {
            this.peerGatewayIp = peerGatewayIp;
            return this;
        }
        public String getPeerGatewayIp() {
            return this.peerGatewayIp;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSet setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSet setAccessPointId(String accessPointId) {
            this.accessPointId = accessPointId;
            return this;
        }
        public String getAccessPointId() {
            return this.accessPointId;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSet setVbrId(String vbrId) {
            this.vbrId = vbrId;
            return this;
        }
        public String getVbrId() {
            return this.vbrId;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSet setPhysicalConnectionId(String physicalConnectionId) {
            this.physicalConnectionId = physicalConnectionId;
            return this;
        }
        public String getPhysicalConnectionId() {
            return this.physicalConnectionId;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSet setVlanId(Integer vlanId) {
            this.vlanId = vlanId;
            return this;
        }
        public Integer getVlanId() {
            return this.vlanId;
        }

    }

}
