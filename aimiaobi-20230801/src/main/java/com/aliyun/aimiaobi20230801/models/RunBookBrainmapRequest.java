// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunBookBrainmapRequest extends TeaModel {
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
     * <p>12345</p>
     */
    @NameInMap("DocId")
    public String docId;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
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

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("WordNumber")
    public Integer wordNumber;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-hx72jf15gqyobvd9</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static RunBookBrainmapRequest build(java.util.Map<String, ?> map) throws Exception {
        RunBookBrainmapRequest self = new RunBookBrainmapRequest();
        return TeaModel.build(map, self);
    }

    public RunBookBrainmapRequest setCleanCache(Boolean cleanCache) {
        this.cleanCache = cleanCache;
        return this;
    }
    public Boolean getCleanCache() {
        return this.cleanCache;
    }

    public RunBookBrainmapRequest setDocId(String docId) {
        this.docId = docId;
        return this;
    }
    public String getDocId() {
        return this.docId;
    }

    public RunBookBrainmapRequest setNodeNumber(Integer nodeNumber) {
        this.nodeNumber = nodeNumber;
        return this;
    }
    public Integer getNodeNumber() {
        return this.nodeNumber;
    }

    public RunBookBrainmapRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public RunBookBrainmapRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public RunBookBrainmapRequest setWordNumber(Integer wordNumber) {
        this.wordNumber = wordNumber;
        return this;
    }
    public Integer getWordNumber() {
        return this.wordNumber;
    }

    public RunBookBrainmapRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
