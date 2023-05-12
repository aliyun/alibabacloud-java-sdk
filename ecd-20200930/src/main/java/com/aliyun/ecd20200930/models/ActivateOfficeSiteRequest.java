// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ActivateOfficeSiteRequest extends TeaModel {
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    @NameInMap("RegionId")
    public String regionId;

    public static ActivateOfficeSiteRequest build(java.util.Map<String, ?> map) throws Exception {
        ActivateOfficeSiteRequest self = new ActivateOfficeSiteRequest();
        return TeaModel.build(map, self);
    }

    public ActivateOfficeSiteRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public ActivateOfficeSiteRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
