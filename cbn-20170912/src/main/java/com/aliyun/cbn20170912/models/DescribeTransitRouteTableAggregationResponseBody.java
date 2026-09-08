// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeTransitRouteTableAggregationResponseBody extends TeaModel {
    /**
     * <p>The number of entries per page for a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The list of aggregate route information.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeTransitRouteTableAggregationResponseBodyData> data;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, no next query exists.</li>
     * <li>If <strong>NextToken</strong> is returned, the value indicates the token for the next query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0C2EE7A8-74D4-4081-8236-CEBDE3BBCF50</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static DescribeTransitRouteTableAggregationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTransitRouteTableAggregationResponseBody self = new DescribeTransitRouteTableAggregationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTransitRouteTableAggregationResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DescribeTransitRouteTableAggregationResponseBody setData(java.util.List<DescribeTransitRouteTableAggregationResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeTransitRouteTableAggregationResponseBodyData> getData() {
        return this.data;
    }

    public DescribeTransitRouteTableAggregationResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeTransitRouteTableAggregationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTransitRouteTableAggregationResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class DescribeTransitRouteTableAggregationResponseBodyData extends TeaModel {
        /**
         * <p>The description of the aggregate route.</p>
         * 
         * <strong>example:</strong>
         * <p>desctest</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the aggregate route.</p>
         * 
         * <strong>example:</strong>
         * <p>nametest</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The routing type of the aggregation route.</p>
         * <p>The value is <strong>Static</strong> only, which indicates a static route. After the aggregation route is propagated to a VPC-connected instance, it becomes a custom route entry by default.</p>
         * 
         * <strong>example:</strong>
         * <p>Static</p>
         */
        @NameInMap("RouteType")
        public String routeType;

        /**
         * <p>The propagation scope of the aggregation route.</p>
         * <p>The value is <strong>VPC</strong> only, which indicates that the aggregation route is propagated to all VPC-connected instances that have established associated forwarding relationships with the current Enterprise Edition transit router route table and have the route synchronization feature enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("Scope")
        public String scope;

        /**
         * <p>The propagation scope list of the aggregate route.</p>
         * <blockquote>
         * <p>You must specify at least one of the propagation scope or the propagation scope list for the aggregate route. We recommend that you use the propagation scope list. Elements in the propagation scope list cannot duplicate the value of the propagation scope.</p>
         * </blockquote>
         */
        @NameInMap("ScopeList")
        public java.util.List<String> scopeList;

        /**
         * <p>The propagation status of the aggregation route.</p>
         * <ul>
         * <li><strong>AllConfigured</strong>: The aggregation routing has been propagated to all VPC-connected instances.</li>
         * <li><strong>Configuring</strong>: The aggregation routing is being propagated.</li>
         * <li><strong>ConfigFailed</strong>: The aggregation routing failed to be propagated.</li>
         * <li><strong>PartialConfigured</strong>: The aggregation routing failed to be propagated to some VPC-connected instances.</li>
         * <li><strong>Deleting</strong>: The aggregation routing is being deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AllConfigured</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the Enterprise Edition transit router route table.</p>
         * 
         * <strong>example:</strong>
         * <p>vtb-6ehgc262hr170qgyc****</p>
         */
        @NameInMap("TrRouteTableId")
        public String trRouteTableId;

        /**
         * <p>The destination CIDR block of the aggregate route.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.10.0/24</p>
         */
        @NameInMap("TransitRouteTableAggregationCidr")
        public String transitRouteTableAggregationCidr;

        public static DescribeTransitRouteTableAggregationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeTransitRouteTableAggregationResponseBodyData self = new DescribeTransitRouteTableAggregationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeTransitRouteTableAggregationResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeTransitRouteTableAggregationResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeTransitRouteTableAggregationResponseBodyData setRouteType(String routeType) {
            this.routeType = routeType;
            return this;
        }
        public String getRouteType() {
            return this.routeType;
        }

        public DescribeTransitRouteTableAggregationResponseBodyData setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public DescribeTransitRouteTableAggregationResponseBodyData setScopeList(java.util.List<String> scopeList) {
            this.scopeList = scopeList;
            return this;
        }
        public java.util.List<String> getScopeList() {
            return this.scopeList;
        }

        public DescribeTransitRouteTableAggregationResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeTransitRouteTableAggregationResponseBodyData setTrRouteTableId(String trRouteTableId) {
            this.trRouteTableId = trRouteTableId;
            return this;
        }
        public String getTrRouteTableId() {
            return this.trRouteTableId;
        }

        public DescribeTransitRouteTableAggregationResponseBodyData setTransitRouteTableAggregationCidr(String transitRouteTableAggregationCidr) {
            this.transitRouteTableAggregationCidr = transitRouteTableAggregationCidr;
            return this;
        }
        public String getTransitRouteTableAggregationCidr() {
            return this.transitRouteTableAggregationCidr;
        }

    }

}
