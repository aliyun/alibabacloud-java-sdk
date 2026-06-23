// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class FindBestMatchSecurityStrategyRequest extends TeaModel {
    /**
     * <p>Control module, used to match the security policy type.</p>
     * 
     * <strong>example:</strong>
     * <p>DataQuery</p>
     */
    @NameInMap("ControlModule")
    public String controlModule;

    /**
     * <p>Control sub-module, used to match the security policy type.</p>
     * 
     * <strong>example:</strong>
     * <p>MyCatalog</p>
     */
    @NameInMap("ControlSubModule")
    public String controlSubModule;

    /**
     * <p><strong>Workspace ID</strong>, used to precisely match workspace-level policies.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("WorkspaceId")
    public Long workspaceId;

    public static FindBestMatchSecurityStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        FindBestMatchSecurityStrategyRequest self = new FindBestMatchSecurityStrategyRequest();
        return TeaModel.build(map, self);
    }

    public FindBestMatchSecurityStrategyRequest setControlModule(String controlModule) {
        this.controlModule = controlModule;
        return this;
    }
    public String getControlModule() {
        return this.controlModule;
    }

    public FindBestMatchSecurityStrategyRequest setControlSubModule(String controlSubModule) {
        this.controlSubModule = controlSubModule;
        return this;
    }
    public String getControlSubModule() {
        return this.controlSubModule;
    }

    public FindBestMatchSecurityStrategyRequest setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

}
