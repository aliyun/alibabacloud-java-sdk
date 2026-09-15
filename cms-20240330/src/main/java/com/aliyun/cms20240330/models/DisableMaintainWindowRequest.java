// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DisableMaintainWindowRequest extends TeaModel {
    /**
     * <p>The workspace name. This parameter is required by the backend and is used to isolate silence policy resources across different business workspaces.</p>
     * 
     * <strong>example:</strong>
     * <p>default-cms-xxxx-cn-hangzhou</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static DisableMaintainWindowRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableMaintainWindowRequest self = new DisableMaintainWindowRequest();
        return TeaModel.build(map, self);
    }

    public DisableMaintainWindowRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
