// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class VerifyWorkspaceAgenticFsMountRamAuthorizationRequest extends TeaModel {
    /**
     * <p>The domain name of the target AccessPoint, obtained from the DomainName field of NAS ListAccessPoints. Do not include the protocol, port, or path.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ap-0123456789abcdef0.0123456789-vlm36.cn-hangzhou.nas.aliyuncs.com</p>
     */
    @NameInMap("server")
    public String server;

    public static VerifyWorkspaceAgenticFsMountRamAuthorizationRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyWorkspaceAgenticFsMountRamAuthorizationRequest self = new VerifyWorkspaceAgenticFsMountRamAuthorizationRequest();
        return TeaModel.build(map, self);
    }

    public VerifyWorkspaceAgenticFsMountRamAuthorizationRequest setServer(String server) {
        this.server = server;
        return this;
    }
    public String getServer() {
        return this.server;
    }

}
