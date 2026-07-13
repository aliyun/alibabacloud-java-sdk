// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class VerifyAtiAgentRegisterInfoAcmeChallengeRecordRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2074753647748672512</p>
     */
    @NameInMap("AgentRegisterInfoId")
    public String agentRegisterInfoId;

    /**
     * <strong>example:</strong>
     * <p>eyJhbGciOiJIUzI1NiIsInR5cC.....</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    public static VerifyAtiAgentRegisterInfoAcmeChallengeRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyAtiAgentRegisterInfoAcmeChallengeRecordRequest self = new VerifyAtiAgentRegisterInfoAcmeChallengeRecordRequest();
        return TeaModel.build(map, self);
    }

    public VerifyAtiAgentRegisterInfoAcmeChallengeRecordRequest setAgentRegisterInfoId(String agentRegisterInfoId) {
        this.agentRegisterInfoId = agentRegisterInfoId;
        return this;
    }
    public String getAgentRegisterInfoId() {
        return this.agentRegisterInfoId;
    }

    public VerifyAtiAgentRegisterInfoAcmeChallengeRecordRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
