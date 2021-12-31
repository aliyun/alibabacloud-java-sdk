// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class ResetSnapshotRequest extends TeaModel {
    @NameInMap("ClientId")
    public String clientId;

    @NameInMap("LoginToken")
    public String loginToken;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("SnapshotId")
    public String snapshotId;

    public static ResetSnapshotRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetSnapshotRequest self = new ResetSnapshotRequest();
        return TeaModel.build(map, self);
    }

    public ResetSnapshotRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public ResetSnapshotRequest setLoginToken(String loginToken) {
        this.loginToken = loginToken;
        return this;
    }
    public String getLoginToken() {
        return this.loginToken;
    }

    public ResetSnapshotRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ResetSnapshotRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public ResetSnapshotRequest setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public String getSnapshotId() {
        return this.snapshotId;
    }

}
