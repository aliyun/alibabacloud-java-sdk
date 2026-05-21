// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class UpdateHoloWebLoginSettingRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("allowExternalAccountsLogin")
    public Boolean allowExternalAccountsLogin;

    public static UpdateHoloWebLoginSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHoloWebLoginSettingRequest self = new UpdateHoloWebLoginSettingRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHoloWebLoginSettingRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateHoloWebLoginSettingRequest setAllowExternalAccountsLogin(Boolean allowExternalAccountsLogin) {
        this.allowExternalAccountsLogin = allowExternalAccountsLogin;
        return this;
    }
    public Boolean getAllowExternalAccountsLogin() {
        return this.allowExternalAccountsLogin;
    }

}
