// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetDasAgentSSERequest extends TeaModel {
    /**
     * <p>Optional. By default, the default agent is used. You can also specify an agent that was generated after enabling the DAS Agent service or an agent that you manually created.</p>
     * 
     * <strong>example:</strong>
     * <p>ag-472T0DxtmjIxxxxx</p>
     */
    @NameInMap("AgentId")
    public String agentId;

    /**
     * <p>Deprecated parameter. The instance ID is passed through the Query field.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-xxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The natural language description for the query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Are there any issues or abnormalities with my instance rm-xxx?</p>
     */
    @NameInMap("Query")
    public String query;

    /**
     * <p>Optional. The session ID in UUID string format. If not specified, a new session is created. To maintain context across conversations, use the same session ID.</p>
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
