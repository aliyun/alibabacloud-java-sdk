// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class TriggerReversedRegisterRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("ServerId")
    public String serverId;

    public static TriggerReversedRegisterRequest build(java.util.Map<String, ?> map) throws Exception {
        TriggerReversedRegisterRequest self = new TriggerReversedRegisterRequest();
        return TeaModel.build(map, self);
    }

    public TriggerReversedRegisterRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public TriggerReversedRegisterRequest setServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }
    public String getServerId() {
        return this.serverId;
    }

}
