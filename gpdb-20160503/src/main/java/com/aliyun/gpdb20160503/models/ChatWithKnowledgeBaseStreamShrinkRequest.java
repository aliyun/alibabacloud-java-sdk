// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ChatWithKnowledgeBaseStreamShrinkRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the IDs of all AnalyticDB for PostgreSQL instances in a region.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>Specifies whether to return recall results. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IncludeKnowledgeBaseResults")
    public Boolean includeKnowledgeBaseResults;

    /**
     * <p>The knowledge retrieval parameter object. If this parameter is not specified, only chat is performed.</p>
     */
    @NameInMap("KnowledgeParams")
    public String knowledgeParamsShrink;

    /**
     * <p>The large language model (LLM) invocation parameter object.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ModelParams")
    public String modelParamsShrink;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The system prompt template. The template must include {{ text_chunks }}, {{ user_system_prompt }}, {{ graph_entities }}, and {{ graph_relations }}. If not specified, this part does not take effect.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;参考以下知识回答问题:{{ text_chunks }}&quot;</p>
     */
    @NameInMap("PromptParams")
    public String promptParams;

    /**
     * <p>The ID of the region where the instance resides.</p>
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
