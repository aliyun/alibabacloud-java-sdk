// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunPptOutlineGenerationRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("ExternalUserId")
    public String externalUserId;

    /**
     * <p>The user\&quot;s prompt.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>帮我生成一个消防安全主题的PPT</p>
     */
    @NameInMap("Prompt")
    public String prompt;

    /**
     * <p>The unique identifier of the Alibaba Cloud Model Studio workspace. For more information, see <a href="https://help.aliyun.com/document_detail/2782167.html">Get a Workspace ID</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-8v8a5mfpxffrj1pn</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static RunPptOutlineGenerationRequest build(java.util.Map<String, ?> map) throws Exception {
        RunPptOutlineGenerationRequest self = new RunPptOutlineGenerationRequest();
        return TeaModel.build(map, self);
    }

    public RunPptOutlineGenerationRequest setExternalUserId(String externalUserId) {
        this.externalUserId = externalUserId;
        return this;
    }
    public String getExternalUserId() {
        return this.externalUserId;
    }

    public RunPptOutlineGenerationRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public RunPptOutlineGenerationRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
