// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class FetchImageTaskShrinkRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("ArticleTaskId")
    public String articleTaskId;

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
