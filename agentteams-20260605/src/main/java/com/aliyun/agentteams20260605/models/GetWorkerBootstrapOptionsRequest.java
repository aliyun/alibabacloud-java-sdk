// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class GetWorkerBootstrapOptionsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    public static GetWorkerBootstrapOptionsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWorkerBootstrapOptionsRequest self = new GetWorkerBootstrapOptionsRequest();
        return TeaModel.build(map, self);
    }

    public GetWorkerBootstrapOptionsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetWorkerBootstrapOptionsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
