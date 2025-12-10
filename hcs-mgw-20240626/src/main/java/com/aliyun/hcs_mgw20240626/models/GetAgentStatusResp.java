// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class GetAgentStatusResp extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>192.168.0.2</p>
     */
    @NameInMap("AgentIP")
    public String agentIP;

    /**
     * <strong>example:</strong>
     * <p>1.5.0</p>
     */
    @NameInMap("AgentVersion")
    public String agentVersion;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Status")
    public String status;

    public static GetAgentStatusResp build(java.util.Map<String, ?> map) throws Exception {
        GetAgentStatusResp self = new GetAgentStatusResp();
        return TeaModel.build(map, self);
    }

    public GetAgentStatusResp setAgentIP(String agentIP) {
        this.agentIP = agentIP;
        return this;
    }
    public String getAgentIP() {
        return this.agentIP;
    }

    public GetAgentStatusResp setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }
    public String getAgentVersion() {
        return this.agentVersion;
    }

    public GetAgentStatusResp setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
