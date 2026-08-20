// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class AgentAuthorizationPrincipal extends TeaModel {
    /**
     * <p>The ID of the authorization principal. Specify a consumer ID or consumer group ID based on the value of principalType.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>consumer-1</p>
     */
    @NameInMap("principalId")
    public String principalId;

    /**
     * <p>The type of the authorization principal. Valid values:</p>
     * <ul>
     * <li>Consumer: consumer.</li>
     * <li>ConsumerGroup: consumer group.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Consumer</p>
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
