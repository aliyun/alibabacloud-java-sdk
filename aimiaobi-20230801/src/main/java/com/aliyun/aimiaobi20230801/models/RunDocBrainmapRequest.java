// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunDocBrainmapRequest extends TeaModel {
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

    @NameInMap("NodeNumber")
    public Integer nodeNumber;

    @NameInMap("Prompt")
    public String prompt;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("WordNumber")
    public Integer wordNumber;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-xxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static RunDocBrainmapRequest build(java.util.Map<String, ?> map) throws Exception {
        RunDocBrainmapRequest self = new RunDocBrainmapRequest();
        return TeaModel.build(map, self);
    }

    public RunDocBrainmapRequest setCleanCache(Boolean cleanCache) {
        this.cleanCache = cleanCache;
        return this;
    }
    public Boolean getCleanCache() {
        return this.cleanCache;
    }

    public RunDocBrainmapRequest setDocId(String docId) {
        this.docId = docId;
        return this;
    }
    public String getDocId() {
        return this.docId;
    }

    public RunDocBrainmapRequest setNodeNumber(Integer nodeNumber) {
        this.nodeNumber = nodeNumber;
        return this;
    }
    public Integer getNodeNumber() {
        return this.nodeNumber;
    }

    public RunDocBrainmapRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public RunDocBrainmapRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public RunDocBrainmapRequest setWordNumber(Integer wordNumber) {
        this.wordNumber = wordNumber;
        return this;
    }
    public Integer getWordNumber() {
        return this.wordNumber;
    }

    public RunDocBrainmapRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
