// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeRouterInterfacesResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("RouterInterfaceSet")
    public DescribeRouterInterfacesResponseBodyRouterInterfaceSet routerInterfaceSet;

    public static DescribeRouterInterfacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRouterInterfacesResponseBody self = new DescribeRouterInterfacesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRouterInterfacesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeRouterInterfacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRouterInterfacesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRouterInterfacesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRouterInterfacesResponseBody setRouterInterfaceSet(DescribeRouterInterfacesResponseBodyRouterInterfaceSet routerInterfaceSet) {
        this.routerInterfaceSet = routerInterfaceSet;
        return this;
    }
    public DescribeRouterInterfacesResponseBodyRouterInterfaceSet getRouterInterfaceSet() {
        return this.routerInterfaceSet;
    }

    public static class DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType extends TeaModel {
        @NameInMap("HealthCheckTargetIp")
        public String healthCheckTargetIp;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("Spec")
        public String spec;

        @NameInMap("OppositeInterfaceId")
        public String oppositeInterfaceId;

        @NameInMap("RouterInterfaceId")
        public String routerInterfaceId;

        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("OppositeRouterType")
        public String oppositeRouterType;

        @NameInMap("OppositeInterfaceOwnerId")
        public String oppositeInterfaceOwnerId;

        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("OppositeRouterId")
        public String oppositeRouterId;

        @NameInMap("OppositeInterfaceSpec")
        public String oppositeInterfaceSpec;

        @NameInMap("RouterId")
        public String routerId;

        @NameInMap("OppositeInterfaceBusinessStatus")
        public String oppositeInterfaceBusinessStatus;

        @NameInMap("ConnectedTime")
        public String connectedTime;

        @NameInMap("HealthCheckSourceIp")
        public String healthCheckSourceIp;

        @NameInMap("OppositeInterfaceStatus")
        public String oppositeInterfaceStatus;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("OppositeRegionId")
        public String oppositeRegionId;

        @NameInMap("OppositeAccessPointId")
        public String oppositeAccessPointId;

        @NameInMap("BusinessStatus")
        public String businessStatus;

        @NameInMap("RouterType")
        public String routerType;

        @NameInMap("Role")
        public String role;

        @NameInMap("AccessPointId")
        public String accessPointId;

        public static DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType self = new DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType();
            return TeaModel.build(map, self);
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType setHealthCheckTargetIp(String healthCheckTargetIp) {
            this.healthCheckTargetIp = healthCheckTargetIp;
            return this;
        }
        public String getHealthCheckTargetIp() {
            return this.healthCheckTargetIp;
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType setOppositeInterfaceId(String oppositeInterfaceId) {
            this.oppositeInterfaceId = oppositeInterfaceId;
            return this;
        }
        public String getOppositeInterfaceId() {
            return this.oppositeInterfaceId;
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType setRouterInterfaceId(String routerInterfaceId) {
            this.routerInterfaceId = routerInterfaceId;
            return this;
        }
        public String getRouterInterfaceId() {
            return this.routerInterfaceId;
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType setOppositeRouterType(String oppositeRouterType) {
            this.oppositeRouterType = oppositeRouterType;
            return this;
        }
        public String getOppositeRouterType() {
            return this.oppositeRouterType;
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType setOppositeInterfaceOwnerId(String oppositeInterfaceOwnerId) {
            this.oppositeInterfaceOwnerId = oppositeInterfaceOwnerId;
            return this;
        }
        public String getOppositeInterfaceOwnerId() {
            return this.oppositeInterfaceOwnerId;
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType setOppositeRouterId(String oppositeRouterId) {
            this.oppositeRouterId = oppositeRouterId;
            return this;
        }
        public String getOppositeRouterId() {
            return this.oppositeRouterId;
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType setOppositeInterfaceSpec(String oppositeInterfaceSpec) {
            this.oppositeInterfaceSpec = oppositeInterfaceSpec;
            return this;
        }
        public String getOppositeInterfaceSpec() {
            return this.oppositeInterfaceSpec;
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType setRouterId(String routerId) {
            this.routerId = routerId;
            return this;
        }
        public String getRouterId() {
            return this.routerId;
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType setOppositeInterfaceBusinessStatus(String oppositeInterfaceBusinessStatus) {
            this.oppositeInterfaceBusinessStatus = oppositeInterfaceBusinessStatus;
            return this;
        }
        public String getOppositeInterfaceBusinessStatus() {
            return this.oppositeInterfaceBusinessStatus;
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType setConnectedTime(String connectedTime) {
            this.connectedTime = connectedTime;
            return this;
        }
        public String getConnectedTime() {
            return this.connectedTime;
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType setHealthCheckSourceIp(String healthCheckSourceIp) {
            this.healthCheckSourceIp = healthCheckSourceIp;
            return this;
        }
        public String getHealthCheckSourceIp() {
            return this.healthCheckSourceIp;
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType setOppositeInterfaceStatus(String oppositeInterfaceStatus) {
            this.oppositeInterfaceStatus = oppositeInterfaceStatus;
            return this;
        }
        public String getOppositeInterfaceStatus() {
            return this.oppositeInterfaceStatus;
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType setOppositeRegionId(String oppositeRegionId) {
            this.oppositeRegionId = oppositeRegionId;
            return this;
        }
        public String getOppositeRegionId() {
            return this.oppositeRegionId;
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType setOppositeAccessPointId(String oppositeAccessPointId) {
            this.oppositeAccessPointId = oppositeAccessPointId;
            return this;
        }
        public String getOppositeAccessPointId() {
            return this.oppositeAccessPointId;
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType setBusinessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType setRouterType(String routerType) {
            this.routerType = routerType;
            return this;
        }
        public String getRouterType() {
            return this.routerType;
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType setAccessPointId(String accessPointId) {
            this.accessPointId = accessPointId;
            return this;
        }
        public String getAccessPointId() {
            return this.accessPointId;
        }

    }

    public static class DescribeRouterInterfacesResponseBodyRouterInterfaceSet extends TeaModel {
        @NameInMap("RouterInterfaceType")
        public java.util.List<DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType> routerInterfaceType;

        public static DescribeRouterInterfacesResponseBodyRouterInterfaceSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouterInterfacesResponseBodyRouterInterfaceSet self = new DescribeRouterInterfacesResponseBodyRouterInterfaceSet();
            return TeaModel.build(map, self);
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSet setRouterInterfaceType(java.util.List<DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType> routerInterfaceType) {
            this.routerInterfaceType = routerInterfaceType;
            return this;
        }
        public java.util.List<DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType> getRouterInterfaceType() {
            return this.routerInterfaceType;
        }

    }

}
