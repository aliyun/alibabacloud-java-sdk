// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunCustomHotTopicAnalysisRequest extends TeaModel {
    /**
     * <p>The follow-up question from the model.</p>
     * 
     * <strong>example:</strong>
     * <p>模型反问</p>
     */
    @NameInMap("AskUser")
    public String askUser;

    /**
     * <p>Specifies whether to forcibly analyze a duplicate topic and overwrite the existing analysis.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ForceAnalysisExistsTopic")
    public Boolean forceAnalysisExistsTopic;

    /**
     * <p>The user\&quot;s input prompt.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>用户输入Prompt</p>
     */
    @NameInMap("Prompt")
    public String prompt;

    /**
     * <p>The unique ID for each request.</p>
     * 
     * <strong>example:</strong>
     * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>The unique ID for the entire conversation task.</p>
     * <blockquote>
     * <p>By default, you do not need to specify TaskId. The system automatically generates one. If you specify the same TaskId for subsequent tasks, the tasks are considered part of the same conversation group.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The user\&quot;s input in response to the model\&quot;s follow-up question.</p>
     * 
     * <strong>example:</strong>
     * <p>用户针对模型反问的输入</p>
     */
    @NameInMap("UserBack")
    public String userBack;

    /**
     * <p>The unique ID of the Alibaba Cloud Model Studio workspace. For more information, see <a href="https://help.aliyun.com/document_detail/2782167.html">Obtain a Workspace ID</a>.</p>
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
