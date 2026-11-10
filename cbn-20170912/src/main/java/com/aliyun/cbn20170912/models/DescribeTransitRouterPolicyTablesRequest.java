// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeTransitRouterPolicyTablesRequest extends TeaModel {
    /**
     * <p>The filter conditions.</p>
     * <p>You can specify up to 5 filter conditions at a time.</p>
     */
    @NameInMap("Filter")
    public java.util.List<DescribeTransitRouterPolicyTablesRequestFilter> filter;

    /**
     * <p>The number of entries to return on each page. Valid values: 1 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next query. Valid values:</p>
     * <ul>
     * <li>If this is the first query or no subsequent query is required, you do not need to specify this parameter.</li>
     * <li>If a subsequent query is required, set the value to the NextToken value returned from the previous API call.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>dd20****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the Enterprise Edition transit router.</p>
     * 
     * <strong>example:</strong>
     * <p>tr-uf654ttymmljlvh2x****</p>
     */
    @NameInMap("TransitRouterId")
    public String transitRouterId;

    public static DescribeTransitRouterPolicyTablesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTransitRouterPolicyTablesRequest self = new DescribeTransitRouterPolicyTablesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTransitRouterPolicyTablesRequest setFilter(java.util.List<DescribeTransitRouterPolicyTablesRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<DescribeTransitRouterPolicyTablesRequestFilter> getFilter() {
        return this.filter;
    }

    public DescribeTransitRouterPolicyTablesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeTransitRouterPolicyTablesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeTransitRouterPolicyTablesRequest setTransitRouterId(String transitRouterId) {
        this.transitRouterId = transitRouterId;
        return this;
    }
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

    public static class DescribeTransitRouterPolicyTablesRequestFilter extends TeaModel {
        /**
         * <p>The filter condition. Valid values:</p>
         * <p>PolicyTableId: the ID of the Cloud Enterprise Network (CEN) instance.
         * By default, multiple filter conditions are combined with the AND operator. A resource is considered a match only if it meets all the filter conditions.</p>
         * <p>You can specify up to 5 filter conditions at a time.</p>
         * 
         * <strong>example:</strong>
         * <p>PolicyTableId</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the filter condition.</p>
         * <p>Specify the filter value based on the key. You can specify multiple values for a single key. Multiple values are combined with the OR operator. A resource is considered a match if it meets any of the values.</p>
         * <p>You can specify up to 5 values for each filter condition.</p>
         */
        @NameInMap("Value")
        public java.util.List<String> value;

        public static DescribeTransitRouterPolicyTablesRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            DescribeTransitRouterPolicyTablesRequestFilter self = new DescribeTransitRouterPolicyTablesRequestFilter();
            return TeaModel.build(map, self);
        }

        public DescribeTransitRouterPolicyTablesRequestFilter setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeTransitRouterPolicyTablesRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

}
