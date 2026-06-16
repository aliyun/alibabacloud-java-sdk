// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class CreateDataAgentWorkspaceRequest extends TeaModel {
    /**
     * <p>The current DMS unit.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DMSUnit")
    public String DMSUnit;

    @NameInMap("IsSessionShareEnabled")
    public Boolean isSessionShareEnabled;

    /**
     * <p>The description of the collaborative workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>Space for test</p>
     */
    @NameInMap("WorkspaceDesc")
    public String workspaceDesc;

    /**
     * <p>The name of the collaborative workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>workspaceTest</p>
     */
    @NameInMap("WorkspaceName")
    public String workspaceName;

    public static CreateDataAgentWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataAgentWorkspaceRequest self = new CreateDataAgentWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataAgentWorkspaceRequest setDMSUnit(String DMSUnit) {
        this.DMSUnit = DMSUnit;
        return this;
    }
    public String getDMSUnit() {
        return this.DMSUnit;
    }

    public CreateDataAgentWorkspaceRequest setIsSessionShareEnabled(Boolean isSessionShareEnabled) {
        this.isSessionShareEnabled = isSessionShareEnabled;
        return this;
    }
    public Boolean getIsSessionShareEnabled() {
        return this.isSessionShareEnabled;
    }

    public CreateDataAgentWorkspaceRequest setWorkspaceDesc(String workspaceDesc) {
        this.workspaceDesc = workspaceDesc;
        return this;
    }
    public String getWorkspaceDesc() {
        return this.workspaceDesc;
    }

    public CreateDataAgentWorkspaceRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

}
