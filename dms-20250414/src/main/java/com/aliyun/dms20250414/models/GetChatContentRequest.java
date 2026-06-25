// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class GetChatContentRequest extends TeaModel {
    /**
     * <p>The agent ID. This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx-xxxx-xxxx</p>
     */
    @NameInMap("AgentId")
    public String agentId;

    /**
     * <p>The backend will return output starting from this checkpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Checkpoint")
    public String checkpoint;

    /**
     * <p>The current DMS unit. Chinese mainland users of Alibaba Cloud should use cn-hangzhou by default.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DMSUnit")
    public String DMSUnit;

    /**
     * <p>The session ID. This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sess_12345</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    public static GetChatContentRequest build(java.util.Map<String, ?> map) throws Exception {
        GetChatContentRequest self = new GetChatContentRequest();
        return TeaModel.build(map, self);
    }

    public GetChatContentRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public GetChatContentRequest setCheckpoint(String checkpoint) {
        this.checkpoint = checkpoint;
        return this;
    }
    public String getCheckpoint() {
        return this.checkpoint;
    }

    public GetChatContentRequest setDMSUnit(String DMSUnit) {
        this.DMSUnit = DMSUnit;
        return this;
    }
    public String getDMSUnit() {
        return this.DMSUnit;
    }

    public GetChatContentRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
