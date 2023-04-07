// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class SetOfficeSiteSsoStatusRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable SSO. Valid values:</p>
     * <br>
     * <p>*   true: enables SSO</p>
     * <p>*   false: disables SSO</p>
     */
    @NameInMap("EnableSso")
    public Boolean enableSso;

    /**
     * <p>The ID of the workspace.</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static SetOfficeSiteSsoStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        SetOfficeSiteSsoStatusRequest self = new SetOfficeSiteSsoStatusRequest();
        return TeaModel.build(map, self);
    }

    public SetOfficeSiteSsoStatusRequest setEnableSso(Boolean enableSso) {
        this.enableSso = enableSso;
        return this;
    }
    public Boolean getEnableSso() {
        return this.enableSso;
    }

    public SetOfficeSiteSsoStatusRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public SetOfficeSiteSsoStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
