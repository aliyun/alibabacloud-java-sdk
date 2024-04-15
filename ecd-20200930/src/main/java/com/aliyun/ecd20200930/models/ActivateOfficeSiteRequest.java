// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ActivateOfficeSiteRequest extends TeaModel {
    /**
     * <p>The ID of the convenience office network that is locked.</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.</p>
     */
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
