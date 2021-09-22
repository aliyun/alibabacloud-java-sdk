// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListDeploymentVersionsRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("MaxResults")
    public String maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Filter")
    public java.util.List<ListDeploymentVersionsRequestFilter> filter;

    public static ListDeploymentVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDeploymentVersionsRequest self = new ListDeploymentVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListDeploymentVersionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListDeploymentVersionsRequest setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
        return this.maxResults;
    }

    public ListDeploymentVersionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDeploymentVersionsRequest setFilter(java.util.List<ListDeploymentVersionsRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<ListDeploymentVersionsRequestFilter> getFilter() {
        return this.filter;
    }

    public static class ListDeploymentVersionsRequestFilter extends TeaModel {
        @NameInMap("Value")
        public java.util.List<String> value;

        @NameInMap("Name")
        public String name;

        public static ListDeploymentVersionsRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            ListDeploymentVersionsRequestFilter self = new ListDeploymentVersionsRequestFilter();
            return TeaModel.build(map, self);
        }

        public ListDeploymentVersionsRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

        public ListDeploymentVersionsRequestFilter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
