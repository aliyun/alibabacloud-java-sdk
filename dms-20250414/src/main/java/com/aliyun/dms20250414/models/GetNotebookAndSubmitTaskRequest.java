// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class GetNotebookAndSubmitTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;dt\&quot;: \&quot;2022-10-14\&quot;}</p>
     */
    @NameInMap("Params")
    public String params;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/Workspace/code/default/test.ipynb</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Retry")
    public Long retry;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8vkixxxxx***</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <strong>example:</strong>
     * <p>8630242382****</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetNotebookAndSubmitTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNotebookAndSubmitTaskRequest self = new GetNotebookAndSubmitTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetNotebookAndSubmitTaskRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public GetNotebookAndSubmitTaskRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public GetNotebookAndSubmitTaskRequest setRetry(Long retry) {
        this.retry = retry;
        return this;
    }
    public Long getRetry() {
        return this.retry;
    }

    public GetNotebookAndSubmitTaskRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public GetNotebookAndSubmitTaskRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
