// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SubmitAuditTaskRequest extends TeaModel {
    /**
     * <p>The ID of the article to be audited.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("ArticleId")
    public String articleId;

    /**
     * <p>The content to be audited.</p>
     * 
     * <strong>example:</strong>
     * <p>待审核的内容</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The content to be audited, in HTML format.</p>
     * 
     * <strong>example:</strong>
     * <p>待审核的内容（HTML格式）</p>
     */
    @NameInMap("HtmlContent")
    public String htmlContent;

    /**
     * <p>The title of the article to be audited.</p>
     * 
     * <strong>example:</strong>
     * <p>审核时的文章标题</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p><a href="https://help.aliyun.com/document_detail/2782167.html">Workspace ID</a></p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static SubmitAuditTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAuditTaskRequest self = new SubmitAuditTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAuditTaskRequest setArticleId(String articleId) {
        this.articleId = articleId;
        return this;
    }
    public String getArticleId() {
        return this.articleId;
    }

    public SubmitAuditTaskRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public SubmitAuditTaskRequest setHtmlContent(String htmlContent) {
        this.htmlContent = htmlContent;
        return this;
    }
    public String getHtmlContent() {
        return this.htmlContent;
    }

    public SubmitAuditTaskRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public SubmitAuditTaskRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
