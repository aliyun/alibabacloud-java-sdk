// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ChatWithKnowledgeBaseShrinkRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/196830.html">DescribeDBInstances</a> operation to view the details of all instances in a target region, including their instance IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>Whether to include the raw retrieval results from the knowledge base in the response. Default: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IncludeKnowledgeBaseResults")
    public Boolean includeKnowledgeBaseResults;

    /**
     * <p>Parameters for knowledge retrieval. If omitted, the operation performs a standard chat without retrieving from a knowledge base.</p>
     */
    @NameInMap("KnowledgeParams")
    public String knowledgeParamsShrink;

    /**
     * <p>The parameters for calling the large language model (LLM).</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ModelParams")
    public String modelParamsShrink;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>A custom system prompt template. If specified, it overrides the default prompt. The template must include the {{ text_chunks }}, {{ user_system_prompt }}, {{ graph_entities }}, and {{ graph_relations }} placeholders.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;参考以下知识回答问题:{{ text_chunks }}&quot;</p>
     */
    @NameInMap("PromptParams")
    public String promptParams;

    /**
     * <p>The region ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ChatWithKnowledgeBaseShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ChatWithKnowledgeBaseShrinkRequest self = new ChatWithKnowledgeBaseShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ChatWithKnowledgeBaseShrinkRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ChatWithKnowledgeBaseShrinkRequest setIncludeKnowledgeBaseResults(Boolean includeKnowledgeBaseResults) {
        this.includeKnowledgeBaseResults = includeKnowledgeBaseResults;
        return this;
    }
    public Boolean getIncludeKnowledgeBaseResults() {
        return this.includeKnowledgeBaseResults;
    }

    public ChatWithKnowledgeBaseShrinkRequest setKnowledgeParamsShrink(String knowledgeParamsShrink) {
        this.knowledgeParamsShrink = knowledgeParamsShrink;
        return this;
    }
    public String getKnowledgeParamsShrink() {
        return this.knowledgeParamsShrink;
    }

    public ChatWithKnowledgeBaseShrinkRequest setModelParamsShrink(String modelParamsShrink) {
        this.modelParamsShrink = modelParamsShrink;
        return this;
    }
    public String getModelParamsShrink() {
        return this.modelParamsShrink;
    }

    public ChatWithKnowledgeBaseShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ChatWithKnowledgeBaseShrinkRequest setPromptParams(String promptParams) {
        this.promptParams = promptParams;
        return this;
    }
    public String getPromptParams() {
        return this.promptParams;
    }

    public ChatWithKnowledgeBaseShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
