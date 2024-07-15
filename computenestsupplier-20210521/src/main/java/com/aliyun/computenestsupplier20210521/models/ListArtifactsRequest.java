// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListArtifactsRequest extends TeaModel {
    /**
     * <p>The filter.</p>
     */
    @NameInMap("Filter")
    public java.util.List<ListArtifactsRequestFilter> filter;

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

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aek25yfxxxxxxxx</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListArtifactsRequestTag> tag;

    public static ListArtifactsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListArtifactsRequest self = new ListArtifactsRequest();
        return TeaModel.build(map, self);
    }

    public ListArtifactsRequest setFilter(java.util.List<ListArtifactsRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<ListArtifactsRequestFilter> getFilter() {
        return this.filter;
    }

    public ListArtifactsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListArtifactsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListArtifactsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListArtifactsRequest setTag(java.util.List<ListArtifactsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListArtifactsRequestTag> getTag() {
        return this.tag;
    }

    public static class ListArtifactsRequestFilter extends TeaModel {
        /**
         * <p>The parameter name of the filter. You can specify one or more filters. Valid values:</p>
         * <ul>
         * <li><em>Name</em>: The name of the deployment package. Fuzzy match is used.</li>
         * <li>ArtifactId: The ID of the deployment package.</li>
         * <li>ArtifactType: The type of the deployment package.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ArtifactType</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The parameter values of the filter.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static ListArtifactsRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            ListArtifactsRequestFilter self = new ListArtifactsRequestFilter();
            return TeaModel.build(map, self);
        }

        public ListArtifactsRequestFilter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListArtifactsRequestFilter setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class ListArtifactsRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>value1</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListArtifactsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListArtifactsRequestTag self = new ListArtifactsRequestTag();
            return TeaModel.build(map, self);
        }

        public ListArtifactsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListArtifactsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
