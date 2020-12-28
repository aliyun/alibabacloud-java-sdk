// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeVRoutersResponseBody extends TeaModel {
    @NameInMap("VRouters")
    public java.util.List<DescribeVRoutersResponseBodyVRouters> VRouters;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    public static DescribeVRoutersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVRoutersResponseBody self = new DescribeVRoutersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVRoutersResponseBody setVRouters(java.util.List<DescribeVRoutersResponseBodyVRouters> VRouters) {
        this.VRouters = VRouters;
        return this;
    }
    public java.util.List<DescribeVRoutersResponseBodyVRouters> getVRouters() {
        return this.VRouters;
    }

    public DescribeVRoutersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeVRoutersResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVRoutersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVRoutersResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public static class DescribeVRoutersResponseBodyVRouters extends TeaModel {
        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("VRouterId")
        public String VRouterId;

        @NameInMap("Description")
        public String description;

        @NameInMap("VRouterName")
        public String VRouterName;

        @NameInMap("RouteTableIds")
        public java.util.List<String> routeTableIds;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribeVRoutersResponseBodyVRouters build(java.util.Map<String, ?> map) throws Exception {
            DescribeVRoutersResponseBodyVRouters self = new DescribeVRoutersResponseBodyVRouters();
            return TeaModel.build(map, self);
        }

        public DescribeVRoutersResponseBodyVRouters setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeVRoutersResponseBodyVRouters setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeVRoutersResponseBodyVRouters setVRouterId(String VRouterId) {
            this.VRouterId = VRouterId;
            return this;
        }
        public String getVRouterId() {
            return this.VRouterId;
        }

        public DescribeVRoutersResponseBodyVRouters setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeVRoutersResponseBodyVRouters setVRouterName(String VRouterName) {
            this.VRouterName = VRouterName;
            return this;
        }
        public String getVRouterName() {
            return this.VRouterName;
        }

        public DescribeVRoutersResponseBodyVRouters setRouteTableIds(java.util.List<String> routeTableIds) {
            this.routeTableIds = routeTableIds;
            return this;
        }
        public java.util.List<String> getRouteTableIds() {
            return this.routeTableIds;
        }

        public DescribeVRoutersResponseBodyVRouters setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
