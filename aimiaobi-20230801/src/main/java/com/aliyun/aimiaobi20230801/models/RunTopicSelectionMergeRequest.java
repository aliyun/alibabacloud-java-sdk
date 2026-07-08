// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunTopicSelectionMergeRequest extends TeaModel {
    /**
     * <p>Custom merge prompt</p>
     * 
     * <strong>example:</strong>
     * <p>请从xxxx的角度，分析xxxx事件</p>
     */
    @NameInMap("Prompt")
    public String prompt;

    /**
     * <p>List of topic perspectives to merge</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Topics")
    public java.util.List<TopicSelection> topics;

    /**
     * <p><a href="https://help.aliyun.com/document_detail/2782167.html">Workspace ID</a></p>
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
