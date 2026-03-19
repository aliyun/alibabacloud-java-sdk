// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetPptTemplateSelectorRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>lm-xxxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetPptTemplateSelectorRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPptTemplateSelectorRequest self = new GetPptTemplateSelectorRequest();
        return TeaModel.build(map, self);
    }

    public GetPptTemplateSelectorRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
