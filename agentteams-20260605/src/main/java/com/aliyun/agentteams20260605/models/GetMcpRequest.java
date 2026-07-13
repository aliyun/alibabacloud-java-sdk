// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class GetMcpRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AgentTeams</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetMcpRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMcpRequest self = new GetMcpRequest();
        return TeaModel.build(map, self);
    }

    public GetMcpRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetMcpRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
