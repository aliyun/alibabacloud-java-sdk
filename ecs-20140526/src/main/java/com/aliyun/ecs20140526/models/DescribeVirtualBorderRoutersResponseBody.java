// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeVirtualBorderRoutersResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("VirtualBorderRouterSet")
    public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSet virtualBorderRouterSet;

    public static DescribeVirtualBorderRoutersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVirtualBorderRoutersResponseBody self = new DescribeVirtualBorderRoutersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVirtualBorderRoutersResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeVirtualBorderRoutersResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVirtualBorderRoutersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVirtualBorderRoutersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeVirtualBorderRoutersResponseBody setVirtualBorderRouterSet(DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSet virtualBorderRouterSet) {
        this.virtualBorderRouterSet = virtualBorderRouterSet;
        return this;
    }
    public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSet getVirtualBorderRouterSet() {
        return this.virtualBorderRouterSet;
    }

    public static class DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType extends TeaModel {
        @NameInMap("AccessPointId")
        public String accessPointId;

        @NameInMap("ActivationTime")
        public String activationTime;

        @NameInMap("CircuitCode")
        public String circuitCode;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("LocalGatewayIp")
        public String localGatewayIp;

        @NameInMap("Name")
        public String name;

        @NameInMap("PeerGatewayIp")
        public String peerGatewayIp;

        @NameInMap("PeeringSubnetMask")
        public String peeringSubnetMask;

        @NameInMap("PhysicalConnectionBusinessStatus")
        public String physicalConnectionBusinessStatus;

        @NameInMap("PhysicalConnectionId")
        public String physicalConnectionId;

        @NameInMap("PhysicalConnectionOwnerUid")
        public String physicalConnectionOwnerUid;

        @NameInMap("PhysicalConnectionStatus")
        public String physicalConnectionStatus;

        @NameInMap("RecoveryTime")
        public String recoveryTime;

        @NameInMap("RouteTableId")
        public String routeTableId;

        @NameInMap("Status")
        public String status;

        @NameInMap("TerminationTime")
        public String terminationTime;

        @NameInMap("VbrId")
        public String vbrId;

        @NameInMap("VlanId")
        public Integer vlanId;

        @NameInMap("VlanInterfaceId")
        public String vlanInterfaceId;

        public static DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType build(java.util.Map<String, ?> map) throws Exception {
            DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType self = new DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType();
            return TeaModel.build(map, self);
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType setAccessPointId(String accessPointId) {
            this.accessPointId = accessPointId;
            return this;
        }
        public String getAccessPointId() {
            return this.accessPointId;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType setActivationTime(String activationTime) {
            this.activationTime = activationTime;
            return this;
        }
        public String getActivationTime() {
            return this.activationTime;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType setCircuitCode(String circuitCode) {
            this.circuitCode = circuitCode;
            return this;
        }
        public String getCircuitCode() {
            return this.circuitCode;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType setLocalGatewayIp(String localGatewayIp) {
            this.localGatewayIp = localGatewayIp;
            return this;
        }
        public String getLocalGatewayIp() {
            return this.localGatewayIp;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType setPeerGatewayIp(String peerGatewayIp) {
            this.peerGatewayIp = peerGatewayIp;
            return this;
        }
        public String getPeerGatewayIp() {
            return this.peerGatewayIp;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType setPeeringSubnetMask(String peeringSubnetMask) {
            this.peeringSubnetMask = peeringSubnetMask;
            return this;
        }
        public String getPeeringSubnetMask() {
            return this.peeringSubnetMask;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType setPhysicalConnectionBusinessStatus(String physicalConnectionBusinessStatus) {
            this.physicalConnectionBusinessStatus = physicalConnectionBusinessStatus;
            return this;
        }
        public String getPhysicalConnectionBusinessStatus() {
            return this.physicalConnectionBusinessStatus;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType setPhysicalConnectionId(String physicalConnectionId) {
            this.physicalConnectionId = physicalConnectionId;
            return this;
        }
        public String getPhysicalConnectionId() {
            return this.physicalConnectionId;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType setPhysicalConnectionOwnerUid(String physicalConnectionOwnerUid) {
            this.physicalConnectionOwnerUid = physicalConnectionOwnerUid;
            return this;
        }
        public String getPhysicalConnectionOwnerUid() {
            return this.physicalConnectionOwnerUid;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType setPhysicalConnectionStatus(String physicalConnectionStatus) {
            this.physicalConnectionStatus = physicalConnectionStatus;
            return this;
        }
        public String getPhysicalConnectionStatus() {
            return this.physicalConnectionStatus;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType setRecoveryTime(String recoveryTime) {
            this.recoveryTime = recoveryTime;
            return this;
        }
        public String getRecoveryTime() {
            return this.recoveryTime;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType setRouteTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }
        public String getRouteTableId() {
            return this.routeTableId;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType setTerminationTime(String terminationTime) {
            this.terminationTime = terminationTime;
            return this;
        }
        public String getTerminationTime() {
            return this.terminationTime;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType setVbrId(String vbrId) {
            this.vbrId = vbrId;
            return this;
        }
        public String getVbrId() {
            return this.vbrId;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType setVlanId(Integer vlanId) {
            this.vlanId = vlanId;
            return this;
        }
        public Integer getVlanId() {
            return this.vlanId;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType setVlanInterfaceId(String vlanInterfaceId) {
            this.vlanInterfaceId = vlanInterfaceId;
            return this;
        }
        public String getVlanInterfaceId() {
            return this.vlanInterfaceId;
        }

    }

    public static class DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSet extends TeaModel {
        @NameInMap("VirtualBorderRouterType")
        public java.util.List<DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType> virtualBorderRouterType;

        public static DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSet self = new DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSet();
            return TeaModel.build(map, self);
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSet setVirtualBorderRouterType(java.util.List<DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType> virtualBorderRouterType) {
            this.virtualBorderRouterType = virtualBorderRouterType;
            return this;
        }
        public java.util.List<DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType> getVirtualBorderRouterType() {
            return this.virtualBorderRouterType;
        }

    }

}
