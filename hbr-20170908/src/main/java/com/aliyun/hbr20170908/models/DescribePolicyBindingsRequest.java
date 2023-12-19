// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribePolicyBindingsRequest extends TeaModel {
    @NameInMap("DataSourceIds")
    public java.util.List<String> dataSourceIds;

    @NameInMap("Filters")
    public java.util.List<DescribePolicyBindingsRequestFilters> filters;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("PolicyId")
    public String policyId;

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
        @NameInMap("Key")
        public String key;

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
