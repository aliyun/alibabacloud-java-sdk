// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aipodcast20250228.models;

import com.aliyun.tea.*;

public class PodcastTaskResultQueryRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>63c4e0eaab3b4c0db208ecafa990e8d1</p>
     */
    @NameInMap("taskId")
    public String taskId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-ep8ba0dr6seiddri</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static PodcastTaskResultQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        PodcastTaskResultQueryRequest self = new PodcastTaskResultQueryRequest();
        return TeaModel.build(map, self);
    }

    public PodcastTaskResultQueryRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public PodcastTaskResultQueryRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
