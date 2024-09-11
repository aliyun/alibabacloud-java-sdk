// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunCustomHotTopicAnalysisRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>模型反问</p>
     */
    @NameInMap("AskUser")
    public String askUser;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ForceAnalysisExistsTopic")
    public Boolean forceAnalysisExistsTopic;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>用户输入Prompt</p>
     */
    @NameInMap("Prompt")
    public String prompt;

    /**
     * <strong>example:</strong>
     * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <strong>example:</strong>
     * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <strong>example:</strong>
     * <p>用户针对模型反问的输入</p>
     */
    @NameInMap("UserBack")
    public String userBack;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static RunCustomHotTopicAnalysisRequest build(java.util.Map<String, ?> map) throws Exception {
        RunCustomHotTopicAnalysisRequest self = new RunCustomHotTopicAnalysisRequest();
        return TeaModel.build(map, self);
    }

    public RunCustomHotTopicAnalysisRequest setAskUser(String askUser) {
        this.askUser = askUser;
        return this;
    }
    public String getAskUser() {
        return this.askUser;
    }

    public RunCustomHotTopicAnalysisRequest setForceAnalysisExistsTopic(Boolean forceAnalysisExistsTopic) {
        this.forceAnalysisExistsTopic = forceAnalysisExistsTopic;
        return this;
    }
    public Boolean getForceAnalysisExistsTopic() {
        return this.forceAnalysisExistsTopic;
    }

    public RunCustomHotTopicAnalysisRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public RunCustomHotTopicAnalysisRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public RunCustomHotTopicAnalysisRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public RunCustomHotTopicAnalysisRequest setUserBack(String userBack) {
        this.userBack = userBack;
        return this;
    }
    public String getUserBack() {
        return this.userBack;
    }

    public RunCustomHotTopicAnalysisRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
