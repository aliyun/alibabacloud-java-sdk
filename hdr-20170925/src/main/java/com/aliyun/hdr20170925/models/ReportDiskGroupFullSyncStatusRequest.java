// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class ReportDiskGroupFullSyncStatusRequest extends TeaModel {
    @NameInMap("DiskGroupId")
    public String diskGroupId;

    @NameInMap("FullSyncCurrentSize")
    public Long fullSyncCurrentSize;

    @NameInMap("FullSyncProgress")
    public Integer fullSyncProgress;

    @NameInMap("FullSyncTotalSize")
    public Long fullSyncTotalSize;

    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("UserUid")
    public Long userUid;

    public static ReportDiskGroupFullSyncStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportDiskGroupFullSyncStatusRequest self = new ReportDiskGroupFullSyncStatusRequest();
        return TeaModel.build(map, self);
    }

    public ReportDiskGroupFullSyncStatusRequest setDiskGroupId(String diskGroupId) {
        this.diskGroupId = diskGroupId;
        return this;
    }
    public String getDiskGroupId() {
        return this.diskGroupId;
    }

    public ReportDiskGroupFullSyncStatusRequest setFullSyncCurrentSize(Long fullSyncCurrentSize) {
        this.fullSyncCurrentSize = fullSyncCurrentSize;
        return this;
    }
    public Long getFullSyncCurrentSize() {
        return this.fullSyncCurrentSize;
    }

    public ReportDiskGroupFullSyncStatusRequest setFullSyncProgress(Integer fullSyncProgress) {
        this.fullSyncProgress = fullSyncProgress;
        return this;
    }
    public Integer getFullSyncProgress() {
        return this.fullSyncProgress;
    }

    public ReportDiskGroupFullSyncStatusRequest setFullSyncTotalSize(Long fullSyncTotalSize) {
        this.fullSyncTotalSize = fullSyncTotalSize;
        return this;
    }
    public Long getFullSyncTotalSize() {
        return this.fullSyncTotalSize;
    }

    public ReportDiskGroupFullSyncStatusRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public ReportDiskGroupFullSyncStatusRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ReportDiskGroupFullSyncStatusRequest setUserUid(Long userUid) {
        this.userUid = userUid;
        return this;
    }
    public Long getUserUid() {
        return this.userUid;
    }

}
