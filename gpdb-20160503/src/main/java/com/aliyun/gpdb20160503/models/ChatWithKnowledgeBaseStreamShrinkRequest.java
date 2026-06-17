// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ChatWithKnowledgeBaseStreamShrinkRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the IDs of all AnalyticDB for PostgreSQL instances in a specified region.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>Specifies whether to include the retrieved knowledge base results in the response. Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IncludeKnowledgeBaseResults")
    public Boolean includeKnowledgeBaseResults;

    /**
     * <p>Parameters for knowledge retrieval. If omitted, the API performs a chat-only operation.</p>
     */
    @NameInMap("KnowledgeParams")
    public String knowledgeParamsShrink;

    /**
     * <p>An object that contains parameters for the Large Language Model (LLM) call.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ModelParams")
    public String modelParamsShrink;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>A template for the system prompt. It must include placeholders such as <code>{{text_chunks}}</code>, <code>{{user_system_prompt}}</code>, <code>{{graph_entities}}</code>, and <code>{{graph_relations}}</code>. If omitted, no custom prompt template is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;参考以下知识回答问题:{{ text_chunks }}&quot;</p>
     */
    @NameInMap("PromptParams")
    public String promptParams;

    /**
     * <p>The instance\&quot;s region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ChatWithKnowledgeBaseStreamShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ChatWithKnowledgeBaseStreamShrinkRequest self = new ChatWithKnowledgeBaseStreamShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ChatWithKnowledgeBaseStreamShrinkRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ChatWithKnowledgeBaseStreamShrinkRequest setIncludeKnowledgeBaseResults(Boolean includeKnowledgeBaseResults) {
        this.includeKnowledgeBaseResults = includeKnowledgeBaseResults;
        return this;
    }
    public Boolean getIncludeKnowledgeBaseResults() {
        return this.includeKnowledgeBaseResults;
    }

    public ChatWithKnowledgeBaseStreamShrinkRequest setKnowledgeParamsShrink(String knowledgeParamsShrink) {
        this.knowledgeParamsShrink = knowledgeParamsShrink;
        return this;
    }
    public String getKnowledgeParamsShrink() {
        return this.knowledgeParamsShrink;
    }

    public ChatWithKnowledgeBaseStreamShrinkRequest setModelParamsShrink(String modelParamsShrink) {
        this.modelParamsShrink = modelParamsShrink;
        return this;
    }
    public String getModelParamsShrink() {
        return this.modelParamsShrink;
    }

    public ChatWithKnowledgeBaseStreamShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ChatWithKnowledgeBaseStreamShrinkRequest setPromptParams(String promptParams) {
        this.promptParams = promptParams;
        return this;
    }
    public String getPromptParams() {
        return this.promptParams;
    }

    public ChatWithKnowledgeBaseStreamShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
