// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RebootARMServerInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the server.</p>
     * 
     * <strong>example:</strong>
     * <p>cas-instance****</p>
     */
    @NameInMap("ServerId")
    public String serverId;

    public static RebootARMServerInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RebootARMServerInstanceRequest self = new RebootARMServerInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RebootARMServerInstanceRequest setServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }
    public String getServerId() {
        return this.serverId;
    }

}
