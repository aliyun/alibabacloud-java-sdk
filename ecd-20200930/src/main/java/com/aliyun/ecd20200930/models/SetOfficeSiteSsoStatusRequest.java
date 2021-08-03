// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class SetOfficeSiteSsoStatusRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    @NameInMap("EnableSso")
    public Boolean enableSso;

    public static SetOfficeSiteSsoStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        SetOfficeSiteSsoStatusRequest self = new SetOfficeSiteSsoStatusRequest();
        return TeaModel.build(map, self);
    }

    public SetOfficeSiteSsoStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SetOfficeSiteSsoStatusRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public SetOfficeSiteSsoStatusRequest setEnableSso(Boolean enableSso) {
        this.enableSso = enableSso;
        return this;
    }
    public Boolean getEnableSso() {
        return this.enableSso;
    }

}
