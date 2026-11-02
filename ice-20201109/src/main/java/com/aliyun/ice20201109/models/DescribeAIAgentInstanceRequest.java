// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeAIAgentInstanceRequest extends TeaModel {
    /**
     * <p>The agent instance ID.</p>
     * <blockquote>
     * <p>InstanceId is the unique ID returned after the agent instance is successfully started. For more information about the operations used to start an agent, see <a href="https://help.aliyun.com/document_detail/2846201.html">StartAIAgentInstance </a> and <a href="https://help.aliyun.com/document_detail/2846209.html">GenerateAIAgentCall</a>.</p>
     * </blockquote>
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
