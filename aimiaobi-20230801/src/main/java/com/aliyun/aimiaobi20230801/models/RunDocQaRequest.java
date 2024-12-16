// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunDocQaRequest extends TeaModel {
    @NameInMap("CategoryIds")
    public java.util.List<String> categoryIds;

    @NameInMap("ConversationContexts")
    public java.util.List<RunDocQaRequestConversationContexts> conversationContexts;

    @NameInMap("DocIds")
    public java.util.List<String> docIds;

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
        @NameInMap("Content")
        public String content;

        /**
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
