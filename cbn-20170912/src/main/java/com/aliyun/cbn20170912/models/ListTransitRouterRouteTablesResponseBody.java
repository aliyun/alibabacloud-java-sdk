// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterRouteTablesResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("TransitRouterRouteTables")
    public java.util.List<ListTransitRouterRouteTablesResponseBodyTransitRouterRouteTables> transitRouterRouteTables;

    public static ListTransitRouterRouteTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTransitRouterRouteTablesResponseBody self = new ListTransitRouterRouteTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTransitRouterRouteTablesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTransitRouterRouteTablesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTransitRouterRouteTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTransitRouterRouteTablesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListTransitRouterRouteTablesResponseBody setTransitRouterRouteTables(java.util.List<ListTransitRouterRouteTablesResponseBodyTransitRouterRouteTables> transitRouterRouteTables) {
        this.transitRouterRouteTables = transitRouterRouteTables;
        return this;
    }
    public java.util.List<ListTransitRouterRouteTablesResponseBodyTransitRouterRouteTables> getTransitRouterRouteTables() {
        return this.transitRouterRouteTables;
    }

    public static class ListTransitRouterRouteTablesResponseBodyTransitRouterRouteTables extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("TransitRouterRouteTableDescription")
        public String transitRouterRouteTableDescription;

        @NameInMap("TransitRouterRouteTableId")
        public String transitRouterRouteTableId;

        @NameInMap("TransitRouterRouteTableName")
        public String transitRouterRouteTableName;

        @NameInMap("TransitRouterRouteTableStatus")
        public String transitRouterRouteTableStatus;

        @NameInMap("TransitRouterRouteTableType")
        public String transitRouterRouteTableType;

        public static ListTransitRouterRouteTablesResponseBodyTransitRouterRouteTables build(java.util.Map<String, ?> map) throws Exception {
            ListTransitRouterRouteTablesResponseBodyTransitRouterRouteTables self = new ListTransitRouterRouteTablesResponseBodyTransitRouterRouteTables();
            return TeaModel.build(map, self);
        }

        public ListTransitRouterRouteTablesResponseBodyTransitRouterRouteTables setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListTransitRouterRouteTablesResponseBodyTransitRouterRouteTables setTransitRouterRouteTableDescription(String transitRouterRouteTableDescription) {
            this.transitRouterRouteTableDescription = transitRouterRouteTableDescription;
            return this;
        }
        public String getTransitRouterRouteTableDescription() {
            return this.transitRouterRouteTableDescription;
        }

        public ListTransitRouterRouteTablesResponseBodyTransitRouterRouteTables setTransitRouterRouteTableId(String transitRouterRouteTableId) {
            this.transitRouterRouteTableId = transitRouterRouteTableId;
            return this;
        }
        public String getTransitRouterRouteTableId() {
            return this.transitRouterRouteTableId;
        }

        public ListTransitRouterRouteTablesResponseBodyTransitRouterRouteTables setTransitRouterRouteTableName(String transitRouterRouteTableName) {
            this.transitRouterRouteTableName = transitRouterRouteTableName;
            return this;
        }
        public String getTransitRouterRouteTableName() {
            return this.transitRouterRouteTableName;
        }

        public ListTransitRouterRouteTablesResponseBodyTransitRouterRouteTables setTransitRouterRouteTableStatus(String transitRouterRouteTableStatus) {
            this.transitRouterRouteTableStatus = transitRouterRouteTableStatus;
            return this;
        }
        public String getTransitRouterRouteTableStatus() {
            return this.transitRouterRouteTableStatus;
        }

        public ListTransitRouterRouteTablesResponseBodyTransitRouterRouteTables setTransitRouterRouteTableType(String transitRouterRouteTableType) {
            this.transitRouterRouteTableType = transitRouterRouteTableType;
            return this;
        }
        public String getTransitRouterRouteTableType() {
            return this.transitRouterRouteTableType;
        }

    }

}
