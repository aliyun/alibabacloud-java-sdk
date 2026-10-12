// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CreateMobileAgentTaskRequest extends TeaModel {
    /**
     * <p>The agent ID.</p>
     * 
     * <strong>example:</strong>
     * <p>agt-mobileagent</p>
     */
    @NameInMap("AgentId")
    public String agentId;

    /**
     * <p>The task input.</p>
     * 
     * <strong>example:</strong>
     * <p>Open DingTalk and reply to the first 5 unread messages</p>
     */
    @NameInMap("InputParam")
    public String inputParam;

    /**
     * <p>The task name.</p>
     * 
     * <strong>example:</strong>
     * <p>Auto-reply to DingTalk messages</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The list of node IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>cpn-csbdhjcbvfd****</p>
     */
    @NameInMap("NodeIds")
    public String nodeIds;

    /**
     * <p>The session ID. Tasks with the same session ID share the same context.</p>
     * 
     * <strong>example:</strong>
     * <p>ses-261005-6ekkb1m9ls00</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>The task type.</p>
     * 
     * <strong>example:</strong>
     * <p>mobile_use_agent</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreateMobileAgentTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMobileAgentTaskRequest self = new CreateMobileAgentTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateMobileAgentTaskRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public CreateMobileAgentTaskRequest setInputParam(String inputParam) {
        this.inputParam = inputParam;
        return this;
    }
    public String getInputParam() {
        return this.inputParam;
    }

    public CreateMobileAgentTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateMobileAgentTaskRequest setNodeIds(String nodeIds) {
        this.nodeIds = nodeIds;
        return this;
    }
    public String getNodeIds() {
        return this.nodeIds;
    }

    public CreateMobileAgentTaskRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public CreateMobileAgentTaskRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
