// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListWorkspacesRequest extends TeaModel {
    /**
     * <p>The number of entries per page.
     * Default value:
     *     50
     * Maximum value:
     *     50</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxxxxxx</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-heyuan</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("region")
    public String region;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-ae******ey</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("tags")
    public java.util.List<ListWorkspacesRequestTags> tags;

    /**
     * <p>The workspace name. Fuzzy match is used.</p>
     * 
     * <strong>example:</strong>
     * <p>workspace-test-001</p>
     */
    @NameInMap("workspaceName")
    public String workspaceName;

    /**
     * <p>The workspace name. Exact match is used.</p>
     * 
     * <strong>example:</strong>
     * <p>workspace-test-001</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("workspaceNameList")
    public java.util.List<String> workspaceNameList;

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

    public ListWorkspacesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListWorkspacesRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ListWorkspacesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListWorkspacesRequest setTags(java.util.List<ListWorkspacesRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ListWorkspacesRequestTags> getTags() {
        return this.tags;
    }

    public ListWorkspacesRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public ListWorkspacesRequest setWorkspaceNameList(java.util.List<String> workspaceNameList) {
        this.workspaceNameList = workspaceNameList;
        return this;
    }
    public java.util.List<String> getWorkspaceNameList() {
        return this.workspaceNameList;
    }

    public static class ListWorkspacesRequestTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The tag value.</p>
         */
        @NameInMap("value")
        public String value;

        public static ListWorkspacesRequestTags build(java.util.Map<String, ?> map) throws Exception {
            ListWorkspacesRequestTags self = new ListWorkspacesRequestTags();
            return TeaModel.build(map, self);
        }

        public ListWorkspacesRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListWorkspacesRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
