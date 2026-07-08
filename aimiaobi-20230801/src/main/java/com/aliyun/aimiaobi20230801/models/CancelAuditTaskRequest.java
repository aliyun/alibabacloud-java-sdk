// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class CancelAuditTaskRequest extends TeaModel {
    /**
     * <p>Article ID. Specify either this parameter or ContentAuditTaskId.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("ArticleId")
    public String articleId;

    /**
     * <p>Audit task ID. Specify either this parameter or ArticleId.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("ContentAuditTaskId")
    public String contentAuditTaskId;

    /**
     * <p><a href="https://help.aliyun.com/document_detail/2782167.html">Workspace ID</a></p>
     * 
     * <strong>example:</strong>
     * <p>llm-xxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CancelAuditTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelAuditTaskRequest self = new CancelAuditTaskRequest();
        return TeaModel.build(map, self);
    }

    public CancelAuditTaskRequest setArticleId(String articleId) {
        this.articleId = articleId;
        return this;
    }
    public String getArticleId() {
        return this.articleId;
    }

    public CancelAuditTaskRequest setContentAuditTaskId(String contentAuditTaskId) {
        this.contentAuditTaskId = contentAuditTaskId;
        return this;
    }
    public String getContentAuditTaskId() {
        return this.contentAuditTaskId;
    }

    public CancelAuditTaskRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
