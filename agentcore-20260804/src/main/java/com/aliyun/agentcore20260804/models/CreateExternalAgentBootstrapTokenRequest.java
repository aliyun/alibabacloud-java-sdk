// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateExternalAgentBootstrapTokenRequest extends TeaModel {
    /**
     * <p>The network type for connection. Valid values:</p>
     * <ul>
     * <li>INTERNET: public network</li>
     * <li>INTRANET: internal network</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>INTERNET</p>
     */
    @NameInMap("networkType")
    public String networkType;

    public static CreateExternalAgentBootstrapTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateExternalAgentBootstrapTokenRequest self = new CreateExternalAgentBootstrapTokenRequest();
        return TeaModel.build(map, self);
    }

    public CreateExternalAgentBootstrapTokenRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

}
