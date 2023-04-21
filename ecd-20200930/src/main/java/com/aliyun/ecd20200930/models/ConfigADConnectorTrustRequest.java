// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ConfigADConnectorTrustRequest extends TeaModel {
    /**
     * <p>The ID of the AD workspace.</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    @NameInMap("RdsLicenseDomain")
    public Boolean rdsLicenseDomain;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The trust password. You can specify the password when you configure a trust relationship between the AD domain and the ecd.acs domain.</p>
     */
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

    public ConfigADConnectorTrustRequest setRdsLicenseDomain(Boolean rdsLicenseDomain) {
        this.rdsLicenseDomain = rdsLicenseDomain;
        return this;
    }
    public Boolean getRdsLicenseDomain() {
        return this.rdsLicenseDomain;
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
