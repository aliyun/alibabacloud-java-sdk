// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class DeleteMemorySessionRequest extends TeaModel {
    /**
     * <p>agentId</p>
     * 
     * <strong>example:</strong>
     * <p>agent-001</p>
     */
    @NameInMap("agentId")
    public String agentId;

    /**
     * <p>teamId</p>
     * 
     * <strong>example:</strong>
     * <p>team-001</p>
     */
    @NameInMap("teamId")
    public String teamId;

    /**
     * <p>userId</p>
     * 
     * <strong>example:</strong>
     * <p>user-001</p>
     */
    @NameInMap("userId")
    public String userId;

    public static DeleteMemorySessionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMemorySessionRequest self = new DeleteMemorySessionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMemorySessionRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public DeleteMemorySessionRequest setTeamId(String teamId) {
        this.teamId = teamId;
        return this;
    }
    public String getTeamId() {
        return this.teamId;
    }

    public DeleteMemorySessionRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
