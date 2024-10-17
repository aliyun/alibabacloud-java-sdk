// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class StopAIAgentInstanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>39f8e0bc005e4f309379701645f4****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static StopAIAgentInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        StopAIAgentInstanceRequest self = new StopAIAgentInstanceRequest();
        return TeaModel.build(map, self);
    }

    public StopAIAgentInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
