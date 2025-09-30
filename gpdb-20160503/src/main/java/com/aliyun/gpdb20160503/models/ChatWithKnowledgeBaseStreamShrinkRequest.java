// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ChatWithKnowledgeBaseStreamShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IncludeKnowledgeBaseResults")
    public Boolean includeKnowledgeBaseResults;

    @NameInMap("KnowledgeParams")
    public String knowledgeParamsShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ModelParams")
    public String modelParamsShrink;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PromptParams")
    public String promptParams;

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

}
