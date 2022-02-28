// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class ReclaimRecoveryPointRequest extends TeaModel {
    @NameInMap("RecoveryPointId")
    public String recoveryPointId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("ServerId")
    public String serverId;

    @NameInMap("UserUid")
    public Long userUid;

    public static ReclaimRecoveryPointRequest build(java.util.Map<String, ?> map) throws Exception {
        ReclaimRecoveryPointRequest self = new ReclaimRecoveryPointRequest();
        return TeaModel.build(map, self);
    }

    public ReclaimRecoveryPointRequest setRecoveryPointId(String recoveryPointId) {
        this.recoveryPointId = recoveryPointId;
        return this;
    }
    public String getRecoveryPointId() {
        return this.recoveryPointId;
    }

    public ReclaimRecoveryPointRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ReclaimRecoveryPointRequest setServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }
    public String getServerId() {
        return this.serverId;
    }

    public ReclaimRecoveryPointRequest setUserUid(Long userUid) {
        this.userUid = userUid;
        return this;
    }
    public Long getUserUid() {
        return this.userUid;
    }

}
