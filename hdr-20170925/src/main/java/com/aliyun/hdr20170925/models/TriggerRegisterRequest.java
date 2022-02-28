// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class TriggerRegisterRequest extends TeaModel {
    @NameInMap("RecoveredIpAddress")
    public String recoveredIpAddress;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("ServerId")
    public String serverId;

    public static TriggerRegisterRequest build(java.util.Map<String, ?> map) throws Exception {
        TriggerRegisterRequest self = new TriggerRegisterRequest();
        return TeaModel.build(map, self);
    }

    public TriggerRegisterRequest setRecoveredIpAddress(String recoveredIpAddress) {
        this.recoveredIpAddress = recoveredIpAddress;
        return this;
    }
    public String getRecoveredIpAddress() {
        return this.recoveredIpAddress;
    }

    public TriggerRegisterRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public TriggerRegisterRequest setServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }
    public String getServerId() {
        return this.serverId;
    }

}
