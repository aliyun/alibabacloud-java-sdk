// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunBookIntroductionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3YQRatoe8phnpIsIE6z7DTPknhG8Fj</p>
     */
    @NameInMap("DocId")
    public String docId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0f56f98a-f2d8-47ec-98e9-1cbdcffa9539</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-vtmox6g2bhq2qv5c</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static RunBookIntroductionRequest build(java.util.Map<String, ?> map) throws Exception {
        RunBookIntroductionRequest self = new RunBookIntroductionRequest();
        return TeaModel.build(map, self);
    }

    public RunBookIntroductionRequest setDocId(String docId) {
        this.docId = docId;
        return this;
    }
    public String getDocId() {
        return this.docId;
    }

    public RunBookIntroductionRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public RunBookIntroductionRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
