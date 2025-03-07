// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeAIAgentInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the AI agent that you want to query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>39f8e0bc005e4f309379701645f4****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeAIAgentInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAIAgentInstanceRequest self = new DescribeAIAgentInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAIAgentInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
