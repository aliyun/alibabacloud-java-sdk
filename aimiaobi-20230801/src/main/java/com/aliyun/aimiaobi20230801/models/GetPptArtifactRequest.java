// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetPptArtifactRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5232136</p>
     */
    @NameInMap("PptArtifactId")
    public Integer pptArtifactId;

    /**
     * <strong>example:</strong>
     * <p>llm-az2gglxxxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetPptArtifactRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPptArtifactRequest self = new GetPptArtifactRequest();
        return TeaModel.build(map, self);
    }

    public GetPptArtifactRequest setPptArtifactId(Integer pptArtifactId) {
        this.pptArtifactId = pptArtifactId;
        return this;
    }
    public Integer getPptArtifactId() {
        return this.pptArtifactId;
    }

    public GetPptArtifactRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
