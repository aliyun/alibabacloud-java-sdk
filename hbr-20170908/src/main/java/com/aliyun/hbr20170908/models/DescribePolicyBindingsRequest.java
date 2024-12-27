// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribePolicyBindingsRequest extends TeaModel {
    /**
     * <p>List of data source IDs.</p>
     */
    @NameInMap("DataSourceIds")
    public java.util.List<String> dataSourceIds;

    /**
     * <p>Query filters.</p>
     */
    @NameInMap("Filters")
    public java.util.List<DescribePolicyBindingsRequestFilters> filters;

    /**
     * <p>Number of results per query.</p>
     * <p>Range: 10~100. Default: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Token required to fetch the next page of policy and data source associations.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Policy ID.</p>
     * 
     * <strong>example:</strong>
     * <p>po-000************hky</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <p>Data source type. Possible values:</p>
     * <ul>
     * <li><strong>UDM_ECS</strong>: Indicates ECS full machine backup.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>UDM_ECS</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    public static DescribePolicyBindingsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePolicyBindingsRequest self = new DescribePolicyBindingsRequest();
        return TeaModel.build(map, self);
    }

    public DescribePolicyBindingsRequest setDataSourceIds(java.util.List<String> dataSourceIds) {
        this.dataSourceIds = dataSourceIds;
        return this;
    }
    public java.util.List<String> getDataSourceIds() {
        return this.dataSourceIds;
    }

    public DescribePolicyBindingsRequest setFilters(java.util.List<DescribePolicyBindingsRequestFilters> filters) {
        this.filters = filters;
        return this;
    }
    public java.util.List<DescribePolicyBindingsRequestFilters> getFilters() {
        return this.filters;
    }

    public DescribePolicyBindingsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribePolicyBindingsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribePolicyBindingsRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public DescribePolicyBindingsRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public static class DescribePolicyBindingsRequestFilters extends TeaModel {
        /**
         * <p>Key in the query filter. Possible values include:</p>
         * <ul>
         * <li><strong>PolicyId</strong>: Backup policy ID</li>
         * <li><strong>DataSourceId</strong>: ECS instance ID</li>
         * <li><strong>DataSourceType</strong>: Data source type</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DataSourceType</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>Matching method. Default is IN. This refers to the matching operation (Operator) supported by the Key and Value in the filter. Possible values include:</p>
         * <ul>
         * <li><strong>EQUAL</strong>: Equal to</li>
         * <li><strong>NOT_EQUAL</strong>: Not equal to</li>
         * <li><strong>GREATER_THAN</strong>: Greater than</li>
         * <li><strong>GREATER_THAN_OR_EQUAL</strong>: Greater than or equal to</li>
         * <li><strong>LESS_THAN</strong>: Less than</li>
         * <li><strong>LESS_THAN_OR_EQUAL</strong>: Less than or equal to</li>
         * <li><strong>BETWEEN</strong>: Range, where value is a JSON array <code>[lower_bound, upper_bound]</code>.</li>
         * <li><strong>IN</strong>: In the set, where value is an array.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IN</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>Values to be matched in the query filter.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static DescribePolicyBindingsRequestFilters build(java.util.Map<String, ?> map) throws Exception {
            DescribePolicyBindingsRequestFilters self = new DescribePolicyBindingsRequestFilters();
            return TeaModel.build(map, self);
        }

        public DescribePolicyBindingsRequestFilters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribePolicyBindingsRequestFilters setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public DescribePolicyBindingsRequestFilters setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

}
