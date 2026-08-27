// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class DeleteMcpRequest extends TeaModel {
    /**
     * <p>Optional. Fuzzy matches by instance name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AgentTeams</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The ID of the AgentTeams instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ins-xxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteMcpRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMcpRequest self = new DeleteMcpRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMcpRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeleteMcpRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
