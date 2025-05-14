// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class QueryAuditTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("ArticleId")
    public String articleId;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("ContentAuditTaskId")
    public String contentAuditTaskId;

    /**
     * <strong>example:</strong>
     * <p>llm-xxxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static QueryAuditTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAuditTaskRequest self = new QueryAuditTaskRequest();
        return TeaModel.build(map, self);
    }

    public QueryAuditTaskRequest setArticleId(String articleId) {
        this.articleId = articleId;
        return this;
    }
    public String getArticleId() {
        return this.articleId;
    }

    public QueryAuditTaskRequest setContentAuditTaskId(String contentAuditTaskId) {
        this.contentAuditTaskId = contentAuditTaskId;
        return this;
    }
    public String getContentAuditTaskId() {
        return this.contentAuditTaskId;
    }

    public QueryAuditTaskRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
