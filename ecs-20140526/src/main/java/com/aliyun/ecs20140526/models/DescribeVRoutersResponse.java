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

    public static class DescribeVRoutersResponseVRoutersVRouterRouteTableIds extends TeaModel {
        // RouteTableId
        @NameInMap("RouteTableId")
        @Validation(required = true)
        public java.util.List<String> routeTableId;

        public static DescribeVRoutersResponseVRoutersVRouterRouteTableIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeVRoutersResponseVRoutersVRouterRouteTableIds self = new DescribeVRoutersResponseVRoutersVRouterRouteTableIds();
            return TeaModel.build(map, self);
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

    }

    public static class DescribeVRoutersResponseVRouters extends TeaModel {
        @NameInMap("VRouter")
        @Validation(required = true)
        public java.util.List<DescribeVRoutersResponseVRoutersVRouter> VRouter;

        public static DescribeVRoutersResponseVRouters build(java.util.Map<String, ?> map) throws Exception {
            DescribeVRoutersResponseVRouters self = new DescribeVRoutersResponseVRouters();
            return TeaModel.build(map, self);
        }

    }

}
