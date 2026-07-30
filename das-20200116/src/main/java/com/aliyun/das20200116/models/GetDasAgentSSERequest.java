// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetDasAgentSSERequest extends TeaModel {
    /**
     * <p>The ID of the agent to use. This parameter is optional. If you do not specify this parameter, the service uses the default agent. You can provide the ID of an agent that was generated when you enabled the DAS Agent service or that you manually created.</p>
     * 
     * <strong>example:</strong>
     * <p>ag-472T0DxtmjIxxxxx</p>
     */
    @NameInMap("AgentId")
    public String agentId;

    /**
     * <p>This parameter is deprecated. Specify the instance ID in the Query parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-xxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The natural language query for the agent.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Are there any issues or abnormalities with my instance rm-xxx?</p>
     */
    @NameInMap("Query")
    public String query;

    /**
     * <p>The session ID, which must be in the UUID format. This parameter is optional. If you do not provide a session ID, the service creates a new session. To continue an existing conversation, use the same session ID in subsequent requests.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-xxxxxxxxxxxx</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    public static GetDasAgentSSERequest build(java.util.Map<String, ?> map) throws Exception {
        GetDasAgentSSERequest self = new GetDasAgentSSERequest();
        return TeaModel.build(map, self);
    }

    public GetDasAgentSSERequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public GetDasAgentSSERequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetDasAgentSSERequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public GetDasAgentSSERequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
