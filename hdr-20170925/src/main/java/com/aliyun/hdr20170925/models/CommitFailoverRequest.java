// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class CommitFailoverRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("ServerId")
    public String serverId;

    public static CommitFailoverRequest build(java.util.Map<String, ?> map) throws Exception {
        CommitFailoverRequest self = new CommitFailoverRequest();
        return TeaModel.build(map, self);
    }

    public CommitFailoverRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public CommitFailoverRequest setServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }
    public String getServerId() {
        return this.serverId;
    }

}
