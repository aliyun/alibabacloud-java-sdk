// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class UpdateReplicationRequest extends TeaModel {
    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("ReplicationList")
    public String replicationList;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static UpdateReplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateReplicationRequest self = new UpdateReplicationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateReplicationRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public UpdateReplicationRequest setReplicationList(String replicationList) {
        this.replicationList = replicationList;
        return this;
    }
    public String getReplicationList() {
        return this.replicationList;
    }

    public UpdateReplicationRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
