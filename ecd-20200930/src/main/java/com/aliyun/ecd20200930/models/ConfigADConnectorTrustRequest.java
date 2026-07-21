// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ConfigADConnectorTrustRequest extends TeaModel {
    /**
     * <p>The ID of the AD office network.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-778418****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>Specifies whether to configure the trust password for the RDS License Domain of the AD office network.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("RdsLicenseDomain")
    public Boolean rdsLicenseDomain;

    /**
     * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> to query the regions supported by Elastic Desktop Service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The trust password. This password is the one that you specified when you configured the trust relationship (that is, established a trust relationship with ecd.acs) in the AD domain.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>password123***</p>
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
