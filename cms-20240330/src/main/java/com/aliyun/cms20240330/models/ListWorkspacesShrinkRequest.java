// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListWorkspacesShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>xxxxxxxxxx</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>cn-heyuan</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("region")
    public String region;

    /**
     * <strong>example:</strong>
     * <p>workspace-test-001</p>
     */
    @NameInMap("workspaceName")
    public String workspaceName;

    /**
     * <strong>example:</strong>
     * <p>workspace-test-001</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("workspaceNameList")
    public String workspaceNameListShrink;

    public static ListWorkspacesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWorkspacesShrinkRequest self = new ListWorkspacesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListWorkspacesShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListWorkspacesShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListWorkspacesShrinkRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ListWorkspacesShrinkRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public ListWorkspacesShrinkRequest setWorkspaceNameListShrink(String workspaceNameListShrink) {
        this.workspaceNameListShrink = workspaceNameListShrink;
        return this;
    }
    public String getWorkspaceNameListShrink() {
        return this.workspaceNameListShrink;
    }

}
