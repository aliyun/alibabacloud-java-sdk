// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunDocIntroductionRequest extends TeaModel {
    @NameInMap("CleanCache")
    public Boolean cleanCache;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("DocId")
    public String docId;

    @NameInMap("IntroductionPrompt")
    public String introductionPrompt;

    @NameInMap("KeyPointPrompt")
    public String keyPointPrompt;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a3b5eb35-6b28-4cf9-ac09-1dec25ab4df6</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("SummaryPrompt")
    public String summaryPrompt;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static RunDocIntroductionRequest build(java.util.Map<String, ?> map) throws Exception {
        RunDocIntroductionRequest self = new RunDocIntroductionRequest();
        return TeaModel.build(map, self);
    }

    public RunDocIntroductionRequest setCleanCache(Boolean cleanCache) {
        this.cleanCache = cleanCache;
        return this;
    }
    public Boolean getCleanCache() {
        return this.cleanCache;
    }

    public RunDocIntroductionRequest setDocId(String docId) {
        this.docId = docId;
        return this;
    }
    public String getDocId() {
        return this.docId;
    }

    public RunDocIntroductionRequest setIntroductionPrompt(String introductionPrompt) {
        this.introductionPrompt = introductionPrompt;
        return this;
    }
    public String getIntroductionPrompt() {
        return this.introductionPrompt;
    }

    public RunDocIntroductionRequest setKeyPointPrompt(String keyPointPrompt) {
        this.keyPointPrompt = keyPointPrompt;
        return this;
    }
    public String getKeyPointPrompt() {
        return this.keyPointPrompt;
    }

    public RunDocIntroductionRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public RunDocIntroductionRequest setSummaryPrompt(String summaryPrompt) {
        this.summaryPrompt = summaryPrompt;
        return this;
    }
    public String getSummaryPrompt() {
        return this.summaryPrompt;
    }

    public RunDocIntroductionRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
