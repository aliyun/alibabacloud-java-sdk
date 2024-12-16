// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunDocQaShrinkRequest extends TeaModel {
    @NameInMap("CategoryIds")
    public String categoryIdsShrink;

    @NameInMap("ConversationContexts")
    public String conversationContextsShrink;

    @NameInMap("DocIds")
    public String docIdsShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Query")
    public String query;

    @NameInMap("ReferenceContent")
    public String referenceContent;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>fromWeb</p>
     */
    @NameInMap("SearchSource")
    public String searchSource;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f486c4e2-b773-4d65-88f8-2ba540610456</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
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
