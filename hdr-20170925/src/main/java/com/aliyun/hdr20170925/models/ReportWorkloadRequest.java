// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class ReportWorkloadRequest extends TeaModel {
    @NameInMap("BackupWorkload")
    public Integer backupWorkload;

    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("RecoveryWorkload")
    public Integer recoveryWorkload;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static ReportWorkloadRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportWorkloadRequest self = new ReportWorkloadRequest();
        return TeaModel.build(map, self);
    }

    public ReportWorkloadRequest setBackupWorkload(Integer backupWorkload) {
        this.backupWorkload = backupWorkload;
        return this;
    }
    public Integer getBackupWorkload() {
        return this.backupWorkload;
    }

    public ReportWorkloadRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public ReportWorkloadRequest setRecoveryWorkload(Integer recoveryWorkload) {
        this.recoveryWorkload = recoveryWorkload;
        return this;
    }
    public Integer getRecoveryWorkload() {
        return this.recoveryWorkload;
    }

    public ReportWorkloadRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
