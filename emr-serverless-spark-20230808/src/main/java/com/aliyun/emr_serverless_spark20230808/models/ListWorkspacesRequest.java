// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListWorkspacesRequest extends TeaModel {
    /**
     * <p>The maximum number of results per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The name of the workspace. Fuzzy search is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>test_workspace</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The token for the next page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The ID of the region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aek2thxggoqhmhq</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The state of the workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>running</p>
     */
    @NameInMap("state")
    public String state;

    /**
     * <p>Filters the results by one or more tags.</p>
     */
    @NameInMap("tag")
    public java.util.List<ListWorkspacesRequestTag> tag;

    public static ListWorkspacesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWorkspacesRequest self = new ListWorkspacesRequest();
        return TeaModel.build(map, self);
    }

    public ListWorkspacesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListWorkspacesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListWorkspacesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListWorkspacesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListWorkspacesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListWorkspacesRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public ListWorkspacesRequest setTag(java.util.List<ListWorkspacesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListWorkspacesRequestTag> getTag() {
        return this.tag;
    }

    public static class ListWorkspacesRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen-finance.edas.config.server</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>iPhone disk space remaining rate</p>
         */
        @NameInMap("value")
        public String value;

        public static ListWorkspacesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListWorkspacesRequestTag self = new ListWorkspacesRequestTag();
            return TeaModel.build(map, self);
        }

        public ListWorkspacesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListWorkspacesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
