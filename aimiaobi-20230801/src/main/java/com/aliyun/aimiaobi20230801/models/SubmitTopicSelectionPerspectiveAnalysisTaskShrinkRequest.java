// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SubmitTopicSelectionPerspectiveAnalysisTaskShrinkRequest extends TeaModel {
    /**
     * <p>The unique identifier of the workspace: <a href="https://help.aliyun.com/document_detail/2587494.html">AgentKey</a></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx_p_efm</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>The list of documents to be analyzed. (Provide at least one of documents or topic)</p>
     */
    @NameInMap("Documents")
    public String documentsShrink;

    /**
     * <p>The topic selection perspective tasks to be analyzed. By default, this parameter is empty, which means all tasks are analyzed. (TopicSummary: Topic event summary, HotViewPoints: Hot topic selection perspectives, TimedViewPoints: Timeliness topic selection perspectives, WebReviewPoints: Online review topic selection perspectives, FreshViewPoints: Novel topic selection perspectives)</p>
     * 
     * <strong>example:</strong>
     * <p>TimedViewPoints</p>
     */
    @NameInMap("PerspectiveTypes")
    public String perspectiveTypesShrink;

    /**
     * <p>The name of the topic to be analyzed. (Provide at least one of documents or topic)</p>
     * 
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
