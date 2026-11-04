// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class UpdateDataAgentSpaceInfoRequest extends TeaModel {
    /**
     * <p>The workspace configuration items.</p>
     * 
     * <strong>example:</strong>
     * <p>{sql_config:null}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The current DMS unit.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DMSUnit")
    public String DMSUnit;

    /**
     * <p>Specifies whether to enable the session sharing feature for the workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSessionShareEnabled")
    public Boolean isSessionShareEnabled;

    /**
     * <p>The new description of the workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>space for test new</p>
     */
    @NameInMap("WorkspaceDesc")
    public String workspaceDesc;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>20923*****7291</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    /**
     * <p>The new name of the workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>yunqitest_v2</p>
     */
    @NameInMap("WorkspaceName")
    public String workspaceName;

    public static UpdateDataAgentSpaceInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataAgentSpaceInfoRequest self = new UpdateDataAgentSpaceInfoRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDataAgentSpaceInfoRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public UpdateDataAgentSpaceInfoRequest setDMSUnit(String DMSUnit) {
        this.DMSUnit = DMSUnit;
        return this;
    }
    public String getDMSUnit() {
        return this.DMSUnit;
    }

    public UpdateDataAgentSpaceInfoRequest setIsSessionShareEnabled(Boolean isSessionShareEnabled) {
        this.isSessionShareEnabled = isSessionShareEnabled;
        return this;
    }
    public Boolean getIsSessionShareEnabled() {
        return this.isSessionShareEnabled;
    }

    public UpdateDataAgentSpaceInfoRequest setWorkspaceDesc(String workspaceDesc) {
        this.workspaceDesc = workspaceDesc;
        return this;
    }
    public String getWorkspaceDesc() {
        return this.workspaceDesc;
    }

    public UpdateDataAgentSpaceInfoRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public UpdateDataAgentSpaceInfoRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

}
