// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class AgentAuthorizationPrincipal extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("principalId")
    public String principalId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("principalType")
    public String principalType;

    public static AgentAuthorizationPrincipal build(java.util.Map<String, ?> map) throws Exception {
        AgentAuthorizationPrincipal self = new AgentAuthorizationPrincipal();
        return TeaModel.build(map, self);
    }

    public AgentAuthorizationPrincipal setPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }
    public String getPrincipalId() {
        return this.principalId;
    }

    public AgentAuthorizationPrincipal setPrincipalType(String principalType) {
        this.principalType = principalType;
        return this;
    }
    public String getPrincipalType() {
        return this.principalType;
    }

}
