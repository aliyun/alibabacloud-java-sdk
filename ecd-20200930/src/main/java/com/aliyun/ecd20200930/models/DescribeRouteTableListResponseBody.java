// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeRouteTableListResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RouteTableList")
    public java.util.List<DescribeRouteTableListResponseBodyRouteTableList> routeTableList;

    public static DescribeRouteTableListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRouteTableListResponseBody self = new DescribeRouteTableListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRouteTableListResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeRouteTableListResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeRouteTableListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRouteTableListResponseBody setRouteTableList(java.util.List<DescribeRouteTableListResponseBodyRouteTableList> routeTableList) {
        this.routeTableList = routeTableList;
        return this;
    }
    public java.util.List<DescribeRouteTableListResponseBodyRouteTableList> getRouteTableList() {
        return this.routeTableList;
    }

    public static class DescribeRouteTableListResponseBodyRouteTableList extends TeaModel {
        @NameInMap("AssociateType")
        public String associateType;

        @NameInMap("RouteTableId")
        public String routeTableId;

        @NameInMap("RouteTableType")
        public String routeTableType;

        @NameInMap("RouterType")
        public String routerType;

        @NameInMap("Status")
        public String status;

        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeRouteTableListResponseBodyRouteTableList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteTableListResponseBodyRouteTableList self = new DescribeRouteTableListResponseBodyRouteTableList();
            return TeaModel.build(map, self);
        }

        public DescribeRouteTableListResponseBodyRouteTableList setAssociateType(String associateType) {
            this.associateType = associateType;
            return this;
        }
        public String getAssociateType() {
            return this.associateType;
        }

        public DescribeRouteTableListResponseBodyRouteTableList setRouteTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }
        public String getRouteTableId() {
            return this.routeTableId;
        }

        public DescribeRouteTableListResponseBodyRouteTableList setRouteTableType(String routeTableType) {
            this.routeTableType = routeTableType;
            return this;
        }
        public String getRouteTableType() {
            return this.routeTableType;
        }

        public DescribeRouteTableListResponseBodyRouteTableList setRouterType(String routerType) {
            this.routerType = routerType;
            return this;
        }
        public String getRouterType() {
            return this.routerType;
        }

        public DescribeRouteTableListResponseBodyRouteTableList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeRouteTableListResponseBodyRouteTableList setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public DescribeRouteTableListResponseBodyRouteTableList setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
