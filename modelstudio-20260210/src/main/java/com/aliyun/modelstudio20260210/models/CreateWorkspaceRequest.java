// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class CreateWorkspaceRequest extends TeaModel {
    /**
     * <p>The service deployment scope (the deployment scope for services that depend on GPU resources, such as inference, training, and deployment). The Beijing and Singapore regions are not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>global</p>
     */
    @NameInMap("serviceSite")
    public String serviceSite;

    /**
     * <p>The workspace name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>workspace_test</p>
     */
    @NameInMap("workspaceName")
    public String workspaceName;

    public static CreateWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkspaceRequest self = new CreateWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public CreateWorkspaceRequest setServiceSite(String serviceSite) {
        this.serviceSite = serviceSite;
        return this;
    }
    public String getServiceSite() {
        return this.serviceSite;
    }

    public CreateWorkspaceRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

}
