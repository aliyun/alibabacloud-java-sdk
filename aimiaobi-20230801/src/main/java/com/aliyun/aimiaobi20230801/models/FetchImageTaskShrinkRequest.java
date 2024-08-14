// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class FetchImageTaskShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cd327c3d5d5e44159cc716e23bfa530e_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e1be065b-adc3-435e-bd01-1c18c5ed75d3</p>
     */
    @NameInMap("ArticleTaskId")
    public String articleTaskId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;9d8c9185-3f75-4a20-aca1-c5bb53dd97b3&quot;]</p>
     */
    @NameInMap("TaskIdList")
    public String taskIdListShrink;

    public static FetchImageTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        FetchImageTaskShrinkRequest self = new FetchImageTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public FetchImageTaskShrinkRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public FetchImageTaskShrinkRequest setArticleTaskId(String articleTaskId) {
        this.articleTaskId = articleTaskId;
        return this;
    }
    public String getArticleTaskId() {
        return this.articleTaskId;
    }

    public FetchImageTaskShrinkRequest setTaskIdListShrink(String taskIdListShrink) {
        this.taskIdListShrink = taskIdListShrink;
        return this;
    }
    public String getTaskIdListShrink() {
        return this.taskIdListShrink;
    }

}
