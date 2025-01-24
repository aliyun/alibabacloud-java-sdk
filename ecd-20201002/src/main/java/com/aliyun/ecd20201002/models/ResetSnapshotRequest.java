// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class ResetSnapshotRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>b9d8ddfd-65d4-4857-9e97-56477d1f****</p>
     */
    @NameInMap("ClientId")
    public String clientId;

    @NameInMap("DesktopId")
    public String desktopId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>v1fdef51b727aa91d6c881658978508114d3f5680fa99a66b2a631d17d5bb4860cccf1173be24d77d5ef1423c83aea****</p>
     */
    @NameInMap("LoginToken")
    public String loginToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>05182b8c-bb0d-49d3-963c-ee63a507****</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>s-2zeipxmnhej803x7****</p>
     */
    @NameInMap("SnapshotId")
    public String snapshotId;

    @NameInMap("StopDesktop")
    public Boolean stopDesktop;

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

    public ResetSnapshotRequest setDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public String getDesktopId() {
        return this.desktopId;
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

    public ResetSnapshotRequest setStopDesktop(Boolean stopDesktop) {
        this.stopDesktop = stopDesktop;
        return this;
    }
    public Boolean getStopDesktop() {
        return this.stopDesktop;
    }

}
