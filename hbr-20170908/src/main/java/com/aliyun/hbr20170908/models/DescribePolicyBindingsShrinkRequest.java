// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribePolicyBindingsShrinkRequest extends TeaModel {
    @NameInMap("DataSourceIds")
    public String dataSourceIdsShrink;

    @NameInMap("Filters")
    public java.util.List<DescribePolicyBindingsShrinkRequestFilters> filters;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("PolicyId")
    public String policyId;

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
        @NameInMap("Key")
        public String key;

        @NameInMap("Operator")
        public String operator;

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
