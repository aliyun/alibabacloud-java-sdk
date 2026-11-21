// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteMaintainWindowRequest extends TeaModel {
    /**
     * <p>The name of the workspace. This parameter is required by the backend to isolate silence policy resources across different business workspaces.</p>
     * 
     * <strong>example:</strong>
     * <p>default-cms-xxxx-cn-hangzhou</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static DeleteMaintainWindowRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMaintainWindowRequest self = new DeleteMaintainWindowRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMaintainWindowRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
