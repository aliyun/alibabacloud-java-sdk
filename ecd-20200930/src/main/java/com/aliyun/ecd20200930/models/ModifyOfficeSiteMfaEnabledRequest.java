// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyOfficeSiteMfaEnabledRequest extends TeaModel {
    @NameInMap("MfaEnabled")
    public Boolean mfaEnabled;

    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    @NameInMap("RegionId")
    public String regionId;

    public static ModifyOfficeSiteMfaEnabledRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyOfficeSiteMfaEnabledRequest self = new ModifyOfficeSiteMfaEnabledRequest();
        return TeaModel.build(map, self);
    }

    public ModifyOfficeSiteMfaEnabledRequest setMfaEnabled(Boolean mfaEnabled) {
        this.mfaEnabled = mfaEnabled;
        return this;
    }
    public Boolean getMfaEnabled() {
        return this.mfaEnabled;
    }

    public ModifyOfficeSiteMfaEnabledRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public ModifyOfficeSiteMfaEnabledRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
