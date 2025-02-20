// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class GetTunnelResponseBody extends TeaModel {
    /**
     * <p>The details for obtaining the details of the tunnel.</p>
     */
    @NameInMap("ImportTunnel")
    public GetTunnelResp importTunnel;

    public static GetTunnelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTunnelResponseBody self = new GetTunnelResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTunnelResponseBody setImportTunnel(GetTunnelResp importTunnel) {
        this.importTunnel = importTunnel;
        return this;
    }
    public GetTunnelResp getImportTunnel() {
        return this.importTunnel;
    }

}
