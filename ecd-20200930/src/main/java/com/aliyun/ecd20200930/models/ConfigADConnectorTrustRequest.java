// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ConfigADConnectorTrustRequest extends TeaModel {
    // The ID of the AD workspace.
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    // The region ID.
    @NameInMap("RegionId")
    public String regionId;

    // The trust password. You can specify the password when you configure a trust relationship between the AD domain and the ecd.acs domain.
    @NameInMap("TrustKey")
    public String trustKey;

    public static ConfigADConnectorTrustRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigADConnectorTrustRequest self = new ConfigADConnectorTrustRequest();
        return TeaModel.build(map, self);
    }

    public ConfigADConnectorTrustRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public ConfigADConnectorTrustRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ConfigADConnectorTrustRequest setTrustKey(String trustKey) {
        this.trustKey = trustKey;
        return this;
    }
    public String getTrustKey() {
        return this.trustKey;
    }

}
