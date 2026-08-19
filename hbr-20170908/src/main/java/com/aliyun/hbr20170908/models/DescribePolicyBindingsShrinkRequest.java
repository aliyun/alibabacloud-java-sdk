// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribePolicyBindingsShrinkRequest extends TeaModel {
    /**
     * <p>The list of data source IDs.</p>
     */
    @NameInMap("DataSourceIds")
    public String dataSourceIdsShrink;

    /**
     * <p>The query filters.</p>
     */
    @NameInMap("Filters")
    public java.util.List<DescribePolicyBindingsShrinkRequestFilters> filters;

    /**
     * <p>The number of results for each query.</p>
     * <p>Valid values: 10 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token required to obtain the next page of policy-data source associations.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The policy ID.</p>
     * 
     * <strong>example:</strong>
     * <p>po-000************hky</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <p>The data source type. Valid values:</p>
     * <ul>
     * <li><strong>UDM_ECS</strong>: ECS instance backup.</li>
     * <li><strong>OSS</strong>: OSS backup.</li>
     * <li><strong>NAS</strong>: Alibaba Cloud NAS backup.</li>
     * <li><strong>COMMON_NAS</strong>: On-premises NAS backup.</li>
     * <li><strong>ECS_FILE</strong>: ECS File Backup Essential Edition.</li>
     * <li><strong>File</strong>: On-premises file backup.</li>
     * <li><strong>COMMON_FILE_SYSTEM</strong>: CPFS backup.</li>
     * <li><strong>OTS</strong>: Tablestore backup.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>UDM_ECS</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    public static DescribePolicyBindingsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePolicyBindingsShrinkRequest self = new DescribePolicyBindingsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribePolicyBindingsShrinkRequest setDataSourceIdsShrink(String dataSourceIdsShrink) {
        this.dataSourceIdsShrink = dataSourceIdsShrink;
        return this;
    }
    public String getDataSourceIdsShrink() {
        return this.dataSourceIdsShrink;
    }

    public DescribePolicyBindingsShrinkRequest setFilters(java.util.List<DescribePolicyBindingsShrinkRequestFilters> filters) {
        this.filters = filters;
        return this;
    }
    public java.util.List<DescribePolicyBindingsShrinkRequestFilters> getFilters() {
        return this.filters;
    }

    public DescribePolicyBindingsShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribePolicyBindingsShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribePolicyBindingsShrinkRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public DescribePolicyBindingsShrinkRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public static class DescribePolicyBindingsShrinkRequestFilters extends TeaModel {
        /**
         * <p>The key in the query filter. Valid values:</p>
         * <ul>
         * <li><strong>PolicyId</strong>: backup policy ID</li>
         * <li><strong>DataSourceId</strong>: ECS instance ID</li>
         * <li><strong>DataSourceType</strong>: data source type</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DataSourceType</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The matching method. Default value: IN. The matching operation (Operator) supported by the Key and Value in the filter. Valid values:</p>
         * <ul>
         * <li><strong>EQUAL</strong>: equal to</li>
         * <li><strong>NOT_EQUAL</strong>: not equal to</li>
         * <li><strong>GREATER_THAN</strong>: greater than</li>
         * <li><strong>GREATER_THAN_OR_EQUAL</strong>: greater than or equal to</li>
         * <li><strong>LESS_THAN</strong>: less than</li>
         * <li><strong>LESS_THAN_OR_EQUAL</strong>: less than or equal to</li>
         * <li><strong>BETWEEN</strong>: range. The value is a JSON array <code>[lower bound, upper bound]</code>.</li>
         * <li><strong>IN</strong>: in a set. The value is an array.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IN</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The values to match in the query filter.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static DescribePolicyBindingsShrinkRequestFilters build(java.util.Map<String, ?> map) throws Exception {
            DescribePolicyBindingsShrinkRequestFilters self = new DescribePolicyBindingsShrinkRequestFilters();
            return TeaModel.build(map, self);
        }

        public DescribePolicyBindingsShrinkRequestFilters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribePolicyBindingsShrinkRequestFilters setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public DescribePolicyBindingsShrinkRequestFilters setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

}
