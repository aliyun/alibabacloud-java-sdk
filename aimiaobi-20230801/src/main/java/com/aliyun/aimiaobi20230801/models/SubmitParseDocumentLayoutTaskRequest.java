// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SubmitParseDocumentLayoutTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>正文</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-xx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static SubmitParseDocumentLayoutTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitParseDocumentLayoutTaskRequest self = new SubmitParseDocumentLayoutTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitParseDocumentLayoutTaskRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public SubmitParseDocumentLayoutTaskRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
