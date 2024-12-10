// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribePolicyBindingsRequest extends TeaModel {
    @NameInMap("DataSourceIds")
    public java.util.List<String> dataSourceIds;

    @NameInMap("Filters")
    public java.util.List<DescribePolicyBindingsRequestFilters> filters;

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
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>po-000************hky</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
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
         * <strong>example:</strong>
         * <p>DataSourceType</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>IN</p>
         */
        @NameInMap("Operator")
        public String operator;

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
