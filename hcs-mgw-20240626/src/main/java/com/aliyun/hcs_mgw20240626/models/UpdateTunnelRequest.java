// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class UpdateTunnelRequest extends TeaModel {
    /**
     * <p>The details for updating the tunnel.</p>
     */
    @NameInMap("ImportTunnel")
    public UpdateTunnelInfo importTunnel;

    public static UpdateTunnelRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTunnelRequest self = new UpdateTunnelRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTunnelRequest setImportTunnel(UpdateTunnelInfo importTunnel) {
        this.importTunnel = importTunnel;
        return this;
    }
    public UpdateTunnelInfo getImportTunnel() {
        return this.importTunnel;
    }

}
