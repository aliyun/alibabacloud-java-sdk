// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class UpdateWorkspaceConfigRequest extends TeaModel {
    @NameInMap("Config")
    public String config;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static UpdateWorkspaceConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkspaceConfigRequest self = new UpdateWorkspaceConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWorkspaceConfigRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public UpdateWorkspaceConfigRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
