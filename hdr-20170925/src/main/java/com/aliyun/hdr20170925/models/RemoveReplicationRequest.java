// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class RemoveReplicationRequest extends TeaModel {
    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("ReplicationInfo")
    public String replicationInfo;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static RemoveReplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveReplicationRequest self = new RemoveReplicationRequest();
        return TeaModel.build(map, self);
    }

    public RemoveReplicationRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public RemoveReplicationRequest setReplicationInfo(String replicationInfo) {
        this.replicationInfo = replicationInfo;
        return this;
    }
    public String getReplicationInfo() {
        return this.replicationInfo;
    }

    public RemoveReplicationRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
