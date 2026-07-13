// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class DeleteServiceEndpointRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ep-xxx</p>
     */
    @NameInMap("EndpointId")
    public String endpointId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteServiceEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceEndpointRequest self = new DeleteServiceEndpointRequest();
        return TeaModel.build(map, self);
    }

    public DeleteServiceEndpointRequest setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public DeleteServiceEndpointRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
