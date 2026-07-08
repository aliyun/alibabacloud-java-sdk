// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListAuditContentErrorTypesRequest extends TeaModel {
    /**
     * <p>Maximum number of records</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Token for the next page</p>
     * 
     * <strong>example:</strong>
     * <p>cEoBWREAXdxaOyjq/cqAbg==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p><a href="https://help.aliyun.com/document_detail/2782167.html">Workspace ID</a></p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListAuditContentErrorTypesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAuditContentErrorTypesRequest self = new ListAuditContentErrorTypesRequest();
        return TeaModel.build(map, self);
    }

    public ListAuditContentErrorTypesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAuditContentErrorTypesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAuditContentErrorTypesRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
