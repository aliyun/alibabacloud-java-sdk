// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class CreateTunnelInfo extends TeaModel {
    /**
     * <p>The tags in the key:value format.\
     * The value can contain letters, digits, hyphens (-), underscores (_), and commas (,). The value can be up to 1,024 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>a:a</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <p>The throttling settings of the tunnel.</p>
     */
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
