// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class ReportRepairReplicationStatusRequest extends TeaModel {
    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("RepairCurrentSize")
    public Long repairCurrentSize;

    @NameInMap("RepairProgress")
    public Integer repairProgress;

    @NameInMap("RepairTotalSize")
    public Long repairTotalSize;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("ServerId")
    public String serverId;

    @NameInMap("UserUid")
    public Long userUid;

    public static ReportRepairReplicationStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportRepairReplicationStatusRequest self = new ReportRepairReplicationStatusRequest();
        return TeaModel.build(map, self);
    }

    public ReportRepairReplicationStatusRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public ReportRepairReplicationStatusRequest setRepairCurrentSize(Long repairCurrentSize) {
        this.repairCurrentSize = repairCurrentSize;
        return this;
    }
    public Long getRepairCurrentSize() {
        return this.repairCurrentSize;
    }

    public ReportRepairReplicationStatusRequest setRepairProgress(Integer repairProgress) {
        this.repairProgress = repairProgress;
        return this;
    }
    public Integer getRepairProgress() {
        return this.repairProgress;
    }

    public ReportRepairReplicationStatusRequest setRepairTotalSize(Long repairTotalSize) {
        this.repairTotalSize = repairTotalSize;
        return this;
    }
    public Long getRepairTotalSize() {
        return this.repairTotalSize;
    }

    public ReportRepairReplicationStatusRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ReportRepairReplicationStatusRequest setServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }
    public String getServerId() {
        return this.serverId;
    }

    public ReportRepairReplicationStatusRequest setUserUid(Long userUid) {
        this.userUid = userUid;
        return this;
    }
    public Long getUserUid() {
        return this.userUid;
    }

}
