// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DetachCenRequest extends TeaModel {
    /**
     * <p>The workspace ID.</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DetachCenRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachCenRequest self = new DetachCenRequest();
        return TeaModel.build(map, self);
    }

    public DetachCenRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public DetachCenRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
