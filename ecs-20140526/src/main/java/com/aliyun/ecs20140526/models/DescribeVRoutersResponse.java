// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeVRoutersResponse extends TeaModel {
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

    @NameInMap("VRouters")
    @Validation(required = true)
    public DescribeVRoutersResponseVRouters VRouters;

    public static DescribeVRoutersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVRoutersResponse self = new DescribeVRoutersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVRoutersResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVRoutersResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeVRoutersResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeVRoutersResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVRoutersResponse setVRouters(DescribeVRoutersResponseVRouters VRouters) {
        this.VRouters = VRouters;
        return this;
    }
    public DescribeVRoutersResponseVRouters getVRouters() {
        return this.VRouters;
    }

    public static class DescribeVRoutersResponseVRoutersVRouterRouteTableIds extends TeaModel {
        // RouteTableId
        @NameInMap("RouteTableId")
        @Validation(required = true)
        public java.util.List<String> routeTableId;

        public static DescribeVRoutersResponseVRoutersVRouterRouteTableIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeVRoutersResponseVRoutersVRouterRouteTableIds self = new DescribeVRoutersResponseVRoutersVRouterRouteTableIds();
            return TeaModel.build(map, self);
        }

        public DescribeVRoutersResponseVRoutersVRouterRouteTableIds setRouteTableId(java.util.List<String> routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }
        public java.util.List<String> getRouteTableId() {
            return this.routeTableId;
        }

    }

    public static class DescribeVRoutersResponseVRoutersVRouter extends TeaModel {
        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("VpcId")
        @Validation(required = true)
        public String vpcId;

        @NameInMap("VRouterName")
        @Validation(required = true)
        public String VRouterName;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("VRouterId")
        @Validation(required = true)
        public String VRouterId;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("RouteTableIds")
        @Validation(required = true)
        public DescribeVRoutersResponseVRoutersVRouterRouteTableIds routeTableIds;

        public static DescribeVRoutersResponseVRoutersVRouter build(java.util.Map<String, ?> map) throws Exception {
            DescribeVRoutersResponseVRoutersVRouter self = new DescribeVRoutersResponseVRoutersVRouter();
            return TeaModel.build(map, self);
        }

        public DescribeVRoutersResponseVRoutersVRouter setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeVRoutersResponseVRoutersVRouter setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeVRoutersResponseVRoutersVRouter setVRouterName(String VRouterName) {
            this.VRouterName = VRouterName;
            return this;
        }
        public String getVRouterName() {
            return this.VRouterName;
        }

        public DescribeVRoutersResponseVRoutersVRouter setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeVRoutersResponseVRoutersVRouter setVRouterId(String VRouterId) {
            this.VRouterId = VRouterId;
            return this;
        }
        public String getVRouterId() {
            return this.VRouterId;
        }

        public DescribeVRoutersResponseVRoutersVRouter setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeVRoutersResponseVRoutersVRouter setRouteTableIds(DescribeVRoutersResponseVRoutersVRouterRouteTableIds routeTableIds) {
            this.routeTableIds = routeTableIds;
            return this;
        }
        public DescribeVRoutersResponseVRoutersVRouterRouteTableIds getRouteTableIds() {
            return this.routeTableIds;
        }

    }

    public static class DescribeVRoutersResponseVRouters extends TeaModel {
        @NameInMap("VRouter")
        @Validation(required = true)
        public java.util.List<DescribeVRoutersResponseVRoutersVRouter> VRouter;

        public static DescribeVRoutersResponseVRouters build(java.util.Map<String, ?> map) throws Exception {
            DescribeVRoutersResponseVRouters self = new DescribeVRoutersResponseVRouters();
            return TeaModel.build(map, self);
        }

        public DescribeVRoutersResponseVRouters setVRouter(java.util.List<DescribeVRoutersResponseVRoutersVRouter> VRouter) {
            this.VRouter = VRouter;
            return this;
        }
        public java.util.List<DescribeVRoutersResponseVRoutersVRouter> getVRouter() {
            return this.VRouter;
        }

    }

}
