// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SubmitTopicSelectionPerspectiveAnalysisTaskShrinkRequest extends TeaModel {
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
     * <strong>example:</strong>
     * <p>TimedViewPoints</p>
     */
    @NameInMap("PerspectiveTypes")
    public String perspectiveTypesShrink;

    /**
     * <strong>example:</strong>
     * <p>待分析的主题名（documents与topic二者至少传一个）</p>
     */
    @NameInMap("Topic")
    public String topic;

    public static SubmitTopicSelectionPerspectiveAnalysisTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitTopicSelectionPerspectiveAnalysisTaskShrinkRequest self = new SubmitTopicSelectionPerspectiveAnalysisTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitTopicSelectionPerspectiveAnalysisTaskShrinkRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public SubmitTopicSelectionPerspectiveAnalysisTaskShrinkRequest setDocumentsShrink(String documentsShrink) {
        this.documentsShrink = documentsShrink;
        return this;
    }
    public String getDocumentsShrink() {
        return this.documentsShrink;
    }

    public SubmitTopicSelectionPerspectiveAnalysisTaskShrinkRequest setPerspectiveTypesShrink(String perspectiveTypesShrink) {
        this.perspectiveTypesShrink = perspectiveTypesShrink;
        return this;
    }
    public String getPerspectiveTypesShrink() {
        return this.perspectiveTypesShrink;
    }

    public SubmitTopicSelectionPerspectiveAnalysisTaskShrinkRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
