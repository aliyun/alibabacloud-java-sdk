// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class FetchImageTaskRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("ArticleTaskId")
    public String articleTaskId;

    @NameInMap("TaskIdList")
    public java.util.List<String> taskIdList;

    public static FetchImageTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        FetchImageTaskRequest self = new FetchImageTaskRequest();
        return TeaModel.build(map, self);
    }

    public FetchImageTaskRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public FetchImageTaskRequest setArticleTaskId(String articleTaskId) {
        this.articleTaskId = articleTaskId;
        return this;
    }
    public String getArticleTaskId() {
        return this.articleTaskId;
    }

    public FetchImageTaskRequest setTaskIdList(java.util.List<String> taskIdList) {
        this.taskIdList = taskIdList;
        return this;
    }
    public java.util.List<String> getTaskIdList() {
        return this.taskIdList;
    }

}
