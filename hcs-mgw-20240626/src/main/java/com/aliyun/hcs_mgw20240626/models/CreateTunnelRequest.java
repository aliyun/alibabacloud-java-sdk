// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class CreateTunnelRequest extends TeaModel {
    /**
     * <p>The details for creating the tunnel.</p>
     */
    @NameInMap("ImportTunnel")
    public CreateTunnelInfo importTunnel;

    public static CreateTunnelRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTunnelRequest self = new CreateTunnelRequest();
        return TeaModel.build(map, self);
    }

    public CreateTunnelRequest setImportTunnel(CreateTunnelInfo importTunnel) {
        this.importTunnel = importTunnel;
        return this;
    }
    public CreateTunnelInfo getImportTunnel() {
        return this.importTunnel;
    }

}
