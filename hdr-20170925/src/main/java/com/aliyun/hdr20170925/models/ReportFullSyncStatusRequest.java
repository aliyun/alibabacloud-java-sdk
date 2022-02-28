// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class ReportFullSyncStatusRequest extends TeaModel {
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

    @NameInMap("ServerId")
    public String serverId;

    @NameInMap("UserUid")
    public Long userUid;

    public static ReportFullSyncStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportFullSyncStatusRequest self = new ReportFullSyncStatusRequest();
        return TeaModel.build(map, self);
    }

    public ReportFullSyncStatusRequest setFullSyncCurrentSize(Long fullSyncCurrentSize) {
        this.fullSyncCurrentSize = fullSyncCurrentSize;
        return this;
    }
    public Long getFullSyncCurrentSize() {
        return this.fullSyncCurrentSize;
    }

    public ReportFullSyncStatusRequest setFullSyncProgress(Integer fullSyncProgress) {
        this.fullSyncProgress = fullSyncProgress;
        return this;
    }
    public Integer getFullSyncProgress() {
        return this.fullSyncProgress;
    }

    public ReportFullSyncStatusRequest setFullSyncTotalSize(Long fullSyncTotalSize) {
        this.fullSyncTotalSize = fullSyncTotalSize;
        return this;
    }
    public Long getFullSyncTotalSize() {
        return this.fullSyncTotalSize;
    }

    public ReportFullSyncStatusRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public ReportFullSyncStatusRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ReportFullSyncStatusRequest setServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }
    public String getServerId() {
        return this.serverId;
    }

    public ReportFullSyncStatusRequest setUserUid(Long userUid) {
        this.userUid = userUid;
        return this;
    }
    public Long getUserUid() {
        return this.userUid;
    }

}
