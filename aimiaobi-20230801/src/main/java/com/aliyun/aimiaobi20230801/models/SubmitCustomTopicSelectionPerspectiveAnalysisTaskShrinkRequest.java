// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SubmitCustomTopicSelectionPerspectiveAnalysisTaskShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx_p_efm</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("Documents")
    public String documentsShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>自定义观点的输入Prompt</p>
     */
    @NameInMap("Prompt")
    public String prompt;

    /**
     * <strong>example:</strong>
     * <p>待分析的主题名（documents与topic二者至少传一个）</p>
     */
    @NameInMap("Topic")
    public String topic;

    public static SubmitCustomTopicSelectionPerspectiveAnalysisTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitCustomTopicSelectionPerspectiveAnalysisTaskShrinkRequest self = new SubmitCustomTopicSelectionPerspectiveAnalysisTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitCustomTopicSelectionPerspectiveAnalysisTaskShrinkRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public SubmitCustomTopicSelectionPerspectiveAnalysisTaskShrinkRequest setDocumentsShrink(String documentsShrink) {
        this.documentsShrink = documentsShrink;
        return this;
    }
    public String getDocumentsShrink() {
        return this.documentsShrink;
    }

    public SubmitCustomTopicSelectionPerspectiveAnalysisTaskShrinkRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public SubmitCustomTopicSelectionPerspectiveAnalysisTaskShrinkRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
