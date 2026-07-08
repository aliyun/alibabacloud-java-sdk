// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunTopicSelectionMergeShrinkRequest extends TeaModel {
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
    public String topicsShrink;

    /**
     * <p><a href="https://help.aliyun.com/document_detail/2782167.html">Workspace ID</a></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static RunTopicSelectionMergeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RunTopicSelectionMergeShrinkRequest self = new RunTopicSelectionMergeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RunTopicSelectionMergeShrinkRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public RunTopicSelectionMergeShrinkRequest setTopicsShrink(String topicsShrink) {
        this.topicsShrink = topicsShrink;
        return this;
    }
    public String getTopicsShrink() {
        return this.topicsShrink;
    }

    public RunTopicSelectionMergeShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
