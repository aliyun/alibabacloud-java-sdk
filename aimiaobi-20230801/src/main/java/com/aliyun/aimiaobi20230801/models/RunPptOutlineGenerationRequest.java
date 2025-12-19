// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunPptOutlineGenerationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Prompt")
    public String prompt;

    /**
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
