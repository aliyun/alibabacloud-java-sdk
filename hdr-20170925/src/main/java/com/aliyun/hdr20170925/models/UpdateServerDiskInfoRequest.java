// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class UpdateServerDiskInfoRequest extends TeaModel {
    @NameInMap("Disks")
    public String disks;

    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("ServerId")
    public String serverId;

    @NameInMap("UserUid")
    public Long userUid;

    public static UpdateServerDiskInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateServerDiskInfoRequest self = new UpdateServerDiskInfoRequest();
        return TeaModel.build(map, self);
    }

    public UpdateServerDiskInfoRequest setDisks(String disks) {
        this.disks = disks;
        return this;
    }
    public String getDisks() {
        return this.disks;
    }

    public UpdateServerDiskInfoRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public UpdateServerDiskInfoRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public UpdateServerDiskInfoRequest setServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }
    public String getServerId() {
        return this.serverId;
    }

    public UpdateServerDiskInfoRequest setUserUid(Long userUid) {
        this.userUid = userUid;
        return this;
    }
    public Long getUserUid() {
        return this.userUid;
    }

}
