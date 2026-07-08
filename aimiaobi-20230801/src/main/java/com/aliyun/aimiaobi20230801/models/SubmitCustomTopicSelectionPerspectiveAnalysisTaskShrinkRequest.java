// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SubmitCustomTopicSelectionPerspectiveAnalysisTaskShrinkRequest extends TeaModel {
    /**
     * <p>The unique identifier of the workspace. For more information, see <a href="https://help.aliyun.com/document_detail/2587494.html">AgentKey</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx_p_efm</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>The list of documents to be analyzed.</p>
     */
    @NameInMap("Documents")
    public String documentsShrink;

    /**
     * <p>The input prompt for custom perspectives.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>自定义观点的输入Prompt</p>
     */
    @NameInMap("Prompt")
    public String prompt;

    /**
     * <p>The name of the topic to be analyzed.</p>
     * 
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
