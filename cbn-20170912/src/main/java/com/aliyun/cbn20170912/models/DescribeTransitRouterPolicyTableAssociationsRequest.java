// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeTransitRouterPolicyTableAssociationsRequest extends TeaModel {
    /**
     * <p>The information about filter conditions. </p>
     * <p>You can specify up to five filter conditions at a time.</p>
     */
    @NameInMap("Filter")
    public java.util.List<DescribeTransitRouterPolicyTableAssociationsRequestFilter> filter;

    /**
     * <p>The number of entries to return per page in a paginated query. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next query. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, it indicates that no next query is available.</li>
     * <li>If <strong>NextToken</strong> returns a value, the value is the token for the next query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static DescribeTransitRouterPolicyTableAssociationsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTransitRouterPolicyTableAssociationsRequest self = new DescribeTransitRouterPolicyTableAssociationsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTransitRouterPolicyTableAssociationsRequest setFilter(java.util.List<DescribeTransitRouterPolicyTableAssociationsRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<DescribeTransitRouterPolicyTableAssociationsRequestFilter> getFilter() {
        return this.filter;
    }

    public DescribeTransitRouterPolicyTableAssociationsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeTransitRouterPolicyTableAssociationsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public static class DescribeTransitRouterPolicyTableAssociationsRequestFilter extends TeaModel {
        /**
         * <p>The filter condition. Valid values:</p>
         * <ul>
         * <li><strong>PolicyTableId</strong>: The instance ID of the policy routing table.</li>
         * <li><strong>AttachmentId</strong>: The instance ID of the network connectivity instance.</li>
         * <li><strong>AssociationId</strong>: The instance ID of the policy routing table associate relationship.</li>
         * </ul>
         * <p>By default, multiple filter conditions are connected by the <strong>AND</strong> operator. A match is found only when all filter conditions are met.</p>
         * <p>You can specify up to five filter conditions at a time.</p>
         * 
         * <strong>example:</strong>
         * <p>CenId</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the filter condition.</p>
         * <p>Specify the filter value based on <strong>Key</strong>. You can specify multiple filter values for a single <strong>Key</strong>. Multiple filter values are connected by the <strong>OR</strong> operator. A match is found when any of the filter values is met.</p>
         * <p>You can specify up to five filter values for a single filter condition.</p>
         */
        @NameInMap("Value")
        public java.util.List<String> value;

        public static DescribeTransitRouterPolicyTableAssociationsRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            DescribeTransitRouterPolicyTableAssociationsRequestFilter self = new DescribeTransitRouterPolicyTableAssociationsRequestFilter();
            return TeaModel.build(map, self);
        }

        public DescribeTransitRouterPolicyTableAssociationsRequestFilter setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeTransitRouterPolicyTableAssociationsRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

}
