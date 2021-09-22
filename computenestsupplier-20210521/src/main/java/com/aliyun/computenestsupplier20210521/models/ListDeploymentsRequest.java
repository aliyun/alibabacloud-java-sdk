// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListDeploymentsRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("MaxResults")
    public String maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Filter")
    public java.util.List<ListDeploymentsRequestFilter> filter;

    public static ListDeploymentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDeploymentsRequest self = new ListDeploymentsRequest();
        return TeaModel.build(map, self);
    }

    public ListDeploymentsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListDeploymentsRequest setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
        return this.maxResults;
    }

    public ListDeploymentsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDeploymentsRequest setFilter(java.util.List<ListDeploymentsRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<ListDeploymentsRequestFilter> getFilter() {
        return this.filter;
    }

    public static class ListDeploymentsRequestFilter extends TeaModel {
        @NameInMap("Value")
        public java.util.List<String> value;

        @NameInMap("Name")
        public String name;

        public static ListDeploymentsRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            ListDeploymentsRequestFilter self = new ListDeploymentsRequestFilter();
            return TeaModel.build(map, self);
        }

        public ListDeploymentsRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

        public ListDeploymentsRequestFilter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
