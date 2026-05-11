// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class UpdateTunnelInfo extends TeaModel {
    /**
     * <p>The tags.</p>
     * 
     * <strong>example:</strong>
     * <p>K1:V1,K2:V2</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <p>The throttling settings of the tunnel.</p>
     */
    @NameInMap("TunnelQos")
    public TunnelQos tunnelQos;

    public static UpdateTunnelInfo build(java.util.Map<String, ?> map) throws Exception {
        UpdateTunnelInfo self = new UpdateTunnelInfo();
        return TeaModel.build(map, self);
    }

    public UpdateTunnelInfo setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public UpdateTunnelInfo setTunnelQos(TunnelQos tunnelQos) {
        this.tunnelQos = tunnelQos;
        return this;
    }
    public TunnelQos getTunnelQos() {
        return this.tunnelQos;
    }

}
