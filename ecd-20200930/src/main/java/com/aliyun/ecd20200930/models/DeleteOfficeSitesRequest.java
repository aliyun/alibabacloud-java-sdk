// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteOfficeSitesRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("OfficeSiteId")
    public java.util.List<String> officeSiteId;

    public static DeleteOfficeSitesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteOfficeSitesRequest self = new DeleteOfficeSitesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteOfficeSitesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteOfficeSitesRequest setOfficeSiteId(java.util.List<String> officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public java.util.List<String> getOfficeSiteId() {
        return this.officeSiteId;
    }

}
