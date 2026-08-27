// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class PutCmsWorkspaceRequest extends TeaModel {
    /**
     * <p>The AgentTeams instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>at-xxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static PutCmsWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        PutCmsWorkspaceRequest self = new PutCmsWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public PutCmsWorkspaceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
