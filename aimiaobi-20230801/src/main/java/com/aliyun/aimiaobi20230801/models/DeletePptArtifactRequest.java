// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class DeletePptArtifactRequest extends TeaModel {
    @NameInMap("ExternalUserId")
    public String externalUserId;

    @NameInMap("PptArtifactId")
    public String pptArtifactId;

    /**
     * <strong>example:</strong>
     * <p>llm-xx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static DeletePptArtifactRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePptArtifactRequest self = new DeletePptArtifactRequest();
        return TeaModel.build(map, self);
    }

    public DeletePptArtifactRequest setExternalUserId(String externalUserId) {
        this.externalUserId = externalUserId;
        return this;
    }
    public String getExternalUserId() {
        return this.externalUserId;
    }

    public DeletePptArtifactRequest setPptArtifactId(String pptArtifactId) {
        this.pptArtifactId = pptArtifactId;
        return this;
    }
    public String getPptArtifactId() {
        return this.pptArtifactId;
    }

    public DeletePptArtifactRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
