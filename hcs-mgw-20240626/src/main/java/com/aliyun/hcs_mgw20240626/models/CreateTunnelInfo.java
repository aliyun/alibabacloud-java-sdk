// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class CreateTunnelInfo extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>K1:V1,K2:V2</p>
     */
    @NameInMap("Tags")
    public String tags;

    @NameInMap("TunnelQos")
    public TunnelQos tunnelQos;

    public static CreateTunnelInfo build(java.util.Map<String, ?> map) throws Exception {
        CreateTunnelInfo self = new CreateTunnelInfo();
        return TeaModel.build(map, self);
    }

    public CreateTunnelInfo setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public CreateTunnelInfo setTunnelQos(TunnelQos tunnelQos) {
        this.tunnelQos = tunnelQos;
        return this;
    }
    public TunnelQos getTunnelQos() {
        return this.tunnelQos;
    }

}
