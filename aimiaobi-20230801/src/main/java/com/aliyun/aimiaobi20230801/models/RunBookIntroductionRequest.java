// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunBookIntroductionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CleanCache")
    public Boolean cleanCache;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3YQRatoe8phnpIsIE6z7DTPknhG8Fj</p>
     */
    @NameInMap("DocId")
    public String docId;

    /**
     * <strong>example:</strong>
     * <p>用英文输出</p>
     */
    @NameInMap("KeyPointPrompt")
    public String keyPointPrompt;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0f56f98a-f2d8-47ec-98e9-1cbdcffa9539</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <strong>example:</strong>
     * <p>用英文输出</p>
     */
    @NameInMap("SummaryPrompt")
    public String summaryPrompt;

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

    public RunBookIntroductionRequest setCleanCache(Boolean cleanCache) {
        this.cleanCache = cleanCache;
        return this;
    }
    public Boolean getCleanCache() {
        return this.cleanCache;
    }

    public RunBookIntroductionRequest setDocId(String docId) {
        this.docId = docId;
        return this;
    }
    public String getDocId() {
        return this.docId;
    }

    public RunBookIntroductionRequest setKeyPointPrompt(String keyPointPrompt) {
        this.keyPointPrompt = keyPointPrompt;
        return this;
    }
    public String getKeyPointPrompt() {
        return this.keyPointPrompt;
    }

    public RunBookIntroductionRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public RunBookIntroductionRequest setSummaryPrompt(String summaryPrompt) {
        this.summaryPrompt = summaryPrompt;
        return this;
    }
    public String getSummaryPrompt() {
        return this.summaryPrompt;
    }

    public RunBookIntroductionRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
