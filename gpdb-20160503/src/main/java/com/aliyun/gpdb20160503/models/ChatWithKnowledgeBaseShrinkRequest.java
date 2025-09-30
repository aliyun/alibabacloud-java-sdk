// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ChatWithKnowledgeBaseShrinkRequest extends TeaModel {
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

}
