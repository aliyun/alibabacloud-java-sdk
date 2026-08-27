// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class GetModelProviderRequest extends TeaModel {
    /**
     * <p>The ID of the model provider.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>p-xxx</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>Optional. Fuzzy matches by instance name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AgentTeams</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetModelProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        GetModelProviderRequest self = new GetModelProviderRequest();
        return TeaModel.build(map, self);
    }

    public GetModelProviderRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetModelProviderRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
