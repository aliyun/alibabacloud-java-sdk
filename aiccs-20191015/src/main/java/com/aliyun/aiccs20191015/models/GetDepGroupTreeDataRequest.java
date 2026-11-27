// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetDepGroupTreeDataRequest extends TeaModel {
    /**
     * <p>The agent ID.</p>
     * <p>You can call the <a href="https://www.alibabacloud.com/help/en/aiccs/developer-reference/api-aiccs-2019-10-15-getagent">GetAgent</a> operation and view the <strong>AgentId</strong> response parameter to obtain the agent ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("AgentId")
    public Long agentId;

    /**
     * <p>The AICCS instance ID.
     * You can obtain the ID in the <b>Instance Management</b> section of the left-side navigation pane in the <a href="https://aiccs.console.aliyun.com/overview">Artificial Intelligence Cloud Call Service console</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc_xp_pre-cn-***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetDepGroupTreeDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDepGroupTreeDataRequest self = new GetDepGroupTreeDataRequest();
        return TeaModel.build(map, self);
    }

    public GetDepGroupTreeDataRequest setAgentId(Long agentId) {
        this.agentId = agentId;
        return this;
    }
    public Long getAgentId() {
        return this.agentId;
    }

    public GetDepGroupTreeDataRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
