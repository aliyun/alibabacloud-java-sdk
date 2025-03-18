// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunDocTranslationRequest extends TeaModel {
    @NameInMap("CleanCache")
    public Boolean cleanCache;

    /**
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("DocId")
    public String docId;

    @NameInMap("RecommendContent")
    public String recommendContent;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2e6b3987-f743-4d4c-8326-d9c41a6af3ee</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <strong>example:</strong>
     * <p>toChinese
     * toEnglish</p>
     */
    @NameInMap("TransType")
    public String transType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-xxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static RunDocTranslationRequest build(java.util.Map<String, ?> map) throws Exception {
        RunDocTranslationRequest self = new RunDocTranslationRequest();
        return TeaModel.build(map, self);
    }

    public RunDocTranslationRequest setCleanCache(Boolean cleanCache) {
        this.cleanCache = cleanCache;
        return this;
    }
    public Boolean getCleanCache() {
        return this.cleanCache;
    }

    public RunDocTranslationRequest setDocId(String docId) {
        this.docId = docId;
        return this;
    }
    public String getDocId() {
        return this.docId;
    }

    public RunDocTranslationRequest setRecommendContent(String recommendContent) {
        this.recommendContent = recommendContent;
        return this;
    }
    public String getRecommendContent() {
        return this.recommendContent;
    }

    public RunDocTranslationRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public RunDocTranslationRequest setTransType(String transType) {
        this.transType = transType;
        return this;
    }
    public String getTransType() {
        return this.transType;
    }

    public RunDocTranslationRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
