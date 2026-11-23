// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateCustomAgentDebugTokenRequest extends TeaModel {
    /**
     * <p>The network type used for local debugging. INTERNET indicates public network access. INTRANET indicates access over a virtual private cloud (VPC).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>INTERNET</p>
     */
    @NameInMap("networkType")
    public String networkType;

    public static CreateCustomAgentDebugTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomAgentDebugTokenRequest self = new CreateCustomAgentDebugTokenRequest();
        return TeaModel.build(map, self);
    }

    public CreateCustomAgentDebugTokenRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

}
