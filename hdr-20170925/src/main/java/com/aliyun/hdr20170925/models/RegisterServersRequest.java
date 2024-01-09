// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class RegisterServersRequest extends TeaModel {
    @NameInMap("AgentPort")
    public Integer agentPort;

    @NameInMap("ServerInstancesInfo")
    public String serverInstancesInfo;

    @NameInMap("SitePairId")
    public String sitePairId;

    public static RegisterServersRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterServersRequest self = new RegisterServersRequest();
        return TeaModel.build(map, self);
    }

    public RegisterServersRequest setAgentPort(Integer agentPort) {
        this.agentPort = agentPort;
        return this;
    }
    public Integer getAgentPort() {
        return this.agentPort;
    }

    public RegisterServersRequest setServerInstancesInfo(String serverInstancesInfo) {
        this.serverInstancesInfo = serverInstancesInfo;
        return this;
    }
    public String getServerInstancesInfo() {
        return this.serverInstancesInfo;
    }

    public RegisterServersRequest setSitePairId(String sitePairId) {
        this.sitePairId = sitePairId;
        return this;
    }
    public String getSitePairId() {
        return this.sitePairId;
    }

}
