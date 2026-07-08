// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunTextPolishingRequest extends TeaModel {
    /**
     * <p>Text content.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>文本内容</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>Original article.</p>
     * 
     * <strong>example:</strong>
     * <p>原始文章内容</p>
     */
    @NameInMap("OriginContent")
    public String originContent;

    /**
     * <p>Custom polishing requirements.</p>
     * 
     * <strong>example:</strong>
     * <p>自定义的润色要求</p>
     */
    @NameInMap("Prompt")
    public String prompt;

    /**
     * <p>The task ID. The same task ID shares a session. The task timeout is 12 hours.</p>
     * 
     * <strong>example:</strong>
     * <p>taskld-xxxxx</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The unique identifier of the Alibaba Cloud Model Studio workspace. Obtain the <a href="https://help.aliyun.com/document_detail/2782167.html">Workspace ID</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static RunTextPolishingRequest build(java.util.Map<String, ?> map) throws Exception {
        RunTextPolishingRequest self = new RunTextPolishingRequest();
        return TeaModel.build(map, self);
    }

    public RunTextPolishingRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public RunTextPolishingRequest setOriginContent(String originContent) {
        this.originContent = originContent;
        return this;
    }
    public String getOriginContent() {
        return this.originContent;
    }

    public RunTextPolishingRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public RunTextPolishingRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public RunTextPolishingRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
