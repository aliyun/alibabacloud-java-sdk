// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mseap20210118.models;

import com.aliyun.tea.*;

public class GetPlatformUserInfoForPartnerRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>app-0wceagu85ceaaais</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <strong>example:</strong>
     * <p>MP</p>
     */
    @NameInMap("PlatformType")
    public String platformType;

    /**
     * <strong>example:</strong>
     * <p>123153124411</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static GetPlatformUserInfoForPartnerRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPlatformUserInfoForPartnerRequest self = new GetPlatformUserInfoForPartnerRequest();
        return TeaModel.build(map, self);
    }

    public GetPlatformUserInfoForPartnerRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetPlatformUserInfoForPartnerRequest setPlatformType(String platformType) {
        this.platformType = platformType;
        return this;
    }
    public String getPlatformType() {
        return this.platformType;
    }

    public GetPlatformUserInfoForPartnerRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
