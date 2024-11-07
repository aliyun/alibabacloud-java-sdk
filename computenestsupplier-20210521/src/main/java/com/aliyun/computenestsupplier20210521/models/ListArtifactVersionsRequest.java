// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListArtifactVersionsRequest extends TeaModel {
    /**
     * <p>The ID of the deployment package.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>artifact-eea08d1e2d3a43aexxxx</p>
     */
    @NameInMap("ArtifactId")
    public String artifactId;

    /**
     * <p>The filter.</p>
     */
    @NameInMap("Filters")
    public java.util.List<ListArtifactVersionsRequestFilters> filters;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAc3HCuYhJi/wvpk4xOr0VLbfVwapgMwCN1wYzPVzLbItEdB0uWSY7AGnM3qCgm/YnjuEfwSnMwiMkcUoI0hRQzE=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListArtifactVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListArtifactVersionsRequest self = new ListArtifactVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListArtifactVersionsRequest setArtifactId(String artifactId) {
        this.artifactId = artifactId;
        return this;
    }
    public String getArtifactId() {
        return this.artifactId;
    }

    public ListArtifactVersionsRequest setFilters(java.util.List<ListArtifactVersionsRequestFilters> filters) {
        this.filters = filters;
        return this;
    }
    public java.util.List<ListArtifactVersionsRequestFilters> getFilters() {
        return this.filters;
    }

    public ListArtifactVersionsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListArtifactVersionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public static class ListArtifactVersionsRequestFilters extends TeaModel {
        /**
         * <p>The parameter name of the filter. You can specify one or more filters. Valid values:</p>
         * <p><strong>Status</strong>：The artifact status</p>
         * 
         * <strong>example:</strong>
         * <p>Status</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The parameter values of the filter.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static ListArtifactVersionsRequestFilters build(java.util.Map<String, ?> map) throws Exception {
            ListArtifactVersionsRequestFilters self = new ListArtifactVersionsRequestFilters();
            return TeaModel.build(map, self);
        }

        public ListArtifactVersionsRequestFilters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListArtifactVersionsRequestFilters setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

}
