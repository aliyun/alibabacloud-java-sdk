// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class ReportRecoveryPointRequest extends TeaModel {
    @NameInMap("ApplicationConsistent")
    public Boolean applicationConsistent;

    @NameInMap("RecoveryPointId")
    public String recoveryPointId;

    @NameInMap("RecoveryPointTime")
    public Long recoveryPointTime;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("ServerId")
    public String serverId;

    @NameInMap("UserUid")
    public Long userUid;

    public static ReportRecoveryPointRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportRecoveryPointRequest self = new ReportRecoveryPointRequest();
        return TeaModel.build(map, self);
    }

    public ReportRecoveryPointRequest setApplicationConsistent(Boolean applicationConsistent) {
        this.applicationConsistent = applicationConsistent;
        return this;
    }
    public Boolean getApplicationConsistent() {
        return this.applicationConsistent;
    }

    public ReportRecoveryPointRequest setRecoveryPointId(String recoveryPointId) {
        this.recoveryPointId = recoveryPointId;
        return this;
    }
    public String getRecoveryPointId() {
        return this.recoveryPointId;
    }

    public ReportRecoveryPointRequest setRecoveryPointTime(Long recoveryPointTime) {
        this.recoveryPointTime = recoveryPointTime;
        return this;
    }
    public Long getRecoveryPointTime() {
        return this.recoveryPointTime;
    }

    public ReportRecoveryPointRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ReportRecoveryPointRequest setServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }
    public String getServerId() {
        return this.serverId;
    }

    public ReportRecoveryPointRequest setUserUid(Long userUid) {
        this.userUid = userUid;
        return this;
    }
    public Long getUserUid() {
        return this.userUid;
    }

}
