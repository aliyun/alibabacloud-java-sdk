// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class GetOfficeSiteSsoStatusRequest extends TeaModel {
    /**
     * <p>Indicates whether SSO is enabled.</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The ID of the workspace.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetOfficeSiteSsoStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOfficeSiteSsoStatusRequest self = new GetOfficeSiteSsoStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetOfficeSiteSsoStatusRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public GetOfficeSiteSsoStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
