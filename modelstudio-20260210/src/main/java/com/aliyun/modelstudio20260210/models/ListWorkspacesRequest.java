// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class ListWorkspacesRequest extends TeaModel {
    /**
     * <p>The page size.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The token used to retrieve additional results. You do not need to provide this parameter for the first request. Obtain the token for subsequent requests from the response of the previous request.</p>
     * 
     * <strong>example:</strong>
     * <p>uwCwQ5FFCDo=</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-32klhjk2312334jkh</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    /**
     * <p>Filters workspaces by name using a fuzzy keyword match.</p>
     * 
     * <strong>example:</strong>
     * <p>ws_test</p>
     */
    @NameInMap("workspaceName")
    public String workspaceName;

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

    public ListWorkspacesRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public ListWorkspacesRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

}
