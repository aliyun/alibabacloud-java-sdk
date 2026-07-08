// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunDocQaShrinkRequest extends TeaModel {
    /**
     * <p>Array of folder IDs for filtering. This parameter takes effect only when SearchSource is set to fromIndexLib.</p>
     */
    @NameInMap("CategoryIds")
    public String categoryIdsShrink;

    /**
     * <p>Array of historical context content</p>
     */
    @NameInMap("ConversationContexts")
    public String conversationContextsShrink;

    /**
     * <p>Array of multiple document IDs</p>
     */
    @NameInMap("DocIds")
    public String docIdsShrink;

    /**
     * <p>Custom model name defined by the User</p>
     * 
     * <strong>example:</strong>
     * <p>quanmiao-max、quanmiao-plus</p>
     */
    @NameInMap("ModelName")
    public String modelName;

    /**
     * <p>Question</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>苹果16手机什么时候发布</p>
     */
    @NameInMap("Query")
    public String query;

    /**
     * <p>Associated content actively provided by the questioner</p>
     * 
     * <strong>example:</strong>
     * <p>关联内容</p>
     */
    @NameInMap("ReferenceContent")
    public String referenceContent;

    /**
     * <p>Search source</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>fromWeb</p>
     */
    @NameInMap("SearchSource")
    public String searchSource;

    /**
     * <p>Conversation ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f486c4e2-b773-4d65-88f8-2ba540610456</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>Alibaba Cloud Model Studio workspace ID. For details on how to obtain it, see <a href="https://help.aliyun.com/document_detail/2587495.html">How to Use Workspaces</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-dswd4003ny4gh9rw</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static RunDocQaShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RunDocQaShrinkRequest self = new RunDocQaShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RunDocQaShrinkRequest setCategoryIdsShrink(String categoryIdsShrink) {
        this.categoryIdsShrink = categoryIdsShrink;
        return this;
    }
    public String getCategoryIdsShrink() {
        return this.categoryIdsShrink;
    }

    public RunDocQaShrinkRequest setConversationContextsShrink(String conversationContextsShrink) {
        this.conversationContextsShrink = conversationContextsShrink;
        return this;
    }
    public String getConversationContextsShrink() {
        return this.conversationContextsShrink;
    }

    public RunDocQaShrinkRequest setDocIdsShrink(String docIdsShrink) {
        this.docIdsShrink = docIdsShrink;
        return this;
    }
    public String getDocIdsShrink() {
        return this.docIdsShrink;
    }

    public RunDocQaShrinkRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public RunDocQaShrinkRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public RunDocQaShrinkRequest setReferenceContent(String referenceContent) {
        this.referenceContent = referenceContent;
        return this;
    }
    public String getReferenceContent() {
        return this.referenceContent;
    }

    public RunDocQaShrinkRequest setSearchSource(String searchSource) {
        this.searchSource = searchSource;
        return this;
    }
    public String getSearchSource() {
        return this.searchSource;
    }

    public RunDocQaShrinkRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public RunDocQaShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
