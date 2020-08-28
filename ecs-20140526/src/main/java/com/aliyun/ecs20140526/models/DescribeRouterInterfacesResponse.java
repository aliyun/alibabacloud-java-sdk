// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeRouterInterfacesResponse extends TeaModel {
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

    @NameInMap("RouterInterfaceSet")
    @Validation(required = true)
    public DescribeRouterInterfacesResponseRouterInterfaceSet routerInterfaceSet;

    public static DescribeRouterInterfacesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRouterInterfacesResponse self = new DescribeRouterInterfacesResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeRouterInterfacesResponseRouterInterfaceSetRouterInterfaceType extends TeaModel {
        @NameInMap("RouterInterfaceId")
        @Validation(required = true)
        public String routerInterfaceId;

        @NameInMap("OppositeRegionId")
        @Validation(required = true)
        public String oppositeRegionId;

        @NameInMap("Role")
        @Validation(required = true)
        public String role;

        @NameInMap("Spec")
        @Validation(required = true)
        public String spec;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("RouterId")
        @Validation(required = true)
        public String routerId;

        @NameInMap("RouterType")
        @Validation(required = true)
        public String routerType;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public String endTime;

        @NameInMap("ChargeType")
        @Validation(required = true)
        public String chargeType;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("BusinessStatus")
        @Validation(required = true)
        public String businessStatus;

        @NameInMap("ConnectedTime")
        @Validation(required = true)
        public String connectedTime;

        @NameInMap("OppositeInterfaceId")
        @Validation(required = true)
        public String oppositeInterfaceId;

        @NameInMap("OppositeInterfaceSpec")
        @Validation(required = true)
        public String oppositeInterfaceSpec;

        @NameInMap("OppositeInterfaceStatus")
        @Validation(required = true)
        public String oppositeInterfaceStatus;

        @NameInMap("OppositeInterfaceBusinessStatus")
        @Validation(required = true)
        public String oppositeInterfaceBusinessStatus;

        @NameInMap("OppositeRouterId")
        @Validation(required = true)
        public String oppositeRouterId;

        @NameInMap("OppositeRouterType")
        @Validation(required = true)
        public String oppositeRouterType;

        @NameInMap("OppositeInterfaceOwnerId")
        @Validation(required = true)
        public String oppositeInterfaceOwnerId;

        @NameInMap("AccessPointId")
        @Validation(required = true)
        public String accessPointId;

        @NameInMap("OppositeAccessPointId")
        @Validation(required = true)
        public String oppositeAccessPointId;

        @NameInMap("HealthCheckSourceIp")
        @Validation(required = true)
        public String healthCheckSourceIp;

        @NameInMap("HealthCheckTargetIp")
        @Validation(required = true)
        public String healthCheckTargetIp;

        public static DescribeRouterInterfacesResponseRouterInterfaceSetRouterInterfaceType build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouterInterfacesResponseRouterInterfaceSetRouterInterfaceType self = new DescribeRouterInterfacesResponseRouterInterfaceSetRouterInterfaceType();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeRouterInterfacesResponseRouterInterfaceSet extends TeaModel {
        @NameInMap("RouterInterfaceType")
        @Validation(required = true)
        public java.util.List<DescribeRouterInterfacesResponseRouterInterfaceSetRouterInterfaceType> routerInterfaceType;

        public static DescribeRouterInterfacesResponseRouterInterfaceSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouterInterfacesResponseRouterInterfaceSet self = new DescribeRouterInterfacesResponseRouterInterfaceSet();
            return TeaModel.build(map, self);
        }

    }

}
