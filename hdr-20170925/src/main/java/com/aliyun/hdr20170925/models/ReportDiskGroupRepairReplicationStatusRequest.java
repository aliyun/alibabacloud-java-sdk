// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class ReportDiskGroupRepairReplicationStatusRequest extends TeaModel {
    @NameInMap("DiskGroupId")
    public String diskGroupId;

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

    @NameInMap("UserUid")
    public Long userUid;

    public static ReportDiskGroupRepairReplicationStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportDiskGroupRepairReplicationStatusRequest self = new ReportDiskGroupRepairReplicationStatusRequest();
        return TeaModel.build(map, self);
    }

    public ReportDiskGroupRepairReplicationStatusRequest setDiskGroupId(String diskGroupId) {
        this.diskGroupId = diskGroupId;
        return this;
    }
    public String getDiskGroupId() {
        return this.diskGroupId;
    }

    public ReportDiskGroupRepairReplicationStatusRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public ReportDiskGroupRepairReplicationStatusRequest setRepairCurrentSize(Long repairCurrentSize) {
        this.repairCurrentSize = repairCurrentSize;
        return this;
    }
    public Long getRepairCurrentSize() {
        return this.repairCurrentSize;
    }

    public ReportDiskGroupRepairReplicationStatusRequest setRepairProgress(Integer repairProgress) {
        this.repairProgress = repairProgress;
        return this;
    }
    public Integer getRepairProgress() {
        return this.repairProgress;
    }

    public ReportDiskGroupRepairReplicationStatusRequest setRepairTotalSize(Long repairTotalSize) {
        this.repairTotalSize = repairTotalSize;
        return this;
    }
    public Long getRepairTotalSize() {
        return this.repairTotalSize;
    }

    public ReportDiskGroupRepairReplicationStatusRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ReportDiskGroupRepairReplicationStatusRequest setUserUid(Long userUid) {
        this.userUid = userUid;
        return this;
    }
    public Long getUserUid() {
        return this.userUid;
    }

}
