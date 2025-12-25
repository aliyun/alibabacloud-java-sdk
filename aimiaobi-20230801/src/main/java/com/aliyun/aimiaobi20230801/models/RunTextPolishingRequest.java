// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunTextPolishingRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>文本内容</p>
     */
    @NameInMap("Content")
    public String content;

    @NameInMap("OriginContent")
    public String originContent;

    @NameInMap("Prompt")
    public String prompt;

    /**
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

    public RunTextPolishingRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
