// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class ReportAppConsistentPointRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("ServerId")
    public String serverId;

    @NameInMap("SnapshotId")
    public String snapshotId;

    @NameInMap("SnapshotTime")
    public Long snapshotTime;

    public static ReportAppConsistentPointRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportAppConsistentPointRequest self = new ReportAppConsistentPointRequest();
        return TeaModel.build(map, self);
    }

    public ReportAppConsistentPointRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ReportAppConsistentPointRequest setServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }
    public String getServerId() {
        return this.serverId;
    }

    public ReportAppConsistentPointRequest setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public String getSnapshotId() {
        return this.snapshotId;
    }

    public ReportAppConsistentPointRequest setSnapshotTime(Long snapshotTime) {
        this.snapshotTime = snapshotTime;
        return this;
    }
    public Long getSnapshotTime() {
        return this.snapshotTime;
    }

}
