// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunDocSummaryRequest extends TeaModel {
    /**
     * <p>Purge the current cache</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CleanCache")
    public Boolean cleanCache;

    /**
     * <p>Document ID</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("DocId")
    public String docId;

    /**
     * <p>Custom model name specified by the User</p>
     * 
     * <strong>example:</strong>
     * <p>quanmiao-max、quanmiao-plus</p>
     */
    @NameInMap("ModelName")
    public String modelName;

    /**
     * <p>Custom requirements</p>
     * 
     * <strong>example:</strong>
     * <p>请总结一下这篇文档</p>
     */
    @NameInMap("Query")
    public String query;

    /**
     * <p>Content to be summarized</p>
     * 
     * <strong>example:</strong>
     * <p>要总结的内容</p>
     */
    @NameInMap("RecommendContent")
    public String recommendContent;

    /**
     * <p>Conversation ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0f56f98a-f2d8-47ec-98e9-1cbdcffa9539</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>Alibaba Cloud Model Studio workspace ID. For more information about how to obtain it, see <a href="https://help.aliyun.com/document_detail/2587495.html">How to use a workspace</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-2setzb9x4ewsd</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static RunDocSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        RunDocSummaryRequest self = new RunDocSummaryRequest();
        return TeaModel.build(map, self);
    }

    public RunDocSummaryRequest setCleanCache(Boolean cleanCache) {
        this.cleanCache = cleanCache;
        return this;
    }
    public Boolean getCleanCache() {
        return this.cleanCache;
    }

    public RunDocSummaryRequest setDocId(String docId) {
        this.docId = docId;
        return this;
    }
    public String getDocId() {
        return this.docId;
    }

    public RunDocSummaryRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public RunDocSummaryRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public RunDocSummaryRequest setRecommendContent(String recommendContent) {
        this.recommendContent = recommendContent;
        return this;
    }
    public String getRecommendContent() {
        return this.recommendContent;
    }

    public RunDocSummaryRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public RunDocSummaryRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
