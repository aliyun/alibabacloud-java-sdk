// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunTopicSelectionMergeRequest extends TeaModel {
    @NameInMap("Prompt")
    public String prompt;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Topics")
    public java.util.List<TopicSelection> topics;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static RunTopicSelectionMergeRequest build(java.util.Map<String, ?> map) throws Exception {
        RunTopicSelectionMergeRequest self = new RunTopicSelectionMergeRequest();
        return TeaModel.build(map, self);
    }

    public RunTopicSelectionMergeRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public RunTopicSelectionMergeRequest setTopics(java.util.List<TopicSelection> topics) {
        this.topics = topics;
        return this;
    }
    public java.util.List<TopicSelection> getTopics() {
        return this.topics;
    }

    public RunTopicSelectionMergeRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
