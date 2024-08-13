// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class GetCloudDriveServiceMountTokenRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>00e122c3-13fb-4fc3-bc7a-5d9acb89****</p>
     */
    @NameInMap("ClientId")
    public String clientId;

    /**
     * <strong>example:</strong>
     * <p>v1972cd3446f0e523598916520951742474e6624fcdea6652994d47bc6157d27f7cc900c339db67882j3no4nh5bk3b4****</p>
     */
    @NameInMap("LoginToken")
    public String loginToken;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-7186763****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>14e1fe41-ce9b-491d-aa8c-345jk2n4bk****</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    public static GetCloudDriveServiceMountTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCloudDriveServiceMountTokenRequest self = new GetCloudDriveServiceMountTokenRequest();
        return TeaModel.build(map, self);
    }

    public GetCloudDriveServiceMountTokenRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public GetCloudDriveServiceMountTokenRequest setLoginToken(String loginToken) {
        this.loginToken = loginToken;
        return this;
    }
    public String getLoginToken() {
        return this.loginToken;
    }

    public GetCloudDriveServiceMountTokenRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public GetCloudDriveServiceMountTokenRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetCloudDriveServiceMountTokenRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
