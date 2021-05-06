// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class GetOfficeSiteSsoStatusRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("OfficeSiteId")
    @Validation(required = true)
    public String officeSiteId;

    public static GetOfficeSiteSsoStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOfficeSiteSsoStatusRequest self = new GetOfficeSiteSsoStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetOfficeSiteSsoStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetOfficeSiteSsoStatusRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

}
