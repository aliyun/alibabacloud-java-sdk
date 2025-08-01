// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class AsyncCreateClipsTimeLineRequest extends TeaModel {
    @NameInMap("AdditionalContent")
    public String additionalContent;

    @NameInMap("CustomContent")
    public String customContent;

    @NameInMap("NoRefVideo")
    public Boolean noRefVideo;

    @NameInMap("ProcessPrompt")
    public String processPrompt;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7AA2AE16-D873-5C5F-9708-15396C382EB1</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-2setzb9x4ewsd</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static AsyncCreateClipsTimeLineRequest build(java.util.Map<String, ?> map) throws Exception {
        AsyncCreateClipsTimeLineRequest self = new AsyncCreateClipsTimeLineRequest();
        return TeaModel.build(map, self);
    }

    public AsyncCreateClipsTimeLineRequest setAdditionalContent(String additionalContent) {
        this.additionalContent = additionalContent;
        return this;
    }
    public String getAdditionalContent() {
        return this.additionalContent;
    }

    public AsyncCreateClipsTimeLineRequest setCustomContent(String customContent) {
        this.customContent = customContent;
        return this;
    }
    public String getCustomContent() {
        return this.customContent;
    }

    public AsyncCreateClipsTimeLineRequest setNoRefVideo(Boolean noRefVideo) {
        this.noRefVideo = noRefVideo;
        return this;
    }
    public Boolean getNoRefVideo() {
        return this.noRefVideo;
    }

    public AsyncCreateClipsTimeLineRequest setProcessPrompt(String processPrompt) {
        this.processPrompt = processPrompt;
        return this;
    }
    public String getProcessPrompt() {
        return this.processPrompt;
    }

    public AsyncCreateClipsTimeLineRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public AsyncCreateClipsTimeLineRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
