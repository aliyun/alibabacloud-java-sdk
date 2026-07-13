// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class GetWorkerMaxVersionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetWorkerMaxVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWorkerMaxVersionRequest self = new GetWorkerMaxVersionRequest();
        return TeaModel.build(map, self);
    }

    public GetWorkerMaxVersionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
