// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunDocQaRequest extends TeaModel {
    /**
     * <p>Array of folder IDs for filtering. This parameter takes effect only when SearchSource is set to fromIndexLib.</p>
     */
    @NameInMap("CategoryIds")
    public java.util.List<String> categoryIds;

    /**
     * <p>Array of historical context content</p>
     */
    @NameInMap("ConversationContexts")
    public java.util.List<RunDocQaRequestConversationContexts> conversationContexts;

    /**
     * <p>Array of multiple document IDs</p>
     */
    @NameInMap("DocIds")
    public java.util.List<String> docIds;

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

    public static RunDocQaRequest build(java.util.Map<String, ?> map) throws Exception {
        RunDocQaRequest self = new RunDocQaRequest();
        return TeaModel.build(map, self);
    }

    public RunDocQaRequest setCategoryIds(java.util.List<String> categoryIds) {
        this.categoryIds = categoryIds;
        return this;
    }
    public java.util.List<String> getCategoryIds() {
        return this.categoryIds;
    }

    public RunDocQaRequest setConversationContexts(java.util.List<RunDocQaRequestConversationContexts> conversationContexts) {
        this.conversationContexts = conversationContexts;
        return this;
    }
    public java.util.List<RunDocQaRequestConversationContexts> getConversationContexts() {
        return this.conversationContexts;
    }

    public RunDocQaRequest setDocIds(java.util.List<String> docIds) {
        this.docIds = docIds;
        return this;
    }
    public java.util.List<String> getDocIds() {
        return this.docIds;
    }

    public RunDocQaRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public RunDocQaRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public RunDocQaRequest setReferenceContent(String referenceContent) {
        this.referenceContent = referenceContent;
        return this;
    }
    public String getReferenceContent() {
        return this.referenceContent;
    }

    public RunDocQaRequest setSearchSource(String searchSource) {
        this.searchSource = searchSource;
        return this;
    }
    public String getSearchSource() {
        return this.searchSource;
    }

    public RunDocQaRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public RunDocQaRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class RunDocQaRequestConversationContexts extends TeaModel {
        /**
         * <p>Q&amp;A pair content</p>
         * 
         * <strong>example:</strong>
         * <p>问答内容</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>Role</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("Role")
        public String role;

        public static RunDocQaRequestConversationContexts build(java.util.Map<String, ?> map) throws Exception {
            RunDocQaRequestConversationContexts self = new RunDocQaRequestConversationContexts();
            return TeaModel.build(map, self);
        }

        public RunDocQaRequestConversationContexts setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public RunDocQaRequestConversationContexts setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

}
