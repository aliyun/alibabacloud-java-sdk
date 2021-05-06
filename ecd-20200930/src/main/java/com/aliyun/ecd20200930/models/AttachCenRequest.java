// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class AttachCenRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("CenId")
    @Validation(required = true)
    public String cenId;

    @NameInMap("OfficeSiteId")
    @Validation(required = true)
    public String officeSiteId;

    public static AttachCenRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachCenRequest self = new AttachCenRequest();
        return TeaModel.build(map, self);
    }

    public AttachCenRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AttachCenRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public AttachCenRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

}
