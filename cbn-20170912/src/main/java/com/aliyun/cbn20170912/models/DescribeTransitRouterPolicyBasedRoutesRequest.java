// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeTransitRouterPolicyBasedRoutesRequest extends TeaModel {
    /**
     * <p>The filter conditions.</p>
     * <p>You can specify up to 5 filter conditions at a time.</p>
     */
    @NameInMap("Filter")
    public java.util.List<DescribeTransitRouterPolicyBasedRoutesRequestFilter> filter;

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
     * <li>If <strong>NextToken</strong> is empty, no next query is available.</li>
     * <li>If <strong>NextToken</strong> returns a value, the value is the token used to start the next query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The instance ID of the policy-based routing table.</p>
     * 
     * <strong>example:</strong>
     * <p>ptbl-abc123xyz</p>
     */
    @NameInMap("PolicyTableId")
    public String policyTableId;

    public static DescribeTransitRouterPolicyBasedRoutesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTransitRouterPolicyBasedRoutesRequest self = new DescribeTransitRouterPolicyBasedRoutesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTransitRouterPolicyBasedRoutesRequest setFilter(java.util.List<DescribeTransitRouterPolicyBasedRoutesRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<DescribeTransitRouterPolicyBasedRoutesRequestFilter> getFilter() {
        return this.filter;
    }

    public DescribeTransitRouterPolicyBasedRoutesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeTransitRouterPolicyBasedRoutesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeTransitRouterPolicyBasedRoutesRequest setPolicyTableId(String policyTableId) {
        this.policyTableId = policyTableId;
        return this;
    }
    public String getPolicyTableId() {
        return this.policyTableId;
    }

    public static class DescribeTransitRouterPolicyBasedRoutesRequestFilter extends TeaModel {
        /**
         * <p>The filter condition. Valid values:</p>
         * <ul>
         * <li><strong>PolicyBasedRouteId</strong>: the instance ID of the policy-based routing rule.</li>
         * </ul>
         * <p>By default, multiple filter conditions are evaluated by using the <strong>AND</strong> operator. A resource is considered a match only if it meets all the filter conditions.</p>
         * <p>You can specify up to 5 filter conditions at a time.</p>
         * 
         * <strong>example:</strong>
         * <p>PolicyBasedRouteId</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the filter condition.</p>
         * <p>Specify the filter value based on <strong>Key</strong>. You can specify multiple filter values for a single <strong>Key</strong>. Multiple filter values are evaluated by using the <strong>OR</strong> operator. A resource is considered a match if it meets any of the filter values.</p>
         * <p>You can specify up to 5 filter values for a single filter condition.</p>
         */
        @NameInMap("Value")
        public java.util.List<String> value;

        public static DescribeTransitRouterPolicyBasedRoutesRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            DescribeTransitRouterPolicyBasedRoutesRequestFilter self = new DescribeTransitRouterPolicyBasedRoutesRequestFilter();
            return TeaModel.build(map, self);
        }

        public DescribeTransitRouterPolicyBasedRoutesRequestFilter setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeTransitRouterPolicyBasedRoutesRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

}
