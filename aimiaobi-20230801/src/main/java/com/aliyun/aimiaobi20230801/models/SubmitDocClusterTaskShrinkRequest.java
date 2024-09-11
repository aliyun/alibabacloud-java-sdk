// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SubmitDocClusterTaskShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx_p_efm</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Documents")
    public String documentsShrink;

    /**
     * <strong>example:</strong>
     * <p>49</p>
     */
    @NameInMap("SummaryLength")
    public Integer summaryLength;

    /**
     * <strong>example:</strong>
     * <p>69</p>
     */
    @NameInMap("TitleLength")
    public Integer titleLength;

    /**
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("TopicCount")
    public Integer topicCount;

    public static SubmitDocClusterTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitDocClusterTaskShrinkRequest self = new SubmitDocClusterTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitDocClusterTaskShrinkRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public SubmitDocClusterTaskShrinkRequest setDocumentsShrink(String documentsShrink) {
        this.documentsShrink = documentsShrink;
        return this;
    }
    public String getDocumentsShrink() {
        return this.documentsShrink;
    }

    public SubmitDocClusterTaskShrinkRequest setSummaryLength(Integer summaryLength) {
        this.summaryLength = summaryLength;
        return this;
    }
    public Integer getSummaryLength() {
        return this.summaryLength;
    }

    public SubmitDocClusterTaskShrinkRequest setTitleLength(Integer titleLength) {
        this.titleLength = titleLength;
        return this;
    }
    public Integer getTitleLength() {
        return this.titleLength;
    }

    public SubmitDocClusterTaskShrinkRequest setTopicCount(Integer topicCount) {
        this.topicCount = topicCount;
        return this;
    }
    public Integer getTopicCount() {
        return this.topicCount;
    }

}
